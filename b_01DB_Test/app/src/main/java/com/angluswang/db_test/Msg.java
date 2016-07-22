package com.angluswang.db_test;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jeson on 2016/7/22.
 * 信息实体类
 */

public class Msg implements Parcelable {

    private String id;
    private String name;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.date);
    }

    public Msg() {
    }

    protected Msg(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
        this.date = in.readString();
    }

    public static final Creator<Msg> CREATOR = new Creator<Msg>() {
        @Override
        public Msg createFromParcel(Parcel source) {
            return new Msg(source);
        }

        @Override
        public Msg[] newArray(int size) {
            return new Msg[size];
        }
    };
}
