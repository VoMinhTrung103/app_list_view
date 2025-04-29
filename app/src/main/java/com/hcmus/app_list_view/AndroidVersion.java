package com.hcmus.app_list_view;

public class AndroidVersion {
    private String name;
    private int iconResId;

    public AndroidVersion(String name, int iconResId) {
        this.name = name;
        this.iconResId = iconResId;
    }

    public String getName() {
        return name;
    }

    public int getIconResId() {
        return iconResId;
    }
}