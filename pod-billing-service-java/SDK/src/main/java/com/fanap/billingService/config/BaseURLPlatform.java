package com.fanap.billingService.config;

/**
 * Created By Askarian on 5/28/2019
 */
public enum BaseURLPlatform {

    SANDBOX("http://sandbox.pod.land"),
    PRODUCTION("https://api.pod.land");

    private final String value;

    BaseURLPlatform(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}

