package com.example.dWorld.mapper;


import com.example.dWorld.model.Member;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface MemberMapper {
    List<Member> findMembers() throws SQLException;

    Member findMember(String id) throws SQLException;

}
