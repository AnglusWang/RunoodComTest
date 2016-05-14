package com.example.jeson.listview_simplepractical;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private ListView list_animal;
    private LinkedList<Animals> mData = null;
    private AnimalAdapter mAnimalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = MainActivity.this;
        list_animal = (ListView) findViewById(R.id.animal_list);

        //动态加载顶部View和底部View
        final LayoutInflater inflater = LayoutInflater.from(this);
        View headView = inflater.inflate(R.layout.view_header, null, false);
        View footView = inflater.inflate(R.layout.view_footer, null, false);

        mData = new LinkedList<>();
        mData.add(new Animals("fish", "I am A", R.drawable.pt1));
        mData.add(new Animals("dog", "I am B", R.drawable.pt2));
        mData.add(new Animals("horse", "I am C", R.drawable.pt3));
        mData.add(new Animals("sheep", "I am D", R.drawable.pt4));
        mData.add(new Animals("bird", "I am E", R.drawable.pt5));
        mData.add(new Animals("cat", "I am F", R.drawable.pt6));
        mData.add(new Animals("tiger", "I am G", R.drawable.pt7));

//      addHeaderView方法必须放在listview.setAdapter前面，否则会报错。
        list_animal.addHeaderView(headView);
        list_animal.addFooterView(footView);

        mAnimalAdapter = new AnimalAdapter(mData, mContext);
        list_animal.setAdapter(mAnimalAdapter);

        list_animal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "你点击了第" + position + "项", Toast.LENGTH_SHORT).show();
            }
        });


        TextView title = (TextView) findViewById(R.id.title);

        //创建一个 SpannableString对象
        SpannableString sp = new SpannableString("动物说自己");

        //设置超链接
        sp.setSpan(new URLSpan("http://www.baidu.com"), 2, 3,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        //设置高亮样式
        sp.setSpan(new BackgroundColorSpan(Color.GREEN), 0, 2,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        //设置斜体
        sp.setSpan(new StyleSpan(android.graphics.Typeface.BOLD_ITALIC),
                3, 5,
                Spannable.SPAN_EXCLUSIVE_INCLUSIVE);

        title.setText(sp);
        title.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
