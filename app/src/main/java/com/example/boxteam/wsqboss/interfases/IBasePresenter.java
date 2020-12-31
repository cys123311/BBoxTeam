package com.example.boxteam.wsqboss.interfases;

public interface IBasePresenter<V extends IBaseView> {

    void attachView(V view);

    void unAttachView();

}
