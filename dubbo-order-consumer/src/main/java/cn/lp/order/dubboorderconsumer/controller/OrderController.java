package cn.lp.order.dubboorderconsumer.controller;

import model.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;

import java.util.List;

/**
 * @BelongsProject: dubbo-project
 * @BelongsPackage: cn.lp.order.dubboorderconsumer.controller
 * @Author: lp
 * @CreateTime: 2023-08-24  16:16
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
@RequestMapping("OrderController")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("getOrder")
    public List<UserAddress> getOrder(@RequestParam("userId") String userId){
        return orderService.initOrder(userId);
    }
}
