package com.example.dWorld.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ResultCode {
    Success(0, "성공"),
    FAIL(1, "실패"),

    //100 번대 (회원관련)
    NOT_EXIST_USER(100, "존재하지 않는 유저입니다."),
    PASSWD_NOT_CORRECT(101,"비밀번호가 틀렸습니다."),






    //9000 번대 에러
    DBError(9998, "DB 오류"),
    ETCError(9999, "기타 오류");

    private int rtnCd;
    private String rtnMsg;

    ResultCode(int rtnCd, String rtnMsg) {
        this.rtnCd = rtnCd;
        this.rtnMsg = rtnMsg;
    }

    public <T> Result<T> result(T resultObject) {
        return new Result<T>(resultObject, this);
    }

    public <T> Result<T> result() {
        return new Result<T>(null, this);
    }

}
