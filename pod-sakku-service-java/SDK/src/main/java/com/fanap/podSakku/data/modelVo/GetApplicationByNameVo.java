package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;

public class GetApplicationByNameVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , name  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String name;


    public GetApplicationByNameVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.name = builder.getName();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String name;


        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
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

        public GetApplicationByNameVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.name != null)
                return new GetApplicationByNameVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
