package com.example.boxteam.bigboss.zf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.boxteam.R;
import com.example.boxteam.lc.LoginAgreeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Zf3Activity extends AppCompatActivity {

    @BindView(R.id.btn_zwx_mode_of_payment_paymant)
    Button btnZwxModeOfPaymentPaymant;
    @BindView(R.id.iv_return)
    ImageView ivReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_zf3 );
        ButterKnife.bind( this );
        initView();
    }

    private void initView() {
        ivReturn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        } );
    }

    @OnClick(R.id.btn_zwx_mode_of_payment_paymant)
    public void onViewClicked() {
        startActivity( new Intent( this, LoginAgreeActivity.class ) );
    }
}