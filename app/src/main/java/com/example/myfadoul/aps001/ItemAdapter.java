package com.example.myfadoul.aps001;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by AYOUB on 20/10/2018.
 */

public class ItemAdapter extends BaseAdapter {
    private String[] items;
    private Context context;

    public ItemAdapter(String[] items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v= LayoutInflater.from(context).inflate(R.layout.rows,null,false);

        TextView textView=v.findViewById(R.id.textView3);
        ImageView imageView=v.findViewById(R.id.imageViewr);

        textView.setText(items[i]);
        if(Globals.ImagesIds.length>i)
            imageView.setImageResource(Globals.ImagesIds[i]);
        return v;
    }
}
