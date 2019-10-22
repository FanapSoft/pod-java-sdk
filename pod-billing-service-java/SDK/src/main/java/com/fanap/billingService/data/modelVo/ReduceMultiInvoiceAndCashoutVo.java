package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.JsonUtil;
import com.fanap.billingService.util.PodServicesEnum;
import com.fanap.billingService.util.TypeConversionUtil;

/**
 * Created by  Z.Gholinia on 8/28/2019.
 */

public class ReduceMultiInvoiceAndCashoutVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and data are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String data;
    private String toolCode;
    private static String scProductId;

    public String getToolCode() {
        return toolCode;
    }


    public ReduceMultiInvoiceAndCashoutVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.data = builder.getData();
        this.toolCode = builder.getToolCode();
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_BIZ_REDUCE_MULTI_INVOICE_AND_CASHOUT);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getData() {
        return data;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private String data;
        private String toolCode;

        public String getToolCode() {
            return toolCode;
        }

        public Builder setToolCode(String toolCode) {
            this.toolCode = toolCode;
            return this;
        }


        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public String getData() {
            return data;
        }

        public Builder setData(ReduceMultiInvoiceDataVo data) {
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

        public ReduceMultiInvoiceAndCashoutVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.data != null)
                return new ReduceMultiInvoiceAndCashoutVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}




