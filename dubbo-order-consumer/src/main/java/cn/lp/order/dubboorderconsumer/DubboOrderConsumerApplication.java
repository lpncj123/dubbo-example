package cn.lp.order.dubboorderconsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboOrderConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboOrderConsumerApplication.class, args);
    }

}
