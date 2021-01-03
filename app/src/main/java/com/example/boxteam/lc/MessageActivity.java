package com.example.boxteam.lc;

import android.os.Bundle;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.interfases.IBasePresenter;
import com.example.boxteam.lc.adapter.MessageAdapter;
import com.example.boxteam.lc.bean.GiftMessage;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
//TODO    消息内容
public class MessageActivity extends BaseActivity {

    @BindView(R.id.ll_mess)
    LinearLayout llMess;
    private List<GiftMessage> list;

    @Override
    protected int getLayout() {
        return R.layout.activity_message;
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void initView() {
        list = new ArrayList();
        GiftMessage m = new GiftMessage();
        for(int i=0;i<5;i++){
            m.setName("已有1497304位用户赢得精美好礼");
            m.setGift("你拆到心仪礼品了吗");
            m.setCan("点击查看");
            m.setTime("11-21 06:27");
            list.add(m);
        }
    }

    @Override
    protected void initData() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.message, null);

        RecyclerView rlv_message = inflate.findViewById(R.id.rlv_message);
        rlv_message.setLayoutManager(new LinearLayoutManager(this));
        MessageAdapter messageAdapter = new MessageAdapter(this, list);
        rlv_message.setAdapter(messageAdapter);

        llMess.addView(inflate);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}