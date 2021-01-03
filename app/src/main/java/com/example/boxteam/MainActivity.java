package com.example.boxteam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.boxteam.bigboss.activity.ActivityActivity;
import com.example.boxteam.bigboss.ask.AskActivity;
import com.example.boxteam.bigboss.category.CategoryActivity;
import com.example.boxteam.bigboss.jf.JfActivity;
import com.example.boxteam.bigboss.parent.ParentActivity;
import com.example.boxteam.bigboss.rl.RlActivity;
import com.example.boxteam.bigboss.train.TrainActivity;
import com.example.boxteam.bigboss.zf.ZfActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_big)
    TextView tvBig;
    @BindView(R.id.tv_jf)
    TextView tvJf;
    @BindView(R.id.tv_zf)
    TextView tvZf;
    @BindView(R.id.tv_rl)
    TextView tvRl;
    @BindView(R.id.tv_category)
    TextView tvCategory;
    @BindView(R.id.tv_ask)
    TextView tvAsk;
    @BindView(R.id.tv_activity)
    TextView tvActivity;
    @BindView(R.id.tv_parent)
    TextView tvParent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        ButterKnife.bind( this );

        tvBig.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //火车
                startActivity( new Intent( MainActivity.this, TrainActivity.class ) );


            }
        } );
        tvJf.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //火车
                startActivity( new Intent( MainActivity.this, JfActivity.class ) );
            }
        } );

        tvZf.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( MainActivity.this, ZfActivity.class ) );
            }
        } );

        tvRl.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( MainActivity.this, RlActivity.class ) );
            }
        } );

        tvCategory.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( MainActivity.this, CategoryActivity.class ) );
            }
        } );

        tvAsk.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( MainActivity.this, AskActivity.class ) );
            }
        } );

        tvActivity.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( MainActivity.this, ActivityActivity.class ) );
            }
        } );
        tvParent.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( MainActivity.this, ParentActivity.class ) );
            }
        } );
    }
}