package com.fanap.podBaseService.service;

import com.fanap.podBaseService.data.modelSrv.ResultSrv;
import com.fanap.podBaseService.data.modelSrv.TagTreeCategorySrv;
import com.fanap.podBaseService.data.modelSrv.TagTreeSrv;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
public interface PodBaseService {

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/biz/addTagTreeCategory")
    Call<ResultSrv<TagTreeCategorySrv>> addTagTreeCategory(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("name") String name,
            @Field("desc") String desc);


    @GET("/srv/core/nzh/biz/getTagTreeCategoryList")
    Call<ResultSrv<List<TagTreeCategorySrv>>> getTagTreeCategoryList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Query("offset") String offset,
            @Query("size") String size,
            @Query("id") String id,
            @Query("name") String name,
            @Query("query") String query);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @PUT("/srv/core/nzh/biz/updateTagTreeCategory")
    Call<ResultSrv<TagTreeCategorySrv>> updateTagTreeCategory(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("id") String id,
            @Field("name") String name,
            @Field("desc") String desc,
            @Field("enable") String enable);



    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/biz/addTagTree")
    Call<ResultSrv<TagTreeSrv>> addTagTree(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("name") String name,
            @Field("categoryId") String categoryId,
            @Field("parentId") String parentId);

    @GET("/srv/core/nzh/biz/getTagTreeList")
    Call<ResultSrv<List<TagTreeSrv>>> getTagTreeList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Query("categoryId") String categoryId ,
            @Query("parentId") String parentId,
            @Query("levelCount") String levelCount ,
            @Query("level") String level,
            @Query("id") String id);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @PUT("/srv/core/nzh/biz/updateTagTree")
    Call<ResultSrv<TagTreeSrv>> updateTagTree(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("id") String id,
            @Field("name") String name,
            @Field("parentId") String parentId,
            @Field("enable") String enable);


}
