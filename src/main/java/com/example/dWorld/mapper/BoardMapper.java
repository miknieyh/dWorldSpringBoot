package com.example.dWorld.mapper;

import com.example.dWorld.model.Board;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface BoardMapper {

    List<Board> mainList(int idx) throws SQLException;
}
