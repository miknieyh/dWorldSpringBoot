package com.example.dWorld.controller;


import com.example.dWorld.VO.MemberVO;
import com.example.dWorld.model.Board;
import com.example.dWorld.model.Member;
import com.example.dWorld.model.Result;
import com.example.dWorld.service.BoardService;
import com.example.dWorld.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private MemberService memberService;
    private BoardService boardService;

    @RequestMapping(value = "/main")
    public String main(Model model, HttpServletRequest request, @RequestParam Map<String, String> param) {
        HttpSession session = request.getSession();


        int idx;
        int stat;
        if (session.getAttribute("idx") == null) {
            idx = Integer.parseInt(param.get("idx"));
            stat = Integer.parseInt(param.get("stat"));
            String invite = param.get("invite");
            int g_idx = invite.equals("") ? -1 : Integer.parseInt(invite);
            if (g_idx != -1) {
                //memberService.groupInvite(idx,g_idx);
            }
            session.setAttribute("idx", idx);
            session.setAttribute("stat", stat);
        } else {
            idx = Integer.parseInt(String.valueOf(session.getAttribute("idx")));
            stat = Integer.parseInt(String.valueOf(session.getAttribute("stat")));
        }
        Result<Member> result = memberService.profile(idx);
        model.addAttribute("m", result.getResultObject());
        System.out.printf("idx : "+idx);


        Result<List<Board>> boardResult = boardService.mainList(idx);

        model.addAttribute("bArr", boardResult.getResultObject());


        return "main";
    }
}
