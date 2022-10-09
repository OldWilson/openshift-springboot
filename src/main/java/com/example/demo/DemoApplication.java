package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String home() throws UnknownHostException {
        return "Hello World! " +  InetAddress.getLocalHost().getHostAddress();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}