package com.example.boxteam.ui;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;


import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.interfases.IBasePresenter;
import com.example.boxteam.ui.course.CourseFragment;
import com.example.boxteam.ui.events.EventsFragment;
import com.example.boxteam.ui.home.Dhz_Activity_Fragment;
import com.example.boxteam.ui.home.HomeFragment;
import com.example.boxteam.ui.me.MeFragment;
import com.google.android.material.tabs.TabLayout;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class HomeActivity extends BaseActivity {


    @BindView(R.id.mcv_pager)
    ViewPager mcvPager;
    @BindView(R.id.tabMode)
    TabLayout tabMode;
    String[] name= {"首页","课程","活动","我的"};
    int[] arr={R.drawable.home,R.drawable.course,R.drawable.special,R.drawable.me};

    @Override
    protected int getLayout() {
        return R.layout.activity_home;
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void initView() {
        List<Fragment> list=new ArrayList<>();
        list.add(new HomeFragment());//首页
        list.add(new CourseFragment());//课程
        list.add(new Dhz_Activity_Fragment());//活动
        list.add(new MeFragment());//我的

        mcvPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });
        tabMode.setupWithViewPager(mcvPager);

        for (int i = 0; i < list.size(); i++) {
            tabMode.getTabAt(i).setText(name[i]).setIcon(arr[i]);
        }
    }

    @Override
    protected void initData() {

    }
}