package com.fanap.SsoService.util.interfaces;

import com.fanap.SsoService.data.modelSrv.AuthorizeSrv;
import com.fanap.SsoService.data.modelSrv.VerifySrv;
import com.fanap.SsoService.exception.SsoServiceException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListenerAuthorize {
    void onResponse(AuthorizeSrv result);

    void onFailed(SsoServiceException e);

}
