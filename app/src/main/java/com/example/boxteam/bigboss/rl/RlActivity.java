package com.example.boxteam.bigboss.rl;

import android.content.Intent;
import android.widget.CalendarView;
import android.widget.Toast;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.interfases.IBasePresenter;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;

public class RlActivity extends BaseActivity {

//    @BindView(R.id.image_call)
//    ImageView imageCall;
    @BindView(R.id.tl_tab)
    TabLayout tlTab;
//    @BindView(R.id.image_head)
//    ImageView imageHead;
    @BindView(R.id.calenderView)
    CalendarView calenderView;

    @Override
    protected int getLayout() {
        return R.layout.activity_rl;
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void initView() {
        tlTab.addTab( tlTab.newTab().setText( "日历模式" ) );
        tlTab.addTab( tlTab.newTab().setText( "列表模式" ) );

        calenderView = (CalendarView) findViewById(R.id.calenderView);
        //calendarView 监听事件
        calenderView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange( CalendarView view, int year, int month, int dayOfMonth) {
                //显示用户选择的日期
                Toast.makeText( RlActivity.this,year + "年" + month + "月" + dayOfMonth + "日",Toast.LENGTH_SHORT).show();
                Intent intent = getIntent();
                intent.putExtra( "ask", year + "-" + month + "-" + dayOfMonth);
                setResult( 2,intent );
                finish();
            }
        });

    }

    @Override
    protected void initData() {

    }
}