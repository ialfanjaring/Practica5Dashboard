package com.iesch.alfanjarin.ivan.practica5dashboard;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.iesch.alfanjarin.ivan.practica5dashboard.databinding.ActivityEdadCaninaBinding;


public class EdadCaninaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityEdadCaninaBinding binding = ActivityEdadCaninaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //setContentView(R.layout.activity_main);
        /*
        EditText ageEdit = findViewById(R.id.Edad_EditText);
        Button btnCalcular = findViewById(R.id.btn_Calcular);
        TextView resultadoText = findViewById(R.id.Respuesta_TextView);
        */
        EditText ageEdit = binding.EdadEditText;
        //Button btnCalcular = binding.btnCalcular;
        //TextView resultadoText = binding.RespuestaTextView;


        /*
        Log.v("DAM","MainActivity Cargada con exito");
        Log.d("DAM","MainActivity Cargada con exito");
        Log.i("DAM","MainActivity Cargada con exito");
        Log.w("DAM","MainActivity Cargada con exito");
        Log.e("DAM","MainActivity Cargada con exito");
        */

        binding.btnCalcular.setOnClickListener(v -> {
            //Al hacer click queremos capturar el texto introducido
            String edad = ageEdit.getText().toString();
            if (!edad.isEmpty()){
                int edadInteger = Integer.parseInt(edad);

                int resultado = edadInteger * 7;
                //String resultadoTexto = "If you were a dog, your age would be " + resultado + " years old";
                String resultadoTexto = getString(R.string.result_format, resultado);

                binding.RespuestaTextView.setText(resultadoTexto);
            } else {
                Log.d("MainActivity","El campo Edad está vacio");
                Toast.makeText(this, getString(R.string.you_have_to_insert_an_age), Toast.LENGTH_LONG).show();
            }

        });
    }
}