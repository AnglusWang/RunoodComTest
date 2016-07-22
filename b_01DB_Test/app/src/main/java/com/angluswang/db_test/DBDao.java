package com.angluswang.db_test;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/**
 * Created by Jeson on 2016/7/22.
 */
public class DBDao {

    public final static String TABLE_NAME = "table_name";
    private DBHelper helper;
    private static DBDao dao = null;

    private DBDao(Context context) {
        this.helper = new DBHelper(context);
    }

    public static synchronized DBDao getDao(Context context) {
        if (null == dao) {
            dao = new DBDao(context);
        }
        return dao;
    }

    public void insert(Msg msg) {
        ContentValues values = new ContentValues();
        values.put("id", msg.getId());
        values.put("name", msg.getName());
        values.put("date", msg.getDate());
        try {
            SQLiteDatabase db = helper.getWritableDatabase();
            db.insert(TABLE_NAME, null, values);
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
    }
}
