package com.example.boxteam.bigboss.jf;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.boxteam.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class JfActivity extends AppCompatActivity {

    @BindView(R.id.tb_tab)
    TabLayout tbTab;
    @BindView(R.id.rv_jf)
    RecyclerView rvJf;
    private JfAdapter jfAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_jf );
        ButterKnife.bind( this );


        tbTab.addTab( tbTab.newTab().setText( "全部" ) );
        tbTab.addTab( tbTab.newTab().setText( "获取" ) );
        tbTab.addTab( tbTab.newTab().setText( "使用" ) );

        ArrayList<JfBean> jfList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JfBean jfBean = new JfBean( "2020-12-12", "12:12:12", 1 );
            jfList.add( jfBean );
        }

        rvJf.setLayoutManager( new LinearLayoutManager( this ) );
        jfAdapter = new JfAdapter(this,jfList);
        rvJf.setAdapter( jfAdapter );




    }
}