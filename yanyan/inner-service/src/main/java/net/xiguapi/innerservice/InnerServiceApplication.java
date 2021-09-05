package net.xiguapi.innerservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
@MapperScan("net.xiguapi.innerservice.dao")
public class InnerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InnerServiceApplication.class, args);
    }

    @GetMapping("/test")
    public String test(){
        System.out.println("test");
        return "test";
    }
}
