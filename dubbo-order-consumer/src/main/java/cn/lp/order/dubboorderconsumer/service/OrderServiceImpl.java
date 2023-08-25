package cn.lp.order.dubboorderconsumer.service;

import model.UserAddress;
import org.apache.dubbo.common.constants.LoadbalanceRules;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.rpc.cluster.LoadBalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;
import service.UserService;

import java.util.List;

/**
 * @BelongsProject: dubbo-project
 * @BelongsPackage: cn.lp.order.dubboorderconsumer.service
 * @Author: lp
 * @CreateTime: 2023-08-24  16:07
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    /**
     * 调用远程接口，指定接口，关闭自启动检查
     * Dubbo 缺省会在启动时检查依赖的服务是否可用，不可用时会抛出异常，阻止 Spring 初始化完成
     * 失败自动切换，当出现失败，重试其它服务器，但重试会带来更长延迟。可通过 retries=“2” 来设置重试次数(不含第一次)。默认次数为两次
     * 由于网络或服务端不可靠，会导致调用出现一种不确定的中间状态（超时）。为了避免超时导致客户端资源（线程）挂起耗尽，必须设置超时时间。
     * 服务提供方设置的超时时间是服务实现在提供方执行时的最大执行时间。
     * 服务调用方设置的超时时间是服务调用方等待远程服务响应的最大等待时间。
     */
    /**
     * 参数设置的规范
     * 方法级配置别优于接口级别，接口级别优先与全局配置
     * 同一级别消费端配置大于提供端
     *
     * 当一个接口实现，出现不兼容升级时，可以用版本号过渡，版本号不同的服务相互间不引用。
     **/
//    @DubboReference(interfaceClass = UserService.class,check = false,stub = "cn.lp.order.dubboorderconsumer.service.OrderServiceStub",retries = 2,timeout = 5000,version = "*")
    //dubbo直连 测试环境用
    @DubboReference(check = false,url = "dubbo://127.0.0.1:20881/",version = "1.0.0",loadbalance = LoadbalanceRules.RANDOM)
    private UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        return userService.getUserAddressList(userId);
    }
}
