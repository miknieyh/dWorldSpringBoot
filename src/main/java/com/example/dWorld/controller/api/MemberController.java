package com.example.dWorld.controller.api;

import com.example.dWorld.VO.MemberVO;
import com.example.dWorld.model.Member;
import com.example.dWorld.model.Result;
import com.example.dWorld.model.ResultCode;
import com.example.dWorld.service.MemberService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/member")
    public @ResponseBody
    Map<String, Object> login(@RequestBody Map<String, String> param) {
        String userid= param.get("userid");
        String passwd= param.get("passwd");
        Result<Member> result = memberService.login(userid, passwd);

        return returnMap(result);
    }


}
