package com.example.jeson.adapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SiampleActivity extends AppCompatActivity {

    private String[] names = new String[]{"红色", "粉色", "柠檬色"};
    private String[] says = new String[]{"红色代表激情~", "粉色代表代表神秘、浪漫、爱情~", "不知道咯~"};
    private int[] imgIds = {
            R.drawable.pt1,
            R.drawable.pt2,
            R.drawable.pt3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_adapter);

        List<Map<String, Object>> listitem = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> showItem = new HashMap<>();
            showItem.put("img", imgIds[i]);
            showItem.put("name", names[i]);
            showItem.put("explains", says[i]);
            listitem.add(showItem);
        }

        SimpleAdapter myAdapter = new SimpleAdapter(
                getApplicationContext(),
                listitem,
                R.layout.list_item,
                new String[]{"img", "name", "explains"},
                new int[]{R.id.img_head, R.id.name, R.id.says}
        );
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(myAdapter);

    }
}
