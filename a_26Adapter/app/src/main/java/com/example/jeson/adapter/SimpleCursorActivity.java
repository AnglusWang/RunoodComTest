package com.example.jeson.adapter;

import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class SimpleCursorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_cursor);

        ListView listView = (ListView) findViewById(R.id.lv_Simple_Cursor);

        Cursor cursor = getContentResolver().query(
                ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        SimpleCursorAdapter spcAdapter =
                new SimpleCursorAdapter(
                        this,
                        R.layout.list_item,
                        cursor,
                        new String[]{
                                ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
                                ContactsContract.CommonDataKinds.Phone.NUMBER},
                        new int[]{R.id.list_name,R.id.list_phone}
                );
        listView.setAdapter(spcAdapter);
        /*
            使用SimpleCursorAdapter的话,绑定的数据库表中一定要有id这个字段,
            或者as id;而且在绑定时取出的数据必须包含这个id项,否则的话会报以下错误!
            java.lang.IllegalArgumentException: column 'id' does not exist**
        */
    }
}
