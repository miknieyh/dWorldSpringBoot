package com.example.dWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class TestController {

    @GetMapping
    @RequestMapping("/test")
        public String test(Model model, @RequestParam Map<String, String> param){
            String invite  = param.get("invite");
            String userid  = param.get("userid");
        String passwd  = param.get("passwd");

        model.addAllAttributes(param);


        //model.addAttribute("invite", invite);
        return "dir/test";
    }

    @GetMapping
    @RequestMapping("/test2")
    public String test2(){
        return "test";
    }

}
