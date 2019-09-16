package com.fanap.podSubscription.data.modelVo;

import com.fanap.podSubscription.exception.PodSubscriptionException;
import com.fanap.podSubscription.util.TypeConversionUtil;

/**
 * Created by Z.gholinia on 7/31/2019.
 */

public class ConsumeSubscriptionVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and id are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;
    private String usedAmount;

    public String getId() {
        return id;
    }

    public String getUsedAmount() {
        return usedAmount;
    }

    public ConsumeSubscriptionVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.usedAmount = TypeConversionUtil.longToString(builder.getUsedAmount());

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long id;
        private Long usedAmount;

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Long getUsedAmount() {
            return usedAmount;
        }

        public Builder setUsedAmount(Long usedAmount) {
            this.usedAmount = usedAmount;
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

        public ConsumeSubscriptionVo build() throws PodSubscriptionException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.id != null && this.usedAmount!=null)
                return new ConsumeSubscriptionVo(this);
            else throw PodSubscriptionException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }
}





