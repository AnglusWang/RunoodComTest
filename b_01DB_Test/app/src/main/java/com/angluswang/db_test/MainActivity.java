package com.angluswang.db_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Msg msg = new Msg();
        msg.setId("userId");
        msg.setName("willkernel");
        msg.setDate("2016-7-22");
        DBDao dbDao = DBDao.getDao(this);
        dbDao.insert(msg);
    }
}
