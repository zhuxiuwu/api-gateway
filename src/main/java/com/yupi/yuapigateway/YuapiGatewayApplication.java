package com.yupi.yuapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class YuapiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuapiGatewayApplication.class, args);
    }



    // @Bean
    // public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
    //     return builder.routes()
    //             .route("tobaidu", r -> r.path("/baidu")
    //                     .uri("http://www.baidu.com"))
    //             .route("tome", r -> r.path("/yupiicu")
    //                     .uri("http://yupi.icu"))
    //             .build();
    // }

}
