package com.hema.www.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/4/18.
 */
public class MyGridAdapter extends BaseAdapter{
    private Context mContext;

    private String[] titles;

    private int[] imgs = {
            R.drawable.c1,
            R.drawable.c2,
            R.drawable.c3,
            R.drawable.c4, R.drawable.c5, R.drawable.c6, R.drawable.c7, R.drawable.c8};

    public MyGridAdapter(Context context) {
        mContext = context;
        titles = context.getResources().getStringArray(R.array.titlearr);
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(
                    R.layout.grid_item, parent, false);
        }

        TextView tv = BaseViewHolder.get(convertView, R.id.tv_item);
        ImageView iv = BaseViewHolder.get(convertView, R.id.iv_item);

        tv.setText(titles[position]);
        iv.setBackgroundResource(imgs[position]);

        return convertView;
    }
}
