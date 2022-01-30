package com.example.dWorld.service;

import com.example.dWorld.mapper.BoardMapper;
import com.example.dWorld.model.Board;
import com.example.dWorld.model.Result;
import com.example.dWorld.model.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
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

    @Override
    public void insertBoard(String contents, int stat, int idx, int g_idx) {
        try{
            boardMapper.insertBoard(contents,stat,idx,g_idx);
        }catch (SQLException e) {
            System.out.println(ResultCode.DBError.result());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(ResultCode.ETCError.result());
        }
    }

    @Override
    public Result<Integer> getDiaryIdx() {
        int d_idx = -1;
        try{
            d_idx = boardMapper.getDiaryIdx();
            return ResultCode.Success.result(d_idx);
        }catch (SQLException e) {
            return ResultCode.DBError.result();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultCode.ETCError.result();
        }
    }

    @Override
    public void insertPhoto(List<String> photo, int d_idx) {
        try{
            for(int i = 0 ; i < photo.size() ; i++){
                boardMapper.insertPhoto(photo.get(i),d_idx);
            }

        }catch (SQLException e) {
            System.out.println(ResultCode.DBError.result());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(ResultCode.ETCError.result());
        }
    }
}
