package com.auth.demo.common;

import io.swagger.annotations.ApiModelProperty;

/**
 * 通用返回结果
 * @param <T>
 */
public class CommonResult<T> {
    @ApiModelProperty(value = "成功或失败代码")
    private int code;
    @ApiModelProperty(value = "成功或失败信息")
    private String message;
    @ApiModelProperty(value = "传输的数据")
    private T data;

    protected CommonResult(){}

    protected CommonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回的结果
     * @param data 返回数据
     */
    public static <T> CommonResult<T> success(T data){
        return new CommonResult<T>(ResultCodeEnum.SUCCESS.getCode(),ResultCodeEnum.SUCCESS.getMessage(),data);
    }

    /**
     * 返回自定义成功提示
     * @param message 提示信息
     * @param data 返回数据
     */
    public static <T> CommonResult<T> success(String message, T data){
        return new CommonResult<T>(ResultCodeEnum.SUCCESS.getCode(),message,data);
    }

    /**
     * 返回默认错误
     */
    public static <T> CommonResult<T> faild(){
        return new CommonResult<T>(ResultCodeEnum.FAILED.getCode(), ResultCodeEnum.FAILED.getMessage(), null);
    }

    /**
     * 返回错误提示
     * @param errorEnum 默认错误枚举
     */
    public static <T> CommonResult<T> faild(ResultCodeEnum errorEnum){
        return new CommonResult<T>(errorEnum.getCode(), errorEnum.getMessage(), null);
    }

    /**
     * 返回默认错误码，自定义错误提示
     * @param message 提示信息
     */
    public static <T> CommonResult<T> faild(String message){
        return new CommonResult<T>(ResultCodeEnum.FAILED.getCode(), message, null);
    }

    /**
     *
     * @param errorEnum 自定义错误码
     * @param message 自定义错误提示
     * @return
     */
    public static <T> CommonResult<T> faild(ResultCodeEnum errorEnum, String message){
        return new CommonResult<T>(errorEnum.getCode(), message, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
