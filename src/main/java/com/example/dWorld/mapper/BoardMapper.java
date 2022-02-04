package com.example.dWorld.mapper;

import com.example.dWorld.model.Board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.jdbc.SQL;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Mapper
public interface BoardMapper {

    List<Board> mainList(int idx) throws SQLException;

    void insertBoard(String contents, int stat, int idx, int g_idx) throws SQLException;

    int getDiaryIdx() throws SQLException;

    void insertPhoto(String photo, int d_idx) throws SQLException;

    List<String> mainPhoto(int idx) throws SQLException;

}
