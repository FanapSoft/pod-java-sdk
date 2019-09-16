package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.TypeConversionUtil;

public class AddDealerProductPermissionVo {


        private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and invoiceId are required parameters!";

        private BaseInfoVo baseInfoVo;
        private String productId  ;
        private String dealerBizId ;



        public AddDealerProductPermissionVo(Builder builder) {
            this.baseInfoVo = builder.getBaseInfoVo();
            this.dealerBizId = TypeConversionUtil.longToString(builder.getDealerBizId());
            this.productId= TypeConversionUtil.longToString(builder.productId);

        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public String getDealerBizId() {
            return dealerBizId;
        }

    public String getProductId() {
        return productId;
    }

    public static class Builder {

            private BaseInfoVo baseInfoVo;
            private Long dealerBizId ;
        private Long productId  ;


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

        public Long getProductId() {
            return productId;
        }

        public Builder setProductId(Long productId) {
            this.productId = productId;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
                return baseInfoVo;
            }

            public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
                this.baseInfoVo = baseInfoVo;
                return this;
            }

            public AddDealerProductPermissionVo build() throws PodException {
                if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                        this.baseInfoVo.getToken_issuer() != null && this.dealerBizId!=null && this.productId!=null)
                    return new AddDealerProductPermissionVo(this);
                else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
            }
        }
    }








