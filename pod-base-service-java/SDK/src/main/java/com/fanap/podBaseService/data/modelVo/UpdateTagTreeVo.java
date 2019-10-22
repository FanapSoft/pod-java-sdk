package com.fanap.podBaseService.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.PodServicesEnum;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.util.List;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class UpdateTagTreeVo {

    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and id are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;
    private String name;
    private String parentId;
    private String enable;
    private static String scProductId;


    public UpdateTagTreeVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.name = builder.getName();
        this.parentId = TypeConversionUtil.longToString(builder.getParentId());
        this.enable = TypeConversionUtil.booleanToString(builder.getEnable());
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_BIZ_UPDATE_TAG_TREE);


    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getParentId() {
        return parentId;
    }

    public String getEnable() {
        return enable;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder{

        private BaseInfoVo baseInfoVo;
        private Long id;
        private String name;
        private Long parentId;
        private Boolean enable;


        public Builder(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
        }

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Long getParentId() {
            return parentId;
        }

        public Builder setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }

        public Boolean getEnable() {
            return enable;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public UpdateTagTreeVo build() throws PodException {
            if (this.baseInfoVo != null &&
                    this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.id != null)
                return new UpdateTagTreeVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}

