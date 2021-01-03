package com.example.boxteam;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.boxteam.wsqboss.home.HomeActivity;
import com.example.boxteam.wsqboss.home.main.DetailsActivity;
import com.example.boxteam.wsqboss.home.main.HotActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text)
    TextView text;
    @BindView(R.id.text_hot)
    TextView textHot;
    @BindView(R.id.text_details)
    TextView textDetails;
    private Unbinder bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind = ButterKnife.bind(this);
        initView();
        int i = 0;

        Log.e("111", "ok");
    }

    private void initView() {
        text.setOnClickListener(this::onViewClicked);
        textHot.setOnClickListener(this::onViewClicked);
        textDetails.setOnClickListener(this::onViewClicked);
    }

    @OnClick({R.id.text, R.id.text_hot})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.text:
                startActivity(new Intent(MainActivity.this, HomeActivity.class));

                break;
            case R.id.text_hot:
                startActivity(new Intent(MainActivity.this, HotActivity.class));
                break;
            case R.id.text_details:
                startActivity(new Intent(MainActivity.this, DetailsActivity.class));
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }
}