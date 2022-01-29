package com.example.dWorld.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @RequestMapping(value="/")
    public String main(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if(session.getAttribute("idx")==null){
            return "index";
        }else{
            return "./main";
        }

    }

    @RequestMapping(value="/join")
    public String join() {
        return "join";
    }

    @RequestMapping(value="/mypage")
    public String mypage() {
        return "mypage";
    }

    @RequestMapping(value="/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("idx");
        session.removeAttribute("stat");
        return "index";
    }



}
