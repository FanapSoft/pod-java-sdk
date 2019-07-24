package com.fanap.SsoService.util.interfaces;

import com.fanap.SsoService.data.modelSrv.GetAccessTokenOtpSrv;
import com.fanap.SsoService.data.modelSrv.GetAccessTokenSrv;
import com.fanap.SsoService.exception.SsoServiceException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListenerGetAccessTokenOtp {
    void onResponse(GetAccessTokenOtpSrv result);

    void onFailed(SsoServiceException e);

}
