package com.example.dWorld.service;


import com.example.dWorld.VO.MemberVO;
import com.example.dWorld.model.Member;
import com.example.dWorld.model.Result;

import java.util.List;

public interface MemberService {
    Result<List<Member>> getMembers();

    Result<MemberVO> getMember(String id);

    Result<Member> login(String id, String passwd);

    Result<Member> profile(int idx);
}
