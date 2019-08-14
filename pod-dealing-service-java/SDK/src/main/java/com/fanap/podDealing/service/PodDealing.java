package com.fanap.podDealing.service;

import com.fanap.podDealing.data.modelSrv.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created By Z.gholinia on 8/11/2019
 */
public interface PodDealing {



    @GET("/srv/core/nzh/biz/addUserAndBusiness")
    Call<ResultSrv<BusinessSrv>> addUserAndBusiness(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Query("username") String username,
            @Query("businessName") String businessName,
            @Query("firstName") String firstName,
            @Query("lastName") String lastName,
            @Query("sheba") String sheba,
            @Query("nationalCode") String nationalCode,
            @Query("economicCode") String economicCode,
            @Query("registrationNumber") String registrationNumber,
            @Query("email") String email,
            @Query("guildCode") List<String> guildCode,
            @Query("cellphone") String cellphone,
            @Query("phone") String phone,
            @Query("fax") String fax,
            @Query("postalCode") String postalCode,
            @Query("country") String country,
            @Query("state") String state,
            @Query("city") String city,
            @Query("address") String address,
            @Query("description") String description,
            @Query("newsReader") String newsReader,
            @Query("logoImage") String logoImage,
            @Query("coverImage") String coverImage,
            @Query("tags") String tags,
            @Query("tagTrees") String tagTrees,
            @Query("tagTreeCategoryName") String tagTreeCategoryName,
            @Query("link") String link,
            @Query("lat") String lat,
            @Query("lng") String lng,
            @Query("agentFirstName") String agentFirstName,
            @Query("agentLastName") String agentLastName,
            @Query("agentCellphoneNumber") String agentCellphoneNumber,
            @Query("agentNationalCode") String agentNationalCode);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/listUserCreatedBusiness")
    Call<ResultSrv<List<BusinessSrv>>> listUserCreatedBusiness(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("bizId") List<String> bizId,
            @Field("guildCode") List<String> guildCod,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("query") String query,
            @Field("tags") List<String> tags,
            @Field("tagTrees") List<String> tagTrees,
            @Field("country") String active,
            @Field("country") String country,
            @Field("state") String state,
            @Field("city") String city,
            @Field("ssoId") String ssoId,
            @Field("username") String username,
            @Field("businessName") String businessName,
            @Field("sheba") String sheba,
            @Field("nationalCode") String nationalCode,
            @Field("economicCode") String economicCode,
            @Field("email") String email,
            @Field("cellphone") String cellphone);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/biz/updateBusiness/")
    Call<ResultSrv<BusinessSrv>> updateBusiness(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("bizId") String bizId,
            @Field("businessName") String businessName,
            @Field("companyName") String companyName,
            @Field("shopName") String shopName,
            @Field("shopNameEn") String shopNameEn,
            @Field("website") String website,
            @Field("dateEstablishing") String dateEstablishing,
            @Field("firstName") String firstName,
            @Field("lastName") String lastName,
            @Field("sheba") String sheba,
            @Field("nationalCode") String nationalCode,
            @Field("economicCode") String economicCode,
            @Field("registrationNumber") String registrationNumber,
            @Field("email") String email,
            @Field("guildCode") List<String> guildCode,
            @Field("cellphone") String cellphone,
            @Field("phone") String phone,
            @Field("fax") String fax,
            @Field("postalCode") String postalCode,
            @Field("country") String country,
            @Field("state") String state,
            @Field("city") String city,
            @Field("address") String address,
            @Field("description") String description,
            @Field("changeLogo") String changeLogo,
            @Field("changeCover") String changeCover,
            @Field("logoImage") String logoImage,
            @Field("coverImage") String coverImage,
            @Field("tags") String tags,
            @Field("tagTrees") String tagTrees,
            @Field("tagTreeCategoryName") String tagTreeCategoryName,
            @Field("link") String link,
            @Field("lat") String lat,
            @Field("lng") String lng,
            @Field("agentFirstName") String agentFirstName,
            @Field("agentLastName") String agentLastName,
            @Field("agentCellphoneNumber") String agentCellphoneNumber,
            @Field("agentNationalCode") String agentNationalCode,
            @Field("changeAgent") String changeAgent);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/biz/getApiTokenForCreatedBusiness/")
    Call<ResultSrv<BusinessApiTokenSrv>> getApiTokenForCreatedBusiness(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("businessId") String businessId);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/rateBusiness/")
    Call<ResultSrv<RateSrv>> rateBusiness(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("businessId") String businessId,
            @Field("rate") String rate);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/commentBusiness/")
    Call<ResultSrv<Long>> commentBusiness(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("businessId") String businessId,
            @Field("text") String rate);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/businessFavorite/")
    Call<ResultSrv<Boolean>> businessFavorite(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("businessId") String businessId,
            @Field("disfavorite") String disfavorite);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/userBusinessInfos/")
    Call<ResultSrv<List<UserBusinessInfoSrv>>> userBusinessInfos(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("id[]") List<String> id);

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/commentBusinessList/")
    Call<ResultSrv<List<CommentSrv>>> commentBusinessList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("businessId") String businessId,
            @Field("firstId") String firstId,
            @Field("lastId") String lastId,
            @Field("offset") String offset,
            @Field("size") String size);


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/biz/confirmComment/")
    Call<ResultSrv<Boolean>> confirmComment(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("commentId") String commentId);


    @GET("/srv/core/nzh/guildList/")
    Call<ResultSrv<List<GuildSrv>>> guildList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Query("name") String name,
            @Query("offset ") String offset,
            @Query("size ") String size);

}
