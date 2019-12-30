package com.fanap.podBank;

import com.fanap.podBank.controller.PodBanking;
import com.fanap.podBank.data.modelSrv.*;
import com.fanap.podBank.data.modelVo.*;
import com.fanap.podBank.util.OnGetResponseListener;
import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Z.gholinia on 11/9/2019.
 */
public class Main {

    private static String TOKEN = "4d3d6b85e2e844b0ade83cc2ec5b4c85";
    private static String API_KEY = "206ccc28fff947dc919a3ad5ba1949b9";


    public static void main(String[] args) {

//        getShebaInfo();
//        getDebitCardInfo();
//        getDepositNumberByCardNumber();
//        getShebaByCardNumber();
//        getCardInformation();
//        getSubmissionChque();
//        convertDepositNumberToSheba();
//        convertShebaToDeposit();
        getDepositInvoice();
//        getDepositBalance();
//        transferMoney();
//        getTransferMoneyState();
//        billPaymentByDeposit();
//        cardToCard();
//        cardToCardList();
//        payaSerivice();

    }


    private static void getShebaInfo() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        try {
            GetShebaInfoVo getShebaInfoVo = new GetShebaInfoVo.Builder(baseInfoVo)
                    .setSheba("510570100180013692932101")
                    .build();
            podBanking.getShebaInfo(getShebaInfoVo, new OnGetResponseListener<ShebaInfoSrv>() {
                @Override
                public void onResponse(ResultVo<ShebaInfoSrv> result) {
                    System.out.println(result.getResult().getOwners().get(0).getLastName());
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


    private static void getDebitCardInfo() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.SANDBOX)
//                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        try {
            GetDebitCardInfoVo getDebitCardInfoVo = new GetDebitCardInfoVo.Builder(baseInfoVo)
                    .setCardNumber("5022291080000841")
                    .build();
            podBanking.getDebitCardInfo(getDebitCardInfoVo, new OnGetResponseListener<String>() {
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

    private static void getDepositNumberByCardNumber() {

        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("<RSAKeyValue><Modulus>qRmVNMYHXo69d67VMJy4MfvXl+fQuQjmwU6t9ZbsU4ixOyAQ6bBDsMMbuJjeS7KiwE73MSo+aiMYMRVC5LBjVlv05LMJeic99pbKB0FjU0VO0PyxUAT0E37t7WcolQ01KlbkSaBNrT5y5+6KGitSXhm7Fu38djUzlzSBfew65bU=</Modulus><Exponent>AQAB</Exponent><P>0urz/B5S5q5sqhrl2H1VYEuScKIQigKy+Oc8O2374T8lf2RD4+A3U9ppGowE4ocNR3PiFIhf3hQWfMnKSs85Pw==</P><Q>zT5uXAtsqoyo2lvLC4ME1wT1cEUrh5yvm47vgqtJvEseRI26jrF/+dKmFOEYk+LLuRa7ctgiWNoCc88YcuCQCw==</Q><DP>iL7f9OPMJ9eKiDbsMhIAWnBkvzWzt2bMlmeFO5qxJXaFXzSod4OVG36NijKhsCSTTXIqb9mDHj6z3bAOwbXcjQ==</DP><DQ>ePwcQdXaMI7J2i3R+u84oychJxUfG8mZGrGfLf+ab4w4Q2DoX8TyE2nAzP4DZumB/ZEQ3hnZ5VZdq7agStdlEQ==</DQ><InverseQ>BoVlcZuVqWf7gb7HPTpWMfAtkl5cncF9dDi8P2N4mHIU1GK3zSTdWtamOKSgh4EheVsiTU/yBAadi7isVmqAbg==</InverseQ><D>UW3fWt1tmQw1ktefE9y0GmXDCQR5j1EJBddkj9oQjZ1Kc0Vav53AyvL5e2gpy9wG4YJlKMjF64hg0uoBH20NODWCp5ApIomwcz/G39Tynyos5Hm8UuUfSF5wMtK9a6xDaOskQC2S0LkUHO7S/6ICQm3B2QQfX1x3jHkZHvlHxfU=</D></RSAKeyValue>");
        try {
            GetDepositNumberByCardNumberVo getDepositNumberByCardNumberVo = new GetDepositNumberByCardNumberVo.Builder(baseInfoVo)
                    .setUserName("66497service")
                    .setSignatureInfo(signatureInfo)
                    .setCardNumber("5022291087967806")
                    .build();
            podBanking.getDepositNumberByCardNumber(getDepositNumberByCardNumberVo, new OnGetResponseListener<GetDepositNumberByCardNumberSrv>() {
                @Override
                public void onResponse(ResultVo<GetDepositNumberByCardNumberSrv> result) {
                    try {
                        System.out.println(result.getResult().getResult().getData());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }


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


    private static void getShebaByCardNumber() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("<RSAKeyValue><Modulus>qRmVNMYHXo69d67VMJy4MfvXl+fQuQjmwU6t9ZbsU4ixOyAQ6bBDsMMbuJjeS7KiwE73MSo+aiMYMRVC5LBjVlv05LMJeic99pbKB0FjU0VO0PyxUAT0E37t7WcolQ01KlbkSaBNrT5y5+6KGitSXhm7Fu38djUzlzSBfew65bU=</Modulus><Exponent>AQAB</Exponent><P>0urz/B5S5q5sqhrl2H1VYEuScKIQigKy+Oc8O2374T8lf2RD4+A3U9ppGowE4ocNR3PiFIhf3hQWfMnKSs85Pw==</P><Q>zT5uXAtsqoyo2lvLC4ME1wT1cEUrh5yvm47vgqtJvEseRI26jrF/+dKmFOEYk+LLuRa7ctgiWNoCc88YcuCQCw==</Q><DP>iL7f9OPMJ9eKiDbsMhIAWnBkvzWzt2bMlmeFO5qxJXaFXzSod4OVG36NijKhsCSTTXIqb9mDHj6z3bAOwbXcjQ==</DP><DQ>ePwcQdXaMI7J2i3R+u84oychJxUfG8mZGrGfLf+ab4w4Q2DoX8TyE2nAzP4DZumB/ZEQ3hnZ5VZdq7agStdlEQ==</DQ><InverseQ>BoVlcZuVqWf7gb7HPTpWMfAtkl5cncF9dDi8P2N4mHIU1GK3zSTdWtamOKSgh4EheVsiTU/yBAadi7isVmqAbg==</InverseQ><D>UW3fWt1tmQw1ktefE9y0GmXDCQR5j1EJBddkj9oQjZ1Kc0Vav53AyvL5e2gpy9wG4YJlKMjF64hg0uoBH20NODWCp5ApIomwcz/G39Tynyos5Hm8UuUfSF5wMtK9a6xDaOskQC2S0LkUHO7S/6ICQm3B2QQfX1x3jHkZHvlHxfU=</D></RSAKeyValue>");
        try {
            GetShebaByCardNumberVo getShebaByCardNumberVo = new GetShebaByCardNumberVo.Builder(baseInfoVo)
                    .setUserName("66497service")
                    .setSignature(signatureInfo)
                    .setCardNumber("5022291077346508")
                    .build();
            podBanking.getShebaByCardNumber(getShebaByCardNumberVo, new OnGetResponseListener<GetShebaByCardNumberSrv>() {
                @Override
                public void onResponse(ResultVo<GetShebaByCardNumberSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

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


    private static void getCardInformation() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("<RSAKeyValue><Modulus>qRmVNMYHXo69d67VMJy4MfvXl+fQuQjmwU6t9ZbsU4ixOyAQ6bBDsMMbuJjeS7KiwE73MSo+aiMYMRVC5LBjVlv05LMJeic99pbKB0FjU0VO0PyxUAT0E37t7WcolQ01KlbkSaBNrT5y5+6KGitSXhm7Fu38djUzlzSBfew65bU=</Modulus><Exponent>AQAB</Exponent><P>0urz/B5S5q5sqhrl2H1VYEuScKIQigKy+Oc8O2374T8lf2RD4+A3U9ppGowE4ocNR3PiFIhf3hQWfMnKSs85Pw==</P><Q>zT5uXAtsqoyo2lvLC4ME1wT1cEUrh5yvm47vgqtJvEseRI26jrF/+dKmFOEYk+LLuRa7ctgiWNoCc88YcuCQCw==</Q><DP>iL7f9OPMJ9eKiDbsMhIAWnBkvzWzt2bMlmeFO5qxJXaFXzSod4OVG36NijKhsCSTTXIqb9mDHj6z3bAOwbXcjQ==</DP><DQ>ePwcQdXaMI7J2i3R+u84oychJxUfG8mZGrGfLf+ab4w4Q2DoX8TyE2nAzP4DZumB/ZEQ3hnZ5VZdq7agStdlEQ==</DQ><InverseQ>BoVlcZuVqWf7gb7HPTpWMfAtkl5cncF9dDi8P2N4mHIU1GK3zSTdWtamOKSgh4EheVsiTU/yBAadi7isVmqAbg==</InverseQ><D>UW3fWt1tmQw1ktefE9y0GmXDCQR5j1EJBddkj9oQjZ1Kc0Vav53AyvL5e2gpy9wG4YJlKMjF64hg0uoBH20NODWCp5ApIomwcz/G39Tynyos5Hm8UuUfSF5wMtK9a6xDaOskQC2S0LkUHO7S/6ICQm3B2QQfX1x3jHkZHvlHxfU=</D></RSAKeyValue>");
        try {
            GetCardInformationVo getCardInformationVo = new GetCardInformationVo.Builder(baseInfoVo)
                    .setUserName("66497service")
                    .setSignature(signatureInfo)
                    .setSrcCardNumber("5022291077346508")
                    .setDestCardNumber("5022291077346508")
                    .setEmail("zahra.gholinia76@gmail.com")
                    .build();
            podBanking.getCardInformation(getCardInformationVo, new OnGetResponseListener<GetCardInformationSrv>() {
                @Override
                public void onResponse(ResultVo<GetCardInformationSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

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


    private static void getSubmissionChque() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("<RSAKeyValue><Modulus>qRmVNMYHXo69d67VMJy4MfvXl+fQuQjmwU6t9ZbsU4ixOyAQ6bBDsMMbuJjeS7KiwE73MSo+aiMYMRVC5LBjVlv05LMJeic99pbKB0FjU0VO0PyxUAT0E37t7WcolQ01KlbkSaBNrT5y5+6KGitSXhm7Fu38djUzlzSBfew65bU=</Modulus><Exponent>AQAB</Exponent><P>0urz/B5S5q5sqhrl2H1VYEuScKIQigKy+Oc8O2374T8lf2RD4+A3U9ppGowE4ocNR3PiFIhf3hQWfMnKSs85Pw==</P><Q>zT5uXAtsqoyo2lvLC4ME1wT1cEUrh5yvm47vgqtJvEseRI26jrF/+dKmFOEYk+LLuRa7ctgiWNoCc88YcuCQCw==</Q><DP>iL7f9OPMJ9eKiDbsMhIAWnBkvzWzt2bMlmeFO5qxJXaFXzSod4OVG36NijKhsCSTTXIqb9mDHj6z3bAOwbXcjQ==</DP><DQ>ePwcQdXaMI7J2i3R+u84oychJxUfG8mZGrGfLf+ab4w4Q2DoX8TyE2nAzP4DZumB/ZEQ3hnZ5VZdq7agStdlEQ==</DQ><InverseQ>BoVlcZuVqWf7gb7HPTpWMfAtkl5cncF9dDi8P2N4mHIU1GK3zSTdWtamOKSgh4EheVsiTU/yBAadi7isVmqAbg==</InverseQ><D>UW3fWt1tmQw1ktefE9y0GmXDCQR5j1EJBddkj9oQjZ1Kc0Vav53AyvL5e2gpy9wG4YJlKMjF64hg0uoBH20NODWCp5ApIomwcz/G39Tynyos5Hm8UuUfSF5wMtK9a6xDaOskQC2S0LkUHO7S/6ICQm3B2QQfX1x3jHkZHvlHxfU=</D></RSAKeyValue>");
        try {
            GetSubmissionChqueVo getSubmissionChqueVo = new GetSubmissionChqueVo.Builder(baseInfoVo)
                    .setUserName("66497service")
                    .setDeposit("1001.800.66497.2")
                    .setMinAmount(0L)
//                    .setChequeNumber("")
                    .setMaxAmount(0L)
                    .setSignature(signatureInfo)
                    .setStartDate("2019/02/15")
                    .setEndDate("2019/12/15")
                    .setChequeStatus("0")
                    .setStartSubmisionDate("2019/02/15")
                    .setEndSubmitionDate("2019/12/15")
                    .setRowCount(10)
                    .setBankCode("-1")
                    .build();
            podBanking.getSubmissionChque(getSubmissionChqueVo, new OnGetResponseListener<GetSubmissionChqueSrv>() {
                @Override
                public void onResponse(ResultVo<GetSubmissionChqueSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().size());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

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


    private static void convertShebaToDeposit() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("<RSAKeyValue><Modulus>qRmVNMYHXo69d67VMJy4MfvXl+fQuQjmwU6t9ZbsU4ixOyAQ6bBDsMMbuJjeS7KiwE73MSo+aiMYMRVC5LBjVlv05LMJeic99pbKB0FjU0VO0PyxUAT0E37t7WcolQ01KlbkSaBNrT5y5+6KGitSXhm7Fu38djUzlzSBfew65bU=</Modulus><Exponent>AQAB</Exponent><P>0urz/B5S5q5sqhrl2H1VYEuScKIQigKy+Oc8O2374T8lf2RD4+A3U9ppGowE4ocNR3PiFIhf3hQWfMnKSs85Pw==</P><Q>zT5uXAtsqoyo2lvLC4ME1wT1cEUrh5yvm47vgqtJvEseRI26jrF/+dKmFOEYk+LLuRa7ctgiWNoCc88YcuCQCw==</Q><DP>iL7f9OPMJ9eKiDbsMhIAWnBkvzWzt2bMlmeFO5qxJXaFXzSod4OVG36NijKhsCSTTXIqb9mDHj6z3bAOwbXcjQ==</DP><DQ>ePwcQdXaMI7J2i3R+u84oychJxUfG8mZGrGfLf+ab4w4Q2DoX8TyE2nAzP4DZumB/ZEQ3hnZ5VZdq7agStdlEQ==</DQ><InverseQ>BoVlcZuVqWf7gb7HPTpWMfAtkl5cncF9dDi8P2N4mHIU1GK3zSTdWtamOKSgh4EheVsiTU/yBAadi7isVmqAbg==</InverseQ><D>UW3fWt1tmQw1ktefE9y0GmXDCQR5j1EJBddkj9oQjZ1Kc0Vav53AyvL5e2gpy9wG4YJlKMjF64hg0uoBH20NODWCp5ApIomwcz/G39Tynyos5Hm8UuUfSF5wMtK9a6xDaOskQC2S0LkUHO7S/6ICQm3B2QQfX1x3jHkZHvlHxfU=</D></RSAKeyValue>");
        try {
            ConvertShebaToDepositVo convertShebaToDepositVo = new ConvertShebaToDepositVo.Builder(baseInfoVo)
                    .setUserName("66497service")
                    .setSignature(signatureInfo)
                    .setSheba("IR510570100180013692932101")
                    .build();
            podBanking.convertShebaToDeposit(convertShebaToDepositVo, new OnGetResponseListener<ConvertShebaToDepositSrv>() {
                @Override
                public void onResponse(ResultVo<ConvertShebaToDepositSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

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

    private static void convertDepositNumberToSheba() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("<RSAKeyValue><Modulus>qRmVNMYHXo69d67VMJy4MfvXl+fQuQjmwU6t9ZbsU4ixOyAQ6bBDsMMbuJjeS7KiwE73MSo+aiMYMRVC5LBjVlv05LMJeic99pbKB0FjU0VO0PyxUAT0E37t7WcolQ01KlbkSaBNrT5y5+6KGitSXhm7Fu38djUzlzSBfew65bU=</Modulus><Exponent>AQAB</Exponent><P>0urz/B5S5q5sqhrl2H1VYEuScKIQigKy+Oc8O2374T8lf2RD4+A3U9ppGowE4ocNR3PiFIhf3hQWfMnKSs85Pw==</P><Q>zT5uXAtsqoyo2lvLC4ME1wT1cEUrh5yvm47vgqtJvEseRI26jrF/+dKmFOEYk+LLuRa7ctgiWNoCc88YcuCQCw==</Q><DP>iL7f9OPMJ9eKiDbsMhIAWnBkvzWzt2bMlmeFO5qxJXaFXzSod4OVG36NijKhsCSTTXIqb9mDHj6z3bAOwbXcjQ==</DP><DQ>ePwcQdXaMI7J2i3R+u84oychJxUfG8mZGrGfLf+ab4w4Q2DoX8TyE2nAzP4DZumB/ZEQ3hnZ5VZdq7agStdlEQ==</DQ><InverseQ>BoVlcZuVqWf7gb7HPTpWMfAtkl5cncF9dDi8P2N4mHIU1GK3zSTdWtamOKSgh4EheVsiTU/yBAadi7isVmqAbg==</InverseQ><D>UW3fWt1tmQw1ktefE9y0GmXDCQR5j1EJBddkj9oQjZ1Kc0Vav53AyvL5e2gpy9wG4YJlKMjF64hg0uoBH20NODWCp5ApIomwcz/G39Tynyos5Hm8UuUfSF5wMtK9a6xDaOskQC2S0LkUHO7S/6ICQm3B2QQfX1x3jHkZHvlHxfU=</D></RSAKeyValue>");
        try {
            ConvertDepositNumberToShebaVo convertDepositNumberToShebaVo = new ConvertDepositNumberToShebaVo.Builder(baseInfoVo)
                    .setUserName("66497service")
                    .setSignature(signatureInfo)
                    .setDepositNumber("1001.800.66497.2")
                    .build();
            podBanking.convertDepositNumberToSheba(convertDepositNumberToShebaVo, new OnGetResponseListener<ConvertDepositNumberToShebaSrv>() {
                @Override
                public void onResponse(ResultVo<ConvertDepositNumberToShebaSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

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

    private static void getDepositInvoice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("<RSAKeyValue><Modulus>qRmVNMYHXo69d67VMJy4MfvXl+fQuQjmwU6t9ZbsU4ixOyAQ6bBDsMMbuJjeS7KiwE73MSo+aiMYMRVC5LBjVlv05LMJeic99pbKB0FjU0VO0PyxUAT0E37t7WcolQ01KlbkSaBNrT5y5+6KGitSXhm7Fu38djUzlzSBfew65bU=</Modulus><Exponent>AQAB</Exponent><P>0urz/B5S5q5sqhrl2H1VYEuScKIQigKy+Oc8O2374T8lf2RD4+A3U9ppGowE4ocNR3PiFIhf3hQWfMnKSs85Pw==</P><Q>zT5uXAtsqoyo2lvLC4ME1wT1cEUrh5yvm47vgqtJvEseRI26jrF/+dKmFOEYk+LLuRa7ctgiWNoCc88YcuCQCw==</Q><DP>iL7f9OPMJ9eKiDbsMhIAWnBkvzWzt2bMlmeFO5qxJXaFXzSod4OVG36NijKhsCSTTXIqb9mDHj6z3bAOwbXcjQ==</DP><DQ>ePwcQdXaMI7J2i3R+u84oychJxUfG8mZGrGfLf+ab4w4Q2DoX8TyE2nAzP4DZumB/ZEQ3hnZ5VZdq7agStdlEQ==</DQ><InverseQ>BoVlcZuVqWf7gb7HPTpWMfAtkl5cncF9dDi8P2N4mHIU1GK3zSTdWtamOKSgh4EheVsiTU/yBAadi7isVmqAbg==</InverseQ><D>UW3fWt1tmQw1ktefE9y0GmXDCQR5j1EJBddkj9oQjZ1Kc0Vav53AyvL5e2gpy9wG4YJlKMjF64hg0uoBH20NODWCp5ApIomwcz/G39Tynyos5Hm8UuUfSF5wMtK9a6xDaOskQC2S0LkUHO7S/6ICQm3B2QQfX1x3jHkZHvlHxfU=</D></RSAKeyValue>");
        try {
            GetDepositInvoiceVo getDepositInvoiceVo = new GetDepositInvoiceVo.Builder(baseInfoVo)
                    .setUserName("66497service")
                    .setCount(1)
                    .setFirstIndex(1)
                    .setDepositNumber("1001.800.66497.2")
                    .setStartDate("2019/12/13")
                    .setEndDate("2019/12/16")
                    .setSignatureInfo(signatureInfo)
                    .setSheba("")
                    .build();
            podBanking.getDepositInvoice(getDepositInvoiceVo, new OnGetResponseListener<GetDepositInvoiceSrv>() {
                @Override
                public void onResponse(ResultVo<GetDepositInvoiceSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().size());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

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

    private static void getDepositBalance() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("<RSAKeyValue><Modulus>qRmVNMYHXo69d67VMJy4MfvXl+fQuQjmwU6t9ZbsU4ixOyAQ6bBDsMMbuJjeS7KiwE73MSo+aiMYMRVC5LBjVlv05LMJeic99pbKB0FjU0VO0PyxUAT0E37t7WcolQ01KlbkSaBNrT5y5+6KGitSXhm7Fu38djUzlzSBfew65bU=</Modulus><Exponent>AQAB</Exponent><P>0urz/B5S5q5sqhrl2H1VYEuScKIQigKy+Oc8O2374T8lf2RD4+A3U9ppGowE4ocNR3PiFIhf3hQWfMnKSs85Pw==</P><Q>zT5uXAtsqoyo2lvLC4ME1wT1cEUrh5yvm47vgqtJvEseRI26jrF/+dKmFOEYk+LLuRa7ctgiWNoCc88YcuCQCw==</Q><DP>iL7f9OPMJ9eKiDbsMhIAWnBkvzWzt2bMlmeFO5qxJXaFXzSod4OVG36NijKhsCSTTXIqb9mDHj6z3bAOwbXcjQ==</DP><DQ>ePwcQdXaMI7J2i3R+u84oychJxUfG8mZGrGfLf+ab4w4Q2DoX8TyE2nAzP4DZumB/ZEQ3hnZ5VZdq7agStdlEQ==</DQ><InverseQ>BoVlcZuVqWf7gb7HPTpWMfAtkl5cncF9dDi8P2N4mHIU1GK3zSTdWtamOKSgh4EheVsiTU/yBAadi7isVmqAbg==</InverseQ><D>UW3fWt1tmQw1ktefE9y0GmXDCQR5j1EJBddkj9oQjZ1Kc0Vav53AyvL5e2gpy9wG4YJlKMjF64hg0uoBH20NODWCp5ApIomwcz/G39Tynyos5Hm8UuUfSF5wMtK9a6xDaOskQC2S0LkUHO7S/6ICQm3B2QQfX1x3jHkZHvlHxfU=</D></RSAKeyValue>");
        try {
            GetDepositBalanceVo getDepositBalanceVo = new GetDepositBalanceVo.Builder(baseInfoVo)
                    .setUserName("66497service")
                    .setDepositNumber("1001.800.66497.2")
                    .setSignatureInfo(signatureInfo)
                    .build();
            podBanking.getDepositBalance(getDepositBalanceVo, new OnGetResponseListener<GetDepositBalanceSrv>() {
                @Override
                public void onResponse(ResultVo<GetDepositBalanceSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().getAmounts());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

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


    private static void transferMoney() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("<RSAKeyValue><Modulus>qRmVNMYHXo69d67VMJy4MfvXl+fQuQjmwU6t9ZbsU4ixOyAQ6bBDsMMbuJjeS7KiwE73MSo+aiMYMRVC5LBjVlv05LMJeic99pbKB0FjU0VO0PyxUAT0E37t7WcolQ01KlbkSaBNrT5y5+6KGitSXhm7Fu38djUzlzSBfew65bU=</Modulus><Exponent>AQAB</Exponent><P>0urz/B5S5q5sqhrl2H1VYEuScKIQigKy+Oc8O2374T8lf2RD4+A3U9ppGowE4ocNR3PiFIhf3hQWfMnKSs85Pw==</P><Q>zT5uXAtsqoyo2lvLC4ME1wT1cEUrh5yvm47vgqtJvEseRI26jrF/+dKmFOEYk+LLuRa7ctgiWNoCc88YcuCQCw==</Q><DP>iL7f9OPMJ9eKiDbsMhIAWnBkvzWzt2bMlmeFO5qxJXaFXzSod4OVG36NijKhsCSTTXIqb9mDHj6z3bAOwbXcjQ==</DP><DQ>ePwcQdXaMI7J2i3R+u84oychJxUfG8mZGrGfLf+ab4w4Q2DoX8TyE2nAzP4DZumB/ZEQ3hnZ5VZdq7agStdlEQ==</DQ><InverseQ>BoVlcZuVqWf7gb7HPTpWMfAtkl5cncF9dDi8P2N4mHIU1GK3zSTdWtamOKSgh4EheVsiTU/yBAadi7isVmqAbg==</InverseQ><D>UW3fWt1tmQw1ktefE9y0GmXDCQR5j1EJBddkj9oQjZ1Kc0Vav53AyvL5e2gpy9wG4YJlKMjF64hg0uoBH20NODWCp5ApIomwcz/G39Tynyos5Hm8UuUfSF5wMtK9a6xDaOskQC2S0LkUHO7S/6ICQm3B2QQfX1x3jHkZHvlHxfU=</D></RSAKeyValue>");
        try {
            TransferMoneyVo transferMoneyVo = new TransferMoneyVo.Builder(baseInfoVo)
                    .setUserName("66497service")
//                    .setSourceSheba("IR930570100000014027212101")
//                    .setDestSheba("IR640170000000100001752007")
                    .setSourceDepositNumber("1001.800.66497.2")
                    .setDestDepositNumber("1004.8000.14027212.1")
//                    .setDestFirstName("رضا")
//                    .setDestLastName("زارع")
                    .setAmount("1")
                    .setPaymentId("1")
//                    .setDestDepositNumber("1001.800.66497.2")
//                    .setSourceDepositNumber("1001.800.66497.2")
                    .setSignature(signatureInfo)
                    .build();
            podBanking.transferMoney(transferMoneyVo, new OnGetResponseListener<TransferMoneySrv>() {
                @Override
                public void onResponse(ResultVo<TransferMoneySrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

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

    private static void getTransferMoneyState() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("<RSAKeyValue><Modulus>qRmVNMYHXo69d67VMJy4MfvXl+fQuQjmwU6t9ZbsU4ixOyAQ6bBDsMMbuJjeS7KiwE73MSo+aiMYMRVC5LBjVlv05LMJeic99pbKB0FjU0VO0PyxUAT0E37t7WcolQ01KlbkSaBNrT5y5+6KGitSXhm7Fu38djUzlzSBfew65bU=</Modulus><Exponent>AQAB</Exponent><P>0urz/B5S5q5sqhrl2H1VYEuScKIQigKy+Oc8O2374T8lf2RD4+A3U9ppGowE4ocNR3PiFIhf3hQWfMnKSs85Pw==</P><Q>zT5uXAtsqoyo2lvLC4ME1wT1cEUrh5yvm47vgqtJvEseRI26jrF/+dKmFOEYk+LLuRa7ctgiWNoCc88YcuCQCw==</Q><DP>iL7f9OPMJ9eKiDbsMhIAWnBkvzWzt2bMlmeFO5qxJXaFXzSod4OVG36NijKhsCSTTXIqb9mDHj6z3bAOwbXcjQ==</DP><DQ>ePwcQdXaMI7J2i3R+u84oychJxUfG8mZGrGfLf+ab4w4Q2DoX8TyE2nAzP4DZumB/ZEQ3hnZ5VZdq7agStdlEQ==</DQ><InverseQ>BoVlcZuVqWf7gb7HPTpWMfAtkl5cncF9dDi8P2N4mHIU1GK3zSTdWtamOKSgh4EheVsiTU/yBAadi7isVmqAbg==</InverseQ><D>UW3fWt1tmQw1ktefE9y0GmXDCQR5j1EJBddkj9oQjZ1Kc0Vav53AyvL5e2gpy9wG4YJlKMjF64hg0uoBH20NODWCp5ApIomwcz/G39Tynyos5Hm8UuUfSF5wMtK9a6xDaOskQC2S0LkUHO7S/6ICQm3B2QQfX1x3jHkZHvlHxfU=</D></RSAKeyValue>");
        try {
            GetTranfserStateVo getTranfserStateVo = new GetTranfserStateVo.Builder(baseInfoVo)
                    .setUserName("66497service")
                    .setDate("2019/12/16")
                    .setPaymentId("123")
                    .setSignature(signatureInfo)
                    .build();
            podBanking.getTransferMoneyState(getTranfserStateVo, new OnGetResponseListener<GetTranfserStateSrv>() {
                @Override
                public void onResponse(ResultVo<GetTranfserStateSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getMessage());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

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


    private static void billPaymentByDeposit() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("<RSAKeyValue><Modulus>qRmVNMYHXo69d67VMJy4MfvXl+fQuQjmwU6t9ZbsU4ixOyAQ6bBDsMMbuJjeS7KiwE73MSo+aiMYMRVC5LBjVlv05LMJeic99pbKB0FjU0VO0PyxUAT0E37t7WcolQ01KlbkSaBNrT5y5+6KGitSXhm7Fu38djUzlzSBfew65bU=</Modulus><Exponent>AQAB</Exponent><P>0urz/B5S5q5sqhrl2H1VYEuScKIQigKy+Oc8O2374T8lf2RD4+A3U9ppGowE4ocNR3PiFIhf3hQWfMnKSs85Pw==</P><Q>zT5uXAtsqoyo2lvLC4ME1wT1cEUrh5yvm47vgqtJvEseRI26jrF/+dKmFOEYk+LLuRa7ctgiWNoCc88YcuCQCw==</Q><DP>iL7f9OPMJ9eKiDbsMhIAWnBkvzWzt2bMlmeFO5qxJXaFXzSod4OVG36NijKhsCSTTXIqb9mDHj6z3bAOwbXcjQ==</DP><DQ>ePwcQdXaMI7J2i3R+u84oychJxUfG8mZGrGfLf+ab4w4Q2DoX8TyE2nAzP4DZumB/ZEQ3hnZ5VZdq7agStdlEQ==</DQ><InverseQ>BoVlcZuVqWf7gb7HPTpWMfAtkl5cncF9dDi8P2N4mHIU1GK3zSTdWtamOKSgh4EheVsiTU/yBAadi7isVmqAbg==</InverseQ><D>UW3fWt1tmQw1ktefE9y0GmXDCQR5j1EJBddkj9oQjZ1Kc0Vav53AyvL5e2gpy9wG4YJlKMjF64hg0uoBH20NODWCp5ApIomwcz/G39Tynyos5Hm8UuUfSF5wMtK9a6xDaOskQC2S0LkUHO7S/6ICQm3B2QQfX1x3jHkZHvlHxfU=</D></RSAKeyValue>");
        try {
            BillPaymentByDepositVo billPaymentByDepositVo = new BillPaymentByDepositVo.Builder(baseInfoVo)
                    .setUserName("66497service")
                    .setPaymentId("11")
                    .setDepositNumber("1001.800.66497.2")
                    .setBillNumber("00000")
                    .setSignature(signatureInfo)
                    .build();
            podBanking.billPaymentByDeposit(billPaymentByDepositVo, new OnGetResponseListener<BillPaymentByDepositSrv>() {
                @Override
                public void onResponse(ResultVo<BillPaymentByDepositSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getIsSuccess());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

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


    private static void cardToCard() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        JsonDateContent jsonDateContent = new JsonDateContent();
        jsonDateContent.setDeviceId("2796461");
        jsonDateContent.setIP("5.160.139.202");
        jsonDateContent.setPlatfrom("ANDROID");
        jsonDateContent.setOS("Android");
//        jsonDateContent.setUserAgent("");
        jsonDateContent.setImei("111");

        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("<RSAKeyValue><Modulus>qRmVNMYHXo69d67VMJy4MfvXl+fQuQjmwU6t9ZbsU4ixOyAQ6bBDsMMbuJjeS7KiwE73MSo+aiMYMRVC5LBjVlv05LMJeic99pbKB0FjU0VO0PyxUAT0E37t7WcolQ01KlbkSaBNrT5y5+6KGitSXhm7Fu38djUzlzSBfew65bU=</Modulus><Exponent>AQAB</Exponent><P>0urz/B5S5q5sqhrl2H1VYEuScKIQigKy+Oc8O2374T8lf2RD4+A3U9ppGowE4ocNR3PiFIhf3hQWfMnKSs85Pw==</P><Q>zT5uXAtsqoyo2lvLC4ME1wT1cEUrh5yvm47vgqtJvEseRI26jrF/+dKmFOEYk+LLuRa7ctgiWNoCc88YcuCQCw==</Q><DP>iL7f9OPMJ9eKiDbsMhIAWnBkvzWzt2bMlmeFO5qxJXaFXzSod4OVG36NijKhsCSTTXIqb9mDHj6z3bAOwbXcjQ==</DP><DQ>ePwcQdXaMI7J2i3R+u84oychJxUfG8mZGrGfLf+ab4w4Q2DoX8TyE2nAzP4DZumB/ZEQ3hnZ5VZdq7agStdlEQ==</DQ><InverseQ>BoVlcZuVqWf7gb7HPTpWMfAtkl5cncF9dDi8P2N4mHIU1GK3zSTdWtamOKSgh4EheVsiTU/yBAadi7isVmqAbg==</InverseQ><D>UW3fWt1tmQw1ktefE9y0GmXDCQR5j1EJBddkj9oQjZ1Kc0Vav53AyvL5e2gpy9wG4YJlKMjF64hg0uoBH20NODWCp5ApIomwcz/G39Tynyos5Hm8UuUfSF5wMtK9a6xDaOskQC2S0LkUHO7S/6ICQm3B2QQfX1x3jHkZHvlHxfU=</D></RSAKeyValue>");
        try {
            CardToCardVo cardToCardVo = new CardToCardVo.Builder(baseInfoVo)
                    .setUserName("66497service")
                    .setSrcCardNumber("5022291077346508")
                    .setDestCardNumber("5022291077346508")
                    .setPassword("45563")
                    .setCvv2("226")
                    .setExpireMonth("08")
                    .setExpireYear("00")
                    .setAmount(1L)
                    .setEmail("zahra.gholinia76@gmail.com")
                    .setAuthorizationCode("0")
                    .setWithReferenceNumber(false)
                    .setCardName("test")
                    .setSrcComment("teeeeest")
                    .setDestComment("hiiiiiiiiiiiiiiiiiii")
                    .setOriginalAddress("127.0.0.1")
                    .setExtraData(jsonDateContent)
                    .setSignature(signatureInfo)
                    .build();
            podBanking.cardToCard(cardToCardVo, new OnGetResponseListener<cardToCardSrv>() {
                @Override
                public void onResponse(ResultVo<cardToCardSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getIsSuccess());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }

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

    private static void cardToCardList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        signatureInfo.setPrivateKey("<RSAKeyValue><Modulus>qRmVNMYHXo69d67VMJy4MfvXl+fQuQjmwU6t9ZbsU4ixOyAQ6bBDsMMbuJjeS7KiwE73MSo+aiMYMRVC5LBjVlv05LMJeic99pbKB0FjU0VO0PyxUAT0E37t7WcolQ01KlbkSaBNrT5y5+6KGitSXhm7Fu38djUzlzSBfew65bU=</Modulus><Exponent>AQAB</Exponent><P>0urz/B5S5q5sqhrl2H1VYEuScKIQigKy+Oc8O2374T8lf2RD4+A3U9ppGowE4ocNR3PiFIhf3hQWfMnKSs85Pw==</P><Q>zT5uXAtsqoyo2lvLC4ME1wT1cEUrh5yvm47vgqtJvEseRI26jrF/+dKmFOEYk+LLuRa7ctgiWNoCc88YcuCQCw==</Q><DP>iL7f9OPMJ9eKiDbsMhIAWnBkvzWzt2bMlmeFO5qxJXaFXzSod4OVG36NijKhsCSTTXIqb9mDHj6z3bAOwbXcjQ==</DP><DQ>ePwcQdXaMI7J2i3R+u84oychJxUfG8mZGrGfLf+ab4w4Q2DoX8TyE2nAzP4DZumB/ZEQ3hnZ5VZdq7agStdlEQ==</DQ><InverseQ>BoVlcZuVqWf7gb7HPTpWMfAtkl5cncF9dDi8P2N4mHIU1GK3zSTdWtamOKSgh4EheVsiTU/yBAadi7isVmqAbg==</InverseQ><D>UW3fWt1tmQw1ktefE9y0GmXDCQR5j1EJBddkj9oQjZ1Kc0Vav53AyvL5e2gpy9wG4YJlKMjF64hg0uoBH20NODWCp5ApIomwcz/G39Tynyos5Hm8UuUfSF5wMtK9a6xDaOskQC2S0LkUHO7S/6ICQm3B2QQfX1x3jHkZHvlHxfU=</D></RSAKeyValue>");
        try {
            CardToCardListVo cardToCardListVo = new CardToCardListVo.Builder(baseInfoVo)
                    .setUserName("66497service")
                    .setSourceCardNumber("5022291077346508")
                    .setDestinationCardNumber("6037997256803041")
                    .setMinAmount(1l)
                    .setMaxAmount(100L)
                    .setStartDate("2019/12/15")
                    .setEndDate("2019/12/17")
                    .setDestinationNote("11")
                    .setRefrenceNumber("22")
                    .setSequenceNumber("33")
                    .setSourceNote("44")
                    .setSignature(signatureInfo)
                    .build();
            podBanking.cardToCardList(cardToCardListVo, new OnGetResponseListener<CardToCardListSrv>() {
                @Override
                public void onResponse(ResultVo<CardToCardListSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getMessage());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
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


    private static void payaSerivice() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .setScApiKey(API_KEY)
//                .setScVoucherHash(scVoucherHashs)
                .build();

        PodBanking podBanking = new PodBanking();
        SignatureInfo signatureInfo = new SignatureInfo();
        BatchPayaItemInfoContents batchPayaItemInfoContents = new BatchPayaItemInfoContents();
        batchPayaItemInfoContents.setAmount(100L);
        batchPayaItemInfoContents.setBeneficiaryFullName("رضا زارع خواجه");
        batchPayaItemInfoContents.setDescription("بانک");
        batchPayaItemInfoContents.setDestShebaNumber("IR930570100480014027212101");
        batchPayaItemInfoContents.setBillNumber("1345");
        List<BatchPayaItemInfoContents> batchPayaItemInfoContentsList = new ArrayList<>();
      batchPayaItemInfoContentsList.add(batchPayaItemInfoContents);
        signatureInfo.setPrivateKey("<RSAKeyValue><Modulus>qRmVNMYHXo69d67VMJy4MfvXl+fQuQjmwU6t9ZbsU4ixOyAQ6bBDsMMbuJjeS7KiwE73MSo+aiMYMRVC5LBjVlv05LMJeic99pbKB0FjU0VO0PyxUAT0E37t7WcolQ01KlbkSaBNrT5y5+6KGitSXhm7Fu38djUzlzSBfew65bU=</Modulus><Exponent>AQAB</Exponent><P>0urz/B5S5q5sqhrl2H1VYEuScKIQigKy+Oc8O2374T8lf2RD4+A3U9ppGowE4ocNR3PiFIhf3hQWfMnKSs85Pw==</P><Q>zT5uXAtsqoyo2lvLC4ME1wT1cEUrh5yvm47vgqtJvEseRI26jrF/+dKmFOEYk+LLuRa7ctgiWNoCc88YcuCQCw==</Q><DP>iL7f9OPMJ9eKiDbsMhIAWnBkvzWzt2bMlmeFO5qxJXaFXzSod4OVG36NijKhsCSTTXIqb9mDHj6z3bAOwbXcjQ==</DP><DQ>ePwcQdXaMI7J2i3R+u84oychJxUfG8mZGrGfLf+ab4w4Q2DoX8TyE2nAzP4DZumB/ZEQ3hnZ5VZdq7agStdlEQ==</DQ><InverseQ>BoVlcZuVqWf7gb7HPTpWMfAtkl5cncF9dDi8P2N4mHIU1GK3zSTdWtamOKSgh4EheVsiTU/yBAadi7isVmqAbg==</InverseQ><D>UW3fWt1tmQw1ktefE9y0GmXDCQR5j1EJBddkj9oQjZ1Kc0Vav53AyvL5e2gpy9wG4YJlKMjF64hg0uoBH20NODWCp5ApIomwcz/G39Tynyos5Hm8UuUfSF5wMtK9a6xDaOskQC2S0LkUHO7S/6ICQm3B2QQfX1x3jHkZHvlHxfU=</D></RSAKeyValue>");
        try {
            PayaSeriviceVo payaSeriviceVo = new PayaSeriviceVo.Builder(baseInfoVo)
                    .setUserName("66497service")
                    .setSourceDepositNumber("1001.800.66497.2")
                    .setFileUniqueIdentifier("ACH158585WP58700")
                    .setBatchPayaItemInfos(batchPayaItemInfoContentsList)
                    .setSignature(signatureInfo)
                    .build();
            podBanking.payaService(payaSeriviceVo, new OnGetResponseListener<PayaSeriviceSrv>() {
                @Override
                public void onResponse(ResultVo<PayaSeriviceSrv> result) {

                    try {
                        System.out.println(result.getResult().getResult().getData().get(0).getAmount());
                    } catch (PodException e) {
                        System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                    }
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
