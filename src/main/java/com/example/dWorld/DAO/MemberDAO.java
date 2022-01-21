package com.example.dWorld.DAO;


import com.example.dWorld.model.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDAO {
    public List<Member> findAll();

}
