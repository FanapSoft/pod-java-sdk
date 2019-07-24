package com.fanap.userOperation.sampleCode;

import com.fanap.billingService.controller.BillingService;
import com.fanap.billingService.data.modelSrv.ExportServiceSrv;
import com.fanap.billingService.data.modelSrv.InvoiceSrv;
import com.fanap.billingService.data.modelVo.*;
import com.fanap.billingService.exception.BillingException;
import com.fanap.billingService.util.OnGetResponseListener;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {
        ott();
//        issueInvoice();
//        createPreInvoice();
//        getInvoiceList();
//        getInvoiceListByMetadata();
//        getInvoiceListAsFile();
//        cancelInvoice();
//        verifyAndCloseInvoice();
//        closeInvoice();
//        getInvoicePaymentLinkVo();
    }

    private static void getInvoicePaymentLinkVo() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
                .build();

        BillingService billingService = new BillingService();

        try {
            GetInvoicePaymentLinkVo getInvoicePaymentLinkVo = new GetInvoicePaymentLinkVo.Builder(baseInfoVo)
                    .setInvoiceId(3581653L)
                    .build();
            billingService.getInvoicePaymentLinkVo(getInvoicePaymentLinkVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(BillingException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (BillingException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void closeInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
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
                public void onFailed(BillingException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (BillingException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void cancelInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
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
                public void onFailed(BillingException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (BillingException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void verifyAndCloseInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
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
                public void onFailed(BillingException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (BillingException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void getInvoiceListAsFile() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
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
                public void onFailed(BillingException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (BillingException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void getInvoiceListByMetadata() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
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
                        public void onFailed(BillingException e) {
                            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                        }
                    });
        } catch (BillingException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void getInvoiceList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
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
                public void onFailed(BillingException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (BillingException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void createPreInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
                .setOtt("84d5b96f8218c6bd")
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
                    .setRedirectURL("https://www.google.com/")
                    .setUserId(513304L)
                    .setProductInfos(productInfos)
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .build();

            billingService.createPreInvoice(createPreInvoiceVo, new OnGetResponseListener<String>() {
                @Override
                public void onResponse(ResultVo<String> result) {
                    System.out.println(result.getResult());
                }

                @Override
                public void onFailed(BillingException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (BillingException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void ott() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
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
                public void onFailed(BillingException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (BillingException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void issueInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
                .setOtt("79a4dae2b9f5b9d0")
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
//                    .setUserId(123L)
                    .setGuildCode("INFORMATION_TECHNOLOGY_GUILD")
                    .build();
            billingService.issueInvoice(issueInvoiceVo, new OnGetResponseListener<InvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<InvoiceSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(BillingException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (BillingException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }
}
