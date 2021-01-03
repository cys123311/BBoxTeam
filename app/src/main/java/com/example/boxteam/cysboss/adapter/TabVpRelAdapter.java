package com.example.boxteam.cysboss.adapter;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

/**
 * 用于 复用 Tab 与 Vp 联动
 */
public class TabVpRelAdapter extends FragmentPagerAdapter {

    private List<Fragment> list;
    private String [] title;

    public TabVpRelAdapter(@NonNull FragmentManager fm, List<Fragment> list,String[] title) {
        super(fm);
        this.list = list;
        this.title = title;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
