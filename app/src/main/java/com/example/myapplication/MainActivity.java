package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    private RecipeViewModel recipeViewModel;

    RecyclerView recipeList;
    RecipeAdapter recipeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        recipeViewModel = new ViewModelProvider(this).get(RecipeViewModel.class);
        recipeViewModel.getAllRecipes().observe(this, new Observer<List<Recipe>>() {
            @Override
            public void onChanged(List<Recipe> recipes) {
                //Update UI with textView.setText()...
            }
        });

        recipeList = findViewById(R.id.rv);
        recipeList.hasFixedSize();
        recipeList.setLayoutManager(new LinearLayoutManager(this));

        recipeViewModel.insert(new Recipe("Thai Meatballs", "Thai", R.drawable.thai_meatballs, 30, 4, "1. Make 10 meatballs, remember to add salt and pepper."));
        recipeViewModel.insert(new Recipe("Chicken Chausser", "French", R.drawable.chicken_chausser, 40, 5, "1. Make 10 meatballs, remember to add salt and pepper."));
        recipeViewModel.insert(new Recipe("Massaman Curry", "Indian", R.drawable.massaman, 50, 4, "1. Make 10 meatballs, remember to add salt and pepper."));
        recipeViewModel.insert(new Recipe("Carbonara", "Italian", R.drawable.carbonara, 20, 3, "1. Make 10 meatballs, remember to add salt and pepper."));
        recipeViewModel.insert(new Recipe("Vietnamese Pho", "Vietnamese", R.drawable.vietnamese_pho, 60, 4, "1. Make 10 meatballs, remember to add salt and pepper."));
        recipeViewModel.insert(new Recipe("Thai Meatballs", "Thai", R.drawable.thai_meatballs, 30, 4, "1. Make 10 meatballs, remember to add salt and pepper."));
        recipeViewModel.insert(new Recipe("Chicken Chausser", "French", R.drawable.chicken_chausser, 40, 5, "1. Make 10 meatballs, remember to add salt and pepper."));
        recipeViewModel.insert(new Recipe("Massaman Curry", "Indian", R.drawable.massaman, 50, 4, "1. Make 10 meatballs, remember to add salt and pepper."));
        recipeViewModel.insert(new Recipe("Carbonara", "Italian", R.drawable.carbonara, 20, 3, "1. Make 10 meatballs, remember to add salt and pepper."));
        recipeViewModel.insert(new Recipe("Vietnamese Pho", "Vietnamese", R.drawable.vietnamese_pho, 60, 4, "1. Make 10 meatballs, remember to add salt and pepper."));

        ArrayList<Recipe> recipes = recipeViewModel.getAllRecipes().getValue();

        recipeAdapter = new RecipeAdapter(recipes);
        recipeList.setAdapter(recipeAdapter);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);

        recipeAdapter.setOnClickListener(recipe -> {
            Toast.makeText(this, recipe.getName(), Toast.LENGTH_SHORT).show();
            navController.navigate(R.id.action_FirstFragment_to_SecondFragment);
        });

        setSupportActionBar(binding.toolbar);

        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

}