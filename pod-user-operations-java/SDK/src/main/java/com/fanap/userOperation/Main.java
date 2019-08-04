package com.fanap.userOperation;

import com.fanap.userOperation.controller.UserOperationMethodInvoke;
import com.fanap.userOperation.data.modelSrv.*;
import com.fanap.userOperation.data.modelVo.*;
import com.fanap.userOperation.enums.Enum_Server_type;
import com.fanap.userOperation.exception.PodException;
import com.fanap.userOperation.util.OnGetResponseListener;

/**
 * Created by Shahab Askarian on 5/28/2019.
 */
public class Main {

    private static String TOKEN = "7683576dfd08480e9ca270f49a479ff7";
    private static String TOKEN_ISSUER = "1";
    public static void main(String[] args) {
//        getUserProfile();
//        editProfileWithConfirmation();
    }

    private static void getUserProfile() {
        BaseInfoVo baseInfoVo = new BaseInfoVo();
        baseInfoVo
                .setToken(TOKEN)
                .setToken_issuer("1")
                .setServerType(Enum_Server_type.PRODUCTION)
//                .setClient_id("")
//                .setClient_secret("")
        ;

        UserOperationMethodInvoke userOperationMethodInvoke = new UserOperationMethodInvoke();

        try {
            GetUserProfileVo getUserProfileVo = new GetUserProfileVo.Builder(baseInfoVo)
                    .build();
            userOperationMethodInvoke.getUserProfile(getUserProfileVo, new OnGetResponseListener<CustomerProfileSrv>() {
                @Override
                public void onResponse(ResultVo<CustomerProfileSrv> result) {
                    System.out.println(result.getResult().getNickName());
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

    private static void editProfileWithConfirmation() {
        BaseInfoVo baseInfoVo = new BaseInfoVo();
        baseInfoVo
                .setToken(TOKEN)
                .setToken_issuer("1")
                .setServerType(Enum_Server_type.PRODUCTION)
//                .setClient_id("")
//                .setClient_secret("")
        ;

        UserOperationMethodInvoke userOperationMethodInvoke = new UserOperationMethodInvoke();

        try {
            EditProfileWithConfirmationVo editProfileWithConfirmationVo =
                    new EditProfileWithConfirmationVo.Builder(baseInfoVo)
                            .setNickName("testces100")
                            .build();
            userOperationMethodInvoke.editProfileWithConfirmation(editProfileWithConfirmationVo, new OnGetResponseListener<CustomerProfileSrv>() {
                @Override
                public void onResponse(ResultVo<CustomerProfileSrv> result) {
                    System.out.println(result.getResult().getNickName());
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
