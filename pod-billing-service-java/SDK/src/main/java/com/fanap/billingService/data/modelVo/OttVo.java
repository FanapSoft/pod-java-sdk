package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.BillingException;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class OttVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token and token_issuer are required parameters!";

    private BaseInfoVo baseInfoVo;

    public OttVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public OttVo build() throws BillingException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null)
                return new OttVo(this);
            else throw BillingException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
