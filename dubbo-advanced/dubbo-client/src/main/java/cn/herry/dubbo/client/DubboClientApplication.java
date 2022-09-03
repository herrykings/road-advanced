package cn.herry.dubbo.client;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author caoheng
 * @className DubboClientApplication
 * @date 2022/08/21
 **/
@SpringBootApplication
@EnableDubbo
public class DubboClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboClientApplication.class, args);
    }
}
