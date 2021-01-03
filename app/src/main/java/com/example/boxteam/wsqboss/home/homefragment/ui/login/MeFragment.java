package com.example.boxteam.wsqboss.home.homefragment.ui.login;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.boxteam.R;
import com.example.boxteam.wsqboss.base.BaseFragment;
import com.example.boxteam.wsqboss.base.BasePresenter;
import com.example.boxteam.wsqboss.home.main.CollectActivity;
import com.example.boxteam.wsqboss.home.main.SetActivity;

import butterknife.BindView;
import butterknife.OnClick;


public class MeFragment extends BaseFragment {


    @BindView(R.id.img_do)
    ImageView imgDo;
    @BindView(R.id.txt_name)
    TextView txtName;
    @BindView(R.id.img_header)
    ImageView imgHeader;
    @BindView(R.id.img_back)
    ImageView imgBack;
    @BindView(R.id.collect)
    RelativeLayout collect;
    @BindView(R.id.set)
    RelativeLayout set;

    @Override
    protected BasePresenter createPersenter() {
        return null;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        Glide.with(getActivity()).load(R.mipmap.jifeng_me_beijing).apply(new RequestOptions().transform(new RoundedCorners(20))).into(imgBack);
        Glide.with(getActivity()).load(R.mipmap.header).apply(new RequestOptions().transform(new RoundedCorners(50))).into(imgHeader);

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_me;
    }

    @Override
    public void showLoading(int visible) {

    }

    @Override
    public void showToast(String tips) {

    }

    @OnClick({R.id.collect,R.id.set})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.collect:
                startActivity(new Intent(getActivity(), CollectActivity.class));
                break;
            case R.id.set:
                startActivity(new Intent(getActivity(), SetActivity.class));
                break;

        }
    }

}