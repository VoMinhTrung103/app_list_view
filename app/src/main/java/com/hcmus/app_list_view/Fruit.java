package com.hcmus.app_list_view;

public class Fruit {
    private String name;
    private int calories;
    private int iconResId;

    public Fruit(String name, int calories, int iconResId) {
        this.name = name;
        this.calories = calories;
        this.iconResId = iconResId;
    }

    public String getName() { return name; }
    public int getCalories() { return calories; }
    public int getIconResId() { return iconResId; }
}