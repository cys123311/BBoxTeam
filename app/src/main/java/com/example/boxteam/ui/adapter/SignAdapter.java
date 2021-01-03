package com.example.boxteam.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.boxteam.R;
import com.example.boxteam.ui.home.bean.DhzSignBean;
import com.example.boxteam.wsqboss.home.main.HotActivity;

import java.util.ArrayList;

public class SignAdapter extends RecyclerView.Adapter {
    private ArrayList<DhzSignBean> signList;
    private Context context;

    public SignAdapter(ArrayList<DhzSignBean> signList, Context context) {
        this.signList = signList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dhz_activity_sign_item, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder holder1 = (ViewHolder) holder;
        Glide.with(context).load(signList.get(position).getImg()).into(holder1.dd_activity_sing);

        holder1.dd_activity_sing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, HotActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return signList.size();
    }

    public static
    class ViewHolder extends RecyclerView.ViewHolder{
        public View rootView;
        public ImageView dd_activity_sing;

        public ViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.dd_activity_sing = (ImageView) rootView.findViewById(R.id.dd_activity_sign);
        }

    }
}
