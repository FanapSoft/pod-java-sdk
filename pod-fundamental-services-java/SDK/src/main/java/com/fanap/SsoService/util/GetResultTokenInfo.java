package com.fanap.SsoService.util;


import com.fanap.SsoService.data.modelSrv.ErrorSrv;
import com.fanap.SsoService.data.modelSrv.TokenInfoSrv;
import com.fanap.SsoService.exception.SsoServiceException;
import com.fanap.SsoService.util.interfaces.OnGetResponseListenerGetTokenInfo;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public class GetResultTokenInfo {

    private OnGetResponseListenerGetTokenInfo onGetResponseListenerGetTokenInfo;
    private Call<TokenInfoSrv> call;

    public GetResultTokenInfo(Call call, OnGetResponseListenerGetTokenInfo onGetResponseListenerGetTokenInfo) {
        this.call = call;
        this.onGetResponseListenerGetTokenInfo = onGetResponseListenerGetTokenInfo;
    }

    public void get() {
        if (onGetResponseListenerGetTokenInfo != null) {
            call.enqueue(new Callback<TokenInfoSrv>() {
                @Override
                public void onResponse(Call<TokenInfoSrv> call, Response<TokenInfoSrv> response) {
                    if (response.code() == 200) {
                        TokenInfoSrv tokenInfoSrv = response.body();
                        onGetResponseListenerGetTokenInfo.onResponse(tokenInfoSrv);
                    } else {
                        ResponseBody responseBody = response.errorBody();
                        String s = null;
                        try {
                            s = responseBody.string();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        ErrorSrv errorSrv = JacksonUtil.getObject(s, ErrorSrv.class);
                        onGetResponseListenerGetTokenInfo.onFailed(
                                SsoServiceException.developerException(response.code(),
                                        errorSrv.getError() + ". " + errorSrv.getError_description()));
                    }
                }

                @Override
                public void onFailure(Call<TokenInfoSrv> call, Throwable throwable) {
                    if (onGetResponseListenerGetTokenInfo != null)
                        onGetResponseListenerGetTokenInfo.onFailed(SsoServiceException.unexpectedException());
                }
            });
        }
    }
}
