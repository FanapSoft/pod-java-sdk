package com.fanap.billingService.data.modelVo;

import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.PodServicesEnum;
import com.fanap.billingService.util.TypeConversionUtil;

/**
 * Created by  Z.Gholinia on 9/30/2019.
 */
public class DeactivateVoucherVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuerm voucherId are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String voucherId;
    private static String scProductId;


    public DeactivateVoucherVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.voucherId = TypeConversionUtil.longToString(builder.getVoucherId());
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_BIZ_DEACTIVATE_VOUCHER);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long voucherId;

        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }


        public Long getVoucherId() {
            return voucherId;
        }

        public Builder setVoucherId(Long id) {
            this.voucherId = id;
            return this;
        }


        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public DeactivateVoucherVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null && this.voucherId != null)
                return new DeactivateVoucherVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
