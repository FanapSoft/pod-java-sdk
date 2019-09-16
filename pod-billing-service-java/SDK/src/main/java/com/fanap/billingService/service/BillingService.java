package com.fanap.billingService.service;

import com.fanap.billingService.data.modelSrv.*;
import retrofit2.Call;
import retrofit2.http.*;

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

    @GET("srv/core/nzh/biz/payInvoice")
    Call<ResultSrv<Boolean>> payInvoice(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("invoiceId") String invoiceId
    );

    @GET("srv/core/nzh/payInvoiceByCredit")
    Call<ResultSrv<Boolean>> payInvoiceByCredit(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("_ott_") String ott,
            @Query("invoiceId") String invoiceId,
            @Query("delegationHash") String delegationHash,
            @Query("delegatorId") String delegatorId,
            @Query("wallet") String wallet,
            @Query("forceDelegation") String forceDelegation
    );

    @GET("srv/core/nzh/payAnyInvoiceByCredit")
    Call<ResultSrv<Boolean>> payAnyInvoiceByCredit(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("_ott_") String ott,
            @Query("invoiceId") String invoiceId,
            @Query("delegationHash") String delegationHash,
            @Query("delegatorId") String delegatorId,
            @Query("wallet") String wallet,
            @Query("forceDelegation") String forceDelegation
    );


    @GET("srv/core/nzh/biz/sendInvoicePaymentSMS")
    Call<ResultSrv<Boolean>> sendInvoicePaymentSMS(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("invoiceId") String invoiceId,
            @Query("delegationId") String delegationId,
            @Query("wallet") String wallet,
            @Query("forceDelegation") String forceDelegation,
            @Query("callbackUri") String callbackUri,
            @Query("redirectUri") String redirectUri
    );

    @GET("srv/core/nzh/biz/payInvoiceInFuture")
    Call<ResultSrv<Boolean>> payInvoiceInFuture(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("invoiceId") String invoiceId,
            @Query("date") String date,
            @Query("wallet") String wallet,
            @Query("guildCode") String guildCode

    );

    @GET("srv/core/nzh/biz/payInvoiceByInvoice")
    Call<ResultSrv<Boolean>> payInvoiceByInvoice(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("creditorInvoiceId") String creditorInvoiceId,
            @Query("debtorInvoiceId") String debtorInvoiceId

    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("srv/core/nzh/biz/addDealer")
    Call<ResultSrv<BusinessDealerSrv>> addDealer(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Field("dealerBizId") String dealerBizId,
            @Field("allProductAllow") String allProductAllow
    );


    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("srv/core/nzh/biz/dealerList")
    Call<ResultSrv<List<BusinessDealerSrv>>> dealerList(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Field("dealerBizId") String dealerBizId,
            @Field("enable") String enable,
            @Field("offset") String offset,
            @Field("size") String size
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("srv/core/nzh/biz/enableDealer")
    Call<ResultSrv<BusinessDealerSrv>> enableDealer(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Field("dealerBizId") String dealerBizId
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("srv/core/nzh/biz/disableDealer")
    Call<ResultSrv<BusinessDealerSrv>> disableDealer(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Field("dealerBizId") String dealerBizId
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("srv/core/nzh/biz/businessDealingList")
    Call<ResultSrv<List<BusinessDealerSrv>>> businessDealingList(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Field("dealingBusinessId") String dealingBusinessId,
            @Field("enable") String enable,
            @Field("offset") String offset,
            @Field("size") String size
    );

    @GET("srv/core/nzh/biz/issueMultiInvoice")
    Call<ResultSrv<InvoiceSrv>> issueMultiInvoice(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("data") String data,
            @Query("delegatorId") List<String> delegatorId,
            @Query("delegationHash") List<String> delegationHash,
            @Query("forceDelegation") String forceDelegation


    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("srv/core/nzh/biz/addDealerProductPermission")
    Call<ResultSrv<DealerProductPermissionSrv>> addDealerProductPermission(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Field("productId") String productId,
            @Field("dealerBizId") String dealerBizId
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("srv/core/nzh/biz/dealerProductPermissionList")
    Call<ResultSrv<List<DealerProductPermissionSrv>>> dealerProductPermissionList(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Field("productId") String productId,
            @Field("dealerBizId") String dealerBizId,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("enable") String enable
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("srv/core/nzh/biz/dealingProductPermissionList")
    Call<ResultSrv<List<DealerProductPermissionSrv>>> dealingProductPermissionList(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Field("productId") String productId,
            @Field("dealingBusinessId") String dealingBusinessId,
            @Field("offset") String offset,
            @Field("size") String size,
            @Field("enable") String enable
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("srv/core/nzh/biz/disableDealerProductPermission")
    Call<ResultSrv<DealerProductPermissionSrv>> disableDealerProductPermission(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Field("productId") String productId,
            @Field("dealerBizId") String dealerBizId
    );

    @FormUrlEncoded
    @Headers("Content-Type:application/x-www-form-urlencoded; charset=UTF-8")
    @POST("srv/core/nzh/biz/enableDealerProductPermission")
    Call<ResultSrv<DealerProductPermissionSrv>> enableDealerProductPermission(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Field("productId") String productId,
            @Field("dealerBizId") String dealerBizId
    );


    @GET("srv/core/nzh/biz/reduceMultiInvoice")
    Call<ResultSrv<InvoiceSrv>> reduceMultiInvoice(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("data") String data


    );

    @GET("srv/core/nzh/biz/reduceMultiInvoiceAndCashout")
    Call<ResultSrv<InvoiceSrv>> reduceMultiInvoiceAndCashout(
            @Query("_token_") String token,
            @Query("_token_issuer_") String tokenIssuer,
            @Query("data") String data,
            @Query("toolCode") String toolCode


    );

}
