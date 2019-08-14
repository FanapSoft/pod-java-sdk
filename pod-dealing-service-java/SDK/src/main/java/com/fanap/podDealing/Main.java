package com.fanap.podDealing;

import com.fanap.podDealing.controller.PodDealing;
import com.fanap.podDealing.data.modelSrv.*;
import com.fanap.podDealing.data.modelVo.*;
import com.fanap.podDealing.enums.Enum_Server_type;
import com.fanap.podDealing.exception.PodException;
import com.fanap.podDealing.util.OnGetResponseListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by  Z.Gholinia on 8/11/2019.
 */

public class Main {

    private static String TOKEN = "c43049a626e5462ab85c0a8e4028e9fe";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    public static void main(String[] args) {


        // addUserAndBusiness();
        // listUserCreatedBusiness();
        // updateBusiness();
        // getApiTokenForCreatedBusiness();
        // rateBusiness();
        // commentBusiness();
        // businessFavorite();
        // userBusinessInfos();
        // commentBusinessList();
        // confirmComment();
        // guildList();
    }


    private static void addUserAndBusiness() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        PodDealing podDealing = new PodDealing();

        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);

        try {
            AddUserAndBusinessVo addUserAndBusinessVo = new AddUserAndBusinessVo.Builder(baseInfoVo)
                    .setUsername("biz1")
                    .setBusinessName("biiz11")
                    .setEmail("biiz.biz@gmail.com")
                    .setCountry("iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .setAgentFirstName("biz111")
                    .setAgentLastName("biz1111")
                    .setAgentCellphoneNumber("09154961631")
                    .setGuildCode(permittedGuildCodeList)
                    .build();
            podDealing.addUserAndBusiness(addUserAndBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
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


    private static void listUserCreatedBusiness() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();
        List<Long> permittedBizIdList = new ArrayList<>();
        permittedBizIdList.add(5204L);
        PodDealing podDealing = new PodDealing();


        try {
            ListUserCreatedBusinessVo listUserCreatedBusinessVo = new ListUserCreatedBusinessVo.Builder(baseInfoVo)
                    .build();
            podDealing.listUserCreatedBusiness(listUserCreatedBusinessVo, new OnGetResponseListener<List<BusinessSrv>>() {
                @Override
                public void onResponse(ResultVo<List<BusinessSrv>> result) {
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

    private static void updateBusiness() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();
        List<String> permittedGuildCodeList = new ArrayList<>();
        permittedGuildCodeList.add(GUILD_CODE);
        PodDealing podDealing = new PodDealing();


        try {
            UpdateBusinessVo updateBusinessVo = new UpdateBusinessVo.Builder(baseInfoVo)
                    .setBizId(5188L)
                    .setBusinessName("biz2")
                    .setGuildCode(permittedGuildCodeList)
                    .setCountry("Iran")
                    .setState("khorasan")
                    .setCity("mashhad")
                    .setAddress("fanap")
                    .setDescription("it")
                    .build();
            podDealing.updateBusiness(updateBusinessVo, new OnGetResponseListener<BusinessSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessSrv> result) {
                    System.out.println(result.getResult().getName());
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


    private static void getApiTokenForCreatedBusiness() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            GetApiTokenForCreatedBusinessVo getApiTokenForCreatedBusinessVo = new GetApiTokenForCreatedBusinessVo.Builder(baseInfoVo)
                    .setBusinessId(5188L)

                    .build();
            podDealing.getApiTokenForCreatedBusiness(getApiTokenForCreatedBusinessVo, new OnGetResponseListener<BusinessApiTokenSrv>() {
                @Override
                public void onResponse(ResultVo<BusinessApiTokenSrv> result) {
                    System.out.println(result.getResult().getApiToken());
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

    private static void rateBusiness() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            RateBusinessVo rateBusinessVo = new RateBusinessVo.Builder(baseInfoVo)
                    .setBusinessId(4887L)
                    .setRate(2L)
                    .build();
            podDealing.rateBusiness(rateBusinessVo, new OnGetResponseListener<RateSrv>() {
                @Override
                public void onResponse(ResultVo<RateSrv> result) {
                    System.out.println(result.getResult().getRate());
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

    private static void commentBusiness() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessVo commentBusinessVo = new CommentBusinessVo.Builder(baseInfoVo)
                    .setBusinessId(5188L)
                    .setText("khooooob")
                    .build();
            podDealing.commentBusiness(commentBusinessVo, new OnGetResponseListener<Long>() {
                @Override
                public void onResponse(ResultVo<Long> result) {
                    System.out.println(result.getMessageId());
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

    private static void businessFavorite() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            BusinessFavoriteVo businessFavoriteVo = new BusinessFavoriteVo.Builder(baseInfoVo)
                    .setBusinessId(5188L)
                    .setDisfavorite(true)
                    .build();
            podDealing.businessFavorite(businessFavoriteVo, new OnGetResponseListener<Boolean>() {
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

    private static void userBusinessInfos() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();
        List<Long> permittedIdList = new ArrayList<>();
        permittedIdList.add(5188L);
        PodDealing podDealing = new PodDealing();


        try {
            UserBusinessInfosVo userBusinessInfosVo = new UserBusinessInfosVo.Builder(baseInfoVo)
                    .setId(permittedIdList)


                    .build();
            podDealing.userBusinessInfos(userBusinessInfosVo, new OnGetResponseListener<List<UserBusinessInfoSrv>>() {
                @Override
                public void onResponse(ResultVo<List<UserBusinessInfoSrv>> result) {
                    System.out.println(result.getResult().get(0).getRate().getRate());
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


    private static void commentBusinessList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            CommentBusinessListVo commentBusinessListVo = new CommentBusinessListVo.Builder(baseInfoVo)
                    .setBusinessId(5188L)
                    .setOffset(1L)
                    .setSize(1L)
                    .build();
            podDealing.commentBusinessList(commentBusinessListVo, new OnGetResponseListener<List<CommentSrv>>() {
                @Override
                public void onResponse(ResultVo<List<CommentSrv>> result) {
                    System.out.println(result.getResult().get(0).getText());
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

    private static void confirmComment() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c26d02dc98b04325b2edb0b86bcf9fe1")
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            ConfirmCommentVo confirmCommentVo = new ConfirmCommentVo.Builder(baseInfoVo)
                    .setCommentId(943L)


                    .build();
            podDealing.confirmComment(confirmCommentVo, new OnGetResponseListener<Boolean>() {
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

    private static void guildList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        PodDealing podDealing = new PodDealing();


        try {
            GuildListVo guildListVo = new GuildListVo.Builder(baseInfoVo)
                    .setOffset(1L)
                    .setSize(3L)
                    .build();
            podDealing.guildList(guildListVo, new OnGetResponseListener<List<GuildSrv>>() {
                @Override
                public void onResponse(ResultVo<List<GuildSrv>> result) {
                    System.out.println(result.getResult().get(2).getName());
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
