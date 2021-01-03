package com.example.boxteam.bigboss.jf;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseAdapter;

import java.util.List;

import butterknife.BindView;

public class JfAdapter extends BaseAdapter {

    public JfAdapter(Context context, List<JfBean> data) {
        super( context, data );

    }

    @Override
    protected int getLayout(int type) {
        return R.layout.jf_adapter;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        JfBean jfBean = (JfBean) data;
        TextView daty = (TextView) vh.getViewById( R.id.tv_data );
        TextView time = (TextView) vh.getViewById( R.id.tv_time );
        TextView count = (TextView) vh.getViewById( R.id.tv_count );

        daty.setText( jfBean.getData() );
        time.setText( jfBean.getTime() );
        count.setText( jfBean.getCount()+"" );
    }
}
