package com.hcmus.app_list_view;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class CustomListViewActivity extends AppCompatActivity {
    private ListView customListView;
    private List<Fruit> fruitList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_listview);

        customListView = findViewById(R.id.custom_listview);
        fruitList = new ArrayList<>();

        fruitList.add(new Fruit("Orange", 47, R.drawable.orange_icon));
        fruitList.add(new Fruit("Cherry", 50, R.drawable.cherry_icon));
        fruitList.add(new Fruit("Banana", 88, R.drawable.banana_icon));
        fruitList.add(new Fruit("Apple", 52, R.drawable.apple_icon));
        fruitList.add(new Fruit("Kiwi", 61, R.drawable.kiwi_icon));
        fruitList.add(new Fruit("Pear", 57, R.drawable.pear_icon));
        fruitList.add(new Fruit("Strawberry", 33, R.drawable.strawberry_icon));
        fruitList.add(new Fruit("Lemon", 29, R.drawable.lemon_icon));
        fruitList.add(new Fruit("Peach", 39, R.drawable.peach_icon));
        fruitList.add(new Fruit("Apricot", 48, R.drawable.apricot_icon));
        fruitList.add(new Fruit("Mango", 60, R.drawable.mango_icon));

        CustomAdapter adapter = new CustomAdapter(this, fruitList);
        customListView.setAdapter(adapter);
    }
}