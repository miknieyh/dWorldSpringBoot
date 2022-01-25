package com.example.dWorld.controller.api;

import com.example.dWorld.VO.MemberVO;
import com.example.dWorld.model.Member;
import com.example.dWorld.model.Result;
import com.example.dWorld.service.MemberService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/members")
public class MemberController extends AbstractController {

    @Autowired
    private MemberService memberService;


    @RequestMapping("/all")
    public @ResponseBody
    Map<String, Object> getMembers() {
        Result<List<Member>> result = memberService.getMembers();
        return returnMap(result);
    }


    @RequestMapping("/member/{id}")
    public @ResponseBody
    Map<String, Object> getMembers(@PathVariable String id) {
        Result<MemberVO> result = memberService.getMember(id);
        return returnMap(result);
    }


}
