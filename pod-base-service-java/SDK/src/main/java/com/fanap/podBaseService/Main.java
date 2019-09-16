package com.fanap.podBaseService;

import com.fanap.podBaseService.controller.PodBaseService;
import com.fanap.podBaseService.data.modelSrv.TagTreeCategorySrv;
import com.fanap.podBaseService.data.modelSrv.TagTreeSrv;
import com.fanap.podBaseService.data.modelVo.*;
import com.fanap.podBaseService.enums.Enum_Server_type;
import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.OnGetResponseListener;

import java.util.List;

/**
 * Created by Z.gholinia on 9/2/2019.
 */
public class Main {

    private static String TOKEN = "c43049a626e5462ab85c0a8e4028e9fe";
    private static String GUILD_CODE = "INFORMATION_TECHNOLOGY_GUILD";

    public static void main(String[] args) {


        addTagTreeCategory();
        getTagTreeCategoryList();
        updateTagTreeCategory();
        addTagTree();
        getTagTreeList();
        updateTagTree();
    }


    private static void addTagTreeCategory() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            AddTagTreeCategoryVo addTagTreeCategoryVo = new AddTagTreeCategoryVo.Builder(baseInfoVo)
                    .setName("")
                    .build();
            podBaseService.addTagTreeCategory(addTagTreeCategoryVo, new OnGetResponseListener<TagTreeCategorySrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeCategorySrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void getTagTreeCategoryList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            GetTagTreeCategoryListVo getTagTreeCategoryListVo = new GetTagTreeCategoryListVo.Builder(baseInfoVo)
                    .setOffset(0)
                    .setSize(10)
                    .build();
            podBaseService.getTagTreeCategoryList(getTagTreeCategoryListVo, new OnGetResponseListener<List<TagTreeCategorySrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeCategorySrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void updateTagTreeCategory() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            UpdateTagTreeCategoryVo updateTagTreeCategoryVo = new UpdateTagTreeCategoryVo.Builder(baseInfoVo)
                    .setId(421L)
                    .setName("hi")
                    .build();
            podBaseService.updateTagTreeCategory(updateTagTreeCategoryVo, new OnGetResponseListener<TagTreeCategorySrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeCategorySrv> result) {
                    System.out.println(result.getResult().getName());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }

    private static void addTagTree() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            AddTagTreeVo addTagTreeVo = new AddTagTreeVo.Builder(baseInfoVo)
                    .setName("tag2")
                    .setCategoryId(421L)
                    .build();
            podBaseService.addTagTree(addTagTreeVo, new OnGetResponseListener<TagTreeSrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeSrv> result) {
                    System.out.println(result.getResult().getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void getTagTreeList() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            GetTagTreeListVo getTagTreeListVo = new GetTagTreeListVo.Builder(baseInfoVo)
                    .setCategoryId(421L)
                    .setLevelCount(1)
                    .build();
            podBaseService.getTagTreeList(getTagTreeListVo, new OnGetResponseListener<List<TagTreeSrv>>() {
                @Override
                public void onResponse(ResultVo<List<TagTreeSrv>> result) {
                    System.out.println(result.getResult().get(0).getId());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


    private static void updateTagTree() {
        BaseInfoVo baseInfoVo = new BaseInfoVo.Builder()
                .setToken(TOKEN)
                .setToken_issuer(1)
                .setServerType(Enum_Server_type.PRODUCTION)
                .build();

        PodBaseService podBaseService = new PodBaseService();

        try {
            UpdateTagTreeVo updateTagTreeVo = new UpdateTagTreeVo.Builder(baseInfoVo)
                    .setId(1208L)
                    .setName("hi")
                    .build();
            podBaseService.updateTagTree(updateTagTreeVo, new OnGetResponseListener<TagTreeSrv>() {
                @Override
                public void onResponse(ResultVo<TagTreeSrv> result) {
                    System.out.println(result.getResult().getName());
                }

                @Override
                public void onFailed(PodException e) {
                    System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
                }
            });
        } catch (PodException e) {
            System.out.println("code : " + e.getCode() + "\nmessage : " + e.getMessage());
        }
    }


}
