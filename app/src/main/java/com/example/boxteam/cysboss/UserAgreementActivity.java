package com.example.boxteam.cysboss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.interfases.IBasePresenter;

public class UserAgreementActivity extends BaseActivity {

    @Override
    protected int getLayout() {
        return R.layout.activity_user_agreement;
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void initView() {
        initPop();
    }

    @Override
    protected void initData() {

    }

    private void initPop() {
        View view = LayoutInflater.from(this).inflate(R.layout.privacy_item, null);
        PopupWindow popupWindow = new PopupWindow(view, 800, ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        popupWindow.setTouchable(true);

        TextView mTextTv = view.findViewById(R.id.tv_text);
        //富文本
        SpannableString spannableString = new SpannableString("您可阅读《用户协议和隐私政策》了解详细信息。如您同意,请点击同意开始接受我们的服务。");
        spannableString.setSpan(new ForegroundColorSpan(Color.BLUE),
                4, 15, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        mTextTv.setText(spannableString);

        //  同意
        Button consent = view.findViewById(R.id.btn_consent);
        consent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
                //点击同意 跳转
//                startActivity(new Intent(UserAgreementActivity.this, PwdLoginActivity.class));
            }
        });
        //  不同意
        Button Noconsent = view.findViewById(R.id.btn_no_consent);
        Noconsent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
                finish();
            }
        });
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

    }
}