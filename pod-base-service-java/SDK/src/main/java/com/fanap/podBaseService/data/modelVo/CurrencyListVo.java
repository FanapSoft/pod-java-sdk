package com.fanap.podBaseService.data.modelVo;


import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.PodServicesEnum;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.util.List;

public class CurrencyListVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer are required parameters!";

    private BaseInfoVo baseInfoVo;
    private static String scProductId;


    public CurrencyListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_CURRENCY_LIST);


    }

    public static String getScProductId() {
        return scProductId;
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }


    public static class Builder{

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


        public CurrencyListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null)
                return new CurrencyListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }


}
