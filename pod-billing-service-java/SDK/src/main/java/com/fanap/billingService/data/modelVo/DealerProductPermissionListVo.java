package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.TypeConversionUtil;

public class DealerProductPermissionListVo {





        private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and invoiceId are required parameters!";

        private BaseInfoVo baseInfoVo;
        private String productId;
        private String dealerBizId ;
        private String enable;
        private String offset;
        private String size;


    public String getProductId() {
        return productId;
    }

    public DealerProductPermissionListVo(Builder builder) {
            this.baseInfoVo = builder.getBaseInfoVo();
            this.productId = TypeConversionUtil.longToString(builder.getProductId());
            this.dealerBizId = TypeConversionUtil.longToString(builder.getDealerBizId());
            this.enable = TypeConversionUtil.booleanToString(builder.getEnable());
            this.offset = TypeConversionUtil.intToString(builder.getOffset());
            this.size = TypeConversionUtil.intToString(builder.getSize());

        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public String getDealerBizId() {
            return dealerBizId;
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

        public static class Builder {

            private BaseInfoVo baseInfoVo;
            private Long productId;
            private Long dealerBizId ;
            private boolean enable;

            public Long getProductId() {
                return productId;
            }

            public Builder setProductId(Long productId) {
                this.productId = productId;
                return this;
            }

            private int offset;
            private int size;


            public Builder(BaseInfoVo baseInfoVo) {
                this.baseInfoVo = baseInfoVo;
            }

            public Long getDealerBizId() {
                return dealerBizId;
            }

            public Builder setDealerBizId(Long dealerBizId) {
                this.dealerBizId = dealerBizId;
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

            public DealerProductPermissionListVo build() throws PodException {
                if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                        this.baseInfoVo.getToken_issuer() != null )
                    return new DealerProductPermissionListVo(this);
                else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
            }
        }
    }




