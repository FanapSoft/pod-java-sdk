package com.fanap.podDealing.data.modelVo;

import com.fanap.podDealing.exception.PodException;
import com.fanap.podDealing.util.PodServicesEnum;
import com.fanap.podDealing.util.TypeConversionUtil;

public class CommentBusinessListVo {


    /**
     * Created by Z.gholinia on 7/31/2019.
     */


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, offset , size and businessId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String businessId;
    private String firstId;
    private String lastId;
    private String offset;
    private String size;
    private static String scProductId;


    public String getBusinessId() {
        return businessId;
    }

    public String getFirstId() {
        return firstId;
    }

    public String getLastId() {
        return lastId;
    }

    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public CommentBusinessListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.businessId = TypeConversionUtil.longToString(builder.getBusinessId());
        this.firstId = TypeConversionUtil.longToString(builder.getFirstId());
        this.lastId = TypeConversionUtil.longToString(builder.getLastId());
        this.offset = TypeConversionUtil.longToString(builder.getOffset());
        this.size = TypeConversionUtil.longToString(builder.getSize());
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_COMMENT_BUSINESS_LIST);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long businessId;
        private Long firstId;
        private Long lastId;
        private Long offset;
        private Long size;


        public Long getFirstId() {
            return firstId;
        }

        public Builder setFirstId(Long firstId) {
            this.firstId = firstId;
            return this;
        }

        public Long getLastId() {
            return lastId;
        }

        public Builder setLastId(Long lastId) {
            this.lastId = lastId;
            return this;
        }

        public Long getOffset() {
            return offset;
        }

        public Builder setOffset(Long offset) {
            this.offset = offset;
            return this;
        }

        public Long getSize() {
            return size;
        }

        public Builder setSize(Long size) {
            this.size = size;
            return this;
        }

        public Long getBusinessId() {
            return businessId;
        }

        public Builder setBusinessId(Long businessId) {
            this.businessId = businessId;
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

        public CommentBusinessListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.businessId != null && this.size != null && this.offset != null)
                return new CommentBusinessListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}





















