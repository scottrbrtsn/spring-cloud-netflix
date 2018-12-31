package com.scottrbrtsn.cloud.netflix.eureka.client.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public interface GreetingController {
    @RequestMapping("/greeting")
    String greeting();
}