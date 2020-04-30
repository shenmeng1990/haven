package com.alibaba.haven01.common;

import lombok.Data;


/**
 * @Author shenmeng
 * @Date 2020-04-30
 **/
@Data
public class HavenResult<T> extends BaseDTO {

    private Boolean success = true;

    private Long total = 0L;

    private String code;

    private T result;

    private String msg;

    public static <T> HavenResult<T> successResult(){
        HavenResult<T> havenResult = new HavenResult<>();
        havenResult.setSuccess(true);
        return havenResult;
    }

    public static <T> HavenResult<T> successResultWithMsg(String msg){
        HavenResult<T> havenResult = new HavenResult<>();
        havenResult.setSuccess(true);
        havenResult.setMsg(msg);
        return havenResult;
    }

    public static <T> HavenResult<T> successResult(T data){
        HavenResult<T> havenResult = new HavenResult<>();
        havenResult.setSuccess(true);
        havenResult.setResult(data);
        return havenResult;
    }

    public static <T> HavenResult<T> successResult(T data,Long total){
        HavenResult<T> havenResult = new HavenResult<>();
        havenResult.setSuccess(true);
        havenResult.setResult(data);
        havenResult.setTotal(total);
        return havenResult;
    }

    public static <T> HavenResult<T> failResult(){
        HavenResult<T> havenResult = new HavenResult<>();
        havenResult.setSuccess(false);
        return havenResult;
    }

    public static <T> HavenResult<T> failResult(String code){
        HavenResult<T> havenResult = new HavenResult<>();
        havenResult.setSuccess(false);
        havenResult.setCode(code);
        return havenResult;
    }

    public static <T> HavenResult<T> failResult(String code,String msg){
        HavenResult<T> havenResult = new HavenResult<>();
        havenResult.setSuccess(false);
        havenResult.setCode(code);
        havenResult.setMsg(msg);
        return havenResult;
    }


}
