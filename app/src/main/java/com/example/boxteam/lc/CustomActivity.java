package com.example.boxteam.lc;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.boxteam.R;
import com.example.boxteam.lc.base.BaseActivity;
import com.example.boxteam.lc.interfaces.IBasePresenter;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomActivity extends BaseActivity {
    @BindView(R.id.txt_custom1)
    TextView txtCustom1;


    @Override
    protected int getLayout() {
        return R.layout.activity_custom;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        String data = "1.品牌介绍\n" + "2.购课咨询\n" + "3.三周年大促\n" + "4.ios系统购课\n" + "5.物流查询\n" + "6.课程售后\n";
        SpannableStringBuilder builder = new SpannableStringBuilder(data);
        int start = 0;
        int end = data.length();
        builder.setSpan(new ForegroundColorSpan(Color.BLUE), start, end, Spanned.SPAN_INCLUSIVE_INCLUSIVE);

        ClickableSpan click = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(CustomActivity.this, CourseSelection.class);
                startActivity(intent);
            }
        };
        builder.setSpan(click,0,end,Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        txtCustom1.setMovementMethod(LinkMovementMethod.getInstance());
        txtCustom1.setText(builder);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
