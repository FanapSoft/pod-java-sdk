package com.fanap.podSubscription;

import com.fanap.podSubscription.controller.PodSubscription;
import com.fanap.podSubscription.data.modelSrv.SubscriptionFullSrv;
import com.fanap.podSubscription.data.modelSrv.SubscriptionPlanSrv;
import com.fanap.podSubscription.data.modelSrv.SubscriptionSrv;
import com.fanap.podSubscription.data.modelVo.*;
import com.fanap.podSubscription.exception.PodSubscriptionException;
import com.fanap.podSubscription.util.OnGetResponseListener;

import java.util.List;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */

public class Main {

    public static void main(String[] args) {

        subscriptionList();
        updateSubscriptionPlan();
        consumeSubscription();

    }


    private static void subscriptionList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
                .build();

        PodSubscription podSubscription = new PodSubscription();

        try {
            SubscriptionListVo subscriptionListVo = new SubscriptionListVo.Builder(baseInfoVo)
                    .setOffset(0L)
                    .setSize(100L)
                    .setSubscriptionPlanId(62L)
                    .build();
            podSubscription.subscriptionList(subscriptionListVo, new OnGetResponseListener<List<SubscriptionFullSrv>>() {
                @Override
                public void onResponse(ResultVo<List<SubscriptionFullSrv>> result) {
                    System.out.println(result.getResult().size());
                }

                @Override
                public void onFailed(PodSubscriptionException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodSubscriptionException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


    private static void consumeSubscription() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
                .build();

        PodSubscription billingService = new PodSubscription();

        try {
            ConsumeSubscriptionVo ConsumeSubscriptionVo = new ConsumeSubscriptionVo.Builder(baseInfoVo)
                    .setId(62L).setUsedAmount(600L)
                    .build();
            billingService.consumeSubscription(ConsumeSubscriptionVo, new OnGetResponseListener<SubscriptionSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodSubscriptionException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodSubscriptionException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }

    private static void updateSubscriptionPlan() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken("c43049a626e5462ab85c0a8e4028e9fe")
                .setToken_issuer(1)
                .build();
        PodSubscription podSubscription = new PodSubscription();

        try {
            UpdateSubscriptionPlanVo UpdateSubscriptionPlanVo = new UpdateSubscriptionPlanVo.Builder(baseInfoVo)
                    .setId(62L).setPeriodTypeCount(2L).setPeriodTypeCode("SUBSCRIPTION_PLAN_PERIOD_TYPE_MONTHLY").
                            setEnable("true").setName("zahra").setPrice(10000L).setUsageCountLimit(3L)
                    .build();
            podSubscription.updateSubscriptionPlan(UpdateSubscriptionPlanVo, new OnGetResponseListener<SubscriptionPlanSrv>() {
                @Override
                public void onResponse(ResultVo<SubscriptionPlanSrv> result) {
                    System.out.println(result.getResult().getPeriodTypeCode());
                }

                @Override
                public void onFailed(PodSubscriptionException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodSubscriptionException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }

    }


}
