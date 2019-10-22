package com.fanap.podSubscription.util;

import com.fanap.podSubscription.data.modelVo.ResultVo;
import com.fanap.podSubscription.exception.PodException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListener<T> {
    void onResponse(ResultVo<T> result);

    void onFailed(PodException e);

}
