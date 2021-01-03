package com.example.boxteam.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.boxteam.interfases.IBaseView;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment<P extends BasePresenter> extends Fragment implements IBaseView {

    protected P presenter;
    Unbinder unbinder;
    protected Context mContext;
    protected Activity mActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContext = getContext();
        mActivity = getActivity();
        int layout = getLayout();
        View view = null;
        if(layout <= 0){
            throw new RuntimeException("布局非法");
        }else{
            view = inflater.inflate(layout,container,false);
        }
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        unbinder = ButterKnife.bind(this,view);
        initView();
        presenter = createPresenter();
        if(presenter != null){
            presenter.attachView(this);
        }
        initData();
    }

    protected abstract int getLayout();
    protected abstract void initView();
    protected abstract P createPresenter();
    protected abstract  void initData();

    @Override
    public void showLoading(int visible) {
        Toast.makeText(mContext, "加载数据失败，请检查网络！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showToast(String tips) {

    }

    /**
     * 跳转登录
     */
    protected void gotoLogin(){

    }

    @Override
    public void onDestroy() {
        if(unbinder != null){
            unbinder.unbind();
        }
        if(presenter != null){
            presenter.unAttachView();
        }
        mActivity = null;
        mContext = null;
        super.onDestroy();
    }
}
