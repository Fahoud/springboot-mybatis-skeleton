package com.fahoud.skeleton.common.exception;

import com.fahoud.skeleton.common.api.IErrorCode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Fahoud
 * Date: 2020/7/11
 * Time: 11:02
 * Description:断言处理类，用于抛出各种API异常
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
