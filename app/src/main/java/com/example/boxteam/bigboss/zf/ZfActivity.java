package com.example.boxteam.bigboss.zf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.boxteam.R;

public class ZfActivity extends AppCompatActivity {

    private ImageView img;
    private TextView price2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_zf );
        initView();
    }

    private void initView() {
        img = (ImageView) findViewById( R.id.img );
        price2 = (TextView) findViewById( R.id.price2 );

        SpannableString sp = new SpannableString( price2.getText().toString() );
        sp.setSpan( new StrikethroughSpan(), 0, price2.getText().toString().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
        price2.setText( sp );

        img.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View root = LayoutInflater.from( ZfActivity.this ).inflate( R.layout.item_pop, null );
                PopupWindow popupWindow = new PopupWindow( root, ViewPager.LayoutParams.MATCH_PARENT, ViewPager.LayoutParams.WRAP_CONTENT );
                popupWindow.setBackgroundDrawable( new ColorDrawable() );
                popupWindow.setOutsideTouchable( true );
                TextView price2 = root.findViewById( R.id.price2 );
                Button zf = root.findViewById( R.id.btn_zf );
                //监听
                zf.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity( new Intent( ZfActivity.this,Zf2Activity.class ) );
                    }
                } );
                SpannableString sp = new SpannableString( price2.getText().toString() );
                sp.setSpan( new StrikethroughSpan(), 0, price2.getText().toString().length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
                price2.setText( sp );
                popupWindow.showAtLocation( img, Gravity.BOTTOM, 0, 0 );
            }
        } );
    }
}