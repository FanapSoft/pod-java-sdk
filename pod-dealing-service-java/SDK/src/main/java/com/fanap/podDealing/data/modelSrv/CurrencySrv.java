package com.fanap.podDealing.data.modelSrv;


import java.io.Serializable;

/**
 * Created by h.mehrara on 3/3/2015.
 */
public class CurrencySrv implements Serializable {
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}