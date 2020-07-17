package com.example.registroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputLayout til_rut, til_nombre, til_apellido, til_edad, til_date;
    RadioGroup rg_gender;
    Button btn_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        til_rut = findViewById(R.id.til_rut);
        til_nombre = findViewById(R.id.til_nombre);
        til_apellido = findViewById(R.id.til_apellido);
        til_edad = findViewById(R.id.til_edad);
        til_date = findViewById(R.id.til_date);
        rg_gender = findViewById(R.id.rg_gender);
        btn_registrar = findViewById(R.id.btn_registrar);

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_rut = til_rut.getEditText().getText().toString();
                String str_nombre = til_nombre.getEditText().getText().toString();
                String str_apellido = til_apellido.getEditText().getText().toString();
                Toast.makeText(getBaseContext(), getString(R.string.mensaje_registro, str_nombre, str_apellido, str_rut), Toast.LENGTH_LONG).show();
            }
        });

    }
}