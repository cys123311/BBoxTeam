package com.example.boxteam.interfases;

public interface Callback<T> {

    void success(T data);

    void fail(String err);

}
