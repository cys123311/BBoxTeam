package com.example.boxteam.cysboss.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.boxteam.R;
import com.example.boxteam.cysboss.baen.ScheduleBean;

import java.util.List;

public class SchedileAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<ScheduleBean> list;

    public SchedileAdapter(Context context, List<ScheduleBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View view = View.inflate(context, R.layout.adapter_tacher_item, null);
            return new VH1(view);
        } else {
            View view = View.inflate(context, R.layout.adapter_tacher_item1, null);
            return new VH2(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int type = getItemViewType(position);
        if (type == 0) {

        } else {

        }
    }

    @Override
    public int getItemCount() {
        return list.size() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static
    class VH1 extends RecyclerView.ViewHolder {
        public View rootView;
        public LinearLayout ll;

        public VH1(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.ll = (LinearLayout) rootView.findViewById(R.id.ll);
        }

    }

    public static
    class VH2 extends RecyclerView.ViewHolder {
        public View rootView;
        public TextView tvTopLine;
        public TextView tvDot;
        public RelativeLayout rlTimeline;
        public TextView tvAcceptTime;
        public TextView tvAcceptStation;
        public LinearLayout rlCenter;
        public RatingBar Rb;

        public VH2(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.tvTopLine = (TextView) rootView.findViewById(R.id.tvTopLine);
            this.tvDot = (TextView) rootView.findViewById(R.id.tvDot);
            this.rlTimeline = (RelativeLayout) rootView.findViewById(R.id.rlTimeline);
            this.tvAcceptTime = (TextView) rootView.findViewById(R.id.tvAcceptTime);
            this.tvAcceptStation = (TextView) rootView.findViewById(R.id.tvAcceptStation);
            this.rlCenter = (LinearLayout) rootView.findViewById(R.id.rlCenter);

        }

    }
}
