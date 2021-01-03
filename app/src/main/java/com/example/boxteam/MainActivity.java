package com.example.boxteam;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.interfases.IBasePresenter;


public class MainActivity extends BaseActivity {


    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}