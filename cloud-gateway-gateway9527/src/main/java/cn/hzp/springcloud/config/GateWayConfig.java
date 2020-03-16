package cn.hzp.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname GateWayConfig
 * @Description TODO
 * @Date 2020/3/16 9:32
 * @Created by HuZP
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path route atguigu",
                r ->r.path("/guonei").uri("https://www.baidu.com")).build();
        return routes.build();
    }
}

