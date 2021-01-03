package com.example.boxteam.cysboss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.cysboss.adapter.TaskAdapter;
import com.example.boxteam.cysboss.baen.TaskBean;
import com.example.boxteam.interfases.IBasePresenter;

import java.util.ArrayList;

/**
 * 我的作业
 */
public class TaskActivity extends BaseActivity {

    private RecyclerView rlv_task;
    private ArrayList<TaskBean> list;

    @Override
    protected int getLayout() {
        return R.layout.activity_task;
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void initView() {
        rlv_task = (RecyclerView) findViewById(R.id.rlv_task);
        list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            TaskBean taskBean = new TaskBean();
            taskBean.setImg(R.mipmap.jifeng);
            taskBean.setText("节奏练习");
            taskBean.setTv("声乐系统课-第一节");
            list.add(taskBean);
        }

        rlv_task.setLayoutManager(new LinearLayoutManager(this));
        TaskAdapter taskAdapter = new TaskAdapter(this, list);
        rlv_task.setAdapter(taskAdapter);
    }

    @Override
    protected void initData() {

    }
}