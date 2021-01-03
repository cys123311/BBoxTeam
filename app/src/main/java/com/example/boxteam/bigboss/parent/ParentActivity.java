package com.example.boxteam.bigboss.parent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

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
    private Unbinder bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);
        bind = ButterKnife.bind(this);
    }

    @OnClick(R.id.pingjia)
    public void onViewClicked() {
        startActivity(new Intent(this, AskActivity.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }
}