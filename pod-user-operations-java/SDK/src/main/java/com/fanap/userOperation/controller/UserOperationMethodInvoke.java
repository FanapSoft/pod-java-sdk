package com.fanap.userOperation.controller;

import com.fanap.userOperation.data.modelVo.*;
import com.fanap.userOperation.exception.PodException;
import com.fanap.userOperation.service.Service;
import com.fanap.userOperation.util.OnGetResponseListener;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class UserOperationMethodInvoke {

    private static final String MESSAGE = "onGetResponseListener can not be null!";
    private static Service service = new Service();

    /**
     * Get access token.
     *
     * @param getUserProfileVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public UserOperationMethodInvoke getUserProfile(GetUserProfileVo getUserProfileVo,
                                               OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.getUserProfile(getUserProfileVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }

    /**
     * Get access token.
     *
     * @param editProfileWithConfirmationVo
     * @param onGetResponseListener A generic listener based on type of the output for receiving response. If the onGetResponseListenerGetAccessToken is null,
     *                                       InvalidParameterException will be thrown.
     * @return
     * @throws PodException
     */
    public UserOperationMethodInvoke editProfileWithConfirmation(EditProfileWithConfirmationVo
                                                                         editProfileWithConfirmationVo,
                                                    OnGetResponseListener onGetResponseListener)
            throws PodException {

        if (onGetResponseListener != null)
            service.editProfileWithConfirmation(editProfileWithConfirmationVo, onGetResponseListener);

        else throw PodException.invalidParameter(MESSAGE);

        return this;
    }
}
