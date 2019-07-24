package com.fanap.SsoService.util.interfaces;

import com.fanap.SsoService.data.modelSrv.RefreshAccessTokenSrv;
import com.fanap.SsoService.exception.SsoServiceException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListenerRefreshAccessToken {
    void onResponse(RefreshAccessTokenSrv result);

    void onFailed(SsoServiceException e);

}
