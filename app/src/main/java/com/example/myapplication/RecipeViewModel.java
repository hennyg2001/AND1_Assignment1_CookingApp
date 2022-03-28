package com.example.myapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class RecipeViewModel extends ViewModel {

    private RecipeRepository repository;

    public RecipeViewModel() {
        repository = RecipeRepository.getInstance();
    }

    public LiveData<ArrayList<Recipe>> getAllRecipes() {
        return repository.getAllRecipes();
    }

    public void insert(Recipe recipe) {
        repository.insert(recipe);
    }

    public void remove(Recipe recipe) {
        repository.remove(recipe);
    }

}
