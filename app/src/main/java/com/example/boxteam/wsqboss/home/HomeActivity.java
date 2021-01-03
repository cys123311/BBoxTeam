package com.example.boxteam.wsqboss.home;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.boxteam.R;
import com.example.boxteam.wsqboss.base.BaseActivity;
import com.example.boxteam.wsqboss.home.homefragment.ui.login.CourseFragment;
import com.example.boxteam.wsqboss.home.homefragment.ui.login.HomeFragment;
import com.example.boxteam.wsqboss.home.homefragment.ui.login.MeFragment;
import com.example.boxteam.wsqboss.interfases.IBasePresenter;
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
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        List<Fragment> list=new ArrayList<>();
        list.add(new HomeFragment());
        list.add(new CourseFragment());
        list.add(new HomeFragment());
        list.add(new MeFragment());

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