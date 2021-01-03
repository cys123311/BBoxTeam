package com.example.boxteam.cysboss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.cysboss.adapter.SchedileAdapter;
import com.example.boxteam.cysboss.baen.ScheduleBean;
import com.example.boxteam.interfases.IBasePresenter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 课程表 小提琴 架子鼓 钢琴
 */
public class ScheduleActivity extends BaseActivity {


    @BindView(R.id.tv_schedule)
    TextView tvSchedule;
    @BindView(R.id.ll_addTab_schedule)
    LinearLayout llAddTabSchedule;
    @BindView(R.id.mTab_schedule)
    TabLayout mTabSchedule;
    @BindView(R.id.mRec_schedule)
    RecyclerView mRecSchedule;

    @Override
    protected int getLayout() {
        return R.layout.activity_schedule;
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void initView() {
        //初始化 Tab 自定义 Tab 小提琴、架子鼓、钢琴
        initTabAbb();
        //适配器 课程
        initTabList();
        mTabSchedule.addTab(mTabSchedule.newTab().setText("一对一"));
        mTabSchedule.addTab(mTabSchedule.newTab().setText("录播课"));
        mTabSchedule.addTab(mTabSchedule.newTab().setText("直播课"));
    }



    @Override
    protected void initData() {

    }

    //初始化 Tab 自定义 Tab 小提琴、架子鼓、钢琴
    private void initTabAbb() {
        String[] addTitle = {"小提琴", "架子鼓", "钢琴"};
        for (int i = 0; i < 3; i++) {
            View view = LayoutInflater.from(this).inflate(R.layout.layout_add_tab, (LinearLayout) llAddTabSchedule, false);
            TextView tv_tab_title = view.findViewById(R.id.tv_tab_title);
            TextView tv_line = view.findViewById(R.id.tv_line);
            ImageView iv_triangle = view.findViewById(R.id.iv_triangle);
            if (i==2){
                tv_line.setVisibility(View.GONE);
            }
            if (i==0){
                iv_triangle.setVisibility(View.VISIBLE);
            }
            tv_tab_title.setText(addTitle[i]);
            llAddTabSchedule.addView(view);
            view.setTag(view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    View tag = (View) view.getTag();
                    ImageView triangle = tag.findViewById(R.id.iv_triangle);
                    triangle.setVisibility(View.VISIBLE);
                }
            });
        }
    }

    private void initTabList() {
        List<ScheduleBean> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new ScheduleBean("title1","title1",
                    "title1",1
                    ));
        }
        mRecSchedule.setLayoutManager(new LinearLayoutManager(this));
        SchedileAdapter schedileAdapter = new SchedileAdapter(this, list);
        mRecSchedule.setAdapter(schedileAdapter);
    }
}