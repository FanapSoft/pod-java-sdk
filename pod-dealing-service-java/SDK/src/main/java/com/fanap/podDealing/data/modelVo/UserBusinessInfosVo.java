package com.fanap.podDealing.data.modelVo;

import com.fanap.podDealing.exception.PodException;
import com.fanap.podDealing.util.PodServicesEnum;
import com.fanap.podDealing.util.TypeConversionUtil;

import java.util.List;

public class UserBusinessInfosVo {


    /**
     * Created by Z.gholinia on 7/31/2019.
     */


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and id are required parameters!";

    private BaseInfoVo baseInfoVo;
    private List<String> id;
    private static String scProductId;


    public UserBusinessInfosVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_USER_BUSINESS_INFOS);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public List<String> getId() {
        return id;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private List<Long> id;


        public List<Long> getId() {
            return id;
        }

        public Builder setId(List<Long> id) {
            this.id = id;
            return this;
        }

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

        public UserBusinessInfosVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.id != null)
                return new UserBusinessInfosVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}





