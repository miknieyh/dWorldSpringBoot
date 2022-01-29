package com.example.dWorld.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class MainController {
    @PostMapping(value="/main")
    public String main(HttpServletRequest request, @RequestParam Map<String, String> param) {
        HttpSession session = request.getSession();
        String invite = param.get("invite");
        int idx = Integer.parseInt(param.get("idx"));
        int stat = Integer.parseInt(param.get("stat"));

        session.setAttribute("idx", idx);
        session.setAttribute("stat", stat);
        return "main";
    }
}
