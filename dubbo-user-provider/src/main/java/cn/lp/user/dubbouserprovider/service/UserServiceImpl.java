package cn.lp.user.dubbouserprovider.service;

import model.UserAddress;
import org.apache.dubbo.config.annotation.DubboService;
import service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @BelongsProject: dubbo-project
 * @BelongsPackage: cn.lp.user.dubbouserprovider.service
 * @Author: lp
 * @CreateTime: 2023-08-24  16:10
 * @Description: TODO
 * @Version: 1.0
 */
/**
 * 暴露远程调用的接口，对外提供服务
 */
@DubboService(interfaceClass = UserService.class,timeout = 5000,version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
        return Arrays.asList(address1,address2);
    }
}
