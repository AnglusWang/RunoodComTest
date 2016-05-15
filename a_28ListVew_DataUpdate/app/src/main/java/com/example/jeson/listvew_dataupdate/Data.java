package com.example.jeson.listvew_dataupdate;

/**
 * Created by Jeson on 2016/5/15.
 * 一个实体类
 */
public class Data {

    private int mImgId;
    private String mContent;

    public Data(int imgId, String content) {
        mImgId = imgId;
        mContent = content;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public int getImgId() {
        return mImgId;
    }

    public void setImgId(int imgId) {
        mImgId = imgId;
    }
}
