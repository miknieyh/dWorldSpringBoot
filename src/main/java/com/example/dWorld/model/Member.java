package com.example.dWorld.model;


import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
public class Member {
    private int idx;
    private String id;
    private String name;
    private String passwd;
    private String phone;
    private String nickname;
    private Timestamp wdate;
    private Date birth;
    private int stat;
    private String groupname;
    private int g_idx;

    public Member(int idx, String id, String name, String passwd, String phone, String nickname,
                      Timestamp wdate, Date birth, int stat) {
        this.idx = idx;
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.phone = phone;
        this.nickname = nickname;
        this.wdate = wdate;
        this.birth = birth;
        this.stat = stat;
    }
    public Member (String id, String name, String nickname) {
        this.id=id;
        this.name = name;
        this.nickname=nickname;
    }
    public Member(int idx, int stat) {
        this.idx=idx;
        this.stat=stat;
    }

}




