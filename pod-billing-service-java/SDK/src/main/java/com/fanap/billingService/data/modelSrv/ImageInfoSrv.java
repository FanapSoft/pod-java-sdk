package com.fanap.billingService.data.modelSrv;


import java.io.Serializable;

/**
 * Created by h.mehrara on 9/20/2014 @Nozhaco.
 */
/*
@ApiObject(
        name = "ImageInfoSrv",
        description = "desc"
)
*/
public class ImageInfoSrv implements Serializable {
    private long id;
    private String name;
    private String hashCode;
    private String description;
    private int actualWidth;
    private int actualHeight;
    private int width;
    private int height;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getActualWidth() {
        return actualWidth;
    }

    public void setActualWidth(int actualWidth) {
        this.actualWidth = actualWidth;
    }

    public int getActualHeight() {
        return actualHeight;
    }

    public void setActualHeight(int actualHeight) {
        this.actualHeight = actualHeight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
