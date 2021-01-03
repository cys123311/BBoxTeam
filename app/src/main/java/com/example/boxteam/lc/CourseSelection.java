package com.example.boxteam.lc;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import com.bigkoo.pickerview.adapter.ArrayWheelAdapter;
import com.contrarywind.listener.OnItemSelectedListener;
import com.contrarywind.view.WheelView;
import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.interfases.IBasePresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
 * 一对一课程
 * */
public class CourseSelection extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.content_input)
    ConstraintLayout contentInput;
    @BindView(R.id.bnt_ok)
    Button bntOk;
    @BindView(R.id.layout_time)
    ConstraintLayout layoutTime;

    @Override
    protected int getLayout() {
        return R.layout.activity_courseselection;
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
//                startActivity(new Intent(CourseSelection.this,CourseFigure.class));
                break;
        }
    }

    @OnClick(R.id.layout_time)
    public void onViewClicked() {
        View root = LayoutInflater.from(this).inflate(R.layout.activity_book_one_to_one_layout, null);
        PopupWindow popupWindow = new PopupWindow(root, ViewPager.LayoutParams.MATCH_PARENT, ViewPager.LayoutParams.MATCH_PARENT);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        popupWindow.setOutsideTouchable(true);
        popupWindow.showAtLocation(root, Gravity.BOTTOM, 0, 0);
        WheelView wheelView = root.findViewById(R.id.wheel_view);
        WheelView wheelView2 = root.findViewById(R.id.wheel_view2);
        WheelView wheelView3 = root.findViewById(R.id.wheel_view3);
        WheelView wheelView4 = root.findViewById(R.id.wheel_view4);
        TextView btn = root.findViewById(R.id.sure_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });

        setWheelView(wheelView);
        setWheelView(wheelView2);
        setWheelView(wheelView3);
        setWheelView(wheelView4);

    }

    private void setWheelView(WheelView wheelView) {
        wheelView.setCyclic(false);
        final List<String> mOptionsItems = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            if (i < 10) {
                mOptionsItems.add("0" + i + ":00");
                mOptionsItems.add("0" + i + ":30");
            } else {
                mOptionsItems.add(i + ":00");
                mOptionsItems.add(i + ":30");
            }
        }
        wheelView.setDividerColor(Color.parseColor("#00000000"));
        wheelView.setItemsVisibleCount(12);
        wheelView.setLineSpacingMultiplier(100);
        wheelView.setTextSize(12);
        wheelView.setTextColorCenter(Color.parseColor("#000000"));
        wheelView.setTextColorOut(Color.parseColor("#333333"));
        wheelView.setAdapter(new ArrayWheelAdapter(mOptionsItems));

        wheelView.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(int index) {
                Toast.makeText(CourseSelection.this, "" + mOptionsItems.get(index), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
