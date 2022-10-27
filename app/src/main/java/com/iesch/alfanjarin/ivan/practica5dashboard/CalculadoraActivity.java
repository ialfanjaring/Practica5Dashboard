package com.iesch.alfanjarin.ivan.practica5dashboard;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.iesch.alfanjarin.ivan.practica5dashboard.databinding.ActivityCalculadoraBinding;

public class CalculadoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCalculadoraBinding binding = ActivityCalculadoraBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        EditText primerNumero = binding.primerNumeroEdit;
        EditText segundoNumero = binding.segundoNumeroEdit;




        binding.btnSuma.setOnClickListener(v -> {
            //Al hacer click queremos capturar el texto introducido
            String primero = primerNumero.getText().toString();
            String segundo = segundoNumero.getText().toString();
            if (!primero.isEmpty() & !segundo.isEmpty()){
                int primerV = Integer.parseInt(primero);
                int segundoV = Integer.parseInt(segundo);

                int resultado = primerV + segundoV;

                String resultadoTexto = getString(R.string.el_resultado_de_la_operacion_es, resultado);

                binding.RespuestaTextView.setText(resultadoTexto);
            } else {
                Log.d("MainActivity","El campo PrimerNumero o SegundoNumero están vacios");
                Toast.makeText(this, getString(R.string.error_rellenar_valores), Toast.LENGTH_LONG).show();
            }
        });
        binding.btnResta.setOnClickListener(v -> {
            //Al hacer click queremos capturar el texto introducido
            String primero = primerNumero.getText().toString();
            String segundo = segundoNumero.getText().toString();
            if (!primero.isEmpty() & !segundo.isEmpty()){
                int primerV = Integer.parseInt(primero);
                int segundoV = Integer.parseInt(segundo);

                int resultado = primerV - segundoV;

                String resultadoTexto = getString(R.string.el_resultado_de_la_operacion_es, resultado);

                binding.RespuestaTextView.setText(resultadoTexto);
            } else {
                Log.d("MainActivity","El campo PrimerNumero o SegundoNumero están vacios");
                Toast.makeText(this, getString(R.string.error_rellenar_valores), Toast.LENGTH_LONG).show();
            }
        });
        binding.btnMultiplicacion.setOnClickListener(v -> {
            //Al hacer click queremos capturar el texto introducido
            String primero = primerNumero.getText().toString();
            String segundo = segundoNumero.getText().toString();
            if (!primero.isEmpty() & !segundo.isEmpty()){
                int primerV = Integer.parseInt(primero);
                int segundoV = Integer.parseInt(segundo);

                int resultado = primerV * segundoV;

                String resultadoTexto = getString(R.string.el_resultado_de_la_operacion_es, resultado);

                binding.RespuestaTextView.setText(resultadoTexto);
            } else {
                Log.d("MainActivity","El campo PrimerNumero o SegundoNumero están vacios");
                Toast.makeText(this, getString(R.string.error_rellenar_valores), Toast.LENGTH_LONG).show();
            }
        });
        binding.btnDividir.setOnClickListener(v -> {
            //Al hacer click queremos capturar el texto introducido
            String primero = primerNumero.getText().toString();
            String segundo = segundoNumero.getText().toString();
            if (!primero.isEmpty() & !segundo.isEmpty()){
                int primerV = Integer.parseInt(primero);
                int segundoV = Integer.parseInt(segundo);

                int resultado = primerV / segundoV;

                String resultadoTexto = getString(R.string.el_resultado_de_la_operacion_es, resultado);

                binding.RespuestaTextView.setText(resultadoTexto);
            } else {
                Log.d("MainActivity","El campo PrimerNumero o SegundoNumero están vacios");
                Toast.makeText(this, getString(R.string.error_rellenar_valores), Toast.LENGTH_LONG).show();
            }
        });
    }
}