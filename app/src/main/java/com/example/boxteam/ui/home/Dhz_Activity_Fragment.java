package com.example.boxteam.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.boxteam.R;
import com.example.boxteam.ui.adapter.SignAdapter;
import com.example.boxteam.ui.home.bean.DhzSignBean;

import java.util.ArrayList;

public class Dhz_Activity_Fragment extends Fragment {
    private TextView dd_activity_newActivity1;
    private TextView dd_activity_more1;
    private ImageView dd_activity_huodong1;
    private TextView dd_activity_newActivity2;
    private TextView dd_activity_more2;
    private RecyclerView dd_activity_recy;
    private ArrayList<DhzSignBean> signList;
    private SignAdapter signAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.dd_activity_fragment, null);
        dd_activity_newActivity1 = view.findViewById(R.id.dd_activity_newActivity1);
        dd_activity_more1 = view.findViewById(R.id.dd_activity_more1);
        dd_activity_huodong1 = view.findViewById(R.id.dd_activity_huodong1);
        dd_activity_newActivity2 = view.findViewById(R.id.dd_activity_newActivity2);
        dd_activity_more2 = view.findViewById(R.id.dd_activity_more2);
        dd_activity_recy = view.findViewById(R.id.dd_activity_recy);
        signList = new ArrayList<>();
        initSign();

        initData();

        return view;
    }

    private void initData() {
        DhzSignBean dhzSignBean = new DhzSignBean("");
        for (int i = 0; i < 10; i++) {
            signList.add(dhzSignBean);
            signAdapter.notifyDataSetChanged();
        }
    }

    private void initSign() {
        dd_activity_recy.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        signAdapter = new SignAdapter(signList, getActivity());
        dd_activity_recy.setAdapter(signAdapter);
    }
}
