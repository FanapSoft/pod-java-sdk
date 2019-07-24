package com.fanap.SsoService.util;


import com.fanap.SsoService.data.modelSrv.ErrorSrv;
import com.fanap.SsoService.data.modelSrv.GetAccessTokenOtpSrv;
import com.fanap.SsoService.exception.SsoServiceException;
import com.fanap.SsoService.util.interfaces.OnGetResponseListenerGetAccessTokenOtp;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class GetResultGetAccessTokenOtp {

    private OnGetResponseListenerGetAccessTokenOtp onGetResponseListenerGetAccessTokenOtp;
    private Call<GetAccessTokenOtpSrv> call;

    public GetResultGetAccessTokenOtp(Call call, OnGetResponseListenerGetAccessTokenOtp onGetResponseListenerGetAccessTokenOtp) {
        this.call = call;
        this.onGetResponseListenerGetAccessTokenOtp = onGetResponseListenerGetAccessTokenOtp;
    }

    public void get() {
        if (onGetResponseListenerGetAccessTokenOtp != null) {
            call.enqueue(new Callback<GetAccessTokenOtpSrv>() {
                @Override
                public void onResponse(Call<GetAccessTokenOtpSrv> call, Response<GetAccessTokenOtpSrv> response) {
                    if (response.code() == 200) {
                        GetAccessTokenOtpSrv getAccessTokenOtpSrv = response.body();
                        onGetResponseListenerGetAccessTokenOtp.onResponse(getAccessTokenOtpSrv);
                    } else {
                        ResponseBody responseBody = response.errorBody();
                        String s = null;
                        try {
                            s = responseBody.string();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        ErrorSrv errorSrv = JacksonUtil.getObject(s, ErrorSrv.class);
                        onGetResponseListenerGetAccessTokenOtp.onFailed(
                                SsoServiceException.developerException(response.code(),
                                        errorSrv.getError() + ". " + errorSrv.getError_description()));
                    }
                }

                @Override
                public void onFailure(Call<GetAccessTokenOtpSrv> call, Throwable throwable) {
                    if (onGetResponseListenerGetAccessTokenOtp != null)
                        onGetResponseListenerGetAccessTokenOtp.onFailed(SsoServiceException.unexpectedException());
                }
            });
        }
    }
}
