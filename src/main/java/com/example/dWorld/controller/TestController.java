package com.example.dWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @GetMapping
    @RequestMapping("/test")
    public String test(){
        return "dir/test";
    }

    @GetMapping
    @RequestMapping("/test2")
    public String test2(){
        return "test";
    }

}
