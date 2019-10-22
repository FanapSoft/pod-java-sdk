package com.fanap.podBaseService.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.PodServicesEnum;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.util.List;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class UpdateTagTreeCategoryVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and id are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;
    private String name;
    private String desc;
    private String enable;
    private static String scProductId;


    public UpdateTagTreeCategoryVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.name = builder.getName();
        this.desc = builder.getDesc();
        this.enable = TypeConversionUtil.booleanToString(builder.getEnable());
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_BIZ_UPDATE_TAG_TREE_CATEGORY);


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

    public String getDesc() {
        return desc;
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
        private String desc;
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

        public String getDesc() {
            return desc;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
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

        public UpdateTagTreeCategoryVo build() throws PodException {
            if (this.baseInfoVo != null &&
                    this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.id != null)
                return new UpdateTagTreeCategoryVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}

