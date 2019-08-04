package com.fanap.billingService.service;

import com.fanap.billingService.data.modelSrv.ExportServiceSrv;
import com.fanap.billingService.data.modelSrv.InvoiceSrv;
import com.fanap.billingService.data.modelVo.*;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.*;

import java.util.List;

/**
 * Created By Askarian on 5/28/2019
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
}
