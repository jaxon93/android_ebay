package com.example.android_ebay_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.android_ebay_java.R;
import com.example.android_ebay_java.model.Deal;

import java.util.ArrayList;

public class DealAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Deal> items;

    public DealAdapter(Context context, ArrayList<Deal> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_deals, parent, false);
        return new FavoriteViewHolder(view);
    }

    public static class FavoriteViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_deals;
        TextView tv_deal_title, tv_discount_price, tv_real_price, tv_discount;

        public FavoriteViewHolder(View view) {
            super(view);
            iv_deals = view.findViewById(R.id.iv_deals);
            tv_deal_title = view.findViewById(R.id.tv_deal_title);
            tv_discount_price = view.findViewById(R.id.tv_discount_price);
            tv_real_price = view.findViewById(R.id.tv_real_price);
            tv_discount = view.findViewById(R.id.tv_discount);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Deal item = items.get(position);

        if (holder instanceof FavoriteViewHolder) {
            FavoriteViewHolder viewHolder = (FavoriteViewHolder) holder;

            viewHolder.iv_deals.setImageResource(item.getImage());
            viewHolder.tv_deal_title.setText(item.getTitle());
            viewHolder.tv_discount_price.setText(item.getDiscountPrice());
            viewHolder.tv_real_price.setText(item.getRealPrice());
            viewHolder.tv_discount.setText(item.getDiscount());
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
