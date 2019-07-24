package com.fanap.userOperation.exception;


public class UserOperationException extends Throwable {

    public static final String errMsg = "خطایی اتفاق افتاده است. لطفا با پشتیبانی تماس بگیرید.";

    private int code;

    /**
     * @param code
     * @param message
     */
    private UserOperationException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static UserOperationException developerException(int code, String message) {

        return new UserOperationException(code, message);
    }

    public static UserOperationException unexpectedException() {

        return new UserOperationException(UserOperationExceptionConsts.UNEXPECTED_EXCEPTION, errMsg);
    }

    public static UserOperationException invalidParameter(String msg) {
        return new UserOperationException(UserOperationExceptionConsts.INVALID_PARAMETER, msg);
    }
}
