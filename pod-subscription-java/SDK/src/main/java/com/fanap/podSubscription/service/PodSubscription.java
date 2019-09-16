package com.fanap.podSubscription.service;

import com.fanap.podSubscription.data.modelSrv.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created By Askarian on 5/28/2019
 */
public interface PodSubscription {

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/biz/subscriptionList")
    Call<ResultSrv<List<SubscriptionFullSrv>>> subscriptionList(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("size") String size,
            @Field("offset") String offset,
            @Field("subscriptionPlanId") String subscriptionPlanId

    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/biz/consumeSubscription")
    Call<ResultSrv<SubscriptionSrv>> consumeSubscription(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("id") String id,
            @Field("usedAmount") String usedAmount

    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/srv/core/nzh/biz/updateSubscriptionPlan")
    Call<ResultSrv<SubscriptionPlanSrv>> updateSubscriptionPlan(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Field("id") String id,
            @Field("periodTypeCode") String periodTypeCode,
            @Field("periodTypeCount") String periodTypeCount,
            @Field("usageCountLimit") String usageCountLimit,
            @Field("name") String name,
            @Field("Price") String Price,
            @Field("enable") String enable


    );


//    @GET("/srv/core/nzh/getUserProfile")
//    Call<ResultSrv<CustomerProfileSrv>> getUserProfile(
//            @Query("_token_") String token,
//            @Query("_token_issuer_") String token_issuer,
//            @Query("client_id") String client_id,
//            @Query("client_secret") String client_secret);
//
//    @FormUrlEncoded
//    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
//    @POST("/srv/core/nzh/editProfileWithConfirmation")
//    Call<ResultSrv<CustomerProfileSrv>> editProfileWithConfirmation(
//            @Field("firstName") String firstName,
//            @Field("lastName") String lastName,
//            @Field("nickName") String nickName,
//            @Field("email") String email,
//            @Field("phoneNumber") String phoneNumber,
//            @Field("cellphoneNumber") String cellphoneNumber,
//            @Field("nationalCode") String nationalCode,
//            @Field("gender") String gender,
//            @Field("address") String address,
//            @Field("birthDate") String birthDate,
//            @Field("country") String country,
//            @Field("state") String state,
//            @Field("city") String city,
//            @Field("postalcode") String postalcode,
//            @Field("sheba") String sheba,
//            @Field("profileImage") String profileImage,
//            @Field("client_metadata") String client_metadata,
//            @Field("birthState") String birthState,
//            @Field("identificationNumber") String identificationNumber,
//            @Field("fatherName") String fatherName,
//            @Field("_token_") String token,
//            @Field("_token_issuer_") String token_issuer,
//            @Field("client_id") String client_id,
//            @Field("client_secret") String client_secret);
}
