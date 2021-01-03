package com.example.boxteam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }
}