package com.fanap.podDealing.data.modelVo;

import com.fanap.podDealing.exception.PodException;
import java.util.ArrayList;
import java.util.List;

public class AddUserAndBusinessVo {

    /**
     * Created by Z.gholinia on 7/31/2019.
     */


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer,serverType, username, businessName, email, " +
            "guildCode, country, state, city, address, description, agentFirstName, agentLastName and agentCellphoneNumber are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String username;
    private String businessName;
    private String firstName;
    private String lastName;
    private String sheba;
    private String nationalCode;
    private String economicCode;
    private String registrationNumber;
    private String email;
    private List<String> guildCode;
    private String cellphone;
    private String phone;
    private String fax;
    private String postalCode;
    private String country;
    private String state;
    private String city;
    private String address;
    private String description;
    private String newsReader;
    private String logoImage;
    private String coverImage;
    private String tags;
    private String tagTrees;
    private String tagTreeCategoryName;
    private String link;
    private String lat;
    private String lng;
    private String agentFirstName;
    private String agentLastName;
    private String agentCellphoneNumber;
    private String agentNationalCode;

    public static String getRequiredParameterErrorMessage() {
        return REQUIRED_PARAMETER_ERROR_MESSAGE;
    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getUsername() {
        return username;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getGuildCode() {
        return guildCode;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getPostalCode() {
        return postalCode;
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

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public String getNewsReader() {
        return newsReader;
    }

    public String getLogoImage() {
        return logoImage;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public String getTags() {
        return tags;
    }

    public String getTagTrees() {
        return tagTrees;
    }

    public String getTagTreeCategoryName() {
        return tagTreeCategoryName;
    }

    public String getLink() {
        return link;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public String getAgentFirstName() {
        return agentFirstName;
    }

    public String getAgentLastName() {
        return agentLastName;
    }

    public String getAgentCellphoneNumber() {
        return agentCellphoneNumber;
    }

    public String getAgentNationalCode() {
        return agentNationalCode;
    }

    public AddUserAndBusinessVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.username = builder.getUsername();
        this.businessName = builder.getBusinessName();
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.sheba = builder.getSheba();
        this.nationalCode = builder.getNationalCode();
        this.economicCode = builder.getEconomicCode();
        this.registrationNumber = builder.getRegistrationNumber();
        this.email = builder.getEmail();
        this.guildCode = builder.getGuildCode();
        this.cellphone = builder.getCellphone();
        this.phone = builder.getPhone();
        this.fax = builder.getFax();
        this.postalCode = builder.getPostalCode();
        this.country = builder.getCountry();
        this.state = builder.getState();
        this.city = builder.getCity();
        this.address = builder.getAddress();
        this.description = builder.getDescription();
        this.newsReader = builder.getNewsReader();
        this.logoImage = builder.getLogoImage();
        this.coverImage = builder.getCoverImage();
        this.tags = builder.getTags();
        this.tagTrees = builder.getTagTrees();
        this.tagTreeCategoryName = builder.getTagTreeCategoryName();
        this.link = builder.getLink();
        this.lat = builder.getLat();
        this.lng = builder.getLng();
        this.agentFirstName = builder.getAgentFirstName();
        this.agentLastName = builder.getAgentLastName();
        this.agentCellphoneNumber = builder.getAgentCellphoneNumber();
        this.agentNationalCode = builder.getAgentNationalCode();


    }


    public static class Builder {
        private BaseInfoVo baseInfoVo;
        private String username;
        private String businessName;
        private String firstName;
        private String lastName;
        private String sheba;
        private String nationalCode;
        private String economicCode;
        private String registrationNumber;
        private String email;
        private List<String> guildCode = new ArrayList<String>();
        ;
        private String cellphone;
        private String phone;
        private String fax;
        private String postalCode;
        private String country;
        private String state;
        private String city;
        private String address;
        private String description;
        private String newsReader;
        private String logoImage;
        private String coverImage;
        private String tags;
        private String tagTrees;
        private String tagTreeCategoryName;
        private String link;
        private String lat;
        private String lng;
        private String agentFirstName;
        private String agentLastName;
        private String agentCellphoneNumber;
        private String agentNationalCode;

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

        public String getFirstName() {
            return firstName;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
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

        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public Builder setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public List<String> getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(List<String> guildCode) {
            this.guildCode = guildCode;
            return this;
        }

        public String getCellphone() {
            return cellphone;
        }

        public Builder setCellphone(String cellphone) {
            this.cellphone = cellphone;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public String getFax() {
            return fax;
        }

        public Builder setFax(String fax) {
            this.fax = fax;
            return this;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
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

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public String getNewsReader() {
            return newsReader;
        }

        public Builder setNewsReader(String newsReader) {
            this.newsReader = newsReader;
            return this;
        }

        public String getLogoImage() {
            return logoImage;
        }

        public Builder setLogoImage(String logoImage) {
            this.logoImage = logoImage;
            return this;
        }

        public String getCoverImage() {
            return coverImage;
        }

        public Builder setCoverImage(String coverImage) {
            this.coverImage = coverImage;
            return this;
        }

        public String getTags() {
            return tags;
        }

        public Builder setTags(String tags) {
            this.tags = tags;
            return this;
        }

        public String getTagTrees() {
            return tagTrees;
        }

        public Builder setTagTrees(String tagTrees) {
            this.tagTrees = tagTrees;
            return this;
        }

        public String getTagTreeCategoryName() {
            return tagTreeCategoryName;
        }

        public Builder setTagTreeCategoryName(String tagTreeCategoryName) {
            this.tagTreeCategoryName = tagTreeCategoryName;
            return this;
        }

        public String getLink() {
            return link;
        }

        public Builder setLink(String link) {
            this.link = link;
            return this;
        }

        public String getLat() {
            return lat;
        }

        public Builder setLat(String lat) {
            this.lat = lat;
            return this;
        }

        public String getLng() {
            return lng;
        }

        public Builder setLng(String lng) {
            this.lng = lng;
            return this;
        }

        public String getAgentFirstName() {
            return agentFirstName;
        }

        public Builder setAgentFirstName(String agentFirstName) {
            this.agentFirstName = agentFirstName;
            return this;
        }

        public String getAgentLastName() {
            return agentLastName;
        }

        public Builder setAgentLastName(String agentLastName) {
            this.agentLastName = agentLastName;
            return this;
        }

        public String getAgentCellphoneNumber() {
            return agentCellphoneNumber;
        }

        public Builder setAgentCellphoneNumber(String agentCellphoneNumber) {
            this.agentCellphoneNumber = agentCellphoneNumber;
            return this;
        }

        public String getAgentNationalCode() {
            return agentNationalCode;
        }

        public Builder setAgentNationalCode(String agentNationalCode) {
            this.agentNationalCode = agentNationalCode;
            return this;
        }

        public AddUserAndBusinessVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getServerType() != null && this.baseInfoVo.getToken_issuer() != null &&
                    this.username != null && this.businessName != null && this.email != null &&
                    this.guildCode != null && this.country != null && this.state != null &&
                    this.city != null && this.address != null && this.description != null &&
                    this.agentFirstName != null && this.agentLastName != null && this.agentCellphoneNumber != null)
                return new AddUserAndBusinessVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }


    }
}







