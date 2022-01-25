package com.example.dWorld.model;


import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

@Getter
@Setter
public class Board {
    private int idx;
    private String contents;
    private Timestamp wdate;
    private int stat;
    private String writer;
    private boolean mine;
    private ArrayList<String> photo;
    private String groupname;

    public Board(int idx, String contents, Timestamp wdate, String writer, int stat, ArrayList<String> photo , String groupname) {
        this.idx = idx;
        this.contents= contents;
        this.wdate=wdate;
        this.writer = writer;
        this.stat = stat;
        this.photo = photo;
        this.groupname= groupname;
    }
    public Board(int idx, String contents, Timestamp wdate, int stat, String writer, boolean mine,
                     ArrayList<String> photo) {
        this.idx = idx;
        this.contents = contents;
        this.wdate = wdate;
        this.stat = stat;
        this.writer = writer;
        this.mine = mine;
        this.photo = photo;

    }




}




