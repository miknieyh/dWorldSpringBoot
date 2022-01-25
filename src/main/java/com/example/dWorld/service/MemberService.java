package com.example.dWorld.service;


import com.example.dWorld.model.Member;
import com.example.dWorld.model.Result;

import java.util.List;

public interface MemberService {
    Result<List<Member>> getMembers();

    Result<Member> getMember(String id);

    Result<Member> login(String id, String passwd);
}
