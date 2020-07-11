package com.fahoud.skeleton.common.exception;

import com.fahoud.skeleton.common.api.IErrorCode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Fahoud
 * Date: 2020/7/11
 * Time: 11:01
 * Description:自定义API异常
 */
public class ApiException extends RuntimeException{
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
