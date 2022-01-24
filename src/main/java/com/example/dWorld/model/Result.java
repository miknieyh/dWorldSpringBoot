package com.example.dWorld.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Result<T> {
    private final T resultObject;
    private final ResultCode resultCode;

    public Result(T resultObject, ResultCode resultCode) {
        super();
        this.resultObject = resultObject;
        this.resultCode = resultCode;
    }

    public T getResultObject() {
        return resultObject;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}
