package com.wanlima.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EdgingServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(EdgingServiceApplication.class, args);
    }
}
