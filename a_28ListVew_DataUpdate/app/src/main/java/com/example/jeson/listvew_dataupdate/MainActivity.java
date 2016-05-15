package com.example.jeson.listvew_dataupdate;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Context mContext;
    private ListView mListView;
    private List<Data> mData;
    private MyAdapter mMyAdapter;

    private Button bt_add;
    private int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = getApplicationContext();
        bindViews();
        mData = new LinkedList<>();

        //静态添加数据
        //mData.add(new Data(R.drawable.photo1, "这个是Genymotion(静态)"));

        //动态添加
        bt_add = (Button) findViewById(R.id.add_data);
        bt_add.setOnClickListener(this);

        mMyAdapter = new MyAdapter(mContext, mData);
        mListView.setAdapter(mMyAdapter);

    }

    private void bindViews() {
        mListView = (ListView) findViewById(R.id.list_one);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_data:
                mMyAdapter.add(new Data(R.drawable.photo1, "这个是Genymotion:~~~~~x" + flag));
                flag ++;
                break;
        }
    }
}
