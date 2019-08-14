package com.fanap.podDealing.util;

import com.fanap.podDealing.data.modelVo.ResultVo;
import com.fanap.podDealing.exception.PodException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListener<T> {
    void onResponse(ResultVo<T> result);

    void onFailed(PodException e);

}
