package com.iesch.alfanjarin.ivan.practica5dashboard;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.iesch.alfanjarin.ivan.practica5dashboard.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupMenuButtons();
    }

    private void setupMenuButtons() {
        binding.rellayCalculadora.setOnClickListener(v -> {
            Intent intent = new Intent(this, CalculadoraActivity.class);
            startActivity(intent);
        });
        binding.rellayAmigos.setOnClickListener(v -> {
            Intent intent = new Intent(this, MusicActivity.class);
            startActivity(intent);
        });
        binding.rellayPerrete.setOnClickListener(v -> {
            Intent intent = new Intent(this, EdadCaninaActivity.class);
            startActivity(intent);
        });
        binding.rellayQuizzes.setOnClickListener(v -> {
            Intent intent = new Intent(this, QuizzesActivity.class);
            startActivity(intent);
        });

    }
}



