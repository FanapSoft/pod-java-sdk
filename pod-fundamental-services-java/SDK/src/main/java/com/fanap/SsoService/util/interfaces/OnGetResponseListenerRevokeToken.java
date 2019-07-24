package com.fanap.SsoService.util.interfaces;

import com.fanap.SsoService.exception.SsoServiceException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListenerRevokeToken {
    void onResponse(Void result);

    void onFailed(SsoServiceException e);

}
