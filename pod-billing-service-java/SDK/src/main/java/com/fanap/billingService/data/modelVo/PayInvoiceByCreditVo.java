package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.TypeConversionUtil;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class PayInvoiceByCreditVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and invoiceId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String invoiceId;
    private String delegatorId;
    private String delegationHash;
    private String forceDelegation;
    private String wallet;

    public PayInvoiceByCreditVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.invoiceId = TypeConversionUtil.longToString(builder.getInvoiceId());
        this.delegationHash = builder.getDelegationHash();
        this.delegatorId = TypeConversionUtil.longToString(builder.getDelegatorId());
        this.forceDelegation = builder.getForceDelegation();
        this.wallet = builder.getWallet();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getWallet() {
        return wallet;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getDelegatorId() {
        return delegatorId;
    }

    public String getDelegationHash() {
        return delegationHash;
    }

    public String getForceDelegation() {
        return forceDelegation;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long invoiceId;
        private Long delegatorId;
        private String delegationHash;
        private String forceDelegation;
        private String wallet;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public String getWallet() {
            return wallet;
        }

        public Builder setWallet(String wallet) {
            this.wallet = wallet;
            return this;
        }

        public Long getDelegatorId() {
            return delegatorId;
        }

        public Builder setDelegatorId(Long delegatorId) {
            this.delegatorId = delegatorId;
            return this;
        }

        public String getDelegationHash() {
            return delegationHash;
        }

        public Builder setDelegationHash(String delegationHash) {
            this.delegationHash = delegationHash;
            return this;
        }

        public String getForceDelegation() {
            return forceDelegation;
        }

        public Builder setForceDelegation(String forceDelegation) {
            this.forceDelegation = forceDelegation;
            return this;
        }

        public Long getInvoiceId() {
            return invoiceId;
        }

        public Builder setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public PayInvoiceByCreditVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.getInvoiceId() != null)
                return new PayInvoiceByCreditVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
