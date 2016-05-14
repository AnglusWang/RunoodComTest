package com.example.jeson.listview_simplepractical;

/**
 * Created by Jeson on 2016/5/14.
 * 一个动物类
 */
public class Animals {

    private String aName;
    private String aSay;
    private int aIcon;

    public Animals(String aName, String aSay, int aIcon) {
        this.aName = aName;
        this.aSay = aSay;
        this.aIcon = aIcon;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaSay() {
        return aSay;
    }

    public void setaSay(String aSay) {
        this.aSay = aSay;
    }

    public int getaIcon() {
        return aIcon;
    }

    public void setaIcon(int aIcon) {
        this.aIcon = aIcon;
    }
}
