package com.fanap.userOperation.service;

import com.fanap.userOperation.data.modelSrv.CustomerProfileSrv;
import com.fanap.userOperation.data.modelVo.*;
import com.fanap.userOperation.util.*;

/**
 * Created By Askarian on 5/28/2019
 */
public class Service {

    public void getUserProfile(GetUserProfileVo getUserProfileVo,
                               OnGetResponseListener onGetResponseListener) {

        UserOperationService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getUserProfileVo.getBaseInfoVo().getServerType()))
                .create(UserOperationService.class);

        new GetResult<CustomerProfileSrv>(service.getUserProfile(
                getUserProfileVo.getBaseInfoVo().getToken(),
                getUserProfileVo.getBaseInfoVo().getToken_issuer(),
                getUserProfileVo.getBaseInfoVo().getClient_id(),
                getUserProfileVo.getBaseInfoVo().getClient_secret()
        ), onGetResponseListener).get();
    }

    public void editProfileWithConfirmation(EditProfileWithConfirmationVo editProfileWithConfirmationVo,
                                            OnGetResponseListener onGetResponseListener) {

        UserOperationService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(editProfileWithConfirmationVo.getBaseInfoVo().getServerType()))
                .create(UserOperationService.class);

        new GetResult<CustomerProfileSrv>(service.editProfileWithConfirmation(
                editProfileWithConfirmationVo.getFirstName(),
                editProfileWithConfirmationVo.getLastName(),
                editProfileWithConfirmationVo.getNickName(),
                editProfileWithConfirmationVo.getEmail(),
                editProfileWithConfirmationVo.getPhoneNumber(),
                editProfileWithConfirmationVo.getCellphoneNumber(),
                editProfileWithConfirmationVo.getNationalCode(),
                editProfileWithConfirmationVo.getGender(),
                editProfileWithConfirmationVo.getAddress(),
                editProfileWithConfirmationVo.getBirthDate(),
                editProfileWithConfirmationVo.getCountry(),
                editProfileWithConfirmationVo.getState(),
                editProfileWithConfirmationVo.getCity(),
                editProfileWithConfirmationVo.getPostalcode(),
                editProfileWithConfirmationVo.getSheba(),
                editProfileWithConfirmationVo.getProfileImage(),
                editProfileWithConfirmationVo.getClient_metadata(),
                editProfileWithConfirmationVo.getBirthState(),
                editProfileWithConfirmationVo.getIdentificationNumber(),
                editProfileWithConfirmationVo.getFatherName(),
                editProfileWithConfirmationVo.getBaseInfoVo().getToken(),
                editProfileWithConfirmationVo.getBaseInfoVo().getToken_issuer(),
                editProfileWithConfirmationVo.getBaseInfoVo().getClient_id(),
                editProfileWithConfirmationVo.getBaseInfoVo().getClient_secret()
        ), onGetResponseListener).get();
    }
}
