package com.fanap.podDealing.data.modelVo;

import com.fanap.podDealing.exception.PodException;
import com.fanap.podDealing.util.PodServicesEnum;
import com.fanap.podDealing.util.TypeConversionUtil;

public class GuildListVo {

    /**
     * Created by Z.gholinia on 7/31/2019.
     */


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, offset and size are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String name;
    private String offset;
    private String size;
    private static String scProductId;


    public String getName() {
        return name;
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

    public GuildListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.size = TypeConversionUtil.longToString(builder.getSize());
        this.offset = TypeConversionUtil.longToString(builder.getOffset());
        this.name = builder.getName();
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_GUILD_LIST);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String name;
        private Long offset;
        private Long size;


        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
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

        public GuildListVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.size != null && this.offset != null)
                return new GuildListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}










