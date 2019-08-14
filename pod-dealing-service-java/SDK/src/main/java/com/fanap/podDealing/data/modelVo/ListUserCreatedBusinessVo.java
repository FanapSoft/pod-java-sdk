package com.fanap.podDealing.data.modelVo;

import com.fanap.podDealing.exception.PodException;
import com.fanap.podDealing.util.TypeConversionUtil;

import java.util.List;

public class ListUserCreatedBusinessVo {

    /**
     * Created by Z.gholinia on 7/31/2019.
     */


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer and serverType are required parameters!";

    private BaseInfoVo baseInfoVo;
    private List<String> bizId;
    private List<String> guildCode;
    private String offset;
    private String size;
    private String query;
    private List<String> tags;
    private List<String> tagTrees;
    private String active;
    private String country;
    private String state;
    private String city;
    private String ssoId;
    private String username;
    private String businessName;
    private String sheba;
    private String nationalCode;
    private String economicCode;
    private String email;
    private String cellphone;

    public List<String> getBizId() {
        return bizId;
    }

    public List<String> getGuildCode() {
        return guildCode;
    }

    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public String getQuery() {
        return query;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<String> getTagTrees() {
        return tagTrees;
    }

    public String getActive() {
        return active;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getSsoId() {
        return ssoId;
    }

    public String getUsername() {
        return username;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getSheba() {
        return sheba;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getEconomicCode() {
        return economicCode;
    }

    public String getEmail() {
        return email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public ListUserCreatedBusinessVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.bizId = TypeConversionUtil.longToString(builder.getBizId());
        this.guildCode = builder.getGuildCode();
        this.offset = TypeConversionUtil.longToString(builder.getOffset());
        this.size = TypeConversionUtil.longToString(builder.getSize());
        this.query = builder.getQuery();
        this.tags = builder.getTags();
        this.tagTrees = builder.getTagTrees();
        this.active = builder.getActive();
        this.country = builder.getCountry();
        this.state = builder.getState();
        this.city = builder.getCity();
        this.ssoId = builder.getSsoId();
        this.username = builder.getUsername();
        this.businessName = builder.getBusinessName();
        this.sheba = builder.getSheba();
        this.nationalCode = builder.getNationalCode();
        this.economicCode = builder.getEconomicCode();
        this.email = builder.getEmail();
        this.cellphone = builder.getCellphone();
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private List<Long> bizId;
        private List<String> guildCode;
        private Long offset;
        private Long size;
        private String query;
        private List<String> tags;
        private List<String> tagTrees;
        private String active;
        private String country;
        private String state;
        private String city;
        private String ssoId;
        private String username;
        private String businessName;
        private String sheba;
        private String nationalCode;
        private String economicCode;
        private String email;
        private String cellphone;

        public List<Long> getBizId() {
            return bizId;
        }

        public Builder setBizId(List<Long> bizId) {
            this.bizId = bizId;
            return this;
        }

        public List<String> getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(List<String> guildCode) {
            this.guildCode = guildCode;
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

        public String getQuery() {
            return query;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public List<String> getTags() {
            return tags;
        }

        public Builder setTags(List<String> tags) {
            this.tags = tags;
            return this;
        }

        public List<String> getTagTrees() {
            return tagTrees;
        }

        public Builder setTagTrees(List<String> tagTrees) {
            this.tagTrees = tagTrees;
            return this;
        }

        public String getActive() {
            return active;
        }

        public Builder setActive(String active) {
            this.active = active;
            return this;
        }

        public String getCountry() {
            return country;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public String getState() {
            return state;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public String getCity() {
            return city;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public String getSsoId() {
            return ssoId;
        }

        public Builder setSsoId(String ssoId) {
            this.ssoId = ssoId;
            return this;
        }

        public String getUsername() {
            return username;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public String getBusinessName() {
            return businessName;
        }

        public Builder setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }

        public String getSheba() {
            return sheba;
        }

        public Builder setSheba(String sheba) {
            this.sheba = sheba;
            return this;
        }

        public String getNationalCode() {
            return nationalCode;
        }

        public Builder setNationalCode(String nationalCode) {
            this.nationalCode = nationalCode;
            return this;
        }

        public String getEconomicCode() {
            return economicCode;
        }

        public Builder setEconomicCode(String economicCode) {
            this.economicCode = economicCode;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getCellphone() {
            return cellphone;
        }

        public Builder setCellphone(String cellphone) {
            this.cellphone = cellphone;
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

        public ListUserCreatedBusinessVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getServerType() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.baseInfoVo.getToken_issuer() != null)
                return new ListUserCreatedBusinessVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }
}







