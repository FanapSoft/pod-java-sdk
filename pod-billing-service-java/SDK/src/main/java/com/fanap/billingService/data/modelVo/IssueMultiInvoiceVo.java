package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.JsonUtil;
import com.fanap.billingService.util.TypeConversionUtil;

import java.util.List;

/**
 * Created by  Z.Gholinia on 8/28/2019.
 */


public class IssueMultiInvoiceVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, ott, serverType and data are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String data;
    private List<String> delegatorId;
    private List<String> delegationHash;
    private String forceDelegation;

    public String getData() {
        return data;
    }

    public List<String> getDelegatorId() {
        return delegatorId;
    }

    public List<String> getDelegationHash() {
        return delegationHash;
    }

    public String getForceDelegation() {
        return forceDelegation;
    }


    public IssueMultiInvoiceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.data = builder.getData();
        this.delegatorId = TypeConversionUtil.longToString(builder.getDelegatorId());
        this.delegationHash = builder.getDelegationHash();
        ;
        this.forceDelegation = TypeConversionUtil.booleanToString(builder.isForceDelegation());


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private String data;
        private List<Long> delegatorId;
        private List<String> delegationHash;
        private boolean forceDelegation;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }


        public String getData() {
            return data;
        }

        public Builder setData(MultiInvoiceDataVo data) {
            this.data = JsonUtil.getJson(data);
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public List<Long> getDelegatorId() {
            return delegatorId;
        }

        public Builder setDelegatorId(List<Long> delegatorId) {
            this.delegatorId = delegatorId;
            return this;
        }

        public List<String> getDelegationHash() {
            return delegationHash;
        }

        public Builder setDelegationHash(List<String> delegationHash) {
            this.delegationHash = delegationHash;
            return this;
        }

        public boolean isForceDelegation() {
            return forceDelegation;
        }

        public Builder setForceDelegation(boolean forceDelegation) {
            this.forceDelegation = forceDelegation;
            return this;
        }


        public IssueMultiInvoiceVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.baseInfoVo.getOtt() != null && this.data!=null)
                return new IssueMultiInvoiceVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}


