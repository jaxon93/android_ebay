package com.example.android_ebay_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.android_ebay_java.R;
import com.example.android_ebay_java.model.WinterProduct;

import java.util.ArrayList;

public class WinterProductAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<WinterProduct> items;

    public WinterProductAdapter(Context context, ArrayList<WinterProduct> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_winter, parent, false);
        return new WinterProductViewHolder(view);
    }

    public static class WinterProductViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_image;
        TextView tv_title;

        public WinterProductViewHolder(View view) {
            super(view);
            iv_image = view.findViewById(R.id.iv_winter);
            tv_title = view.findViewById(R.id.tv_winter_title);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        WinterProduct item = items.get(position);

        if (holder instanceof WinterProductViewHolder) {
            WinterProductViewHolder viewHolder = (WinterProductViewHolder) holder;

            viewHolder.iv_image.setImageResource(item.getImage());
            viewHolder.tv_title.setText(item.getTitle());
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}

