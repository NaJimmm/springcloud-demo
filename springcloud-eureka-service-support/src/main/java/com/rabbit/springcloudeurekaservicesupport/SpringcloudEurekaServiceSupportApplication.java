package com.rabbit.springcloudeurekaservicesupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.rabbit"})
@EnableDiscoveryClient //代表自己是服务提供方
public class SpringcloudEurekaServiceSupportApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServiceSupportApplication.class, args);
    }

}
