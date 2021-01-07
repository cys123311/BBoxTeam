package com.example.boxteam.bigboss.ask;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.boxteam.R;
import com.example.boxteam.bigboss.rl.RlActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class AskActivity extends AppCompatActivity {


    @BindView(R.id.cl_wl)
    ConstraintLayout clWl;
    @BindView(R.id.tv_ask_txt6)
    TextView tvAskTxt6;
    @BindView(R.id.btn_ok)
    Button btnOk;
    @BindView(R.id.iv_ask_call)
    ImageView ivAskCall;
    private Unbinder bind;
    private String ask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_ask );
        bind = ButterKnife.bind( this );
        initView();


//        Glide.with( this ).load( R.mipmap.a )
//                .apply( new RequestOptions().transform( new SerrationTransformation( AskActivity.this ) ) )
//                .into( ivImage );
    }

    private void initView() {
        btnOk.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty( ask )) {
                    Toast.makeText( AskActivity.this, "请假成功！", Toast.LENGTH_SHORT ).show();
                } else {
                    Toast.makeText( AskActivity.this, "您没有选择请假时间，立即前往", Toast.LENGTH_SHORT ).show();
                }
            }
        } );

        ivAskCall.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        } );
    }


    @OnClick(R.id.cl_wl)
    public void onViewClicked() {
        //回传值
        Intent intent = new Intent( AskActivity.this, RlActivity.class );
        startActivityForResult( intent, 1 );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult( requestCode, resultCode, data );
        if (requestCode == 1 && resultCode == 2) {
            ask = data.getStringExtra( "ask" );
            tvAskTxt6.setText( ask );

        }
    }
}