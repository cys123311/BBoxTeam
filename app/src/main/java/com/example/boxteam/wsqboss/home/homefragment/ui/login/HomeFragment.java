package com.example.boxteam.wsqboss.home.homefragment.ui.login;


import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.boxteam.R;
import com.example.boxteam.base.BaseFragment;
import com.example.boxteam.base.BasePresenter;
import com.example.boxteam.wsqboss.bean.home.CourseBean;
import com.example.boxteam.wsqboss.bean.home.IntroduceBean;
import com.example.boxteam.wsqboss.bean.home.LiveBean;
import com.example.boxteam.wsqboss.bean.home.OneBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class HomeFragment extends BaseFragment {

    @BindView(R.id.image)
    ImageView image;
    @BindView(R.id.images)
    ImageView images;
    @BindView(R.id.img_events)
    ImageView imgEvents;
    @BindView(R.id.img_train)
    ImageView imgTrain;
    @BindView(R.id.img_common)
    ImageView imgCommon;
    @BindView(R.id.img_train1)
    ImageView imgTrain1;
    @BindView(R.id.rv_introduce)
    RecyclerView rvIntroduce;
    @BindView(R.id.rv_live)
    RecyclerView rvLive;
    @BindView(R.id.rv_course)
    RecyclerView rvCourse;
    @BindView(R.id.rv_one)
    RecyclerView rvOne;
    @BindView(R.id.container)
    ConstraintLayout container;
    private List<IntroduceBean> introduceBeanList;
    private List<LiveBean> liveBeanList;
    private List<CourseBean> courseBeanList;
    private List<OneBean> oneBeanList;

    @Override
    protected BasePresenter createPersenter() {
        return null;
    }

    @Override
    protected void initData() {
        Glide.with(this).load(R.mipmap.jifeng_game).apply(new RequestOptions().transform(new RoundedCorners(10))).into(imgEvents);
        Glide.with(this).load(R.mipmap.jifeng_train2).into(imgTrain1);
    }

    @Override
    protected void initView() {
        introduceBeanList = new ArrayList<>();
        liveBeanList = new ArrayList<>();
        courseBeanList = new ArrayList<>();
        oneBeanList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            introduceBeanList.add(new IntroduceBean(R.mipmap.jifeng_limingle,"李明宇","钢琴","|声乐"));
            liveBeanList.add(new LiveBean(R.mipmap.jifeng_shengyue,"声乐教学-免费60讲","给你来一段巴赫小步舞曲"));
            courseBeanList.add(new CourseBean(R.mipmap.jifeng_miaomiao,"妙妙","5岁","给你来一段巴赫小步舞曲"));
            oneBeanList.add(new OneBean(R.mipmap.jifeng_gangpin));
        }

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void showLoading(int visible) {

    }

    @Override
    public void showToast(String tips) {

    }
}