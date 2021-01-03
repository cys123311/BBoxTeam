package com.example.boxteam.bigboss.train;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.boxteam.MainActivity;
import com.example.boxteam.R;

public class TrainActivity extends AppCompatActivity {

    private ImageView mTvCall;
    /**
     * 评价
     */
    private TextView mTvPj;
    /**
     * 上传作业
     */
    private TextView mTvTopHomework;
    /**
     * 1.简介
     */
    private TextView mTvJj;
    /**
     * 2.基础乐理
     */
    private TextView mTvYl;
    /**
     * 3.音乐史
     */
    private TextView mTvYy;
    /**
     * 疾风音乐
     */
    private TextView mTvPop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_train );
        initView();
    }

    private void initView() {
        mTvCall = (ImageView) findViewById( R.id.tv_call );
        mTvPj = (TextView) findViewById( R.id.tv_pj );
        mTvTopHomework = (TextView) findViewById( R.id.tv_top_homework );
        mTvJj = (TextView) findViewById( R.id.tv_jj );
        mTvYl = (TextView) findViewById( R.id.tv_yl );
        mTvYy = (TextView) findViewById( R.id.tv_yy );


        mTvPop = (TextView) findViewById( R.id.tv_pop );

        //监听
        mTvPop.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pop = mTvPop.getText().toString();
                Toast.makeText( TrainActivity.this, pop, Toast.LENGTH_SHORT ).show();
            }
        } );

        //监听返回
        mTvCall.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( TrainActivity.this, MainActivity.class ) );
            }
        } );
    }
}