package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.TypeConversionUtil;

public class PayInvoiceByInvoiceVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType, creditorInvoiceId and debtorInvoiceId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String creditorInvoiceId;
    private String debtorInvoiceId;


    public String getCreditorInvoiceId() {
        return creditorInvoiceId;
    }

    public String getDebtorInvoiceId() {
        return debtorInvoiceId;
    }

    public PayInvoiceByInvoiceVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.creditorInvoiceId = TypeConversionUtil.longToString(builder.getCreditorInvoiceId());
        this.debtorInvoiceId = TypeConversionUtil.longToString(builder.getDebtorInvoiceId());

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }


    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long creditorInvoiceId;
        private Long debtorInvoiceId;


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

        public Long getCreditorInvoiceId() {
            return creditorInvoiceId;
        }

        public Builder setCreditorInvoiceId(Long creditorInvoiceId) {
            this.creditorInvoiceId = creditorInvoiceId;
            return this;
        }

        public Long getDebtorInvoiceId() {
            return debtorInvoiceId;
        }

        public Builder setDebtorInvoiceId(Long debtorInvoiceId) {
            this.debtorInvoiceId = debtorInvoiceId;
            return this;
        }

        public PayInvoiceByInvoiceVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.getCreditorInvoiceId() != null && this.getDebtorInvoiceId() != null)
                return new PayInvoiceByInvoiceVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}












