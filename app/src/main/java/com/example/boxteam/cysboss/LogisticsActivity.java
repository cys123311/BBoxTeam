package com.example.boxteam.cysboss;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.cysboss.adapter.TraceListAdapter;
import com.example.boxteam.cysboss.baen.TraceBean;
import com.example.boxteam.interfases.IBasePresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * 物流详情 展示  时间轴
 */

public class LogisticsActivity extends BaseActivity {

    @BindView(R.id.iv_return)
    ImageView ivReturn;
    @BindView(R.id.tv_tool_title)
    TextView tvToolTitle;
    @BindView(R.id.iv_more)
    ImageView ivMore;
    @BindView(R.id.iv_share)
    ImageView ivShare;
    @BindView(R.id.tv_logistics_num)
    TextView tvLogisticsNum;
    @BindView(R.id.tv_logistics_odd)
    TextView tvLogisticsOdd;
    @BindView(R.id.mRec_logistics)
    RecyclerView mRecLogistics;

    private List<TraceBean> traceList = new ArrayList<>();
    private TraceListAdapter adapter;

    @Override
    protected int getLayout() {
        return R.layout.activity_logistics;
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        // 模拟一些假的数据
        traceList.add(new TraceBean("2016-05-25 17:48:00", "[沈阳市] [沈阳和平五部]的派件已签收 感谢使用中通快递,期待再次为您服务!"));
        traceList.add(new TraceBean("2016-05-25 14:13:00", "[沈阳市] [沈阳和平五部]的东北大学代理点正在派件 电话:18040xxxxxx 请保持电话畅通、耐心等待"));
        traceList.add(new TraceBean("2016-05-25 13:01:04", "[沈阳市] 快件到达 [沈阳和平五部]"));
        traceList.add(new TraceBean("2016-05-25 12:19:47", "[沈阳市] 快件离开 [沈阳中转]已发往[沈阳和平五部]"));
        traceList.add(new TraceBean("2016-05-25 11:12:44", "[沈阳市] 快件到达 [沈阳中转]"));
        traceList.add(new TraceBean("2016-05-24 03:12:12", "[嘉兴市] 快件离开 [杭州中转部]已发往[沈阳中转]"));
        traceList.add(new TraceBean("2016-05-23 21:06:46", "[杭州市] 快件到达 [杭州汽运部]"));
        traceList.add(new TraceBean("2016-05-23 18:59:41", "[杭州市] 快件离开 [杭州乔司区]已发往[沈阳]"));
        traceList.add(new TraceBean("2016-05-23 18:35:32", "[杭州市] [杭州乔司区]的市场部已收件 电话:18358xxxxxx"));
        adapter = new TraceListAdapter(this, traceList);
        mRecLogistics.setLayoutManager(new LinearLayoutManager(this));
        mRecLogistics.setAdapter(adapter);
    }
}