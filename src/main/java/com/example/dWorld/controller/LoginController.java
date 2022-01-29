package com.example.dWorld.controller;

import com.example.dWorld.controller.api.AbstractController;
import com.example.dWorld.model.Member;
import com.example.dWorld.model.Result;
import com.example.dWorld.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/loginOk")
public class LoginController {

    @Autowired
    private MemberService memberService;


    @GetMapping
    public String loginOk(HttpServletRequest request, @RequestParam Map<String, String> param) {
        HttpSession session = request.getSession();
        String invite = param.get("invite");
        int idx = Integer.parseInt(param.get("idx"));
        int stat = Integer.parseInt(param.get("stat"));

        if (idx == -1) {
            System.out.println("로그인 실패");
            return "redirect:/index";
        } else {
            int g_idx = invite.equals("") ? -1 : Integer.parseInt(invite);
            if (g_idx != -1) {
                //memberService.groupInvite(idx,g_idx);
            }
            session.setAttribute("idx", idx);
            session.setAttribute("stat", stat);
            return "redirect:/main";

        }
    }


}
