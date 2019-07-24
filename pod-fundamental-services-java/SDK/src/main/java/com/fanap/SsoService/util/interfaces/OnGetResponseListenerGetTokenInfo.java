package com.fanap.SsoService.util.interfaces;

import com.fanap.SsoService.data.modelSrv.TokenInfoSrv;
import com.fanap.SsoService.exception.SsoServiceException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListenerGetTokenInfo {
    void onResponse(TokenInfoSrv result);

    void onFailed(SsoServiceException e);

}
