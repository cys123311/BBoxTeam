package com.example.boxteam.lc.splace;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.boxteam.MainActivity;
import com.example.boxteam.R;
import com.example.boxteam.lc.JobCardActivity;

import java.lang.ref.WeakReference;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplaceFragment extends Fragment {
    @BindView(R.id.img)
    ImageView img;
    @BindView(R.id.txt_come)
    TextView txtCome;
    private int index;
    private static int time = 4;
    public static SplaceFragment getInstance(int index){
        SplaceFragment fragment = new SplaceFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("index",index);
        fragment.setArguments(bundle);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_splace, null);
        return inflate;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this,view);
        time = 4;
        index = getArguments().getInt("index");
        int resId = 0;
        if(index == 1){
            resId = R.drawable.first1;
        }else if(index == 2){
            resId = R.drawable.first2;
        }else if(index == 3){
            resId = R.drawable.first3;
        }
        img.setImageResource(resId);
        if(index == 3){
            startTime();
            txtCome.setVisibility(View.VISIBLE);
        }else{
            txtCome.setVisibility(View.GONE);
        }
    }

    private MyHandler myHndler = new MyHandler(this);

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Log.i("TAG",Thread.currentThread().getName());
            time--;
            if(time < 0){
                Intent intent = new Intent(getContext(), JobCardActivity.class);
                getActivity().startActivity(intent);
                getActivity().finish();
            }else{
                Message msg = new Message();
                msg.what = 1;
                msg.obj = time;
                myHndler.sendMessage(msg);
                //只有页面在显示的情况下继续倒计时
                myHndler.postDelayed(runnable,1000);
            }
        }
    };
    private void startTime() {
        myHndler.postDelayed(runnable,1000);
    }

    static class MyHandler extends Handler {

        WeakReference<SplaceFragment> weakReference;
        SplaceFragment splaceFragment;

        public MyHandler(SplaceFragment fragment) {
            weakReference = new WeakReference<SplaceFragment>(fragment);
            splaceFragment = weakReference.get();
        }

        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    splaceFragment.setTime(String.valueOf(msg.obj));
                    break;
            }
        }
    }
    private void setTime(String str) {
        txtCome.setText(str);
    }
}
