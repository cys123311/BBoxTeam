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
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.boxteam.custom.PileLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

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
        initPraises();

    }

    public void initPraises() {
        PileLayout pileLayout = findViewById(R.id.pile_layout);
        List<Integer> list= new ArrayList<>();
        list.add(R.mipmap.jifeng_game);
        list.add(R.mipmap.jifeng_limingle);
        list.add(R.mipmap.jifeng_shengyue);
        list.add(R.mipmap.ic_triangle);
        list.add(R.mipmap.ic_tag);
        LayoutInflater inflater = LayoutInflater.from(this);
        for (int i = 0; i < list.size(); i++) {
            ImageView imageView = (ImageView) inflater.inflate(R.layout.item_praise, pileLayout, false);
            Glide.with(this).load(list.get(i)).into(imageView);
            pileLayout.addView(imageView);
        }
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