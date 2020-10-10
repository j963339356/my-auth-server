package com.auth.common;

/**
 * 返回结果代码
 */
public enum ResultCodeEnum{
    SUCCESS(200,"操作成功"),
    FAILED(0,"操作失败"),
    VALIDATE_FAILED(1,"参数校验失败"),
    UNAUTHORIZED(2, "暂未登录或token已经过期"),
    FORBIDDEN(3, "没有操作权限");

    private int code;
    private String message;

    private ResultCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
