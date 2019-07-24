package com.fanap.billingService.service;

import com.fanap.billingService.data.modelSrv.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Askarian on 5/28/2019
 */
public interface BillingService {

    @GET("/srv/core/nzh/ott")
    Call<ResultSrv<String>> ott(
            @Query("_token_") String token,
            @Query("_token_issuer_") String token_issuer);

    @GET("/srv/core/nzh/biz/issueInvoice")
    Call<ResultSrv<InvoiceSrv>> issueInvoice(
            @Header("_token_") String token,
            @Header("_token_issuer_") String token_issuer,
            @Header("_ott_") String ott,
            @Query("redirectURL") String redirectURL,
            @Query("userId") String userId,
            @Query("billNumber") String billNumber,
            @Query("description") String description,
            @Query("deadline") String deadline,
            @Query("productId[]") List<String> productId,
            @Query("price[]") List<String> price,
            @Query("quantity[]") List<String> quantity,
            @Query("productDescription[]") List<String> productDescription,
            @Query("guildCode") String guildCode,
            @Query("currencyCode") String currencyCode,
            @Query("addressId") String addressId,
            @Query("voucherHash[]") List<String> voucherHash,
            @Query("preferredTaxRate") String preferredTaxRate,
            @Query("verificationNeeded") String verificationNeeded,
            @Query("verifyAfterTimeout") String verifyAfterTimeout,
            @Query("preview") String preview,
            @Query("metadata") String metadata,
            @Query("safe") String safe,
            @Query("postVoucherEnabled") String postVoucherEnabled,
            @Query("hasEvent") String hasEvent,
            @Query("eventTitle") String eventTitle,
            @Query("eventTimeZone") String eventTimeZone,
            @Query("eventReminders[]") List<String> eventReminders,
            @Query("eventDescription") String eventDescription,
            @Query("eventMetadata") String eventMetadata,
            @Query("cellphoneNumber") String cellphoneNumber
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("/service/createPreInvoice")
    Call<ResultSrvCreatePreInvoice<String>> createPreInvoice(
            @Field("token") String token,
            @Field("ott") String ott,
            @Field("redirectUri") String redirectUri,
            @Field("userId") String userId,
            @Field("productId[]") List<String> productId,
            @Field("price[]") List<String> price,
            @Field("quantity[]") List<String> quantity,
            @Field("productDescription[]") List<String> productDescription,
            @Field("guildCode") String guildCode,
            @Field("currencyCode") String currencyCode,
            @Field("billNumber") String billNumber,
            @Field("description") String description,
            @Field("deadline") String deadline,
            @Field("preferredTaxRate") String preferredTaxRate,
            @Field("verificationNeeded") String verificationNeeded,
            @Field("callUrl") String callUrl
    );

    @GET("srv/core/nzh/biz/getInvoiceList")
    Call<ResultSrv<List<InvoiceSrv>>> getInvoiceList(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("id") String id,
            @Query("billNumber") String billNumber,
            @Query("uniqueNumber") String uniqueNumber,
            @Query("trackerId") String trackerId,
            @Query("fromDate") String fromDate,
            @Query("toDate") String toDate,
            @Query("isCanceled") String isCanceled,
            @Query("isPayed") String isPayed,
            @Query("isClosed") String isClosed,
            @Query("isWaiting") String isWaiting,
            @Query("guildCode") String guildCode,
            @Query("referenceNumber") String referenceNumber,
            @Query("userId") String userId,
            @Query("issuerId") String issuerId,
            @Query("query") String query,
            @Query("firstId") String firstId,
            @Query("lastId") String lastId,
            @Query("offset") String offset,
            @Query("productIdList[]") List<String> productIdList,
            @Query("size") String size);

    @GET("srv/core/nzh/biz/getInvoiceListByMetadata")
    Call<ResultSrv<List<InvoiceSrv>>> getInvoiceListByMetadata(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("isCanceled") String isCanceled,
            @Query("isPayed") String isPayed,
            @Query("offset") String offset,
            @Query("size") String size);

    @GET("srv/core/nzh/biz/getInvoiceListAsFile")
    Call<ResultSrv<ExportServiceSrv>> getInvoiceListAsFile(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("id") String id,
            @Query("billNumber") String billNumber,
            @Query("uniqueNumber") String uniqueNumber,
            @Query("trackerId") String trackerId,
            @Query("fromDate") String fromDate,
            @Query("toDate") String toDate,
            @Query("isCanceled") String isCanceled,
            @Query("isPayed") String isPayed,
            @Query("isClosed") String isClosed,
            @Query("isWaiting") String isWaiting,
            @Query("guildCode") String guildCode,
            @Query("referenceNumber") String referenceNumber,
            @Query("userId") String userId,
            @Query("query") String query,
            @Query("productIdList[]") List<String> productIdList,
            @Query("lastNRows") String lastNRows,
            @Query("callbackUrl") String callbackUrl
    );

    @GET("srv/core/nzh/biz/cancelInvoice")
    Call<ResultSrv<Boolean>> cancelInvoice(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("id") String id
    );

    @GET("srv/core/nzh/biz/verifyAndCloseInvoice")
    Call<ResultSrv<InvoiceSrv>> verifyAndCloseInvoice(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("id") String id
    );

    @GET("srv/core/nzh/biz/closeInvoice")
    Call<ResultSrv<Boolean>> closeInvoice(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("id") String id
    );

    @GET("srv/core/nzh/biz/getInvoicePaymentLink")
    Call<ResultSrv<String>> getInvoicePaymentLink(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("invoiceId") String invoiceId
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
