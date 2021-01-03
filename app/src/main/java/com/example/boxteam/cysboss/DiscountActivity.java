package com.example.boxteam.cysboss;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.cysboss.adapter.TabVpRelAdapter;
import com.example.boxteam.cysboss.fragment.CouponFragment;
import com.example.boxteam.interfases.IBasePresenter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


/**
 * 优惠券 Activity
 * 有 两个 Fragment 未使用 与 已过期
 */
public class DiscountActivity extends BaseActivity {

    @BindView(R.id.iv_return)
    ImageView ivReturn;
    @BindView(R.id.tv_tool_title)
    TextView tvToolTitle;
    @BindView(R.id.iv_more)
    ImageView ivMore;
    @BindView(R.id.iv_share)
    ImageView ivShare;
    @BindView(R.id.mTab_discount)
    TabLayout mTabDiscount;
    @BindView(R.id.mVp_discount)
    ViewPager mVpDiscount;

    @Override
    protected int getLayout() {
        return R.layout.activity_discount;
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
        String [] title = {"未使用","已失效"};
        List<Fragment> list = new ArrayList<>();
        list.add(new CouponFragment());
        list.add(new CouponFragment());
        TabVpRelAdapter relAdapter = new TabVpRelAdapter(getSupportFragmentManager(), list ,title);
        mVpDiscount.setAdapter(relAdapter);
        mTabDiscount.setupWithViewPager(mVpDiscount);
    }

}