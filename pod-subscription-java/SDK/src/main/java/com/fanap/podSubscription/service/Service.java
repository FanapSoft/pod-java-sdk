package com.fanap.podSubscription.service;

import com.fanap.podSubscription.config.BaseURLPlatform;
import com.fanap.podSubscription.data.modelSrv.*;
import com.fanap.podSubscription.data.modelVo.*;
import com.fanap.podSubscription.util.GetResult;
import com.fanap.podSubscription.util.OnGetResponseListener;
import com.fanap.podSubscription.util.RetrofitUtil;

import java.util.List;

/**
 * Created By Askarian on 5/28/2019
 */
public class Service {


    public void subscriptionList(SubscriptionListVo subscriptionListVo, OnGetResponseListener onGetResponseListener) {

        PodSubscription service = RetrofitUtil.getInstance(BaseURLPlatform.PRODUCTION.getValue()).create(PodSubscription.class);

        new GetResult<List<SubscriptionFullSrv>>(service.subscriptionList(
                subscriptionListVo.getBaseInfoVo().getToken(),
                subscriptionListVo.getBaseInfoVo().getToken_issuer(),
                subscriptionListVo.getSize(),
                subscriptionListVo.getOffset(),
                subscriptionListVo.getSubscriptionPlanId()
        ), onGetResponseListener).get();
    }

    public void consumeSubscription(ConsumeSubscriptionVo consumeSubscriptionVo, OnGetResponseListener onGetResponseListener) {

        PodSubscription service = RetrofitUtil.getInstance(BaseURLPlatform.PRODUCTION.getValue()).create(PodSubscription.class);

        new GetResult<SubscriptionSrv>(service.consumeSubscription(
                consumeSubscriptionVo.getBaseInfoVo().getToken(),
                consumeSubscriptionVo.getBaseInfoVo().getToken_issuer(),
                consumeSubscriptionVo.getId(),
                consumeSubscriptionVo.getUsedAmount()
        ), onGetResponseListener).get();
    }

    public void updateSubscriptionPlan(UpdateSubscriptionPlanVo updateSubscriptionPlanVo, OnGetResponseListener onGetResponseListener) {

        PodSubscription service = RetrofitUtil.getInstance(BaseURLPlatform.PRODUCTION.getValue()).create(PodSubscription.class);

        new GetResult<SubscriptionPlanSrv>(service.updateSubscriptionPlan(
                updateSubscriptionPlanVo.getBaseInfoVo().getToken(),
                updateSubscriptionPlanVo.getBaseInfoVo().getToken_issuer(),
                updateSubscriptionPlanVo.getId(),
                updateSubscriptionPlanVo.getPeriodTypeCode(),
                updateSubscriptionPlanVo.getPeriodTypeCount(),
                updateSubscriptionPlanVo.getUsageCountLimit(),
                updateSubscriptionPlanVo.getName(),
                updateSubscriptionPlanVo.getPrice(),
                updateSubscriptionPlanVo.getEnable()
        ), onGetResponseListener).get();
    }

//    public void getUserProfile(GetUserProfileVo getUserProfileVo,
//                               OnGetResponseListener onGetResponseListener) {
//
//        PodSubscription service = RetrofitUtil.getInstance().create(PodSubscription.class);
//
//        new GetResult<CustomerProfileSrv>(service.getUserProfile(
//                getUserProfileVo.getBaseInfoVo().getToken(),
//                getUserProfileVo.getBaseInfoVo().getToken_issuer(),
//                getUserProfileVo.getBaseInfoVo().getClient_id(),
//                getUserProfileVo.getBaseInfoVo().getClient_secret()
//        ), onGetResponseListener).get();
//    }

//    public void editProfileWithConfirmation(EditProfileWithConfirmationVo editProfileWithConfirmationVo,
//                                            OnGetResponseListener onGetResponseListener) {
//
//        PodSubscription service = RetrofitUtil.getInstance().create(PodSubscription.class);
//
//        new GetResult<CustomerProfileSrv>(service.editProfileWithConfirmation(
//                editProfileWithConfirmationVo.getFirstName(),
//                editProfileWithConfirmationVo.getLastName(),
//                editProfileWithConfirmationVo.getNickName(),
//                editProfileWithConfirmationVo.getEmail(),
//                editProfileWithConfirmationVo.getPhoneNumber(),
//                editProfileWithConfirmationVo.getCellphoneNumber(),
//                editProfileWithConfirmationVo.getNationalCode(),
//                editProfileWithConfirmationVo.getGender(),
//                editProfileWithConfirmationVo.getAddress(),
//                editProfileWithConfirmationVo.getBirthDate(),
//                editProfileWithConfirmationVo.getCountry(),
//                editProfileWithConfirmationVo.getState(),
//                editProfileWithConfirmationVo.getCity(),
//                editProfileWithConfirmationVo.getPostalcode(),
//                editProfileWithConfirmationVo.getSheba(),
//                editProfileWithConfirmationVo.getProfileImage(),
//                editProfileWithConfirmationVo.getClient_metadata(),
//                editProfileWithConfirmationVo.getBirthState(),
//                editProfileWithConfirmationVo.getIdentificationNumber(),
//                editProfileWithConfirmationVo.getFatherName(),
//                editProfileWithConfirmationVo.getBaseInfoVo().getToken(),
//                editProfileWithConfirmationVo.getBaseInfoVo().getToken_issuer(),
//                editProfileWithConfirmationVo.getBaseInfoVo().getClient_id(),
//                editProfileWithConfirmationVo.getBaseInfoVo().getClient_secret()
//        ), onGetResponseListener).get();
//    }
}
