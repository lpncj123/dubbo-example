package service;

import model.UserAddress;

import java.util.List;

/**
 * @BelongsProject: dubbo-project
 * @BelongsPackage: service
 * @Author: lp
 * @CreateTime: 2023-08-24  16:00
 * @Description: TODO
 * @Version: 1.0
 */
public interface OrderService {

    /**
     * 初始化订单
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);

}

