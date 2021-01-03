package com.example.boxteam.lc.interfaces;

import io.reactivex.disposables.Disposable;

public interface IBaseModel {
    void addDisposable(Disposable disposable);
    void clear();
}
