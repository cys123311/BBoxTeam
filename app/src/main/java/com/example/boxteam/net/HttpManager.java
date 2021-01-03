package com.example.boxteam.net;

import com.example.boxteam.utils.SpUtils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpManager {
    private static HttpManager httpManager;

    public static HttpManager getHttpManager() {
        if (httpManager==null){
            synchronized (HttpManager.class){
                if (httpManager==null){
                    httpManager = new HttpManager();
                }
            }
        }
        return httpManager;
    }




    public Retrofit getRetrofit(String url){
        return new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .client(getOk())
                .build();

    }


    private OkHttpClient getOk() {
        return new OkHttpClient.Builder()
                .addInterceptor(new HeaderInterceptor())
                .build();
    }





    private class HeaderInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request build = chain.request().newBuilder()
                    .addHeader("Authorization","APPCODE 964e16aa1ae944e9828e87b8b9fbd30a")
                    .addHeader("X-Nideshop-Token", SpUtils.getInstance().getString("token"))
                    .build();

            return chain.proceed(build);
        }
    }

}
