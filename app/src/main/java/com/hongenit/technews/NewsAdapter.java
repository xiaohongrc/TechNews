package com.hongenit.technews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by hongenit on 2018/3/16.
 */

public class NewsAdapter extends BaseAdapter implements View.OnClickListener {
    private final LayoutInflater mLayoutInflater;
    private Context mContext;
    private ArrayList<NewsData.ShowapiResBodyBean.PagebeanBean.ContentlistBean> mData;

    public NewsAdapter(Context context, ArrayList<NewsData.ShowapiResBodyBean.PagebeanBean.ContentlistBean> data) {
        mData = data;
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHoler holder = null;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.item_news, parent, false);
            holder = new ViewHoler(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHoler) convertView.getTag();

        }

        NewsData.ShowapiResBodyBean.PagebeanBean.ContentlistBean bean = mData.get(position);
        holder.tv_title.setText(bean.getTitle());
        holder.tv_date.setText(bean.getPubTime());
        holder.tv_desc.setText(bean.getDesc());
        holder.iv_choose.setVisibility(bean.isChoosed() ? View.VISIBLE : View.GONE);
//        convertView.setOnClickListener(this);

        return convertView;
    }

    @Override
    public void onClick(View v) {

    }

    class ViewHoler {
        public ViewHoler(View convertView) {
            tv_title = convertView.findViewById(R.id.tv_title);
            tv_desc = convertView.findViewById(R.id.tv_desc);
            tv_date = convertView.findViewById(R.id.tv_date);
            iv_choose = convertView.findViewById(R.id.iv_choose);

        }

        private TextView tv_title;
        private TextView tv_date;
        private TextView tv_desc;
        private ImageView iv_choose;
    }

}
