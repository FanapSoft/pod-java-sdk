package com.fanap.podBank.util;

import com.fanap.podBank.data.modelVo.ResultVo;
import com.fanap.podBaseService.exception.PodException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListener<T> {
    void onResponse(ResultVo<T> result);

    void onFailed(PodException e);

}
