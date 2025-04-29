package com.hcmus.app_list_view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSimpleListView = findViewById(R.id.btn_simple_listview);
        Button btnCustomListView = findViewById(R.id.btn_custom_listview);

        btnSimpleListView.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SimpleListViewActivity.class);
            startActivity(intent);
        });

        btnCustomListView.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CustomListViewActivity.class);
            startActivity(intent);
        });
    }
}