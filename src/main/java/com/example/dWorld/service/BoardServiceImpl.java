package com.example.dWorld.service;

import com.example.dWorld.mapper.BoardMapper;
import com.example.dWorld.mapper.MemberMapper;
import com.example.dWorld.model.Board;
import com.example.dWorld.model.Result;
import com.example.dWorld.model.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.List;

public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardMapper boardMapper;

    /**
     * 
     * @see com.example.dWorld.service.BoardService#mainList(int) 
     *
     */
    @Override
    public Result<List<Board>> mainList(int idx) {
        List<Board> boardList;
        try{
            boardList = boardMapper.mainList(idx);
            return ResultCode.Success.result(boardList);
        }catch (SQLException e) {
            return ResultCode.DBError.result();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultCode.ETCError.result();
        }

    }
}
