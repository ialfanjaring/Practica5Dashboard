package com.iesch.alfanjarin.ivan.practica5dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.iesch.alfanjarin.ivan.practica5dashboard.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityResultBinding binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        int contador = extras.getInt("contador");
        boolean acierto = extras.getBoolean("acierto");
        if(contador == 4){
            binding.preguntaTxt.setText(R.string.felicidades);
            binding.aciertoTxt.setText(R.string.yaTerminasteTodasLasPreguntas);
            binding.continuarBtn.setText(R.string.repetir);
            binding.continuarBtn.setOnClickListener(v -> {
                abrirMain(0);
            });

        }else {
            String pregunta = extras.getString("pregunta");
            binding.preguntaTxt.setText(pregunta);

            if (acierto) {
                binding.aciertoTxt.setText(R.string.correct);
            } else {
                binding.aciertoTxt.setText(R.string.incorrecto);
            }
            binding.continuarBtn.setOnClickListener(v -> {
                if(contador == 3){
                    abrirResult(contador);
                }else {
                    abrirMain(contador);
                }
            });
        }
    }

    private void abrirResult(int contador) {
        Intent iraResult = new Intent(this,ResultActivity.class);
        contador++;
        iraResult.putExtra("contador", contador);
        startActivity(iraResult);
    }

    private void abrirMain(int contador) {
        Intent irAMain = new Intent(this,QuizzesActivity.class);
        contador++;
        irAMain.putExtra("contador",contador);
        startActivity(irAMain);

    }
}