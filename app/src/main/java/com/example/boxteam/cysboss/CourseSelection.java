package com.example.boxteam.cysboss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.interfases.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CourseSelection extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.content_input)
    ConstraintLayout contentInput;
    @BindView(R.id.bnt_ok)
    Button bntOk;

    @Override
    protected int getLayout() {
        return R.layout.activity_course_selection;
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }


    @Override
    protected void initView() {
        bntOk.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bnt_ok:
//                startActivity(new Intent(CourseSelection.this, CourseFigure.class));
                break;
        }
    }
}