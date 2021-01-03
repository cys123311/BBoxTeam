package com.example.boxteam.wsqboss.home.main;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.bigboss.zf.Zf2Activity;
import com.example.boxteam.bigboss.zf.ZfActivity;
import com.example.boxteam.interfases.IBasePresenter;
import com.example.boxteam.lc.IdentifyCodeActivity;
import com.example.boxteam.ui.adapter.DetailsAdapter;
import com.example.boxteam.ui.home.bean.DetailsBean;
import com.example.boxteam.utils.SpUtils;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetailsActivity extends BaseActivity {


    @BindView(R.id.tabMode)
    TabLayout tabMode;
    @BindView(R.id.rv_txt)
    RecyclerView rvTxt;
    @BindView(R.id.prices)
    TextView prices;

    @Override
    protected int getLayout() {
        return R.layout.activity_details;
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void initView() {
        tabMode.addTab(tabMode.newTab().setText("课程介绍"));
        tabMode.addTab(tabMode.newTab().setText("课程目录"));

        List<DetailsBean> list = new ArrayList<>();

        list.add(new DetailsBean(R.mipmap.mianfei));
        list.add(new DetailsBean(R.mipmap.fufei));
        list.add(new DetailsBean(R.mipmap.fufei));
        list.add(new DetailsBean(R.mipmap.fufei));
        list.add(new DetailsBean(R.mipmap.fufei));

        rvTxt.setLayoutManager(new LinearLayoutManager(this));
        DetailsAdapter detailsAdapter = new DetailsAdapter(this, list);
        rvTxt.setAdapter(detailsAdapter);
    }

    @Override
    protected void initData() {

    }


    @OnClick(R.id.prices)
    public void onViewClicked() {
        String name = SpUtils.getInstance().getString("name");
        if (!TextUtils.isEmpty(name)) {
            View root = LayoutInflater.from(DetailsActivity.this).inflate(R.layout.item_pop, null);
            PopupWindow popupWindow = new PopupWindow(root, ViewPager.LayoutParams.MATCH_PARENT, ViewPager.LayoutParams.WRAP_CONTENT);
            popupWindow.setBackgroundDrawable(new ColorDrawable());
            popupWindow.setOutsideTouchable(true);
            TextView price2 = root.findViewById(R.id.price2);
            Button zf = root.findViewById(R.id.btn_zf);
            //监听
            zf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(DetailsActivity.this, Zf2Activity.class));
                }
            });
            SpannableString sp = new SpannableString(price2.getText().toString());
            sp.setSpan(new StrikethroughSpan(), 0, price2.getText().toString().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            price2.setText(sp);
            popupWindow.showAtLocation(prices, Gravity.BOTTOM, 0, 0);
        } else {
            startActivity(new Intent(this, IdentifyCodeActivity.class));
        }
    }
}