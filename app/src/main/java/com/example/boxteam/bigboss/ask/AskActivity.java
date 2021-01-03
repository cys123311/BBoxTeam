package com.example.boxteam.bigboss.ask;

import android.content.Intent;
import android.os.Bundle;

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
    private Unbinder bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask);
        bind = ButterKnife.bind(this);


//        Glide.with( this ).load( R.mipmap.a )
//                .apply( new RequestOptions().transform( new SerrationTransformation( AskActivity.this ) ) )
//                .into( ivImage );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }

    @OnClick(R.id.cl_wl)
    public void onViewClicked() {
        startActivity(new Intent(AskActivity.this, RlActivity.class));
    }
}