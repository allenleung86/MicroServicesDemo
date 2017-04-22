package com.kfit.test.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// 标记为：restful
@RequestMapping("/")
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "Hello world!";
    }

    @RequestMapping("/hello")
    public String hello2() {
        return "Hello world2!";
    }
}