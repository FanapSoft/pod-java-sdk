package com.fanap.billingService.config;

/**
 * Created By Askarian on 5/28/2019
 */
public enum BaseURLPrivate {

    SANDBOX("https://sandbox.pod.land:1033"),
    PRODUCTION("https://pay.pod.land");

    private final String value;

    BaseURLPrivate(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}

