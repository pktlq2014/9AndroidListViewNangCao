package com.example.a9androidlistviewnangcao;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TraiCayAdapter extends BaseAdapter
{
    private Context context;
    private int layout;
    private ArrayList<TraiCay> arrayList;

    public TraiCayAdapter(Context context, int layout, ArrayList<TraiCay> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount()
    {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }
    private class viewHolder
    {
        ImageView imageView1;
        TextView textView1, textView2;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        viewHolder viewHolder;
        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            viewHolder = new viewHolder();
            viewHolder.textView1 = convertView.findViewById(R.id.textView1);
            viewHolder.textView2 = convertView.findViewById(R.id.textView2);
            viewHolder.imageView1 = convertView.findViewById(R.id.imageView1);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (TraiCayAdapter.viewHolder) convertView.getTag();
        }
        TraiCay traiCay = arrayList.get(position);
        viewHolder.textView1.setText(traiCay.getTen());
        viewHolder.textView2.setText(traiCay.getMoTa());
        viewHolder.imageView1.setImageResource(traiCay.getHinhAnh());
        return convertView;
    }
}
