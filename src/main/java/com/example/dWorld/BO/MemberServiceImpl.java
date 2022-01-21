package com.example.dWorld.BO;


import com.example.dWorld.DAO.MemberDAO;
import com.example.dWorld.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberDAO memberDAO;

    @Override
    public List<Member> getAll(){
        return memberDAO.findAll();
    }


}
