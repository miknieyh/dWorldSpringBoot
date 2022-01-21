package com.example.dWorld.controller.api;

import com.example.dWorld.BO.MemberServiceImpl;
import com.example.dWorld.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/members")
public class MemberController {

    @Autowired
    MemberServiceImpl memberBO;


    @RequestMapping("")
    public @ResponseBody List<Member> getMembers(){

        return memberBO.getAll();
    }


    @RequestMapping("/member/{id}")
    public @ResponseBody String getMembers(@PathVariable String id){

        return id;
    }



}
