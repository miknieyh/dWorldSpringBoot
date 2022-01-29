package com.example.dWorld.service;

import com.example.dWorld.model.Board;
import com.example.dWorld.model.Result;

import java.util.List;

public interface BoardService {

    Result<List<Board>> mainList(int idx);
}
