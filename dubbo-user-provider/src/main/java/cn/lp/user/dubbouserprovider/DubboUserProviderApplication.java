package cn.lp.user.dubbouserprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboUserProviderApplication.class, args);
    }

}
