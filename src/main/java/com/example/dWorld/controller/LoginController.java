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
public class LoginController extends AbstractController  {

    @Autowired
    private MemberService memberService;


    @GetMapping
    public String loginOk(HttpServletRequest request ,@RequestParam String invite , @RequestParam String userid, @RequestParam String passwd){
        Result<Member> result = memberService.login(userid,passwd);
        HttpSession session = request.getSession();
        int idx = result.getResultObject().getIdx();
        int stat = result.getResultObject().getStat();

        if (idx == -1){
            System.out.println("로그인 실패");
            return "redirect:/index";
        }else{
            int g_idx = invite.equals("") ? -1: Integer.parseInt(invite);
            if (g_idx != -1){
                //memberService.groupInvite(idx,g_idx);
            }
            session.setAttribute("idx",idx);
            session.setAttribute("stat",stat);
            return "redirect:/main";

        }
    }





}
