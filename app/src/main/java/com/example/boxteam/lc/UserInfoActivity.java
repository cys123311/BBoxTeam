package com.example.boxteam.lc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.boxteam.R;

import butterknife.BindView;
import butterknife.ButterKnife;

//TODO 个人资料
public class UserInfoActivity extends AppCompatActivity {

    @BindView(R.id.btn_sure)
    Button btnSure;
    @BindView(R.id.txt_save)
    TextView txtSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_user_info );
        ButterKnife.bind( this );

        //确定
        btnSure.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText( UserInfoActivity.this, "个人资料修改成功！", Toast.LENGTH_SHORT ).show();
            }
        } );

        //保存
        txtSave.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        } );
    }
}