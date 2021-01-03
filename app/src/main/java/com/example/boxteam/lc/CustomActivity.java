package com.example.boxteam.lc;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.bigboss.zf.Zf2Activity;
import com.example.boxteam.interfases.IBasePresenter;
import com.example.boxteam.wsqboss.home.main.DetailsActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CustomActivity extends BaseActivity {
    @BindView(R.id.txt_custom)
    TextView txtCustom;
    @BindView(R.id.con_title)
    ConstraintLayout conTitle;
    @BindView(R.id.tv_content)
    TextView tvContent;
    @BindView(R.id.nes)
    NestedScrollView nes;
    @BindView(R.id.img_cusp)
    ImageView imgCusp;
    @BindView(R.id.img_cusj)
    ImageView imgCusj;

    @Override
    protected int getLayout() {
        return R.layout.activity_custom;
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
        String data = "1.品牌介绍\n" + "2.购课咨询\n" + "3.三周年大促\n" + "4.ios系统购课\n" + "5.物流查询\n" + "6.课程售后\n";
        SpannableStringBuilder builder = new SpannableStringBuilder(data);
        String re = "[0-9]";
        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();

            builder.setSpan(new ForegroundColorSpan(Color.BLUE), start, end, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        }
        txtCustom.setText(data);
    }


    @OnClick({R.id.img_cusp, R.id.img_cusj})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_cusp:
                View root = LayoutInflater.from(this).inflate(R.layout.activity_feed_back, null);
                PopupWindow popupWindow = new PopupWindow(root, ViewPager.LayoutParams.MATCH_PARENT, ViewPager.LayoutParams.WRAP_CONTENT);
                popupWindow.setBackgroundDrawable(new ColorDrawable());
                popupWindow.setOutsideTouchable(true);
                popupWindow.showAtLocation(root, Gravity.CENTER, 0, 0);
                break;
            case R.id.img_cusj:
                break;
        }
    }
}
