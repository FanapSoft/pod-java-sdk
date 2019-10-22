package com.fanap.podDealing.service;

import com.fanap.podDealing.data.modelSrv.*;
import com.fanap.podDealing.data.modelVo.*;
import com.fanap.podDealing.util.GetResult;
import com.fanap.podDealing.util.OnGetResponseListener;
import com.fanap.podDealing.util.RetrofitUtil;

import java.util.List;

/**
 * Created By Z.Gholinia on 8/10/2019
 */
public class Service {


    public void addUserAndBusiness(AddUserAndBusinessVo addUserAndBusinessVo,
                                   OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance()
                .create(PodDealing.class);

        new GetResult<BusinessSrv>(service.addUserAndBusiness(
                addUserAndBusinessVo.getBaseInfoVo().getToken(),
                addUserAndBusinessVo.getBaseInfoVo().getToken_issuer(),
                addUserAndBusinessVo.getScProductId(),
                addUserAndBusinessVo.getBaseInfoVo().getScVoucherHash(),
                addUserAndBusinessVo.getBaseInfoVo().getScApiKey(),
                addUserAndBusinessVo.getUsername(),
                addUserAndBusinessVo.getBusinessName(),
                addUserAndBusinessVo.getFirstName(),
                addUserAndBusinessVo.getLastName(),
                addUserAndBusinessVo.getSheba(),
                addUserAndBusinessVo.getNationalCode(),
                addUserAndBusinessVo.getEconomicCode(),
                addUserAndBusinessVo.getRegistrationNumber(),
                addUserAndBusinessVo.getEmail(),
                addUserAndBusinessVo.getGuildCode(),
                addUserAndBusinessVo.getCellphone(),
                addUserAndBusinessVo.getPhone(),
                addUserAndBusinessVo.getPostalCode(),
                addUserAndBusinessVo.getFax(),
                addUserAndBusinessVo.getCountry(),
                addUserAndBusinessVo.getState(),
                addUserAndBusinessVo.getCity(),
                addUserAndBusinessVo.getAddress(),
                addUserAndBusinessVo.getDescription(),
                addUserAndBusinessVo.getNewsReader(),
                addUserAndBusinessVo.getLogoImage(),
                addUserAndBusinessVo.getCoverImage(),
                addUserAndBusinessVo.getTags(),
                addUserAndBusinessVo.getTagTrees(),
                addUserAndBusinessVo.getTagTreeCategoryName(),
                addUserAndBusinessVo.getLink(),
                addUserAndBusinessVo.getLat(),
                addUserAndBusinessVo.getLng(),
                addUserAndBusinessVo.getAgentFirstName(),
                addUserAndBusinessVo.getAgentLastName(),
                addUserAndBusinessVo.getAgentCellphoneNumber(),
                addUserAndBusinessVo.getAgentNationalCode()


        ), onGetResponseListener).get();
    }

    public void listUserCreatedBusiness(ListUserCreatedBusinessVo listUserCreatedBusinessVo,
                                        OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance()
                .create(PodDealing.class);

        new GetResult<List<BusinessSrv>>(service.listUserCreatedBusiness(
                listUserCreatedBusinessVo.getBaseInfoVo().getToken(),
                listUserCreatedBusinessVo.getBaseInfoVo().getToken_issuer(),
                listUserCreatedBusinessVo.getScProductId(),
                listUserCreatedBusinessVo.getBaseInfoVo().getScVoucherHash(),
                listUserCreatedBusinessVo.getBaseInfoVo().getScApiKey(),
                listUserCreatedBusinessVo.getBizId(),
                listUserCreatedBusinessVo.getGuildCode(),
                listUserCreatedBusinessVo.getOffset(),
                listUserCreatedBusinessVo.getSize(),
                listUserCreatedBusinessVo.getQuery(),
                listUserCreatedBusinessVo.getTags(),
                listUserCreatedBusinessVo.getTagTrees(),
                listUserCreatedBusinessVo.getActive(),
                listUserCreatedBusinessVo.getCountry(),
                listUserCreatedBusinessVo.getState(),
                listUserCreatedBusinessVo.getCity(),
                listUserCreatedBusinessVo.getSsoId(),
                listUserCreatedBusinessVo.getUsername(),
                listUserCreatedBusinessVo.getBusinessName(),
                listUserCreatedBusinessVo.getSheba(),
                listUserCreatedBusinessVo.getNationalCode(),
                listUserCreatedBusinessVo.getEconomicCode(),
                listUserCreatedBusinessVo.getEmail(),
                listUserCreatedBusinessVo.getCellphone()


        ), onGetResponseListener).get();
    }

    public void updateBusiness(UpdateBusinessVo updateBusinessVo,
                               OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance()
                .create(PodDealing.class);

        new GetResult<BusinessSrv>(service.updateBusiness(
                updateBusinessVo.getBaseInfoVo().getToken(),
                updateBusinessVo.getBaseInfoVo().getToken_issuer(),
                updateBusinessVo.getScProductId(),
                updateBusinessVo.getBaseInfoVo().getScVoucherHash(),
                updateBusinessVo.getBaseInfoVo().getScApiKey(),
                updateBusinessVo.getBizId(),
                updateBusinessVo.getBusinessName(),
                updateBusinessVo.getCompanyName(),
                updateBusinessVo.getShopName(),
                updateBusinessVo.getShopNameEn(),
                updateBusinessVo.getWebsite(),
                updateBusinessVo.getDateEstablishing(),
                updateBusinessVo.getFirstName(),
                updateBusinessVo.getLastName(),
                updateBusinessVo.getSheba(),
                updateBusinessVo.getNationalCode(),
                updateBusinessVo.getEconomicCode(),
                updateBusinessVo.getRegistrationNumber(),
                updateBusinessVo.getEmail(),
                updateBusinessVo.getGuildCode(),
                updateBusinessVo.getCellphone(),
                updateBusinessVo.getPhone(),
                updateBusinessVo.getFax(),
                updateBusinessVo.getPostalCode(),
                updateBusinessVo.getCountry(),
                updateBusinessVo.getState(),
                updateBusinessVo.getCity(),
                updateBusinessVo.getAddress(),
                updateBusinessVo.getDescription(),
                updateBusinessVo.getChangeLogo(),
                updateBusinessVo.getChangeCover(),
                updateBusinessVo.getLogoImage(),
                updateBusinessVo.getCoverImage(),
                updateBusinessVo.getTags(),
                updateBusinessVo.getTagTrees(),
                updateBusinessVo.getTagTreeCategoryName(),
                updateBusinessVo.getLink(),
                updateBusinessVo.getLat(),
                updateBusinessVo.getLng(),
                updateBusinessVo.getAgentFirstName(),
                updateBusinessVo.getAgentLastName(),
                updateBusinessVo.getAgentCellphoneNumber(),
                updateBusinessVo.getAgentNationalCode(),
                updateBusinessVo.getChangeAgent()

        ), onGetResponseListener).get();
    }


    public void getApiTokenForCreatedBusiness(GetApiTokenForCreatedBusinessVo getApiTokenForCreatedBusinessVo,
                                              OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance()
                .create(PodDealing.class);

        new GetResult<BusinessApiTokenSrv>(service.getApiTokenForCreatedBusiness(
                getApiTokenForCreatedBusinessVo.getBaseInfoVo().getToken(),
                getApiTokenForCreatedBusinessVo.getBaseInfoVo().getToken_issuer(),
                getApiTokenForCreatedBusinessVo.getScProductId(),
                getApiTokenForCreatedBusinessVo.getBaseInfoVo().getScVoucherHash(),
                getApiTokenForCreatedBusinessVo.getBaseInfoVo().getScApiKey(),
                getApiTokenForCreatedBusinessVo.getBusinessId()


        ), onGetResponseListener).get();
    }

    public void rateBusiness(RateBusinessVo rateBusinessVo,
                             OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance()
                .create(PodDealing.class);

        new GetResult<RateSrv>(service.rateBusiness(
                rateBusinessVo.getBaseInfoVo().getToken(),
                rateBusinessVo.getBaseInfoVo().getToken_issuer(),
                rateBusinessVo.getScProductId(),
                rateBusinessVo.getBaseInfoVo().getScVoucherHash(),
                rateBusinessVo.getBaseInfoVo().getScApiKey(),
                rateBusinessVo.getBusinessId(),
                rateBusinessVo.getRate()

        ), onGetResponseListener).get();
    }

    public void commentBusiness(CommentBusinessVo commentBusinessVo,
                                OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance()
                .create(PodDealing.class);

        new GetResult<Long>(service.commentBusiness(
                commentBusinessVo.getBaseInfoVo().getToken(),
                commentBusinessVo.getBaseInfoVo().getToken_issuer(),
                commentBusinessVo.getScProductId(),
                commentBusinessVo.getBaseInfoVo().getScVoucherHash(),
                commentBusinessVo.getBaseInfoVo().getScApiKey(),
                commentBusinessVo.getBusinessId(),
                commentBusinessVo.getText()

        ), onGetResponseListener).get();
    }

    public void businessFavorite(BusinessFavoriteVo businessFavoriteVo,
                                 OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance()
                .create(PodDealing.class);

        new GetResult<Boolean>(service.businessFavorite(
                businessFavoriteVo.getBaseInfoVo().getToken(),
                businessFavoriteVo.getBaseInfoVo().getToken_issuer(),
                businessFavoriteVo.getScProductId(),
                businessFavoriteVo.getBaseInfoVo().getScVoucherHash(),
                businessFavoriteVo.getBaseInfoVo().getScApiKey(),
                businessFavoriteVo.getBusinessId(),
                businessFavoriteVo.getDisfavorite()

        ), onGetResponseListener).get();
    }


    public void userBusinessInfos(UserBusinessInfosVo userBusinessInfosVo,
                                  OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance()
                .create(PodDealing.class);

        new GetResult<List<UserBusinessInfoSrv>>(service.userBusinessInfos(
                userBusinessInfosVo.getBaseInfoVo().getToken(),
                userBusinessInfosVo.getBaseInfoVo().getToken_issuer(),
                userBusinessInfosVo.getScProductId(),
                userBusinessInfosVo.getBaseInfoVo().getScVoucherHash(),
                userBusinessInfosVo.getBaseInfoVo().getScApiKey(),
                userBusinessInfosVo.getId()


        ), onGetResponseListener).get();
    }


    public void commentBusinessList(CommentBusinessListVo commentBusinessListVo,
                                    OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance()
                .create(PodDealing.class);

        new GetResult<List<CommentSrv>>(service.commentBusinessList(
                commentBusinessListVo.getBaseInfoVo().getToken(),
                commentBusinessListVo.getBaseInfoVo().getToken_issuer(),
                commentBusinessListVo.getScProductId(),
                commentBusinessListVo.getBaseInfoVo().getScVoucherHash(),
                commentBusinessListVo.getBaseInfoVo().getScApiKey(),
                commentBusinessListVo.getBusinessId(),
                commentBusinessListVo.getFirstId(),
                commentBusinessListVo.getLastId(),
                commentBusinessListVo.getSize(),
                commentBusinessListVo.getOffset()


        ), onGetResponseListener).get();
    }

    public void confirmComment(ConfirmCommentVo confirmCommentVo,
                               OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance()
                .create(PodDealing.class);

        new GetResult<Boolean>(service.confirmComment(
                confirmCommentVo.getBaseInfoVo().getToken(),
                confirmCommentVo.getBaseInfoVo().getToken_issuer(),
                confirmCommentVo.getScProductId(),
                confirmCommentVo.getBaseInfoVo().getScVoucherHash(),
                confirmCommentVo.getBaseInfoVo().getScApiKey(),
                confirmCommentVo.getCommentId()


        ), onGetResponseListener).get();
    }

    public void guildList(GuildListVo guildListVo,
                          OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance()
                .create(PodDealing.class);

        new GetResult<List<GuildSrv>>(service.guildList(
                guildListVo.getBaseInfoVo().getToken(),
                guildListVo.getBaseInfoVo().getToken_issuer(),
                guildListVo.getScProductId(),
                guildListVo.getBaseInfoVo().getScVoucherHash(),
                guildListVo.getBaseInfoVo().getScApiKey(),
                guildListVo.getName(),
                guildListVo.getOffset(),
                guildListVo.getSize()


        ), onGetResponseListener).get();
    }

    public void unconfirmComment(UnconfirmCommentVo unconfirmCommentVo,
                                 OnGetResponseListener onGetResponseListener) {

        PodDealing service = RetrofitUtil
                .getInstance()
                .create(PodDealing.class);

        new GetResult<Boolean>(service.unconfirmComment(
                unconfirmCommentVo.getBaseInfoVo().getToken(),
                unconfirmCommentVo.getBaseInfoVo().getToken_issuer(),
                unconfirmCommentVo.getScProductId(),
                unconfirmCommentVo.getBaseInfoVo().getScVoucherHash(),
                unconfirmCommentVo.getBaseInfoVo().getScApiKey(),
                unconfirmCommentVo.getCommentId()


        ), onGetResponseListener).get();
    }
}
