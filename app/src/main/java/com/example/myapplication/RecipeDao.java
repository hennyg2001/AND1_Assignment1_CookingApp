package com.example.myapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class RecipeDao {

    private MutableLiveData<ArrayList<Recipe>> recipes;
    private static RecipeDao instance;

    public RecipeDao() {
        recipes = new MutableLiveData<>();
        ArrayList<Recipe> newList = new ArrayList<>();
        recipes.setValue(newList);
    }

    public static RecipeDao getInstance(){
        if(instance == null) {
            instance = new RecipeDao();
        }
        return instance;
    }

    public LiveData<ArrayList<Recipe>> getAllRecipes() {
        return recipes;
    }

    public void insert(Recipe recipe) {
        ArrayList<Recipe> currentRecipes = recipes.getValue();
        currentRecipes.add(recipe);
        recipes.setValue(currentRecipes);
    }

    public void remove(Recipe recipe) {
        ArrayList<Recipe> currentRecipes = recipes.getValue();
        currentRecipes.remove(recipe);
        recipes.setValue(currentRecipes);
    }

}
