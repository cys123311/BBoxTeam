package com.example.boxteam.bigboss.parent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.boxteam.R;
import com.example.boxteam.bigboss.ask.AskActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class ParentActivity extends AppCompatActivity {

    @BindView(R.id.pingjia)
    Button pingjia;
    @BindView(R.id.image_stop)
    ImageView imageStop;
    @BindView(R.id.image_open)
    ImageView imageOpen;
    @BindView(R.id.tv_parent_stop)
    TextView tvParentStop;
    @BindView(R.id.tv_parent_open)
    TextView tvParentOpen;
    private Unbinder bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_parent );
        bind = ButterKnife.bind( this );
        initView();
    }

    private void initView() {
        imageStop.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageOpen.setVisibility( View.VISIBLE );
                tvParentStop.setVisibility( View.GONE );
                tvParentOpen.setVisibility( View.VISIBLE );

            }
        } );
        imageOpen.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageOpen.setVisibility( View.GONE );
                tvParentStop.setVisibility( View.VISIBLE );
                tvParentOpen.setVisibility( View.GONE );
            }
        } );
    }

    @OnClick(R.id.pingjia)
    public void onViewClicked() {
        startActivity( new Intent( this, AskActivity.class ) );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }
}