package com.example.boxteam.cysboss;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.widget.ImageView;

/**
 * 直播
 */
import com.bumptech.glide.Glide;
import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.custom.PileLayout;
import com.example.boxteam.interfases.IBasePresenter;
import com.example.boxteam.ui.adapter.LiveAdapter;
import com.example.boxteam.ui.home.bean.LiveBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class LiveActivity extends BaseActivity {

    @BindView(R.id.live_rlv)
    RecyclerView liveRlv;
    @BindView(R.id.live_pile_layout)
    PileLayout livePileLayout;

    private ArrayList<String> mDatas;
    private ArrayList<LiveBean> liveBeans;
    private LiveAdapter liveAdapter;

    @Override
    protected int getLayout() {
        return R.layout.activity_live;
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void initView() {
        liveRlv.setLayoutManager(new LinearLayoutManager(this));
        liveBeans = new ArrayList<>();
        LiveBean liveBean = new LiveBean();

        for (int i = 0; i < 10; i++) {
            liveBean.setName("音乐人生");
            liveBean.setText("我来了");
            liveBeans.add(liveBean);
            liveAdapter = new LiveAdapter(this, liveBeans);
            liveRlv.setAdapter(liveAdapter);
        }

        initPraises();
    }

    @Override
    protected void initData() {

    }

    public void initPraises() {
        List<Integer> list = new ArrayList<>();
        list.add(R.mipmap.xiaoyu_live_transmit);
        list.add(R.mipmap.xiaoyu_liveone_camera);
        list.add(R.mipmap.xiaoyu_liveone_full);
        list.add(R.mipmap.xiaoyu_live_send);
        list.add(R.mipmap.xiaoyu_liveone_camera);
        LayoutInflater inflater = LayoutInflater.from(this);
        for (int i = 0; i < list.size(); i++) {
            ImageView imageView = (ImageView) inflater.inflate(R.layout.item_praise, livePileLayout, false);
            Glide.with(this).load(list.get(i)).into(imageView);
            livePileLayout.addView(imageView);
        }

    }
}