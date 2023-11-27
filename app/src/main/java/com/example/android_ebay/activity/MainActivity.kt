package com.example.android_ebay.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_ebay.R
import com.example.android_ebay.adapter.DealAdapter
import com.example.android_ebay.adapter.FavoriteAdapter
import com.example.android_ebay.adapter.WinterProductAdapter
import com.example.android_ebay.model.Deal
import com.example.android_ebay.model.Favorite
import com.example.android_ebay.model.WinterProduct


class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var recyclerView2: RecyclerView
    lateinit var recyclerView3: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    fun initView() {
        recyclerView = findViewById(R.id.recyclerView)
        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = manager

        recyclerView2 = findViewById(R.id.recyclerView2)
        val manager2 = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.layoutManager = manager2

        recyclerView3 = findViewById(R.id.recyclerView3)
        val manager3 = GridLayoutManager(this, 3)
        recyclerView3.layoutManager = manager3

        refreshFavoriteAdapter(getFavorites())
        refreshDealAdapter(getDeals())
        refreshWinterProductAdapter(getWinterProducts())
    }

    private fun getFavorites(): ArrayList<Favorite> {
        val items = ArrayList<Favorite>()

        items.add(Favorite("Apple Watch", R.drawable.ic_product1))
        items.add(Favorite("Apple Watch", R.drawable.ic_product1))
        items.add(Favorite("Apple Watch", R.drawable.ic_product1))
        items.add(Favorite("Apple Watch", R.drawable.ic_product1))
        items.add(Favorite("Apple Watch", R.drawable.ic_product1))
        items.add(Favorite("Apple Watch", R.drawable.ic_product1))
        items.add(Favorite("Apple Watch", R.drawable.ic_product1))
        items.add(Favorite("Apple Watch", R.drawable.ic_product1))
        items.add(Favorite("Apple Watch", R.drawable.ic_product1))
        items.add(Favorite("Apple Watch", R.drawable.ic_product1))
        items.add(Favorite("Apple Watch", R.drawable.ic_product1))
        items.add(Favorite("Apple Watch", R.drawable.ic_product1))

        return items
    }

    private fun getDeals(): ArrayList<Deal> {
        val items = ArrayList<Deal>()

        items.add(Deal(R.drawable.deals_product1, "Bose QuietComfort Earbuds", "$199.00", "$279.00", " - 29% OFF"))
        items.add(Deal(R.drawable.deals_product2, "AKG Y500 Wireless Bluetooth On-ear Headphones with Unicersal", "$39.99", "$149.95", " - 73% OFF"))
        items.add(Deal(R.drawable.deals_product1, "Bose QuietComfort Earbuds", "$199.00", "$279.00", " - 29% OFF"))
        items.add(Deal(R.drawable.deals_product2, "AKG Y500 Wireless Bluetooth On-ear Headphones with Unicersal", "$39.99", "$149.95", " - 73% OFF"))
        items.add(Deal(R.drawable.deals_product1, "Bose QuietComfort Earbuds", "$199.00", "$279.00", " - 29% OFF"))
        items.add(Deal(R.drawable.deals_product2, "AKG Y500 Wireless Bluetooth On-ear Headphones with Unicersal", "$39.99", "$149.95", " - 73% OFF"))
        items.add(Deal(R.drawable.deals_product1, "Bose QuietComfort Earbuds", "$199.00", "$279.00", " - 29% OFF"))
        items.add(Deal(R.drawable.deals_product2, "AKG Y500 Wireless Bluetooth On-ear Headphones with Unicersal", "$39.99", "$149.95", " - 73% OFF"))
        items.add(Deal(R.drawable.deals_product1, "Bose QuietComfort Earbuds", "$199.00", "$279.00", " - 29% OFF"))
        items.add(Deal(R.drawable.deals_product2, "AKG Y500 Wireless Bluetooth On-ear Headphones with Unicersal", "$39.99", "$149.95", " - 73% OFF"))
        return items
    }

    private fun getWinterProducts(): ArrayList<WinterProduct> {
        val items = ArrayList<WinterProduct>()

        items.add(WinterProduct(R.drawable.deals_product1, "Blankets"))
        items.add(WinterProduct(R.drawable.deals_product2, "Earphones"))
        items.add(WinterProduct(R.drawable.deals_product1, "Blankets"))
        items.add(WinterProduct(R.drawable.deals_product2, "Earphones"))
        items.add(WinterProduct(R.drawable.deals_product1, "Blankets"))
        items.add(WinterProduct(R.drawable.deals_product2, "Earphones"))
        items.add(WinterProduct(R.drawable.deals_product1, "Blankets"))
        items.add(WinterProduct(R.drawable.deals_product2, "Earphones"))
        items.add(WinterProduct(R.drawable.deals_product1, "Blankets"))

        return items
    }

    private fun refreshFavoriteAdapter(items: ArrayList<Favorite>) {
        val adapter = FavoriteAdapter(this, items)
        recyclerView.adapter = adapter
    }

    private fun refreshDealAdapter(items: ArrayList<Deal>) {
        val adapter = DealAdapter(this, items)
        recyclerView2.adapter = adapter
    }

    private fun refreshWinterProductAdapter(items: ArrayList<WinterProduct>) {
        val adapter = WinterProductAdapter(this, items)
        recyclerView3.adapter = adapter
    }
}