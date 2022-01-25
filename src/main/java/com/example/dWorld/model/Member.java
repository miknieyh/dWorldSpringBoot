package com.example.dWorld.model;


import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
}




