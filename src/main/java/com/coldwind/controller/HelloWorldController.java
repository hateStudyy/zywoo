package com.coldwind.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author coldwind
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("")
    public String hello(){
        log.info("接收到请求！");
        return "你好！";
    }
}
