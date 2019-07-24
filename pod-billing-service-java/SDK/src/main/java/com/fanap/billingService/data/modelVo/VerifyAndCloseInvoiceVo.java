package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.BillingException;
import com.fanap.billingService.util.TypeConversionUtil;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class VerifyAndCloseInvoiceVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and id are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;

    public VerifyAndCloseInvoiceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.id);
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getId() {
        return id;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long id;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public VerifyAndCloseInvoiceVo build() throws BillingException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.id != null)
                return new VerifyAndCloseInvoiceVo(this);
            else throw BillingException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
