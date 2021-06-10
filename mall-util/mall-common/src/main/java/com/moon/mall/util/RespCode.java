package com.moon.mall.util;

public enum RespCode {

    SUCCESS(200,"ok"),
    ERROR(500,"error"),
    SYSTEM_ERROR(501,"system error")
    ;
    private Integer code;
    private String message;

    RespCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    RespCode() {
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
