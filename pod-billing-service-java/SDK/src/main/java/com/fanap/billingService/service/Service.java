package com.fanap.billingService.service;

import com.fanap.billingService.data.modelSrv.BusinessDealerSrv;
import com.fanap.billingService.data.modelSrv.DealerProductPermissionSrv;
import com.fanap.billingService.data.modelSrv.ExportServiceSrv;
import com.fanap.billingService.data.modelSrv.InvoiceSrv;
import com.fanap.billingService.data.modelVo.*;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.*;

import java.util.List;

/**
 * Created by  Z.Gholinia on 8/28/2019.
 */
public class Service {

    public void ott(OttVo ottVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        ottVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<String>(service.ott(
                ottVo.getBaseInfoVo().getToken(),
                ottVo.getBaseInfoVo().getToken_issuer()
        ), onGetResponseListener).get();
    }

    public void issueInvoice(IssueInvoiceVo issueInvoiceVo, OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        issueInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<InvoiceSrv>(service.issueInvoice(
                issueInvoiceVo.getBaseInfoVo().getToken(),
                issueInvoiceVo.getBaseInfoVo().getToken_issuer(),
                issueInvoiceVo.getBaseInfoVo().getOtt(),
                issueInvoiceVo.getRedirectURL(),
                issueInvoiceVo.getUserId(),
                issueInvoiceVo.getBillNumber(),
                issueInvoiceVo.getDescription(),
                issueInvoiceVo.getDeadline(),
                issueInvoiceVo.getProductId(),
                issueInvoiceVo.getPrice(),
                issueInvoiceVo.getQuantity(),
                issueInvoiceVo.getProductDescription(),
                issueInvoiceVo.getGuildCode(),
                issueInvoiceVo.getCurrencyCode(),
                issueInvoiceVo.getAddressId(),
                issueInvoiceVo.getEventReminders(),
                issueInvoiceVo.getPreferredTaxRate(),
                issueInvoiceVo.getVerificationNeeded(),
                issueInvoiceVo.getVerifyAfterTimeout(),
                issueInvoiceVo.getPreview(),
                issueInvoiceVo.getMetadata(),
                issueInvoiceVo.getSafe(),
                issueInvoiceVo.getPostVoucherEnabled(),
                issueInvoiceVo.getHasEvent(),
                issueInvoiceVo.getEventTitle(),
                issueInvoiceVo.getEventTimeZone(),
                issueInvoiceVo.getEventReminders(),
                issueInvoiceVo.getEventDescription(),
                issueInvoiceVo.getEventMetadata(),
                issueInvoiceVo.getCellphoneNumber()
        ), onGetResponseListener).get();
    }

    public void createPreInvoice(CreatePreInvoiceVo createPreInvoiceVo, OnGetResponseListener onGetResponseListener) throws PodException {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        createPreInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResultCreatePreInvoice<String>(service.createPreInvoice(
                createPreInvoiceVo.getBaseInfoVo().getToken(),
                createPreInvoiceVo.getBaseInfoVo().getOtt(),
                createPreInvoiceVo.getRedirectURL(),
                createPreInvoiceVo.getUserId(),
                createPreInvoiceVo.getProductId(),
                createPreInvoiceVo.getPrice(),
                createPreInvoiceVo.getQuantity(),
                createPreInvoiceVo.getProductDescription(),
                createPreInvoiceVo.getGuildCode(),
                createPreInvoiceVo.getCurrencyCode(),
                createPreInvoiceVo.getBillNumber(),
                createPreInvoiceVo.getDescription(),
                createPreInvoiceVo.getDeadline(),
                createPreInvoiceVo.getPreferredTaxRate(),
                createPreInvoiceVo.getVerificationNeeded(),
                createPreInvoiceVo.getCallUrl()
        ), onGetResponseListener).get();
    }

    public void getInvoiceList(GetInvoiceListVo getInvoiceListVo,
                               OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getInvoiceListVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<List<InvoiceSrv>>(service.getInvoiceList(
                getInvoiceListVo.getBaseInfoVo().getToken(),
                getInvoiceListVo.getBaseInfoVo().getToken_issuer(),
                getInvoiceListVo.getId(),
                getInvoiceListVo.getBillNumber(),
                getInvoiceListVo.getUniqueNumber(),
                getInvoiceListVo.getTrackerId(),
                getInvoiceListVo.getFromDate(),
                getInvoiceListVo.getToDate(),
                getInvoiceListVo.getIsCanceled(),
                getInvoiceListVo.getIsPayed(),
                getInvoiceListVo.getIsClosed(),
                getInvoiceListVo.getIsWaiting(),
                getInvoiceListVo.getGuildCode(),
                getInvoiceListVo.getReferenceNumber(),
                getInvoiceListVo.getUserId(),
                getInvoiceListVo.getId(),
                getInvoiceListVo.getQuery(),
                getInvoiceListVo.getFirstId(),
                getInvoiceListVo.getLastId(),
                getInvoiceListVo.getOffset(),
                getInvoiceListVo.getProductIdList(),
                getInvoiceListVo.getSize()
        ),
                onGetResponseListener).get();
    }

    public void getInvoiceListByMetadata(GetInvoiceListByMetadataVo getInvoiceListByMetadataVo,
                                         OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getInvoiceListByMetadataVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<List<InvoiceSrv>>(service.getInvoiceListByMetadata(
                getInvoiceListByMetadataVo.getBaseInfoVo().getToken(),
                getInvoiceListByMetadataVo.getBaseInfoVo().getToken_issuer(),
                getInvoiceListByMetadataVo.getIsCanceled(),
                getInvoiceListByMetadataVo.getIsPayed(),
                getInvoiceListByMetadataVo.getOffset(),
                getInvoiceListByMetadataVo.getSize()
        ),
                onGetResponseListener).get();
    }

    public void getInvoiceListAsFile(GetInvoiceListAsFileVo getInvoiceListAsFileVo,
                                     OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getInvoiceListAsFileVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<ExportServiceSrv>(service.getInvoiceListAsFile(
                getInvoiceListAsFileVo.getBaseInfoVo().getToken(),
                getInvoiceListAsFileVo.getBaseInfoVo().getToken_issuer(),
                getInvoiceListAsFileVo.getId(),
                getInvoiceListAsFileVo.getBillNumber(),
                getInvoiceListAsFileVo.getUniqueNumber(),
                getInvoiceListAsFileVo.getTrackerId(),
                getInvoiceListAsFileVo.getFromDate(),
                getInvoiceListAsFileVo.getToDate(),
                getInvoiceListAsFileVo.getIsCanceled(),
                getInvoiceListAsFileVo.getIsPayed(),
                getInvoiceListAsFileVo.getIsClosed(),
                getInvoiceListAsFileVo.getIsWaiting(),
                getInvoiceListAsFileVo.getGuildCode(),
                getInvoiceListAsFileVo.getReferenceNumber(),
                getInvoiceListAsFileVo.getUserId(),
                getInvoiceListAsFileVo.getQuery(),
                getInvoiceListAsFileVo.getProductIdList(),
                getInvoiceListAsFileVo.getLastNRows(),
                getInvoiceListAsFileVo.getCallbackUrl()
        ),
                onGetResponseListener).get();
    }

    public void cancelInvoice(CancelInvoiceVo cancelInvoiceVo,
                              OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        cancelInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.cancelInvoice(
                cancelInvoiceVo.getBaseInfoVo().getToken(),
                cancelInvoiceVo.getBaseInfoVo().getToken_issuer(),
                cancelInvoiceVo.getId()
        ),
                onGetResponseListener).get();
    }

    public void verifyAndCloseInvoice(VerifyAndCloseInvoiceVo verifyAndCloseInvoiceVo,
                                      OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        verifyAndCloseInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<InvoiceSrv>(service.verifyAndCloseInvoice(
                verifyAndCloseInvoiceVo.getBaseInfoVo().getToken(),
                verifyAndCloseInvoiceVo.getBaseInfoVo().getToken_issuer(),
                verifyAndCloseInvoiceVo.getId()
        ),
                onGetResponseListener).get();
    }

    public void closeInvoice(CloseInvoiceVo closeInvoiceVo,
                             OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        closeInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.closeInvoice(
                closeInvoiceVo.getBaseInfoVo().getToken(),
                closeInvoiceVo.getBaseInfoVo().getToken_issuer(),
                closeInvoiceVo.getId()
        ),
                onGetResponseListener).get();
    }

    public void getInvoicePaymentLink(GetInvoicePaymentLinkVo getInvoicePaymentLinkVo,
                                      OnGetResponseListener onGetResponseListener) {

        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        getInvoicePaymentLinkVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<String>(service.getInvoicePaymentLink(
                getInvoicePaymentLinkVo.getBaseInfoVo().getToken(),
                getInvoicePaymentLinkVo.getBaseInfoVo().getToken_issuer(),
                getInvoicePaymentLinkVo.getInvoiceId()
        ),
                onGetResponseListener).get();
    }

    public void payInvoice(PayInvoiceVo payInvoiceVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        payInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.payInvoice(
                payInvoiceVo.getBaseInfoVo().getToken(),
                payInvoiceVo.getBaseInfoVo().getToken_issuer(),
                payInvoiceVo.getInvoiceId()
        ), onGetResponseListener).get();
    }

    public void payInvoiceByCredit(PayInvoiceByCreditVo payInvoiceByCreditVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        payInvoiceByCreditVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.payInvoiceByCredit(
                payInvoiceByCreditVo.getBaseInfoVo().getToken(),
                payInvoiceByCreditVo.getBaseInfoVo().getToken_issuer(),
                payInvoiceByCreditVo.getBaseInfoVo().getOtt(),
                payInvoiceByCreditVo.getInvoiceId(),
                payInvoiceByCreditVo.getDelegationHash(),
                payInvoiceByCreditVo.getDelegatorId(),
                payInvoiceByCreditVo.getWallet(),
                payInvoiceByCreditVo.getForceDelegation()
        ), onGetResponseListener).get();
    }

    public void payAnyInvoiceByCredit(PayAnyInvoiceByCreditVo payAnyInvoiceByCreditVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        payAnyInvoiceByCreditVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.payAnyInvoiceByCredit(
                payAnyInvoiceByCreditVo.getBaseInfoVo().getToken(),
                payAnyInvoiceByCreditVo.getBaseInfoVo().getToken_issuer(),
                payAnyInvoiceByCreditVo.getBaseInfoVo().getOtt(),
                payAnyInvoiceByCreditVo.getInvoiceId(),
                payAnyInvoiceByCreditVo.getDelegationHash(),
                payAnyInvoiceByCreditVo.getDelegatorId(),
                payAnyInvoiceByCreditVo.getWallet(),
                payAnyInvoiceByCreditVo.getForceDelegation()
        ), onGetResponseListener).get();
    }

    public void sendInvoicePaymentSMS(SendInvoicePaymentSmsVo sendInvoicePaymentSMSVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        sendInvoicePaymentSMSVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.sendInvoicePaymentSMS(
                sendInvoicePaymentSMSVo.getBaseInfoVo().getToken(),
                sendInvoicePaymentSMSVo.getBaseInfoVo().getToken_issuer(),
                sendInvoicePaymentSMSVo.getInvoiceId(),
                sendInvoicePaymentSMSVo.getDelegationId(),
                sendInvoicePaymentSMSVo.getWallet(),
                sendInvoicePaymentSMSVo.getForceDelegation(),
                sendInvoicePaymentSMSVo.getCallbackUri(),
                sendInvoicePaymentSMSVo.getRedirectUri()
        ), onGetResponseListener).get();
    }


    public void payInvoiceInFuture(PayInvoiceInFutureVo payInvoiceInFutureVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        payInvoiceInFutureVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.payInvoiceInFuture(
                payInvoiceInFutureVo.getBaseInfoVo().getToken(),
                payInvoiceInFutureVo.getBaseInfoVo().getToken_issuer(),
                payInvoiceInFutureVo.getInvoiceId(),
                payInvoiceInFutureVo.getDate(),
                payInvoiceInFutureVo.getWallet(),
                payInvoiceInFutureVo.getGuildCode()
        ), onGetResponseListener).get();
    }


    public void payInvoiceByInvoice(PayInvoiceByInvoiceVo payInvoiceByInvoiceVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        payInvoiceByInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<Boolean>(service.payInvoiceByInvoice(
                payInvoiceByInvoiceVo.getBaseInfoVo().getToken(),
                payInvoiceByInvoiceVo.getBaseInfoVo().getToken_issuer(),
                payInvoiceByInvoiceVo.getCreditorInvoiceId(),
                payInvoiceByInvoiceVo.getDebtorInvoiceId()
        ), onGetResponseListener).get();
    }

    public void addDealer(AddDealerVo addDealerVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        addDealerVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<BusinessDealerSrv>(service.addDealer(
                addDealerVo.getBaseInfoVo().getToken(),
                addDealerVo.getBaseInfoVo().getToken_issuer(),
                addDealerVo.getDealerBizId(),
                addDealerVo.getAllProductAllow()
        ), onGetResponseListener).get();
    }

    public void dealerList(DealerListVo dealerListVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        dealerListVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<List<BusinessDealerSrv>>(service.dealerList(
                dealerListVo.getBaseInfoVo().getToken(),
                dealerListVo.getBaseInfoVo().getToken_issuer(),
                dealerListVo.getDealerBizId(),
                dealerListVo.getEnable(),
                dealerListVo.getOffset(),
                dealerListVo.getSize()
        ), onGetResponseListener).get();
    }

    public void enableDealer(EnableDealerVo enableDealerVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        enableDealerVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<BusinessDealerSrv>(service.enableDealer(
                enableDealerVo.getBaseInfoVo().getToken(),
                enableDealerVo.getBaseInfoVo().getToken_issuer(),
                enableDealerVo.getDealerBizId()
        ), onGetResponseListener).get();
    }

    public void disableDealer(DisableDealerVo disableDealerVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        disableDealerVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<BusinessDealerSrv>(service.disableDealer(
                disableDealerVo.getBaseInfoVo().getToken(),
                disableDealerVo.getBaseInfoVo().getToken_issuer(),
                disableDealerVo.getDealerBizId()
        ), onGetResponseListener).get();
    }


    public void businessDealingList(BusinessDealingListVo businessDealingListVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        businessDealingListVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<List<BusinessDealerSrv>>(service.businessDealingList(
                businessDealingListVo.getBaseInfoVo().getToken(),
                businessDealingListVo.getBaseInfoVo().getToken_issuer(),
                businessDealingListVo.getDealingBusinessId(),
                businessDealingListVo.getEnable(),
                businessDealingListVo.getOffset(),
                businessDealingListVo.getSize()
        ), onGetResponseListener).get();
    }

    public void issueMultiInvoice(IssueMultiInvoiceVo issueMultiInvoiceVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        issueMultiInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<InvoiceSrv>(service.issueMultiInvoice(
                issueMultiInvoiceVo.getBaseInfoVo().getToken(),
                issueMultiInvoiceVo.getBaseInfoVo().getToken_issuer(),
                issueMultiInvoiceVo.getData(),
                issueMultiInvoiceVo.getDelegationHash(),
                issueMultiInvoiceVo.getDelegatorId(),
                issueMultiInvoiceVo.getForceDelegation()
        ), onGetResponseListener).get();
    }

    public void addDealerProductPermission(AddDealerProductPermissionVo addDealerProductPermissionVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        addDealerProductPermissionVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<DealerProductPermissionSrv>(service.addDealerProductPermission(
                addDealerProductPermissionVo.getBaseInfoVo().getToken(),
                addDealerProductPermissionVo.getBaseInfoVo().getToken_issuer(),
                addDealerProductPermissionVo.getProductId(),
                addDealerProductPermissionVo.getDealerBizId()
        ), onGetResponseListener).get();
    }

    public void dealerProductPermissionList(DealerProductPermissionListVo dealerProductPermissionListVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        dealerProductPermissionListVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<List<DealerProductPermissionSrv>>(service.dealerProductPermissionList(
                dealerProductPermissionListVo.getBaseInfoVo().getToken(),
                dealerProductPermissionListVo.getBaseInfoVo().getToken_issuer(),
                dealerProductPermissionListVo.getProductId(),
                dealerProductPermissionListVo.getDealerBizId(),
                dealerProductPermissionListVo.getEnable(),
                dealerProductPermissionListVo.getOffset(),
                dealerProductPermissionListVo.getSize()
        ), onGetResponseListener).get();
    }

    public void dealingProductPermissionList(DealingProductPermissionListVo dealingProductPermissionListVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        dealingProductPermissionListVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<List<DealerProductPermissionSrv>>(service.dealingProductPermissionList(
                dealingProductPermissionListVo.getBaseInfoVo().getToken(),
                dealingProductPermissionListVo.getBaseInfoVo().getToken_issuer(),
                dealingProductPermissionListVo.getProductId(),
                dealingProductPermissionListVo.getDealingBusinessId(),
                dealingProductPermissionListVo.getOffset(),
                dealingProductPermissionListVo.getSize(),
                dealingProductPermissionListVo.getEnable()

        ), onGetResponseListener).get();
    }

    public void disableDealerProductPermission(DisableDealerProductPermissionVo disableDealerProductPermissionVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        disableDealerProductPermissionVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<DealerProductPermissionSrv>(service.disableDealerProductPermission(
                disableDealerProductPermissionVo.getBaseInfoVo().getToken(),
                disableDealerProductPermissionVo.getBaseInfoVo().getToken_issuer(),
                disableDealerProductPermissionVo.getProductId(),
                disableDealerProductPermissionVo.getDealerBizId()

        ), onGetResponseListener).get();
    }

    public void enableDealerProductPermission(EnableDealerProductPermissionVo enableDealerProductPermissionVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        enableDealerProductPermissionVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<DealerProductPermissionSrv>(service.enableDealerProductPermission(
                enableDealerProductPermissionVo.getBaseInfoVo().getToken(),
                enableDealerProductPermissionVo.getBaseInfoVo().getToken_issuer(),
                enableDealerProductPermissionVo.getProductId(),
                enableDealerProductPermissionVo.getDealerBizId()

        ), onGetResponseListener).get();
    }

    public void reduceMultiInvoice(ReduceMultiInvoiceVo reduceMultiInvoiceVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        reduceMultiInvoiceVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<InvoiceSrv>(service.reduceMultiInvoice(
                reduceMultiInvoiceVo.getBaseInfoVo().getToken(),
                reduceMultiInvoiceVo.getBaseInfoVo().getToken_issuer(),
                reduceMultiInvoiceVo.getData()


        ), onGetResponseListener).get();
    }

    public void reduceMultiInvoiceAndCashout(ReduceMultiInvoiceAndCashoutVo reduceMultiInvoiceAndCashoutVo, OnGetResponseListener onGetResponseListener) {
        BillingService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(new Throwable().getStackTrace()[0].getMethodName(),
                        reduceMultiInvoiceAndCashoutVo.getBaseInfoVo().getServerType()))
                .create(BillingService.class);

        new GetResult<InvoiceSrv>(service.reduceMultiInvoiceAndCashout(
                reduceMultiInvoiceAndCashoutVo.getBaseInfoVo().getToken(),
                reduceMultiInvoiceAndCashoutVo.getBaseInfoVo().getToken_issuer(),
                reduceMultiInvoiceAndCashoutVo.getData(),
                reduceMultiInvoiceAndCashoutVo.getToolCode()

        ), onGetResponseListener).get();
    }
}
