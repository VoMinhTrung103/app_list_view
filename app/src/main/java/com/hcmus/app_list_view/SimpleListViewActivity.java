package com.hcmus.app_list_view;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class SimpleListViewActivity extends AppCompatActivity {
    private ListView simpleListView;
    private List<AndroidVersion> androidVersions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_listview);

        simpleListView = findViewById(R.id.simple_listview);
        androidVersions = new ArrayList<>();

        // Thêm các phiên bản Android với icon tương ứng
        androidVersions.add(new AndroidVersion("Android Cupcake", R.drawable.cupcake_icon));
        androidVersions.add(new AndroidVersion("Android Donut", R.drawable.donut_icon));
        androidVersions.add(new AndroidVersion("Android Eclair", R.drawable.eclair_icon));
        androidVersions.add(new AndroidVersion("Android Froyo", R.drawable.froyo_icon));
        androidVersions.add(new AndroidVersion("Android Gingerbread", R.drawable.gingerbread_icon));
        androidVersions.add(new AndroidVersion("Android Honeycomb", R.drawable.honeycomb_icon));

        SimpleAdapter adapter = new SimpleAdapter(this, androidVersions);
        simpleListView.setAdapter(adapter);
    }
}