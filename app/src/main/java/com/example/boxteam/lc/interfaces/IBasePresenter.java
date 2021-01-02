package com.example.boxteam.lc.interfaces;

public interface IBasePresenter<V extends IBaseView> {
    //与V连
    void attachView(V view);
    void unAttachView();
}
