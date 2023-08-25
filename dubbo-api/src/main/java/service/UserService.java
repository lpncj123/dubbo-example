package service;

/**
 * @BelongsProject: dubbo-project
 * @BelongsPackage: service
 * @Author: lp
 * @CreateTime: 2023-08-24  16:00
 * @Description: TODO
 * @Version: 1.0
 */

import model.UserAddress;

import java.util.List;

/**
 * 用户服务
 *
 */
public interface UserService {

    /**
     * 按照用户id返回所有的收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);

}

