package com.fanap.podBaseService.service;

import com.fanap.podBaseService.data.modelSrv.*;
import com.fanap.podBaseService.data.modelVo.*;
import com.fanap.podBaseService.util.GetResult;
import com.fanap.podBaseService.util.OnGetResponseListener;
import com.fanap.podBaseService.util.RetrofitUtil;
import com.fanap.podBaseService.util.ServerTypeSelectionUtil;

import java.util.List;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class Service {



    public void addTagTreeCategory(AddTagTreeCategoryVo addTagTreeCategoryVo,
                                    OnGetResponseListener onGetResponseListener) {

        PodBaseService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(addTagTreeCategoryVo.getBaseInfoVo().getServerType()))
                .create(PodBaseService.class);

        new GetResult<TagTreeCategorySrv>(service.addTagTreeCategory(
                addTagTreeCategoryVo.getBaseInfoVo().getToken(),
                addTagTreeCategoryVo.getBaseInfoVo().getToken_issuer(),
                addTagTreeCategoryVo.getName(),
                addTagTreeCategoryVo.getDesc()
        ), onGetResponseListener).get();
    }
    public void getTagTreeCategoryList(GetTagTreeCategoryListVo getTagTreeCategoryListVo,
                                   OnGetResponseListener onGetResponseListener) {

        PodBaseService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getTagTreeCategoryListVo.getBaseInfoVo().getServerType()))
                .create(PodBaseService.class);

        new GetResult<List<TagTreeCategorySrv>>(service.getTagTreeCategoryList(
                getTagTreeCategoryListVo.getBaseInfoVo().getToken(),
                getTagTreeCategoryListVo.getBaseInfoVo().getToken_issuer(),
                getTagTreeCategoryListVo.getOffset(),
                getTagTreeCategoryListVo.getSize(),
                getTagTreeCategoryListVo.getId(),
                getTagTreeCategoryListVo.getQuery(),
                getTagTreeCategoryListVo.getName()
        ), onGetResponseListener).get();
    }
    public void updateTagTreeCategory(UpdateTagTreeCategoryVo updateTagTreeCategoryVo,
                                       OnGetResponseListener onGetResponseListener) {

        PodBaseService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(updateTagTreeCategoryVo.getBaseInfoVo().getServerType()))
                .create(PodBaseService.class);

        new GetResult<TagTreeCategorySrv>(service.updateTagTreeCategory(
                updateTagTreeCategoryVo.getBaseInfoVo().getToken(),
                updateTagTreeCategoryVo.getBaseInfoVo().getToken_issuer(),
                updateTagTreeCategoryVo.getId(),
                updateTagTreeCategoryVo.getName(),
                updateTagTreeCategoryVo.getDesc(),
                updateTagTreeCategoryVo.getEnable()

        ), onGetResponseListener).get();
    }
    public void addTagTree(AddTagTreeVo addTagTreeVo,
                                      OnGetResponseListener onGetResponseListener) {

        PodBaseService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(addTagTreeVo.getBaseInfoVo().getServerType()))
                .create(PodBaseService.class);

        new GetResult<TagTreeSrv>(service.addTagTree(
                addTagTreeVo.getBaseInfoVo().getToken(),
                addTagTreeVo.getBaseInfoVo().getToken_issuer(),
                addTagTreeVo.getName(),
                addTagTreeVo.getCategoryId(),
                addTagTreeVo.getParentId()

        ), onGetResponseListener).get();
    }


    public void getTagTreeList(GetTagTreeListVo getTagTreeListVo,
                                OnGetResponseListener onGetResponseListener) {

        PodBaseService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(getTagTreeListVo.getBaseInfoVo().getServerType()))
                .create(PodBaseService.class);

        new GetResult<List<TagTreeSrv>>(service.getTagTreeList(
                getTagTreeListVo.getBaseInfoVo().getToken(),
                getTagTreeListVo.getBaseInfoVo().getToken_issuer(),
                getTagTreeListVo.getCategoryId(),
                getTagTreeListVo.getParentId(),
                getTagTreeListVo.getLevelCount(),
                getTagTreeListVo.getLevel(),
                getTagTreeListVo.getId()

        ), onGetResponseListener).get();
    }


    public void updateTagTree(UpdateTagTreeVo updateTagTreeVo,
                                      OnGetResponseListener onGetResponseListener) {

        PodBaseService service = RetrofitUtil
                .getInstance(ServerTypeSelectionUtil.getBaseURL(updateTagTreeVo.getBaseInfoVo().getServerType()))
                .create(PodBaseService.class);

        new GetResult<TagTreeSrv>(service.updateTagTree(
                updateTagTreeVo.getBaseInfoVo().getToken(),
                updateTagTreeVo.getBaseInfoVo().getToken_issuer(),
                updateTagTreeVo.getId(),
                updateTagTreeVo.getName(),
                updateTagTreeVo.getParentId(),
                updateTagTreeVo.getEnable()

        ), onGetResponseListener).get();
    }


}
