package com.example.dWorld.controller.api;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class L7healthCheckController {


    @RequestMapping("/L7check")
    public @ResponseBody
    String L7check() {
        return "OK";
    }
}
