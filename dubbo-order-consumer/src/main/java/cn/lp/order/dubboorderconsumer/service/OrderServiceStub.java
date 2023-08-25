package cn.lp.order.dubboorderconsumer.service;

import model.UserAddress;
import org.apache.dubbo.common.utils.StringUtils;
import service.UserService;

import java.util.List;

/**
 * @BelongsProject: dubbo-project
 * @BelongsPackage: cn.lp.order.dubboorderconsumer.service
 * @Author: lp
 * @CreateTime: 2023-08-25  15:53
 * @Description: TODO
 * @Version: 1.0
 */
/**
 * stub（存根）是一种用于客户端和服务端之间通信的技术，它允许客户端通过本地调用来调用远程服务，而无需实际的网络通信。当你在Dubbo中配置了stub时，调用将会通过stub方法进行处理，而不会进行远程调用。如果没有配置stub，调用将正常执行远程调用。
 * 是的，您理解得很对。消费方实现了提供者的 API 接口，以便在消费方本地处理自己的逻辑，这就是 Dubbo 中 "stub" 的作用。
 * 当消费方配置了 "stub" 参数后，在 Dubbo 中会生成一个本地的代理类，这个代理类实现了与服务提供方相同的接口，但它的方法体中包含了一些本地的处理逻辑。这个本地的代理类被称为 "stub"。当消费方调用这个 "stub" 的方法时，实际上是调用了本地代理类的方法，而不是直接发起远程调用。
 * 通过在 "stub" 中进行一些本地逻辑处理，可以减少远程调用的数据传输和网络延迟，从而提高调用性能。通常，消费方的 "stub" 会做一些预处理、缓存、数据格式转换等操作，以减轻远程服务提供方的压力，并提供更快的响应时间。
 * 需要注意的是，"stub" 的配置是可选的，如果不配置 "stub"，Dubbo 会直接发起远程调用，而不会使用本地的代理。您可以根据具体的业务需求和性能要求来决定是否配置 "stub"。
 **/
public class OrderServiceStub implements UserService {

    public final UserService userService;

    // 构造函数传入真正的远程代理对象
    public OrderServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // 这里可以对参数进行校验
        System.out.println("OrderServiceStub----1");
        if (StringUtils.hasText(userId)){
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}

