package com.fanap.billingService.data.modelVo;


import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.TypeConversionUtil;

import java.io.Serializable;
import java.util.List;

public class SubInvoiceVO implements Serializable {
    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, serverType and invoiceId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String businessId;
    private String guildCode;
    private String billNumber;
    private String description;
    private String metadata;
    private List<InvoiceItemVO> invoiceItemVOs;

    public SubInvoiceVO(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.businessId = TypeConversionUtil.longToString(builder.getBusinessId());
        this.guildCode = builder.getGuildCode();
        this.billNumber = builder.getBillNumber();
        this.description = builder.getDescription();
        this.invoiceItemVOs = builder.getInvoiceItemVOs();
    }


    public String getGuildCode() {
        return guildCode;
    }


    public String getBillNumber() {
        return billNumber;
    }


    public String getDescription() {
        return description;
    }


    public String getMetadata() {
        return metadata;
    }


    public List<InvoiceItemVO> getInvoiceItemVOs() {
        return invoiceItemVOs;
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getBusinessId() {
        return businessId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private long businessId;
        private String guildCode;
        private String billNumber;
        private String description;
        private String metadata;
        private List<InvoiceItemVO> invoiceItemVOs;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public long getBusinessId() {
            return businessId;
        }

        public Builder setBusinessId(long businessId) {
            this.businessId = businessId;
            return this;
        }

        public String getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(String guildCode) {
            this.guildCode = guildCode;
            return this;
        }

        public String getBillNumber() {
            return billNumber;
        }

        public Builder setBillNumber(String billNumber) {
            this.billNumber = billNumber;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public String getMetadata() {
            return metadata;
        }

        public Builder setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        public List<InvoiceItemVO> getInvoiceItemVOs() {
            return invoiceItemVOs;
        }

        public Builder setInvoiceItemVOs(List<InvoiceItemVO> invoiceItemVOs) {
            this.invoiceItemVOs = invoiceItemVOs;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public SubInvoiceVO build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null)
                return new SubInvoiceVO(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}

