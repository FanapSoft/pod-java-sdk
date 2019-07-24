package com.fanap.billingService.controller;

import com.fanap.billingService.data.modelVo.*;
import com.fanap.billingService.exception.BillingException;
import com.fanap.billingService.service.Service;
import com.fanap.billingService.util.OnGetResponseListener;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class BillingService {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();

    /**
     * Get ott.
     *
     * @param ottVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws BillingException
     */
    public BillingService ott(OttVo ottVo, OnGetResponseListener onGetResponseListener)
            throws BillingException {

        if (onGetResponseListener != null)
            service.ott(ottVo, onGetResponseListener);

        else throw BillingException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Issue invoice.
     *
     * @param issueInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws BillingException
     */
    public BillingService issueInvoice(IssueInvoiceVo issueInvoiceVo, OnGetResponseListener onGetResponseListener)
            throws BillingException {

        if (onGetResponseListener != null)
            service.issueInvoice(issueInvoiceVo, onGetResponseListener);

        else throw BillingException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Create preinvoice.
     *
     * @param createPreInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws BillingException
     */
    public BillingService createPreInvoice(CreatePreInvoiceVo createPreInvoiceVo, OnGetResponseListener onGetResponseListener)
            throws BillingException {

        if (onGetResponseListener != null)
            service.createPreInvoice(createPreInvoiceVo, onGetResponseListener);

        else throw BillingException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list.
     *
     * @param getInvoiceListVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws BillingException
     */
    public BillingService getInvoiceList(GetInvoiceListVo getInvoiceListVo, OnGetResponseListener onGetResponseListener)
            throws BillingException {

        if (onGetResponseListener != null)
            service.getInvoiceList(getInvoiceListVo, onGetResponseListener);

        else throw BillingException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list by metadata.
     *
     * @param getInvoiceListByMetadataVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws BillingException
     */
    public BillingService getInvoiceListByMetadata(GetInvoiceListByMetadataVo getInvoiceListByMetadataVo,
                                                   OnGetResponseListener onGetResponseListener)
            throws BillingException {

        if (onGetResponseListener != null)
            service.getInvoiceListByMetadata(getInvoiceListByMetadataVo, onGetResponseListener);

        else throw BillingException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list as file.
     *
     * @param getInvoiceListAsFileVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws BillingException
     */
    public BillingService getInvoiceListAsFile(GetInvoiceListAsFileVo getInvoiceListAsFileVo,
                                               OnGetResponseListener onGetResponseListener)
            throws BillingException {

        if (onGetResponseListener != null)
            service.getInvoiceListAsFile(getInvoiceListAsFileVo, onGetResponseListener);

        else throw BillingException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list as file.
     *
     * @param cancelInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws BillingException
     */
    public BillingService cancelInvoice(CancelInvoiceVo cancelInvoiceVo,
                                               OnGetResponseListener onGetResponseListener)
            throws BillingException {

        if (onGetResponseListener != null)
            service.cancelInvoice(cancelInvoiceVo, onGetResponseListener);

        else throw BillingException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list as file.
     *
     * @param verifyAndCloseInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws BillingException
     */
    public BillingService verifyAndCloseInvoice(VerifyAndCloseInvoiceVo verifyAndCloseInvoiceVo,
                                        OnGetResponseListener onGetResponseListener)
            throws BillingException {

        if (onGetResponseListener != null)
            service.verifyAndCloseInvoice(verifyAndCloseInvoiceVo, onGetResponseListener);

        else throw BillingException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list as file.
     *
     * @param closeInvoiceVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws BillingException
     */
    public BillingService closeInvoice(CloseInvoiceVo closeInvoiceVo,
                                        OnGetResponseListener onGetResponseListener)
            throws BillingException {

        if (onGetResponseListener != null)
            service.closeInvoice(closeInvoiceVo, onGetResponseListener);

        else throw BillingException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get invoice list as file.
     *
     * @param getInvoicePaymentLinkVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws BillingException
     */
    public BillingService getInvoicePaymentLinkVo(GetInvoicePaymentLinkVo getInvoicePaymentLinkVo,
                                       OnGetResponseListener onGetResponseListener)
            throws BillingException {

        if (onGetResponseListener != null)
            service.getInvoicePaymentLinkVo(getInvoicePaymentLinkVo, onGetResponseListener);

        else throw BillingException.invalidParameter(MESSAGE);

        return this;
    }


//    /**
//     * Get access token.
//     *
//     * @param getUserProfileVo
//     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
//     *                                       InvalidParameterException will be thrown.
//     * @return
//     * @throws BillingException
//     */
//    public BillingService getUserProfile(GetUserProfileVo getUserProfileVo,
//                                         OnGetResponseListener onGetResponseListener)
//            throws BillingException {
//
//        if (onGetResponseListener != null)
//            service.getUserProfile(getUserProfileVo, onGetResponseListener);
//
//        else throw BillingException.invalidParameter(MESSAGE);
//
//        return this;
//    }
//
//    /**
//     * Get access token.
//     *
//     * @param editProfileWithConfirmationVo
//     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
//     *                                       InvalidParameterException will be thrown.
//     * @return
//     * @throws BillingException
//     */
//    public BillingService editProfileWithConfirmation(EditProfileWithConfirmationVo
//                                                                         editProfileWithConfirmationVo,
//                                                      OnGetResponseListener onGetResponseListener)
//            throws BillingException {
//
//        if (onGetResponseListener != null)
//            service.editProfileWithConfirmation(editProfileWithConfirmationVo, onGetResponseListener);
//
//        else throw BillingException.invalidParameter(MESSAGE);
//
//        return this;
//    }
}
