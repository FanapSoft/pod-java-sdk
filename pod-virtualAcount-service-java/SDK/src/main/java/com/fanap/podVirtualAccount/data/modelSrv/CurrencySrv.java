package com.fanap.podVirtualAccount.data.modelSrv;


import java.io.Serializable;

/**
 * Created by Zahra Golinia on 2/4/2020.
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
