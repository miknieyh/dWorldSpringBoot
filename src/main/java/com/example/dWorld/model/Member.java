package com.example.dWorld.model;


import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
public class Member {
    private int idx;
    private String userid;
    private String name;
    private String passwd;
    private String phone;
    private String nickname;
    private Timestamp wdate;
    private Date birth;
    private int stat;
    private String groupname;
    private int g_idx;
}
