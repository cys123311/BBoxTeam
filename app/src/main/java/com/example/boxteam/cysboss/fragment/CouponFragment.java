package com.example.boxteam.cysboss.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseFragment;
import com.example.boxteam.base.BasePresenter;
import com.example.boxteam.cysboss.adapter.CouponAdapter;
import com.example.boxteam.cysboss.baen.CouponBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class CouponFragment extends BaseFragment {

    @BindView(R.id.mRec_coupon)
    RecyclerView mRecCoupon;

    @Override
    protected int getLayout() {
        return R.layout.fragment_coupon;
    }

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void initView() {
        mRecCoupon.setLayoutManager(new LinearLayoutManager(getActivity()));
        List<CouponBean> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new CouponBean(
                    "新用户满减抵减红包","两天后到期","50","满2千立减",
                    "新用户专用，满2千减50元仅限小程序内使用","有效期至2021-12-12","立即使用"
            ));
        }
        CouponAdapter couponAdapter = new CouponAdapter(mContext,list);
        mRecCoupon.setAdapter(couponAdapter);
    }

    @Override
    protected void initData() {

    }
}
