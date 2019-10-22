package com.fanap.podProduct.util;

import com.fanap.podProduct.data.modelVo.ResultVo;
import com.fanap.podProduct.exception.PodException;

/**
 * Created By Khojasteh on 2/26/2019
 */
public interface OnGetResponseListener<T> {
    void onResponse(ResultVo<T> result);

    void onFailed(PodException e);

}
