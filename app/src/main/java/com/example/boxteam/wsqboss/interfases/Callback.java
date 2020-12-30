package com.example.boxteam.wsqboss.interfases;

public interface Callback<T> {

    void success(T data);

    void fail(String err);

}
