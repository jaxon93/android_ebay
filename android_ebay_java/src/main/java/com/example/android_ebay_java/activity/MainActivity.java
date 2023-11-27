package com.example.android_ebay_java.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android_ebay_java.R;
import com.example.android_ebay_java.adapter.DealAdapter;
import com.example.android_ebay_java.adapter.FavoriteAdapter;
import com.example.android_ebay_java.adapter.WinterProductAdapter;
import com.example.android_ebay_java.model.Deal;
import com.example.android_ebay_java.model.Favorite;
import com.example.android_ebay_java.model.WinterProduct;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;
    private RecyclerView recyclerView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(manager);

        recyclerView2 = findViewById(R.id.recyclerView2);
        LinearLayoutManager manager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(manager2);

        recyclerView3 = findViewById(R.id.recyclerView3);
        GridLayoutManager manager3 = new GridLayoutManager(this, 3);
        recyclerView3.setLayoutManager(manager3);

        refreshFavoriteAdapter(getFavorites());
        refreshDealAdapter(getDeals());
        refreshWinterProductAdapter(getWinterProducts());
    }

    private ArrayList<Favorite> getFavorites() {
        ArrayList<Favorite> items = new ArrayList<>();

        items.add(new Favorite("Apple Watch", R.drawable.ic_product1));
        items.add(new Favorite("Apple Watch", R.drawable.ic_product1));
        items.add(new Favorite("Apple Watch", R.drawable.ic_product1));
        items.add(new Favorite("Apple Watch", R.drawable.ic_product1));
        items.add(new Favorite("Apple Watch", R.drawable.ic_product1));
        items.add(new Favorite("Apple Watch", R.drawable.ic_product1));
        items.add(new Favorite("Apple Watch", R.drawable.ic_product1));
        items.add(new Favorite("Apple Watch", R.drawable.ic_product1));
        items.add(new Favorite("Apple Watch", R.drawable.ic_product1));
        items.add(new Favorite("Apple Watch", R.drawable.ic_product1));
        items.add(new Favorite("Apple Watch", R.drawable.ic_product1));
        items.add(new Favorite("Apple Watch", R.drawable.ic_product1));
        items.add(new Favorite("Apple Watch", R.drawable.ic_product1));
        // Add other items...

        return items;
    }

    private ArrayList<Deal> getDeals() {
        ArrayList<Deal> items = new ArrayList<>();

        items.add(new Deal(R.drawable.deals_product1, "Bose QuietComfort Earbuds", "$199.00", "$279.00", " - 29% OFF"));
        items.add(new Deal(R.drawable.deals_product2, "AKG Y500 Wireless Bluetooth On-ear Headphones with Unicersal", "$39.99", "$149.95", " - 73% OFF"));
        items.add(new Deal(R.drawable.deals_product1, "Bose QuietComfort Earbuds", "$199.00", "$279.00", " - 29% OFF"));
        items.add(new Deal(R.drawable.deals_product2, "AKG Y500 Wireless Bluetooth On-ear Headphones with Unicersal", "$39.99", "$149.95", " - 73% OFF"));
        items.add(new Deal(R.drawable.deals_product1, "Bose QuietComfort Earbuds", "$199.00", "$279.00", " - 29% OFF"));
        items.add(new Deal(R.drawable.deals_product2, "AKG Y500 Wireless Bluetooth On-ear Headphones with Unicersal", "$39.99", "$149.95", " - 73% OFF"));
        items.add(new Deal(R.drawable.deals_product1, "Bose QuietComfort Earbuds", "$199.00", "$279.00", " - 29% OFF"));
        items.add(new Deal(R.drawable.deals_product2, "AKG Y500 Wireless Bluetooth On-ear Headphones with Unicersal", "$39.99", "$149.95", " - 73% OFF"));
        items.add(new Deal(R.drawable.deals_product1, "Bose QuietComfort Earbuds", "$199.00", "$279.00", " - 29% OFF"));
        items.add(new Deal(R.drawable.deals_product2, "AKG Y500 Wireless Bluetooth On-ear Headphones with Unicersal", "$39.99", "$149.95", " - 73% OFF"));
        // Add other items...

        return items;
    }

    private ArrayList<WinterProduct> getWinterProducts() {
        ArrayList<WinterProduct> items = new ArrayList<>();

        items.add(new WinterProduct(R.drawable.deals_product1, "Blankets"));
        items.add(new WinterProduct(R.drawable.deals_product2, "Earphones"));
        items.add(new WinterProduct(R.drawable.deals_product1, "Blankets"));
        items.add(new WinterProduct(R.drawable.deals_product2, "Earphones"));
        items.add(new WinterProduct(R.drawable.deals_product1, "Blankets"));
        items.add(new WinterProduct(R.drawable.deals_product2, "Earphones"));
        items.add(new WinterProduct(R.drawable.deals_product1, "Blankets"));
        items.add(new WinterProduct(R.drawable.deals_product2, "Earphones"));
        items.add(new WinterProduct(R.drawable.deals_product1, "Blankets"));
        // Add other items...

        return items;
    }

    private void refreshFavoriteAdapter(ArrayList<Favorite> items) {
        FavoriteAdapter adapter = new FavoriteAdapter(this, items);
        recyclerView.setAdapter(adapter);
    }

    private void refreshDealAdapter(ArrayList<Deal> items) {
        DealAdapter adapter = new DealAdapter(this, items);
        recyclerView2.setAdapter(adapter);
    }

    private void refreshWinterProductAdapter(ArrayList<WinterProduct> items) {
        WinterProductAdapter adapter = new WinterProductAdapter(this, items);
        recyclerView3.setAdapter(adapter);
    }
}
