package com.fahoud.skeleton.common.api;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Fahoud
 * Date: 2020/7/11
 * Time: 10:52
 * Description:封装api的错误码
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
