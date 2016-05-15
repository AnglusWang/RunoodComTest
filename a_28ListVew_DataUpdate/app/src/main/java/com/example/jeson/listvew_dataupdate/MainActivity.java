package com.example.jeson.listvew_dataupdate;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {

    private Context mContext;
    private ListView mListView;
    private List<Data> mData;
    private MyAdapter mMyAdapter;

    private Button bt_add;
    private Button index_add;
    private Button del_obj;
    private Button del_pot;
    private Button del_all;

    private int flag = 1;
    private Data obj_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = getApplicationContext();
        bindViews();
        mData = new LinkedList<>();

        //静态添加数据
        //mData.add(new Data(R.drawable.photo1, "这个是Genymotion(静态)"));

        init();

        mMyAdapter = new MyAdapter(mContext, mData);
        mListView.setAdapter(mMyAdapter);

    }

    private void init() {

        //动态添加
        bt_add = (Button) findViewById(R.id.add_data);
        index_add = (Button) findViewById(R.id.index_add);
        del_obj = (Button) findViewById(R.id.del_obj);
        del_pot = (Button) findViewById(R.id.del_pot);
        del_all = (Button) findViewById(R.id.del_all);

        bt_add.setOnClickListener(this);
        index_add.setOnClickListener(this);
        del_obj.setOnClickListener(this);
        del_pot.setOnClickListener(this);
        del_all.setOnClickListener(this);

    }


    private void bindViews() {
        mListView = (ListView) findViewById(R.id.list_one);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //在之后添加数据
            case R.id.add_data:
                if (flag == 2) {
                    obj_2 = new Data(R.drawable.photo1, "这个是Genymotion:~~~~~x" + flag);
                    mMyAdapter.add(obj_2);
                } else {
                    mMyAdapter.add(new Data(R.drawable.photo1, "这个是Genymotion:~~~~~x" + flag));
                }
                flag ++;
                break;
            //在指定位置添加
            case R.id.index_add:
                mMyAdapter.add(
                  3, new Data(R.drawable.photo1, "这个是Genymotion:~~~~~x" + flag)
                );
                flag ++;
                break;
            //删除指定对象
            case R.id.del_obj:
                mMyAdapter.remove(obj_2);
                break;
            //删除指定位置上的对象
            case R.id.del_pot:
                mMyAdapter.remove(4);
                break;
            //删除所有数据
            case R.id.del_all:
                mMyAdapter.clear();
                flag = 1;
                break;
        }
    }
}
