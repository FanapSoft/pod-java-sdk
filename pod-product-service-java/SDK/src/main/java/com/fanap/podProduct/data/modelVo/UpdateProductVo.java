package com.fanap.podProduct.data.modelVo;

import com.fanap.podProduct.exception.PodException;
import com.fanap.podProduct.util.PodServicesEnum;
import com.fanap.podProduct.util.TypeConversionUtil;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Z.gholinia on 9/11/2019.
 */

public class UpdateProductVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer , name, description , canComment , canLike , enable ,entityId , price, discount and changePreview are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String parentProductId;
    private String name;
    private String description;
    private String version;
    private String canComment;
    private String canLike;
    private String enable;
    private String metadata;
    private String entityId;
    private String unlimited;
    private String availableCount;
    private List<String> categories;
    private String guildCode;
    private String allowUserInvoice;
    private String allowUserPrice;
    private String attTemplateCode;
    private List<String> attValue;
    private List<String> attCode;
    private List<String> attGroup;
    private String groupId;
    private String price;
    private String discount;
    private String changePreview;
    private String lat;
    private String lng;
    private String tags;
    private String content;
    private String previewImage;
    private String tagTrees;
    private String tagTreeCategoryName;
    private String preferredTaxRate;
    private String quantityPrecision;
    private static String scProductId;

    public String getParentProductId() {
        return parentProductId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public String getCanComment() {
        return canComment;
    }

    public String getCanLike() {
        return canLike;
    }

    public String getEnable() {
        return enable;
    }

    public String getMetadata() {
        return metadata;
    }

    public String getVersion() {
        return version;
    }

    public String getEntityId() {
        return entityId;
    }

    public List<String> getCategories() {
        return categories;
    }

    public String getChangePreview() {
        return changePreview;
    }

    public String getUnlimited() {
        return unlimited;
    }

    public String getAvailableCount() {
        return availableCount;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscount() {
        return discount;
    }

    public String getGuildCode() {
        return guildCode;
    }

    public String getAllowUserInvoice() {
        return allowUserInvoice;
    }

    public String getAllowUserPrice() {
        return allowUserPrice;
    }


    public String getAttTemplateCode() {
        return attTemplateCode;
    }

    public List<String> getAttCode() {
        return attCode;
    }

    public List<String> getAttValue() {
        return attValue;
    }

    public List<String> getAttGroup() {
        return attGroup;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public String getTags() {
        return tags;
    }

    public String getContent() {
        return content;
    }

    public String getPreviewImage() {
        return previewImage;
    }

    public String getTagTrees() {
        return tagTrees;
    }

    public String getTagTreeCategoryName() {
        return tagTreeCategoryName;
    }

    public String getPreferredTaxRate() {
        return preferredTaxRate;
    }

    public String getQuantityPrecision() {
        return quantityPrecision;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public UpdateProductVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.name = builder.getName();
        this.description = builder.getDescription();
        this.version = builder.getVersion();
        this.canComment = TypeConversionUtil.booleanToString(builder.getCanComment());
        this.canLike = TypeConversionUtil.booleanToString(builder.getCanLike());
        this.enable = TypeConversionUtil.booleanToString(builder.getEnable());
        this.metadata = builder.getMetadata();
        this.entityId = TypeConversionUtil.longToString(builder.getEntityId());
        this.unlimited = TypeConversionUtil.booleanToString(builder.isUnlimited());
        this.availableCount = TypeConversionUtil.intToString(builder.getAvailableCount());
        this.categories = builder.getCategories();
        this.guildCode = builder.getGuildCode();
        this.allowUserInvoice = TypeConversionUtil.booleanToString(builder.isAllowUserInvoice());
        this.allowUserPrice = TypeConversionUtil.booleanToString(builder.isAllowUserPrice());
        this.attTemplateCode = builder.getAttTemplateCode();
        this.attValue = builder.getAttValue();
        this.attCode = builder.getAttCode();
        this.attGroup = builder.getAttGroup();
        this.groupId = TypeConversionUtil.longToString(builder.getGroupId());
        this.price = TypeConversionUtil.decimalToString(builder.getPrice());
        this.discount = TypeConversionUtil.decimalToString(builder.getDiscount());
        this.changePreview = TypeConversionUtil.booleanToString(builder.getChangePreview());
        this.lat = TypeConversionUtil.doubleToString(builder.getLat());
        this.lng = TypeConversionUtil.doubleToString(builder.getLng());
        this.tags = builder.getTags();
        this.content = builder.getContent();
        this.previewImage = builder.getPreviewImage();
        this.tagTrees = builder.getTagTrees();
        this.tagTreeCategoryName = builder.getTagTreeCategoryName();
        this.preferredTaxRate = TypeConversionUtil.doubleToString(builder.getPreferredTaxRate());
        this.quantityPrecision = TypeConversionUtil.doubleToString(builder.getQuantityPrecision());
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_BIZ_UPDATE_PRODUCT);



    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public static class Builder  {
        private BaseInfoVo baseInfoVo;
        private Long parentProductId;
        private String name;
        private String description;
        private String version;
        private Boolean canComment;
        private Boolean canLike;
        private Boolean enable;
        private String metadata;
        private Long entityId;
        private boolean unlimited;
        private Integer availableCount;
        private List<String> categories;
        private String guildCode;
        private boolean allowUserInvoice;
        private boolean allowUserPrice;
        private String attTemplateCode;
        private List<String> attCode;
        private List<String> attValue;
        private List<String> attGroup;
        private Long groupId;
        private BigDecimal price;
        private BigDecimal discount;
        private Boolean changePreview;
        private Double lat;
        private Double lng;
        private String tags;
        private String content;
        private String previewImage;
        private String tagTrees;
        private String tagTreeCategoryName;
        private Double preferredTaxRate;
        private Double quantityPrecision;

        public Long getParentProductId() {
            return parentProductId;
        }

        public Builder setParentProductId(Long parentProductId) {
            this.parentProductId = parentProductId;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public String getVersion() {
            return version;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public Boolean getCanComment() {
            return canComment;
        }

        public Builder setCanComment(Boolean canComment) {
            this.canComment = canComment;
            return this;
        }

        public Boolean getCanLike() {
            return canLike;
        }

        public Builder setCanLike(Boolean canLike) {
            this.canLike = canLike;
            return this;
        }

        public Boolean getEnable() {
            return enable;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        public String getMetadata() {
            return metadata;
        }

        public Builder setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        public Long getEntityId() {
            return entityId;
        }

        public Builder setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }

        public boolean isUnlimited() {
            return unlimited;
        }

        public Builder setUnlimited(boolean unlimited) {
            this.unlimited = unlimited;
            return this;
        }

        public Integer getAvailableCount() {
            return availableCount;
        }

        public Builder setAvailableCount(Integer availableCount) {
            this.availableCount = availableCount;
            return this;
        }

        public List<String> getCategories() {
            return categories;
        }

        public Builder setCategories(List<String> categories) {
            this.categories = categories;
            return this;
        }

        public String getGuildCode() {
            return guildCode;
        }

        public Builder setGuildCode(String guildCode) {
            this.guildCode = guildCode;
            return this;
        }

        public boolean isAllowUserInvoice() {
            return allowUserInvoice;
        }

        public Builder setAllowUserInvoice(boolean allowUserInvoice) {
            this.allowUserInvoice = allowUserInvoice;
            return this;
        }

        public boolean isAllowUserPrice() {
            return allowUserPrice;
        }

        public Builder setAllowUserPrice(boolean allowUserPrice) {
            this.allowUserPrice = allowUserPrice;
            return this;
        }

        public String getAttTemplateCode() {
            return attTemplateCode;
        }

        public Builder setAttTemplateCode(String attTemplateCode) {
            this.attTemplateCode = attTemplateCode;
            return this;
        }

        public List<String> getAttCode() {
            return attCode;
        }

        public Builder setAttCode(List<String> attCode) {
            this.attCode = attCode;
            return this;
        }

        public List<String> getAttValue() {
            return attValue;
        }

        public Builder setAttValue(List<String> attValue) {
            this.attValue = attValue;
            return this;
        }

        public List<String> getAttGroup() {
            return attGroup;
        }

        public Builder setAttGroup(List<String> attGroup) {
            this.attGroup = attGroup;
            return this;
        }

        public Long getGroupId() {
            return groupId;
        }

        public Builder setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public Builder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public BigDecimal getDiscount() {
            return discount;
        }

        public Builder setDiscount(BigDecimal discount) {
            this.discount = discount;
            return this;
        }

        public Boolean getChangePreview() {
            return changePreview;
        }

        public Builder setChangePreview(Boolean changePreview) {
            this.changePreview = changePreview;
            return this;
        }

        public Double getLat() {
            return lat;
        }

        public Builder setLat(Double lat) {
            this.lat = lat;
            return this;
        }

        public Double getLng() {
            return lng;
        }

        public Builder setLng(Double lng) {
            this.lng = lng;
            return this;
        }

        public String getTags() {
            return tags;
        }

        public Builder setTags(String[] tags) {
            this.tags = String.join(",", tags);
            return this;
        }

        public String getContent() {
            return content;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public String getPreviewImage() {
            return previewImage;
        }

        public Builder setPreviewImage(String previewImage) {
            this.previewImage = previewImage;
            return this;
        }

        public String getTagTrees() {
            return tagTrees;
        }

        public Builder setTagTrees(String[] tagTrees) {
            this.tagTrees = String.join(",", tagTrees);
            return this;
        }

        public String getTagTreeCategoryName() {
            return tagTreeCategoryName;
        }

        public Builder setTagTreeCategoryName(String tagTreeCategoryName) {
            this.tagTreeCategoryName = tagTreeCategoryName;
            return this;
        }

        public Double getPreferredTaxRate() {
            return preferredTaxRate;
        }

        public Builder setPreferredTaxRate(Double preferredTaxRate) {
            this.preferredTaxRate = preferredTaxRate;
            return this;
        }

        public Double getQuantityPrecision() {
            return quantityPrecision;
        }

        public Builder setQuantityPrecision(Double quantityPrecision) {
            this.quantityPrecision = quantityPrecision;
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

        public UpdateProductVo build() throws PodException {
            if (this.baseInfoVo != null && this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.name != null && this.canComment != null && this.canLike != null && this.enable != null
                    && this.price != null && this.discount != null &&
                    this.description != null && this.entityId != null && this.changePreview != null)
                return new UpdateProductVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }


}

