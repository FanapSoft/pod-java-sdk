package com.fanap.billingService.util;

import com.fanap.billingService.enums.EnumBaseURLPlatform;
import com.fanap.billingService.enums.EnumBaseURLPrivate;
import com.fanap.billingService.enums.Enum_Server_type;

/**
 * Created by Shahab Askarian on 8/3/2019.
 */
public class ServerTypeSelectionUtil {

    public static String getBaseURL(String methodName, Enum_Server_type enum_server_type) {

        switch (methodName) {
            case "ott":
            case "getInvoicePaymentLink":
            case "closeInvoice":
            case "verifyAndCloseInvoice":
            case "getInvoiceListByMetadata":
            case "getInvoiceListAsFile":
            case "getInvoiceList":
            case "issueInvoice":
            case "cancelInvoice":
            case "payInvoice":
            case "payInvoiceByCredit":
            case "sendInvoicePaymentSMS":
            case "payInvoiceByInvoice":
            case "payInvoiceInFuture":
            case "payAnyInvoiceByCredit":
            case "addDealer":
            case "dealerList":
            case "enableDealer":
            case "disableDealer":
            case "businessDealingList":
            case "issueMultiInvoiceVo":
            case "addDealerProductPermission":
            case " dealerProductPermissionList":
            case "dealingProductPermissionList":
            case "disabeDealerProductPermission":
            case "enableDealerProductPermission":
            case "reduceMultiInvoice":
            case "reduceMultiInvoiceAndCashout":
                if (enum_server_type.getValue().equals(Enum_Server_type.PRODUCTION.getValue()))
                    return EnumBaseURLPlatform.PRODUCTION.getValue();
                else
                    return EnumBaseURLPlatform.SANDBOX.getValue();

            case "createPreInvoice":
            case "payInvoiceByUniqueNumber":

                if (enum_server_type.getValue().equals(Enum_Server_type.PRODUCTION.getValue()))
                    return EnumBaseURLPrivate.PRODUCTION.getValue();
                else
                    return EnumBaseURLPrivate.SANDBOX.getValue();
            default:
                return EnumBaseURLPlatform.SANDBOX.getValue();
        }
    }
}
