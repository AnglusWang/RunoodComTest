package com.angluswang.db_test;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Jeson on 2016/7/22.
 * 数据库帮助类
 */

public class DBHelper extends SQLiteOpenHelper {

    private final static String NAME = "sendMsg.db";
    private final static String TAG = "DBHelper";
    private final static int VERSION = 1;

    public DBHelper(Context context) {
        super(context, NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + DBDao.TABLE_NAME + "("
                + "_ID" + " integer PRIMARY KEY AUTOINCREMENT,"
                + "id" + " text, "
                + "name" + " text,"
                + "date" + " text)");
        Log.e(TAG, "onCreate");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("ALTER TABLE " + DBDao.TABLE_NAME + " ADD phone VARCHAR(12)");
    }
}
