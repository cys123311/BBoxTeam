package com.example.boxteam.bigboss.zf;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.boxteam.R;
import com.example.boxteam.lc.LoginAgreeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Zf3Activity extends AppCompatActivity {

    @BindView(R.id.btn_zwx_mode_of_payment_paymant)
    Button btnZwxModeOfPaymentPaymant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zf3);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_zwx_mode_of_payment_paymant)
    public void onViewClicked() {
        startActivity(new Intent(this, LoginAgreeActivity.class));
    }
}