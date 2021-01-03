package com.example.boxteam.cysboss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.cysboss.adapter.LiveOneAdapter;
import com.example.boxteam.interfases.IBasePresenter;

import java.util.ArrayList;

import butterknife.BindView;

public class LiveOneActivity extends BaseActivity {

    @BindView(R.id.liveone_rlv)
    RecyclerView liveoneRlv;
    private LiveOneAdapter liveoneAdapter;
    private ArrayList<Integer> strings;

    @Override
    protected int getLayout() {
        return R.layout.activity_live_one;
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void initView() {
        liveoneRlv.setLayoutManager(new GridLayoutManager(this,2));
        strings = new ArrayList<>();

        for (int i = 0; i <6 ; i++) {
            strings.add(R.drawable.home);
        }
        liveoneAdapter = new LiveOneAdapter(this, strings);
        liveoneRlv.setAdapter(liveoneAdapter);
    }

    @Override
    protected void initData() {

    }
}