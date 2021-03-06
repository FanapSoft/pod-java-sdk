package com.fanap.podSakku.data.modelVo;

import com.fanap.podSakku.exception.PodException;
import com.fanap.podSakku.util.TypeConversionUtil;

public class VerifyUserCommandPermissionVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Authorization , cmd, id are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String cmd;
    private String id;

    public VerifyUserCommandPermissionVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.cmd = builder.getCmd();
        this.id = TypeConversionUtil.longToString(builder.getId());
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getId() {
        return id;
    }

    public String getCmd() {
        return cmd;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String cmd;
        private Long id;

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public String getCmd() {
            return cmd;
        }

        public Builder setCmd(String cmd) {
            this.cmd = cmd;
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

        public VerifyUserCommandPermissionVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getAuthorization() != null &&
                    this.id != null && this.cmd != null)
                return new VerifyUserCommandPermissionVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
