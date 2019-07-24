package com.fanap.SsoService.exception;


public class SsoServiceException extends Throwable {

    public static final String errMsg = "خطایی اتفاق افتاده است. لطفا با پشتیبانی تماس بگیرید.";

    private int code;

    /**
     * @param code
     * @param message
     */
    private SsoServiceException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static SsoServiceException developerException(int code, String message) {

        return new SsoServiceException(code, message);
    }

    public static SsoServiceException unexpectedException() {

        return new SsoServiceException(SsoServiceExceptionConsts.UNEXPECTED_EXCEPTION, errMsg);
    }

    public static SsoServiceException invalidParameter(String msg) {
        return new SsoServiceException(SsoServiceExceptionConsts.INVALID_PARAMETER, msg);
    }
}
