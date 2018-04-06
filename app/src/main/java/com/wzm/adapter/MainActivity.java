package com.wzm.adapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.wzm.adapter.adapter.CommonAdapter;
import com.wzm.adapter.bean.Bean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lv_list;
    private List<Bean> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
    }

    private void initView() {
        setContentView(R.layout.activity_main);
        lv_list = (ListView) findViewById(R.id.lv_list);
    }

    private void initData() {
        mData = new ArrayList<>();
        Bean bean;
        bean = new Bean("Title 1", "this is content", R.mipmap.ic_launcher);
        mData.add(bean);
        bean = new Bean("Title 2", "this is content", R.mipmap.ic_launcher);
        mData.add(bean);
        bean = new Bean("Title 3", "this is content", R.mipmap.ic_launcher);
        mData.add(bean);
        bean = new Bean("Title 4", "this is content", R.mipmap.ic_launcher);
        mData.add(bean);
        bean = new Bean("Title 5", "this is content", R.mipmap.ic_launcher);
        mData.add(bean);
        bean = new Bean("Title 6", "this is content", R.mipmap.ic_launcher);
        mData.add(bean);
        bean = new Bean("Title 7", "this is content", R.mipmap.ic_launcher);
        mData.add(bean);
        lv_list.setAdapter(new CommonAdapter<Bean>(this, mData, R.layout.item_list_main) {
            @Override
            public void convert(CommonAdapter.ViewHolder holder, Bean bean, int p) {
                holder.setText(R.id.tv_title, bean.getTitle())
                        .setText(R.id.tv_content, bean.getContent())
                        .setImageResource(R.id.img_pic, bean.getPic());
            }
        });
    }
}
