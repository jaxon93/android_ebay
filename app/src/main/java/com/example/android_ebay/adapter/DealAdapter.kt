package com.example.android_ebay.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android_ebay.R
import com.example.android_ebay.model.Deal

class DealAdapter(var context: Context, var items: ArrayList<Deal>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_deals, parent, false)
        return FavoriteViewHolder(view)
    }

    class FavoriteViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_deals: ImageView
        var tv_deal_title: TextView
        var tv_discount_price: TextView
        var tv_real_price: TextView
        var tv_discount: TextView
        init {
            iv_deals = view.findViewById(R.id.iv_deals)
            tv_deal_title = view.findViewById(R.id.tv_deal_title)
            tv_discount_price = view.findViewById(R.id.tv_discount_price)
            tv_real_price = view.findViewById(R.id.tv_real_price)
            tv_discount = view.findViewById(R.id.tv_discount)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item =items[position]

        if(holder is FavoriteViewHolder) {
            var iv_deals = holder.iv_deals
            var tv_deal_title = holder.tv_deal_title
            var tv_discount_price = holder.tv_discount_price
            var tv_real_price = holder.tv_real_price
            var tv_discount = holder.tv_discount

            iv_deals.setImageResource(item.image)
            tv_deal_title.text = (item.title)
            tv_discount_price.text = (item.discountPrice)
            tv_real_price.text = (item.realPrice)
            tv_discount.text = (item.discount)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}