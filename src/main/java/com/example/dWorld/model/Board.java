package com.example.dWorld.model;


import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private int idx;
    private String contents;
    private Timestamp wdate;
    private int stat;
    private String writer;
    private boolean mine;
    private ArrayList<String> photo;
    private String groupname;


}




