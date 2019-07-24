package com.fanap.userOperation.data.modelVo;

import com.fanap.userOperation.exception.UserOperationException;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class BaseInfoVo {

    private String token;
    private String token_issuer;
    private String client_id;
    private String client_secret;

    public String getToken() {
        return token;
    }

    public BaseInfoVo setToken(String token) {
        this.token = token;
        return this;
    }

    public String getToken_issuer() {
        return token_issuer;
    }

    public BaseInfoVo setToken_issuer(String token_issuer) {
        this.token_issuer = token_issuer;
        return this;
    }

    public String getClient_id() {
        return client_id;
    }

    public BaseInfoVo setClient_id(String client_id) {
        this.client_id = client_id;
        return this;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public BaseInfoVo setClient_secret(String client_secret) {
        this.client_secret = client_secret;
        return this;
    }
}
