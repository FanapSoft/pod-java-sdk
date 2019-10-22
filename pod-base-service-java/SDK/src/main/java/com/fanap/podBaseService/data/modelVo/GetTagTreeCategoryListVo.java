package com.fanap.podBaseService.data.modelVo;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.PodServicesEnum;
import com.fanap.podBaseService.util.TypeConversionUtil;

import java.util.List;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class GetTagTreeCategoryListVo {


    private final static String REQUIRED_PARAMETER_ERROR_MESSAGE = "Token, token_issuer, offset and size are required parameters!";

    private BaseInfoVo baseInfoVo;
    private String id;
    private String offset;
    private String size;
    private String name;
    private String query;
    private static String scProductId;

    public GetTagTreeCategoryListVo(Builder builder) {
        this.baseInfoVo = builder.getBaseInfoVo();
        this.id = TypeConversionUtil.longToString(builder.getId());
        this.name = builder.getName();
        this.query = builder.getQuery();
        this.size = TypeConversionUtil.intToString(builder.getSize());
        this.offset = TypeConversionUtil.intToString(builder.getOffset());
        this.scProductId = TypeConversionUtil.intToString(PodServicesEnum.NZH_BIZ_GET_TAG_TREE_CATEGORY_LIST);

    }

    public BaseInfoVo getBaseInfoVo() {
        return baseInfoVo;
    }

    public String getId() {
        return id;
    }

    public String getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getQuery() {
        return query;
    }

    public static String getScProductId() {
        return scProductId;
    }

    public static class Builder {

        private BaseInfoVo baseInfoVo;
        private Long id;
        private Integer offset;
        private Integer size;
        private String name;
        private String query;

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

        public int getOffset() {
            return offset;
        }

        public Builder setOffset(int offset) {
            this.offset = offset;
            return this;
        }

        public int getSize() {
            return size;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getQuery() {
            return query;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public BaseInfoVo getBaseInfoVo() {
            return baseInfoVo;
        }

        public Builder setBaseInfoVo(BaseInfoVo baseInfoVo) {
            this.baseInfoVo = baseInfoVo;
            return this;
        }

        public GetTagTreeCategoryListVo build() throws PodException {
            if (this.baseInfoVo != null &&
                    this.baseInfoVo.getToken() != null &&
                    this.baseInfoVo.getToken_issuer() != null &&
                    this.offset != null &&
                    this.size != null)
                return new GetTagTreeCategoryListVo(this);
            else throw PodException.invalidParameter(REQUIRED_PARAMETER_ERROR_MESSAGE);
        }
    }
}
