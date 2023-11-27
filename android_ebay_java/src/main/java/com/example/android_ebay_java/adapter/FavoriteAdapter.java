package com.example.android_ebay_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.android_ebay_java.R;
import com.example.android_ebay_java.model.Favorite;

import java.util.ArrayList;

public class FavoriteAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Favorite> items;

    public FavoriteAdapter(Context context, ArrayList<Favorite> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_feed_favorite, parent, false);
        return new FavoriteViewHolder(view);
    }

    public static class FavoriteViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_image;
        TextView tv_title;

        public FavoriteViewHolder(View view) {
            super(view);
            iv_image = view.findViewById(R.id.iv_image);
            tv_title = view.findViewById(R.id.tv_title);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Favorite item = items.get(position);

        if (holder instanceof FavoriteViewHolder) {
            FavoriteViewHolder viewHolder = (FavoriteViewHolder) holder;

            viewHolder.iv_image.setImageResource(item.getImage());
            viewHolder.tv_title.setText(item.getTitle());
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
