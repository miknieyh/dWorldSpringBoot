package com.example.dWorld.service;

import com.example.dWorld.model.Board;
import com.example.dWorld.model.Result;

import java.util.List;

public interface BoardService {

    Result<List<Board>> mainList(int idx);
    void insertBoard(String contents,int stat, int idx, int g_idx);
    Result<Integer> getDiaryIdx();
    void insertPhoto(List<String> photo, int d_idx);
}
