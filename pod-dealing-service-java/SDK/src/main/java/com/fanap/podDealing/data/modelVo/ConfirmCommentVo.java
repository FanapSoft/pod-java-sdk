package com.fanap.podDealing.data.modelVo;

import com.fanap.podDealing.exception.PodException;
import com.fanap.podDealing.util.PodServicesEnum;
import com.fanap.podDealing.util.TypeConversionUtil;

public class ConfirmCommentVo {


    /**
     * Created by Z.gholinia on 7/31/2019.
     */


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, and commentId  are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String commentId;
    private static String scProductId;


    public String getCommentId() {
        return commentId;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public ConfirmCommentVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.commentId = TypeConversionUtil.longToString(builder.getCommentId());
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_BIZ_CONFIRM_COMMENT);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private Long commentId;


        public Long getCommentId() {
            return commentId;
        }

        public Builder setCommentId(Long commentId) {
            this.commentId = commentId;
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

        public ConfirmCommentVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.commentId != null)
                return new ConfirmCommentVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}








