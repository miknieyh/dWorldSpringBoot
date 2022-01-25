package com.example.dWorld.service;


import com.example.dWorld.VO.MemberVO;
import com.example.dWorld.mapper.MemberMapper;
import com.example.dWorld.model.Member;
import com.example.dWorld.model.Result;
import com.example.dWorld.model.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberMapper memberMapper;

    @Override
    public Result<List<Member>> getMembers() {
        List<Member> memberList;
        try {
            memberList = memberMapper.findMembers();
            return ResultCode.Success.result(memberList);
        } catch (SQLException e) {
            return ResultCode.DBError.result();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultCode.ETCError.result();
        }
    }

    @Override
    public Result<MemberVO> getMember(String id) {
        Member member = null;
        try {
            member = memberMapper.findMember(id);
        } catch (SQLException e) {
            return ResultCode.DBError.result();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultCode.ETCError.result();
        }

        if (member == null) {
            return ResultCode.NOT_EXIST_USER.result();
        }

        return ResultCode.Success.result(
                MemberVO.builder()
                .name(member.getName())
                .nickname(member.getNickname())
                .build()
        );
    }

    @Override
    public Result<Member> login(String id, String passwd) {
        int stat = -1;
        int idx = -1;
        Member member = null;
        try {
            member = memberMapper.findMember(id);
            if (member == null) {
                return ResultCode.NOT_EXIST_USER.result();
            }

            if (!passwd.equals(member.getPasswd())) {
                System.out.println("비밀번호가 틀렸습니다");
                return ResultCode.FAIL.result();
            }


            member.setPasswd("");
            return ResultCode.Success.result(member);
        } catch (SQLException e) {
            return ResultCode.DBError.result();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultCode.ETCError.result();
        }
    }

}
