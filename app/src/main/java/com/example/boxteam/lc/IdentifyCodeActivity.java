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
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.boxteam.R;
import com.example.boxteam.lc.base.BaseActivity;
import com.example.boxteam.lc.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class IdentifyCodeActivity extends BaseActivity {
    @BindView(R.id.xieyi)
    TextView xieyi;
    @BindView(R.id.yzlogin)
    TextView yzlogin;
    @BindView(R.id.mm_login)
    TextView mmLogin;
    @BindView(R.id.ll_yanz)
    LinearLayout llYanz;
    @BindView(R.id.ll_mm)
    LinearLayout llMm;

    @Override
    protected int getLayout() {
        return R.layout.activity_identifycode;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        //验证码登录
        mmLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mmLogin.setTextColor(Color.BLACK);
                yzlogin.setTextColor(Color.LTGRAY);
                llMm.setVisibility(View.VISIBLE);
                llYanz.setVisibility(View.GONE);
            }
        });
        //密码登录
        yzlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mmLogin.setTextColor(Color.LTGRAY);
                yzlogin.setTextColor(Color.BLACK);
                llMm.setVisibility(View.GONE);
                llYanz.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    protected void initData() {
        String text = "登录即代表同意《中国移动认证服务条款》和《用户协议》";
        SpannableStringBuilder builder = new SpannableStringBuilder(text);
        int start = 7;
        int start1 = 20;
        int end = 19;
        int end1 = 26;
        builder.setSpan(new ForegroundColorSpan(Color.BLUE), start, end, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        builder.setSpan(new ForegroundColorSpan(Color.BLUE), start1, end1, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        ClickableSpan click = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(IdentifyCodeActivity.this, CourseSelection.class);
                startActivity(intent);
            }
        };
        builder.setSpan(click,7,19,Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        ClickableSpan click1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(IdentifyCodeActivity.this, CourseSelection.class);
                startActivity(intent);
            }
        };
        builder.setSpan(click1,20,26,Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        xieyi.setMovementMethod(LinkMovementMethod.getInstance());
        xieyi.setText(builder);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
