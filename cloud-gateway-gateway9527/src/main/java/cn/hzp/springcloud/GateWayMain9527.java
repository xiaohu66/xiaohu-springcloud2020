package cn.hzp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname GateWayMain9527
 * @Description TODO
 * @Date 2020/3/16 9:31
 * @Created by HuZP
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class);
    }
}
