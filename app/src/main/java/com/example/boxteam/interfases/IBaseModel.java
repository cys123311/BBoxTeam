package com.example.boxteam.interfases;

import io.reactivex.disposables.Disposable;

public interface IBaseModel {

    void addDisposible(Disposable disposable);

    void clear();

}
