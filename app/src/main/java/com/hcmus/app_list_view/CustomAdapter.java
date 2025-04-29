package com.hcmus.app_list_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Fruit> {
    public CustomAdapter(Context context, List<Fruit> fruits) {
        super(context, 0, fruits);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_item, parent, false);
        }

        Fruit fruit = getItem(position);

        if (fruit != null) {
            ImageView iconFruit = convertView.findViewById(R.id.icon_fruit);
            TextView fruitName = convertView.findViewById(R.id.fruit_name);
            TextView fruitCalories = convertView.findViewById(R.id.fruit_calories);

            iconFruit.setImageResource(fruit.getIconResId());
            fruitName.setText(fruit.getName());
            fruitCalories.setText(fruit.getCalories() + " Calories");
        }

        return convertView;
    }
}