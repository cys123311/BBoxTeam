package com.example.boxteam.cysboss.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.boxteam.R;
import com.example.boxteam.base.BaseAdapter;
import com.example.boxteam.cysboss.baen.TaskBean;
import com.example.boxteam.utils.TxtUtils;


import java.util.List;

public class TaskAdapter extends BaseAdapter {

    private ImageView tv_zwx_work_remark_on_head_img;
    private TextView tv_zwx_work_remark_on_head_title;
    private TextView tv_task_text;

    public TaskAdapter(Context context, List Data) {
        super(context, Data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.layout_task_item;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        ImageView tv_zwx_work_remark_on_head_img = (ImageView) vh.getViewById(R.id.tv_zwx_work_remark_on_head_img);
        TextView tv_zwx_work_remark_on_head_title = (TextView) vh.getViewById(R.id.tv_zwx_work_remark_on_head_title);
        TextView tv_task_text = (TextView) vh.getViewById(R.id.tv_task_text);

        TaskBean taskBean = (TaskBean) data;

        Glide.with(context).load(((TaskBean) data).getImg()).into(tv_zwx_work_remark_on_head_img);
        TxtUtils.setTextView(tv_zwx_work_remark_on_head_title,taskBean.getText());
        TxtUtils.setTextView(tv_task_text,taskBean.getTv());
    }
}
