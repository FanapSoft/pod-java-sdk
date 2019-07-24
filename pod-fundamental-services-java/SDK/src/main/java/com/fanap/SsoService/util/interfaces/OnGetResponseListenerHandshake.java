package com.fanap.SsoService.util.interfaces;

import com.fanap.SsoService.data.modelSrv.HandshakeSrv;
import com.fanap.SsoService.exception.SsoServiceException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListenerHandshake {
    void onResponse(HandshakeSrv result) throws SsoServiceException;

    void onFailed(SsoServiceException e);
}
