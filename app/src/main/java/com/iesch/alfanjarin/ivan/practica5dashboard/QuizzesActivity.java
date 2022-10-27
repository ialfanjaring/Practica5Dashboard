package com.iesch.alfanjarin.ivan.practica5dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.iesch.alfanjarin.ivan.practica5dashboard.databinding.ActivityQuizzesBinding;

import java.util.concurrent.atomic.AtomicBoolean;

public class QuizzesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            ActivityQuizzesBinding binding = ActivityQuizzesBinding.inflate(getLayoutInflater());
            Bundle extras = getIntent().getExtras();
            int contador = 1;
            if(extras != null){
                contador = extras.getInt("contador");
            }
            AtomicBoolean acierto = new AtomicBoolean(false);
            int result = 0;


            binding.numeroTxt.setText(contador + "/3");
            if(contador == 1){
                binding.preguntaTxt.setText(R.string.pregunta1);
                binding.radioA.setText(R.string.respuestaA1);
                binding.radioB.setText(R.string.respuestaB1);
                binding.radioC.setText(R.string.respuestaC1);
                binding.radioD.setText(R.string.respuestaD1);
                result = binding.radioC.getId();
            }if(contador == 2){
                binding.preguntaTxt.setText(R.string.pregunta2);
                binding.radioA.setText(R.string.respuestaA2);
                binding.radioB.setText(R.string.respuestaB2);
                binding.radioC.setText(R.string.respuestaC2);
                binding.radioD.setText(R.string.respuestaD2);
                result = binding.radioB.getId();
            }if(contador == 3){
                binding.preguntaTxt.setText(R.string.pregunta3);
                binding.radioA.setText(R.string.respuestaA3);
                binding.radioB.setText(R.string.respuestaB3);
                binding.radioC.setText(R.string.respuestaC3);
                binding.radioD.setText(R.string.respuestaD3);
                result = binding.radioD.getId();
            }

            //setContentView(R.layout.activity_main);
            setContentView(binding.getRoot());
            int finalResult = result;

            int finalContador = contador;
            binding.responderBtn.setOnClickListener(v -> {
                if(binding.radioGroup.getCheckedRadioButtonId()!=-1) {
                    String pregunta = binding.preguntaTxt.getText().toString();
                    int opcion = binding.radioGroup.getCheckedRadioButtonId();
                    if (finalResult == opcion) {
                        acierto.set(true);
                    } else {
                        acierto.set(false);
                    }
                    abrirResultado(pregunta, acierto.get(), finalContador);
                }else{
                    Toast selecciona = Toast.makeText(this, "Selecciona una respuesta", Toast.LENGTH_SHORT);
                    selecciona.show();
                }
            });
        }

    private void abrirResultado(String pregunta, boolean b, int finalContador) {
        Intent irADetalle = new Intent(this,ResultActivity.class);
        irADetalle.putExtra("pregunta",pregunta);
        irADetalle.putExtra("acierto",b);
        irADetalle.putExtra("contador",finalContador);
        startActivity(irADetalle);
    }
}
