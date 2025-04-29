package com.hcmus.app_list_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class SimpleAdapter extends ArrayAdapter<AndroidVersion> {
    public SimpleAdapter(Context context, List<AndroidVersion> versions) {
        super(context, 0, versions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.simple_list_item, parent, false);
        }

        AndroidVersion version = getItem(position);

        if (version != null) {
            ImageView iconAndroid = convertView.findViewById(R.id.icon_android);
            TextView versionName = convertView.findViewById(R.id.version_name);

            iconAndroid.setImageResource(version.getIconResId());
            versionName.setText(version.getName());
        }

        return convertView;
    }
}