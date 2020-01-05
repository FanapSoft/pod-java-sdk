package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.PodServicesEnum;
import com.fanap.billingService.util.TypeConversionUtil;

public class DealingProductPermissionListVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String entityId;
    private String dealingBusinessId;
    private String enable;
    private String offset;
    private String size;
    private static String scProductId;


    public DealingProductPermissionListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.entityId = TypeConversionUtil.longToString(builder.getEntityId());
        this.dealingBusinessId = TypeConversionUtil.longToString(builder.getDealingBusinessId());
        this.enable = TypeConversionUtil.booleanToString(builder.getEnable());
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.size = TypeConversionUtil.intToString(builder.getSize());
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_BIZ_DEALING_PRODUCT_PERMISSION_LIST);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getDealingBusinessId() {
        return dealingBusinessId;
    }

    public String getEnable() {
        return enable;
    }

    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public String getEntityId() {
        return entityId;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long entityId;
        private Long dealingBusinessId;
        private boolean enable;

        public Long getEntityId() {
            return entityId;
        }


        public Builder setEntityId(Long productId) {
            this.entityId = productId;
            return this;
        }

        private int offset;
        private int size;


        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public Long getDealingBusinessId() {
            return dealingBusinessId;
        }

        public Builder setDealingBusinessId(Long dealingBusinessId) {
            this.dealingBusinessId = dealingBusinessId;
            return this;
        }

        public boolean getEnable() {
            return enable;
        }

        public Builder setEnable(boolean enable) {
            this.enable = enable;
            return this;
        }

        public int getOffset() {
            return offset;
        }

        public Builder setOffset(int offset) {
            this.offset = offset;
            return this;
        }

        public int getSize() {
            return size;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public DealingProductPermissionListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null)
                return new DealingProductPermissionListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}







