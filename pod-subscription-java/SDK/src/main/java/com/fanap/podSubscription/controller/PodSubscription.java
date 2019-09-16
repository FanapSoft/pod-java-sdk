package com.fanap.podSubscription.controller;

import com.fanap.podSubscription.data.modelVo.ConsumeSubscriptionVo;
import com.fanap.podSubscription.data.modelVo.SubscriptionListVo;
import com.fanap.podSubscription.data.modelVo.UpdateSubscriptionPlanVo;
import com.fanap.podSubscription.exception.PodSubscriptionException;
import com.fanap.podSubscription.service.Service;
import com.fanap.podSubscription.util.OnGetResponseListener;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class PodSubscription {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();


    /**
     * subscription list.
     * <p>
     * //    * @param subscriptionListVo
     *
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodSubscriptionException
     */
    public PodSubscription subscriptionList(SubscriptionListVo subscriptionListVo, OnGetResponseListener onGetResponseListener)
            throws PodSubscriptionException {

        if (onGetResponseListener != null)
            service.subscriptionList(subscriptionListVo, onGetResponseListener);

        else throw PodSubscriptionException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * consume Subscription.
     * <p>
     * //    * @param consumeSubscriptionVo
     *
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodSubscriptionException
     */
    public PodSubscription consumeSubscription(ConsumeSubscriptionVo consumeSubscriptionVo, OnGetResponseListener onGetResponseListener)
            throws PodSubscriptionException {

        if (onGetResponseListener != null)
            service.consumeSubscription(consumeSubscriptionVo, onGetResponseListener);

        else throw PodSubscriptionException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * update Subscription Plan.
     * <p>
     * //    * @param updateSubscriptionPlanVo
     *
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                              InvalidParameterException will be thrown.
     * @return
     * @throws PodSubscriptionException
     */
    public PodSubscription updateSubscriptionPlan(UpdateSubscriptionPlanVo updateSubscriptionPlanVo, OnGetResponseListener onGetResponseListener)
            throws PodSubscriptionException {

        if (onGetResponseListener != null) {
            service.updateSubscriptionPlan(updateSubscriptionPlanVo, onGetResponseListener);
        } else throw PodSubscriptionException.invalidParameter(MESSAGE);

        return this;
    }

}
