package com.example.boxteam.bigboss.zf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.boxteam.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Zf2Activity extends AppCompatActivity {

    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.view)
    View view;
    @BindView(R.id.img)
    ImageView img;
    @BindView(R.id.view2)
    View view2;
    @BindView(R.id.price)
    TextView price;
    @BindView(R.id.money)
    TextView money;
    @BindView(R.id.sum)
    TextView sum;
    @BindView(R.id.money2)
    TextView money2;
    @BindView(R.id.btn_zfs)
    Button btnZf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_zf2 );
        ButterKnife.bind( this );

        //支付
        btnZf.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( Zf2Activity.this,Zf3Activity.class ) );
            }
        } );
    }
}