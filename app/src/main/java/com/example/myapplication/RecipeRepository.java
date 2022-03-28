package com.example.myapplication;

import androidx.lifecycle.LiveData;

import java.util.ArrayList;
import java.util.List;

public class RecipeRepository {

    private RecipeDao recipeDao;
    private static RecipeRepository instance;

    private RecipeRepository(){
        recipeDao = RecipeDao.getInstance();
    }

    public static RecipeRepository getInstance(){
        if(instance == null)
            instance = new RecipeRepository();

        return instance;
    }

    public LiveData<ArrayList<Recipe>> getAllRecipes(){
        return recipeDao.getAllRecipes();
    }

    public void insert(Recipe recipe) {
        recipeDao.insert(recipe);
    }

    public void remove(Recipe recipe){
        recipeDao.remove(recipe);
    }

}
