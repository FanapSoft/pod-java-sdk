package com.fanap.userOperation.sampleCode;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.BusinessDealerSrv;
import com.fanap.billingService.data.modelSrv.DealerProductPermissionSrv;
import com.fanap.billingService.data.modelSrv.ExportServiceSrv;
import com.fanap.billingService.data.modelSrv.InvoiceSrv;
import com.fanap.billingService.data.modelVo.*;
import com.fanap.billingService.enums.Enum_Server_type;
import com.fanap.billingService.exception.PodException;
import com.fanap.billingService.util.OnGetResponseListener;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */

public class App {

    private static String TOKEN = "c43049a626e5462ab85c0a8e4028e9fe";
    private static String OTT = "";
    private static String RIDERECT_URI = "https://www.google.com/";
    private static String SAMPLE_GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    public static void main(String[] args) throws PodException {
        ott();
        issueInvoice();
        createPreInvoice();
        getInvoiceList();
        getInvoiceListByMetadata();
        getInvoiceListAsFile();
        cancelInvoice();
        verifyAndCloseInvoice();
        closeInvoice();
        getInvoicePaymentLink();
        payInvoice();
        payInvoiceByCredit();
        sendInvoicePaymentSMS();
        payInvoiceInFuture();
        payInvoiceByInvoice();
        payAnyInvoiceByCredit();
        payInvoiceByUniqueNumber();
        addDealer();
        dealerList();
        enableDealer();
        disableDealer();
        addDealerProductPermission();
        businessDealingList();
        addDealerProductPermission();
        dealerProductPermissionList();
        dealingProductPermissionList();
        disableDealerProductPermission();
        enableDealerProductPermission();
        issueMultiInvoice();
        reduceMultiInvoice();
        reduceMultiInvoiceAndCashout();
    }


    private static void sendInvoicePaymentSMS() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("1c0898d03cef4c0a80741653aaa1b8ad")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        BillingService billingService = new BillingService();

        try {
            SendInvoicePaymentSmsVo sendInvoicePaymentSMSVo = new SendInvoicePaymentSmsVo.Builder(baseInfoVo)
                    .setInvoiceId(31596L)
                    .build();
            billingService.sendInvoicePaymentSMS(sendInvoicePaymentSMSVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void payInvoiceByCredit() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9a36df05377e45fb943d22543996498c")
                .setToken_issuer(1)
                .setOtt("c021f185e038c772")
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        BillingService billingService = new BillingService();

        try {
            PayInvoiceByCreditVo payInvoiceByCreditVo = new PayInvoiceByCreditVo.Builder(baseInfoVo)
                    .setInvoiceId(31576L)
                    .build();
            billingService.payInvoiceByCredit(payInvoiceByCreditVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void payAnyInvoiceByCredit() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9a36df05377e45fb943d22543996498c")
                .setToken_issuer(1)
                .setOtt("b290720b4497e5f7")
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        BillingService billingService = new BillingService();

        try {
            PayAnyInvoiceByCreditVo payAnyInvoiceByCreditVo = new PayAnyInvoiceByCreditVo.Builder(baseInfoVo)
                    .setInvoiceId(31580L)
                    .setWallet("PODLAND_WALLET")
                    .build();
            billingService.payAnyInvoiceByCredit(payAnyInvoiceByCreditVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void payInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        BillingService billingService = new BillingService();

        try {
            PayInvoiceVo payInvoiceVo = new PayInvoiceVo.Builder(baseInfoVo)
                    .setInvoiceId(5007913L)
                    .build();
            billingService.payInvoice(payInvoiceVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void getInvoicePaymentLink() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        BillingService billingService = new BillingService();

        try {
            GetInvoicePaymentLinkVo getInvoicePaymentLinkVo = new GetInvoicePaymentLinkVo.Builder(baseInfoVo)
                    .setInvoiceId(3581653L)
                    .build();
            billingService.getInvoicePaymentLink(getInvoicePaymentLinkVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void closeInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        BillingService billingService = new BillingService();

        try {
            CloseInvoiceVo closeInvoiceVo = new CloseInvoiceVo.Builder(baseInfoVo)
                    .setId(3360466L)
                    .build();
            billingService.closeInvoice(closeInvoiceVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void cancelInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        BillingService billingService = new BillingService();

        try {
            CancelInvoiceVo cancelInvoiceVo = new CancelInvoiceVo.Builder(baseInfoVo)
                    .setId(3581653L)
                    .build();
            billingService.cancelInvoice(cancelInvoiceVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void verifyAndCloseInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        BillingService billingService = new BillingService();

        try {
            VerifyAndCloseInvoiceVo verifyAndCloseInvoiceVo = new VerifyAndCloseInvoiceVo.Builder(baseInfoVo)
                    .setId(3581653L)
                    .build();
            billingService.verifyAndCloseInvoice(verifyAndCloseInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void getInvoiceListAsFile() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        BillingService billingService = new BillingService();

        try {
            GetInvoiceListAsFileVo getInvoiceListAsFileVo = new GetInvoiceListAsFileVo.Builder(baseInfoVo)
                    .setLastNRows(10L)
                    .build();
            billingService.getInvoiceListAsFile(getInvoiceListAsFileVo, new OnGetResponseListener<ExportServiceSrv>() {
                @Override
                public void onResponse(ResultVo<ExportServiceSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void getInvoiceListByMetadata() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        BillingService billingService = new BillingService();

        try {
            GetInvoiceListByMetadataVo getInvoiceListByMetadataVo = new GetInvoiceListByMetadataVo.Builder(baseInfoVo)
                    .build();
            billingService.getInvoiceListByMetadata(getInvoiceListByMetadataVo,
                    new OnGetResponseListener<List<InvoiceSrv>>() {
                        @Override
                        public void onResponse(ResultVo<List<InvoiceSrv>> result) {
                            System.out.println(result.getResult().size());
                        }

                        @Override
                        public void onFailed(PodException e) {
                            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        }
                    });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void getInvoiceList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        BillingService billingService = new BillingService();

        try {
            GetInvoiceListVo getInvoiceListVo = new GetInvoiceListVo.Builder(baseInfoVo)
                    .setOffset(0L)
                    .setSize(10L)
                    .build();
            billingService.getInvoiceList(getInvoiceListVo, new OnGetResponseListener<List<InvoiceSrv>>() {
                @Override
                public void onResponse(ResultVo<List<InvoiceSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void createPreInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setOtt(OTT)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        BillingService billingService = new BillingService();

        List<ProductInfo> productInfos = new ArrayList<>();
        ProductInfo productInfo = new ProductInfo();
        productInfo
                .setProductId(0L)
                .setPrice(new BigDecimal(1))
                .setQuantity(new BigDecimal(1))
                .setProductDescription("test");
        productInfos.add(productInfo);

        try {
            CreatePreInvoiceVo createPreInvoiceVo = new CreatePreInvoiceVo.Builder(baseInfoVo)
                    .setRedirectURL(RIDERECT_URI)
                    .setUserId(513304L)
                    .setProductInfos(productInfos)
                    .setGuildCode(SAMPLE_GUILD_CODE)
                    .build();

            billingService.createPreInvoice(createPreInvoiceVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void ott() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        BillingService billingService = new BillingService();

        try {
            OttVo ottVo = new OttVo.Builder(baseInfoVo)
                    .build();
            billingService.ott(ottVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getOtt());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void issueInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setOtt(OTT)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        BillingService billingService = new BillingService();

        List<ProductInfo> productInfos = new ArrayList<>();
        ProductInfo productInfo = new ProductInfo();
        productInfo
                .setProductId(0L)
                .setPrice(new BigDecimal(1))
                .setQuantity(new BigDecimal(1))
                .setProductDescription("test");
        productInfos.add(productInfo);

        try {
            IssueInvoiceVo issueInvoiceVo = new IssueInvoiceVo.Builder(baseInfoVo)
                    .setProductInfos(productInfos)
                    .setUserId(123L)
                    .setGuildCode(SAMPLE_GUILD_CODE)
                    .build();
            billingService.issueInvoice(issueInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void payInvoiceInFuture() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9a36df05377e45fb943d22543996498c")
                .setToken_issuer(1)
                .setOtt(OTT)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        BillingService billingService = new BillingService();


        try {
            PayInvoiceInFutureVo payInvoiceInFutureVo = new PayInvoiceInFutureVo.Builder(baseInfoVo)
                    .setDate("1398/07/05")
                    .setInvoiceId(31607L)
                    .setGuildCode("ENGINEERING_GUILD")
                    .build();
            billingService.payInvoiceInFuture(payInvoiceInFutureVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void payInvoiceByInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("1c0898d03cef4c0a80741653aaa1b8ad")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();


        try {
            PayInvoiceByInvoiceVo payInvoiceByInvoiceVo = new PayInvoiceByInvoiceVo.Builder(baseInfoVo)
                    .setCreditorInvoiceId(31605L)
                    .setDebtorInvoiceId(31606L)
                    .build();
            billingService.payInvoiceByInvoice(payInvoiceByInvoiceVo, new OnGetResponseListener<Boolean>() {
                @Override
                public void onResponse(ResultVo<Boolean> result) {
                    System.out.println(result.getResult());
                }


                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static String payInvoiceByUniqueNumber() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        try {
            PayInvoiceByUniqueNumberVo payInvoiceByUniqueNumberVo = new PayInvoiceByUniqueNumberVo.Builder(baseInfoVo)
                    .setUniqueNumber("3dc9575c7f860ab4")
                    .setGateway("PEP")
                    .setRedirectUri("https://www.google.com/")
                    .build();
            return payInvoiceByUniqueNumberVo.getLink();

        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
        return null;

    }


    private static void addDealer() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9a36df05377e45fb943d22543996498c")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();


        try {
            AddDealerVo addDealerVo = new AddDealerVo.Builder(baseInfoVo)
                    .setDealerBizId(9371L)
                    .build();
            billingService.addDealer(addDealerVo, new OnGetResponseListener<BusinessDealerSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessDealerSrv> result) {
                    System.out.println(result.getResult().getBusiness().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void dealerList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("1c0898d03cef4c0a80741653aaa1b8ad")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();


        try {
            DealerListVo dealerListVo = new DealerListVo.Builder(baseInfoVo)
                    .setDealerBizId(9373L)
                    .build();
            billingService.dealerList(dealerListVo, new OnGetResponseListener<List<BusinessDealerSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BusinessDealerSrv>> result) {
                    System.out.println(result.getResult().get(0).getBusiness().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void enableDealer() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("1c0898d03cef4c0a80741653aaa1b8ad")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();


        try {
            EnableDealerVo enableDealerVo = new EnableDealerVo.Builder(baseInfoVo)
                    .setDealerBizId(9373L)
                    .build();
            billingService.enableDealer(enableDealerVo, new OnGetResponseListener<BusinessDealerSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessDealerSrv> result) {
                    System.out.println(result.getResult().getBusiness().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void disableDealer() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("1c0898d03cef4c0a80741653aaa1b8ad")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();


        try {
            DisableDealerVo disableDealerVo = new DisableDealerVo.Builder(baseInfoVo)
                    .setDealerBizId(9373L)
                    .build();
            billingService.disableDealer(disableDealerVo, new OnGetResponseListener<BusinessDealerSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessDealerSrv> result) {
                    System.out.println(result.getResult().getBusiness().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void businessDealingList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9a36df05377e45fb943d22543996498c")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();


        try {
            BusinessDealingListVo businessDealingListVo = new BusinessDealingListVo.Builder(baseInfoVo)
                    .build();
            billingService.businessDealingList(businessDealingListVo, new OnGetResponseListener<List<BusinessDealerSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BusinessDealerSrv>> result) {
                    System.out.println(result.getResult().size());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void issueMultiInvoice() throws PodException {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setOtt(OTT)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();


        BillingService billingService = new BillingService();
        InvoiceItemVO mainInvoiceItemVo = new InvoiceItemVO.Builder(baseInfoVo)
                .setProductId(0L)
                .setDescription("p1")
                .setQuantity(new BigDecimal(1))
                .setPrice(100L)
                .build();
        List<InvoiceItemVO> mainInvoiceItemVOList = new ArrayList<>();
        mainInvoiceItemVOList.add(mainInvoiceItemVo);
        MainInvoiceVo mainInvoiceVo = new MainInvoiceVo()
                .setGuildCode("ENGINEERING_GUILD")
                .setDescription("hi")
                .setInvoiceItemVOs(mainInvoiceItemVOList);


        InvoiceItemVO subInvoiceItemVo = new InvoiceItemVO.Builder(baseInfoVo)
                .setProductId(0L)
                .setDescription("TEST")
                .setQuantity(new BigDecimal(1))
                .setPrice(100L)
                .build();
        List<InvoiceItemVO> SUBInvoiceItemVoList = new ArrayList<>();
        SUBInvoiceItemVoList.add(subInvoiceItemVo);

        SubInvoiceVO subInvoiceVO = new SubInvoiceVO.Builder(baseInfoVo)
                .setBusinessId(9371L)
                .setGuildCode("ENGINEERING_GUILD")
                .setInvoiceItemVOs(SUBInvoiceItemVoList)
                .setDescription("ZIR")
                .build();

        List<SubInvoiceVO> subInvoiceVOS = new ArrayList<>();
        subInvoiceVOS.add(subInvoiceVO);

        InvoiceItemVO customerInvoiceItemVo = new InvoiceItemVO.Builder(baseInfoVo)
                .setProductId(0L)
                .setDescription("CO")
                .setQuantity(new BigDecimal(1))
                .setPrice(200L)
                .build();
        List<InvoiceItemVO> customerInvoiceItems = new ArrayList<>();
        customerInvoiceItems.add(customerInvoiceItemVo);

        MultiInvoiceDataVo multiInvoiceDataVo = new MultiInvoiceDataVo()
                .setMainInvoice(mainInvoiceVo)
                .setSubInvoices(subInvoiceVOS)
                .setCustomerInvoiceItemVOs(customerInvoiceItems)
                .setUserId(16849L);
        try {
            IssueMultiInvoiceVo issueMultiInvoiceVo = new IssueMultiInvoiceVo.Builder(baseInfoVo)
                    .setData(multiInvoiceDataVo)
                    .build();
            billingService.issueMultiInvoice(issueMultiInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void addDealerProductPermission() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("1c0898d03cef4c0a80741653aaa1b8ad")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();


        try {
            AddDealerProductPermissionVo addDealerProductPermissionVo = new AddDealerProductPermissionVo.Builder(baseInfoVo)
                    .setDealerBizId(9373L)
                    .setProductId(30343L)
                    .build();
            billingService.addDealerProductPermission(addDealerProductPermissionVo, new OnGetResponseListener<DealerProductPermissionSrv>() {
                @Override
                public void onResponse(ResultVo<DealerProductPermissionSrv> result) {
                    System.out.println(result.getResult().getProduct().getEntityId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void dealerProductPermissionList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("1c0898d03cef4c0a80741653aaa1b8ad")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();


        try {
            DealerProductPermissionListVo dealerProductPermissionListVo = new DealerProductPermissionListVo.Builder(baseInfoVo)

                    .build();
            billingService.dealerProductPermissionList(dealerProductPermissionListVo, new OnGetResponseListener<List<DealerProductPermissionSrv>>() {
                @Override
                public void onResponse(ResultVo<List<DealerProductPermissionSrv>> result) {
                    System.out.println(result.getResult().get(0).getProduct().getEntityId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void dealingProductPermissionList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("9a36df05377e45fb943d22543996498c")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();


        try {
            DealingProductPermissionListVo dealingProductPermissionListVo = new DealingProductPermissionListVo.Builder(baseInfoVo)
                    .setSize(5)
                    .build();
            billingService.dealingProductPermissionList(dealingProductPermissionListVo, new OnGetResponseListener<List<DealerProductPermissionSrv>>() {
                @Override
                public void onResponse(ResultVo<List<DealerProductPermissionSrv>> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void disableDealerProductPermission() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("1c0898d03cef4c0a80741653aaa1b8ad")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();


        try {
            DisableDealerProductPermissionVo disableDealerProductPermissionVo = new DisableDealerProductPermissionVo.Builder(baseInfoVo)
                    .setDealerBizId(9373L)
                    .setProductId(30343L)
                    .build();
            billingService.disableDealerProductPermission(disableDealerProductPermissionVo, new OnGetResponseListener<DealerProductPermissionSrv>() {
                @Override
                public void onResponse(ResultVo<DealerProductPermissionSrv> result) {
                    System.out.println(result.getResult().getProduct().getEntityId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void enableDealerProductPermission() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("1c0898d03cef4c0a80741653aaa1b8ad")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();


        try {
            EnableDealerProductPermissionVo enableDealerProductPermissionVo = new EnableDealerProductPermissionVo.Builder(baseInfoVo)
                    .setDealerBizId(9373L)
                    .setProductId(30343L)
                    .build();
            billingService.enableDealerProductPermission(enableDealerProductPermissionVo, new OnGetResponseListener<DealerProductPermissionSrv>() {
                @Override
                public void onResponse(ResultVo<DealerProductPermissionSrv> result) {
                    System.out.println(result.getResult().getProduct().getEntityId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void reduceMultiInvoice() throws PodException {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
        ReduceInvoiceSubItemVo mainReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(34881L)
                .setDescription("JJ")
                .setPrice(50L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> mainReduceInvoiceSubItemVos = new ArrayList<>();
        mainReduceInvoiceSubItemVos.add(mainReduceInvoiceSubItemVo);

        ReduceInvoiceItemVO mainInvoiceVos = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                .setId(32514L)
                .setReduceInvoiceItemVOs(mainReduceInvoiceSubItemVos)
                .build();

        ReduceInvoiceSubItemVo subReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(32515L)
                .setDescription("jioj")
                .setPrice(50L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> subrReduceInvoiceSubItemVos = new ArrayList<>();
        subrReduceInvoiceSubItemVos.add(subReduceInvoiceSubItemVo);


        ReduceInvoiceItemVO subReduceInvoiceItemVo = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                .setId(32515L)
                .setReduceInvoiceItemVOs(subrReduceInvoiceSubItemVos)
                .build();

        List<ReduceInvoiceItemVO> subReduceInvoiceItemVos = new ArrayList<>();
        subReduceInvoiceItemVos.add(subReduceInvoiceItemVo);

        ReduceInvoiceSubItemVo customerreduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(34879L)
                .setDescription("DFDF")
                .setPrice(100L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> customerInvoiceItems = new ArrayList<>();
        customerInvoiceItems.add(customerreduceInvoiceSubItemVo);


        ReduceMultiInvoiceDataVo reduceMultiInvoiceDataVo = new ReduceMultiInvoiceDataVo()
                .setMainInvoice(mainInvoiceVos)
                .setSubInvoices(subReduceInvoiceItemVos)
                .setCustomerInvoiceItemVOs(customerInvoiceItems);
        try {
            ReduceMultiInvoiceVo reduceMultiInvoiceVo = new ReduceMultiInvoiceVo.Builder(baseInfoVo)
                    .setData(reduceMultiInvoiceDataVo)
                    .build();
            billingService.reduceMultiInvoice(reduceMultiInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }


    private static void reduceMultiInvoiceAndCashout() throws PodException {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("2b02de2188a149bfa74b7760d4a64c85")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
                .build();

        BillingService billingService = new BillingService();
        ReduceInvoiceSubItemVo mainReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(35105L)
                .setDescription("MJH")
                .setPrice(50L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> mainReduceInvoiceSubItemVol = new ArrayList<>();
        mainReduceInvoiceSubItemVol.add(mainReduceInvoiceSubItemVo);
        ReduceInvoiceItemVO mainInvoiceVos = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                .setId(32734L)
                .setReduceInvoiceItemVOs(mainReduceInvoiceSubItemVol)
                .build();


        ReduceInvoiceSubItemVo subReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(35106L)
                .setDescription("HFHF")
                .setPrice(50L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> subReduceInvoiceSubItemVoList = new ArrayList<>();
        subReduceInvoiceSubItemVoList.add(subReduceInvoiceSubItemVo);


        ReduceInvoiceItemVO subReduceInvoiceItemVo = new ReduceInvoiceItemVO.Builder(baseInfoVo)
                .setId(32735L)
                .setReduceInvoiceItemVOs(subReduceInvoiceSubItemVoList)
                .build();
        List<ReduceInvoiceItemVO> subInvoiceVos = new ArrayList<>();
        subInvoiceVos.add(subReduceInvoiceItemVo);

        ReduceInvoiceSubItemVo customerReduceInvoiceSubItemVo = new ReduceInvoiceSubItemVo()
                .setId(35103L)
                .setDescription("fjhg")
                .setPrice(100L)
                .setQuantity(new BigDecimal(2));
        List<ReduceInvoiceSubItemVo> customerInvoiceItems = new ArrayList<>();
        customerInvoiceItems.add(customerReduceInvoiceSubItemVo);

        ReduceMultiInvoiceDataVo reduceMultiInvoiceDataVo = new ReduceMultiInvoiceDataVo()
                .setMainInvoice(mainInvoiceVos)
                .setCustomerInvoiceItemVOs(customerInvoiceItems)
                .setSubInvoices(subInvoiceVos);


        try {
            ReduceMultiInvoiceAndCashoutVo reduceMultiInvoiceAndCashoutVo = new ReduceMultiInvoiceAndCashoutVo.Builder(baseInfoVo)
                    .setData(reduceMultiInvoiceDataVo)
                    .setToolCode("SETTLEMENT_TOOL_CARD")
                    .build();
            billingService.reduceMultiInvoiceAndCashout(reduceMultiInvoiceAndCashoutVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


}


