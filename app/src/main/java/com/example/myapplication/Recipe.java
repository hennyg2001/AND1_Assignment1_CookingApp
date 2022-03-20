package com.example.myapplication;

public class Recipe {

    private String name;
    private String cuisine;
    private int iconId;
    private int cookTime;
    private int servings;
    private String method;

    Recipe(String name, String cuisine, int iconId, int cookTime, int servings, String method) {
        this.name = name;
        this.cuisine = cuisine;
        this.iconId = iconId;
        this.cookTime = cookTime;
        this.servings = servings;
        this.method = method;
    }

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public int getIconId() {
        return iconId;
    }

    public int getCookTime() {
        return cookTime;
    }

    public int getServings() {
        return servings;
    }

    public String getMethod() {
        return method;
    }
}
