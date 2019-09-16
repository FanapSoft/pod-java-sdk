package com.fanap.podSubscription.data.modelSrv;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

/**
 * Created by h.mehrara on 9/20/2014 @Nozhaco.
 */
/*@ApiObject(
        name = "ProductSrv",
        description = "desc"
)*/
public class ProductSrv extends ItemSrv {
    private String name;
    private String description;
    private List<String> categoryList;
    private ImageInfoSrv previewInfo;
    private String preview;
    private boolean unlimited;
    private BigDecimal availableCount;
    private BigDecimal price;
    private BigDecimal discount = BigDecimal.ZERO;
    private RateSrv rate;
    private SaleInfo saleInfo;
    private List<AttributeValueSrv> attributeValues;
    private GuildSrv guild;
    private boolean allowUserInvoice;
    private boolean allowUserPrice;
    private String templateCode;
    private List<SubProductSrv> subProducts;
    private ProductGroupSrv productGroup;
    private String content;
    private CurrencySrv currency;
    private ProductSrv parentProduct;
    private Double preferredTaxRate;
//    private BusinessSoftSrv business ;
//    private boolean hide;
//    private boolean enable;
//    private boolean canLike;
//    private  Long numOfDisLikes;
//    private Double latitude;
//    private  UserSrv userSrv;
//    private boolean canComment;
//    private Double longitude;
//    private String metadata;
//    private Long numOfComments;
//    private Long timestamp;
//    private int version;
//    private UserPostInfoSrv userPostInfo;
//    private  Long numOfFavorites;
//    private Long id;
//    private Long timelineId;
//    private Long entityId;
//    private Long numOfLikes;
//    private List<String> tags;
//    private List<String> tagTrees;

//    @Override
//    public List<String> getTags() {
//        return tags;
//    }
//
//    @Override
//    public void setTags(List<String> tags) {
//        this.tags = tags;
//    }
//
//    @Override
//    public List<String> getTagTrees() {
//        return tagTrees;
//    }
//
//    @Override
//    public void setTagTrees(List<String> tagTrees) {
//        this.tagTrees = tagTrees;
//    }
//
//    @Override
//    public BusinessSoftSrv getBusiness() {
//        return business;
//    }
//
//    @Override
//    public void setBusiness(BusinessSoftSrv business) {
//        this.business = business;
//    }
//
//    @Override
//    public boolean isHide() {
//        return hide;
//    }
//
//    @Override
//    public void setHide(boolean hide) {
//        this.hide = hide;
//    }
//
//    @Override
//    public boolean isEnable() {
//        return enable;
//    }
//
//    @Override
//    public void setEnable(boolean enable) {
//        this.enable = enable;
//    }
//
//    public boolean isCanLike() {
//        return canLike;
//    }
//
//    public void setCanLike(boolean canLike) {
//        this.canLike = canLike;
//    }
//
//    @Override
//    public long getNumOfDisLikes() {
//        return numOfDisLikes;
//    }
//
//    public void setNumOfDisLikes(Long numOfDisLikes) {
//        this.numOfDisLikes = numOfDisLikes;
//    }
//
//    @Override
//    public double getLatitude() {
//        return latitude;
//    }
//
//    public void setLatitude(Double latitude) {
//        this.latitude = latitude;
//    }
//
//    @Override
//    public UserSrv getUserSrv() {
//        return userSrv;
//    }
//
//    @Override
//    public void setUserSrv(UserSrv userSrv) {
//        this.userSrv = userSrv;
//    }
//
//    public boolean isCanComment() {
//        return canComment;
//    }
//
//    public void setCanComment(boolean canComment) {
//        this.canComment = canComment;
//    }
//
//    @Override
//    public double getLongitude() {
//        return longitude;
//    }
//
//    public void setLongitude(Double longitude) {
//        this.longitude = longitude;
//    }
//
//    @Override
//    public String getMetadata() {
//        return metadata;
//    }
//
//    @Override
//    public void setMetadata(String metadata) {
//        this.metadata = metadata;
//    }
//
//    @Override
//    public long getNumOfComments() {
//        return numOfComments;
//    }
//
//    public void setNumOfComments(Long numOfComments) {
//        this.numOfComments = numOfComments;
//    }
//
//    @Override
//    public long getTimestamp() {
//        return timestamp;
//    }
//
//    public void setTimestamp(Long timestamp) {
//        this.timestamp = timestamp;
//    }
//
//    @Override
//    public int getVersion() {
//        return version;
//    }
//
//    @Override
//    public void setVersion(int version) {
//        this.version = version;
//    }
//
//    @Override
//    public UserPostInfoSrv getUserPostInfo() {
//        return userPostInfo;
//    }
//
//    @Override
//    public void setUserPostInfo(UserPostInfoSrv userPostInfo) {
//        this.userPostInfo = userPostInfo;
//    }
//
//    @Override
//    public long getNumOfFavorites() {
//        return numOfFavorites;
//    }
//
//    public void setNumOfFavorites(Long numOfFavorites) {
//        this.numOfFavorites = numOfFavorites;
//    }
//
//    @Override
//    public long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    @Override
//    public long getTimelineId() {
//        return timelineId;
//    }
//
//    public void setTimelineId(Long timelineId) {
//        this.timelineId = timelineId;
//    }
//
//    @Override
//    public long getEntityId() {
//        return entityId;
//    }
//
//    public void setEntityId(Long entityId) {
//        this.entityId = entityId;
//    }

//    @Override
//    public long getNumOfLikes() {
//        return numOfLikes;
//    }
//
//    public void setNumOfLikes(Long numOfLikes) {
//        this.numOfLikes = numOfLikes;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<String> categoryList) {
        this.categoryList = categoryList;
    }

    public ImageInfoSrv getPreviewInfo() {
        return previewInfo;
    }

    public void setPreviewInfo(ImageInfoSrv previewInfo) {
        this.previewInfo = previewInfo;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public boolean isUnlimited() {
        return unlimited;
    }

    public void setUnlimited(boolean unlimited) {
        this.unlimited = unlimited;
    }

    public BigDecimal getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(BigDecimal availableCount) {
        this.availableCount = availableCount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public RateSrv getRate() {
        return rate;
    }

    public void setRate(RateSrv rate) {
        this.rate = rate;
    }

    public SaleInfo getSaleInfo() {
        return saleInfo;
    }

    public void setSaleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    public List<AttributeValueSrv> getAttributeValues() {
        return attributeValues;
    }

    public void setAttributeValues(List<AttributeValueSrv> attributeValues) {
        this.attributeValues = attributeValues;
    }

    public GuildSrv getGuild() {
        return guild;
    }

    public void setGuild(GuildSrv guild) {
        this.guild = guild;
    }

    public boolean isAllowUserInvoice() {
        return allowUserInvoice;
    }

    public void setAllowUserInvoice(boolean allowUserInvoice) {
        this.allowUserInvoice = allowUserInvoice;
    }

    public boolean isAllowUserPrice() {
        return allowUserPrice;
    }

    public void setAllowUserPrice(boolean allowUserPrice) {
        this.allowUserPrice = allowUserPrice;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public List<SubProductSrv> getSubProducts() {
        return subProducts;
    }

    public void setSubProducts(List<SubProductSrv> subProducts) {
        this.subProducts = subProducts;
    }

    public ProductGroupSrv getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(ProductGroupSrv productGroup) {
        this.productGroup = productGroup;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CurrencySrv getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencySrv currency) {
        this.currency = currency;
    }

    public ProductSrv getParentProduct() {
        return parentProduct;
    }

    public void setParentProduct(ProductSrv parentProduct) {
        this.parentProduct = parentProduct;
    }

    public Double getPreferredTaxRate() {
        return preferredTaxRate;
    }

    public void setPreferredTaxRate(Double preferredTaxRate) {
        this.preferredTaxRate = preferredTaxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSrv that = (ProductSrv) o;
        return unlimited == that.unlimited &&
                availableCount == that.availableCount &&
                price == that.price &&
                discount == that.discount &&
                allowUserInvoice == that.allowUserInvoice &&
                allowUserPrice == that.allowUserPrice &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(categoryList, that.categoryList) &&
                Objects.equals(previewInfo, that.previewInfo) &&
                Objects.equals(preview, that.preview) &&
                Objects.equals(rate, that.rate) &&
                Objects.equals(saleInfo, that.saleInfo) &&
                Objects.equals(attributeValues, that.attributeValues) &&
                Objects.equals(guild, that.guild) &&
                Objects.equals(templateCode, that.templateCode) &&
                Objects.equals(subProducts, that.subProducts) &&
                Objects.equals(productGroup, that.productGroup) &&
                Objects.equals(content, that.content) &&
                Objects.equals(currency, that.currency) &&
                Objects.equals(parentProduct, that.parentProduct);
//                Objects.equals(tags, that.tags) &&
//        Objects.equals(tagTrees, that.tagTrees) &&
//        Objects.equals(business, that.business) &&
//        Objects.equals(hide, that.hide) &&
//        Objects.equals(enable, that.enable) &&
//        Objects.equals(canLike, that.canLike) &&
//        Objects.equals(numOfDisLikes, that.numOfDisLikes) &&
//        Objects.equals(latitude, that.latitude) &&
//        Objects.equals(userSrv, that.userSrv) &&
//        Objects.equals(canComment, that.canComment) &&
//        Objects.equals(longitude, that.longitude) &&
//        Objects.equals(metadata, that.metadata) &&
//        Objects.equals(numOfComments, that.numOfComments) &&
//        Objects.equals(timestamp, that.timestamp) &&
//        Objects.equals(version, that.version) &&
//        Objects.equals(userPostInfo, that.userPostInfo) &&
//        Objects.equals(numOfFavorites, that.numOfFavorites) &&
//        Objects.equals(id, that.id) &&
//        Objects.equals(timelineId, that.timelineId) &&
//        Objects.equals(entityId, that.entityId) &&
//        Objects.equals(numOfLikes, that.numOfLikes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, categoryList, previewInfo, preview, unlimited, availableCount, price,
                discount, rate, saleInfo, attributeValues, guild, allowUserInvoice, allowUserPrice,
                templateCode, subProducts, productGroup, content, currency,
                parentProduct
//                ,business,hide,enable,canLike,numOfDisLikes,latitude,
//                userSrv,canComment,longitude,metadata,numOfComments,timestamp,
//                version,userPostInfo,numOfFavorites,id,timelineId,entityId,numOfLikes,tags,tagTrees
        );
    }
}
