package com.example.boxteam.bigboss.ask;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.boxteam.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AskActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_ask );
        ButterKnife.bind( this );



//        Glide.with( this ).load( R.mipmap.a )
//                .apply( new RequestOptions().transform( new SerrationTransformation( AskActivity.this ) ) )
//                .into( ivImage );
    }


}