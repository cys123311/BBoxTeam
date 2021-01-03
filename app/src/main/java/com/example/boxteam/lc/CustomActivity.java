package com.example.boxteam.lc;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.interfases.IBasePresenter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomActivity extends BaseActivity {
    @BindView(R.id.txt_custom)
    TextView txtCustom;

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
        String data = "1.品牌介绍\n"+"2.购课咨询\n"+"3.三周年大促\n"+"4.ios系统购课\n"+"5.物流查询\n"+"6.课程售后\n";
        SpannableStringBuilder builder = new SpannableStringBuilder(data);
        String re = "[0-9]";
        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(data);
        while(matcher.find()){
            int start = matcher.start();
            int end = matcher.end();

            builder.setSpan(new ForegroundColorSpan(Color.BLUE),start,end, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        }
        txtCustom.setText(data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
