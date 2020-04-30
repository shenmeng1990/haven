package com.alibaba.haven01.common;

/**
 * @Author shenmeng
 * @Date 2020-04-30
 **/
public class HavenException extends RuntimeException {

    public HavenException() {
    }

    public HavenException(String message) {
        super(message);
    }

    public HavenException(String message, Throwable cause) {
        super(message, cause);
    }

    public HavenException(Throwable cause) {
        super(cause);
    }

    public HavenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
