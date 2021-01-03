package com.example.boxteam.bigboss.rl;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.boxteam.MainActivity;
import com.example.boxteam.R;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RlActivity extends AppCompatActivity {

    @BindView(R.id.image_call)
    ImageView imageCall;
    @BindView(R.id.tl_tab)
    TabLayout tlTab;
    @BindView(R.id.image_head)
    ImageView imageHead;
    @BindView(R.id.calenderView)
    CalendarView calenderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_rl );
        ButterKnife.bind( this );

        initView();


    }

    private void initView() {
        tlTab.addTab( tlTab.newTab().setText( "日历模式" ) );
        tlTab.addTab( tlTab.newTab().setText( "列表模式" ) );


        calenderView = (CalendarView) findViewById(R.id.calenderView);
        //calendarView 监听事件
        calenderView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange( CalendarView view, int year, int month, int dayOfMonth) {
                //显示用户选择的日期
                Toast.makeText( RlActivity.this,year + "年" + month + "月" + dayOfMonth + "日",Toast.LENGTH_SHORT).show();
            }
        });

    }
}