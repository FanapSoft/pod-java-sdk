package com.fanap.billingService.exception;


public class BillingException extends Throwable {

    public static final String errMsg = "خطایی اتفاق افتاده است. لطفا با پشتیبانی تماس بگیرید.";

    private int code;

    /**
     * @param code
     * @param message
     */

    private BillingException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static BillingException developerException(int code, String message) {

        return new BillingException(code, message);
    }

    public static BillingException unexpectedException() {

        return new BillingException(BillingExceptionConsts.UNEXPECTED_EXCEPTION, errMsg);
    }

    public static BillingException invalidParameter(String msg) {
        return new BillingException(BillingExceptionConsts.INVALID_PARAMETER, msg);
    }
}
