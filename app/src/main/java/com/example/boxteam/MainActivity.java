package com.example.boxteam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.boxteam.custom.PileLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

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