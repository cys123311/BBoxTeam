package com.example.boxteam.ui.course;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
    @BindView(R.id.text1)
    TextView text1;
    @BindView(R.id.img1)
    ImageView img1;
    @BindView(R.id.text_layout1)
    RelativeLayout textLayout1;
    @BindView(R.id.text2)
    TextView text2;
    @BindView(R.id.img2)
    ImageView img2;
    @BindView(R.id.text_layout2)
    RelativeLayout textLayout2;
    @BindView(R.id.text3)
    TextView text3;
    @BindView(R.id.img3)
    ImageView img3;
    @BindView(R.id.text_layout3)
    RelativeLayout textLayout3;
    @BindView(R.id.text4)
    TextView text4;
    @BindView(R.id.img4)
    ImageView img4;
    @BindView(R.id.text_layout4)
    RelativeLayout textLayout4;
    private List<SetBean> list;
    private SetAdapter setAdapter;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        list = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            list.add(new SetBean(R.mipmap.jifeng_set, "钢琴钢琴钢琴钢琴", "99.9", "20课", "99"));
        }
        rvSet.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
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

    @OnClick({R.id.text_layout1, R.id.text_layout2, R.id.text_layout3, R.id.text_layout4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.text_layout1:
                delete();
                img1.setVisibility(View.VISIBLE);
                break;
            case R.id.text_layout2:
                delete();
                img2.setVisibility(View.VISIBLE);
                break;
            case R.id.text_layout3:
                delete();

                img3.setVisibility(View.VISIBLE);
                break;
            case R.id.text_layout4:
                delete();
                img4.setVisibility(View.VISIBLE);
                break;
        }
    }
    public void delete() {

        img1.setVisibility(View.GONE);
        img2.setVisibility(View.GONE);
        img3.setVisibility(View.GONE);
        img4.setVisibility(View.GONE);
    }


}