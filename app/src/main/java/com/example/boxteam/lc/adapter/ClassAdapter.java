package com.example.boxteam.lc.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseAdapter;
import com.example.boxteam.lc.CourseSelection;
import com.example.boxteam.lc.bean.ClassBean;
import com.example.boxteam.lc.bean.GiftMessage;

import java.util.List;

public class ClassAdapter extends BaseAdapter {
    public ClassAdapter(Context context, List<ClassBean> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.item_class;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        ClassBean bean = (ClassBean) data;

        ImageView img_class = (ImageView) vh.getViewById(R.id.img_class);
        TextView class_name = (TextView) vh.getViewById(R.id.class_name);
        ConstraintLayout item_con = (ConstraintLayout) vh.getViewById(R.id.item_con);
        Button btn_see = (Button) vh.getViewById(R.id.btn_see);

        class_name.setText(bean.getName());
        img_class.setImageResource(bean.getPic());

        btn_see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, CourseSelection.class));
//                View inflate = LayoutInflater.from(context).inflate(R.layout.pop_item, null);
//                ImageView iv_pop_pic = inflate.findViewById(R.id.iv_pop_pic);
//                Button btn_class_ok = inflate.findViewById(R.id.btn_class_ok);
//                PopupWindow pw = new PopupWindow(inflate,-1,-1);
//                pw.setOutsideTouchable(true);
//                //叉号
//                iv_pop_pic.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        pw.dismiss();
//                    }
//                });
//                //确定
//                btn_class_ok.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        pw.dismiss();
//                    }
//                });
//                pw.showAtLocation(item_con, Gravity.CENTER,0,0);

            }
        });
    }
}
