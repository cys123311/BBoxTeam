package com.example.boxteam.ui.course;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseFragment;
import com.example.boxteam.base.BasePresenter;
import com.example.boxteam.ui.adapter.SetAdapter;
import com.example.boxteam.ui.home.bean.SetBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class CourseFragment extends BaseFragment {

    @BindView(R.id.text)
    TextView text;
    @BindView(R.id.rv_set)
    RecyclerView rvSet;
    private List<SetBean> list;
    private SetAdapter setAdapter;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        list = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            list.add(new SetBean(R.mipmap.jifeng_set,"钢琴钢琴钢琴钢琴","99.9","20课","99"));
        }
        rvSet.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        setAdapter = new SetAdapter(getContext(), list);
        rvSet.setAdapter(setAdapter);
    }

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_course;
    }

    @OnClick({R.id.text, R.id.rv_set})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.text:
                break;
            case R.id.rv_set:
                break;
        }
    }
}