package com.fanap.SsoService.data.modelVo;

/**
 * Created by Shahab Askarian on 6/20/2019.
 */
public class ClientInfoVo {
    private String client_id;
    private String client_secret;

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }
}
