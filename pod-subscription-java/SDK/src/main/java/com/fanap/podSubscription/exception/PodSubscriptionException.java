package com.fanap.podSubscription.exception;


public class PodSubscriptionException extends Throwable {

    public static final String errMsg = "خطایی اتفاق افتاده است. لطفا با پشتیبانی تماس بگیرید.";

    private int code;

    /**
     * @param code
     * @param message
     */

    private PodSubscriptionException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static PodSubscriptionException developerException(int code, String message) {

        return new PodSubscriptionException(code, message);
    }

    public static PodSubscriptionException unexpectedException() {

        return new PodSubscriptionException(PodSubscriptionExceptionConsts.UNEXPECTED_EXCEPTION, errMsg);
    }

    public static PodSubscriptionException invalidParameter(String msg) {
        return new PodSubscriptionException(PodSubscriptionExceptionConsts.INVALID_PARAMETER, msg);
    }
}
