package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class segunda_tela extends AppCompatActivity {
//---------------Segunda Tela--------------

    private EditText edtNome, edtHorarioAcordar, edtPeso, edtFrequenciaExercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        edtHorarioAcordar = findViewById(R.id.edtHorarioAcordar);
        edtPeso = findViewById(R.id.edtPeso);
        edtFrequenciaExercicios = findViewById(R.id.edtFrequenciaExercicios);

        Button submitButton = findViewById(R.id.btnEnviar);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = edtNome.getText().toString().trim();
                String horarioAcordar = edtHorarioAcordar.getText().toString().trim();
                String peso = edtPeso.getText().toString().trim();
                String frequenciaExercicios = edtFrequenciaExercicios.getText().toString().trim();

                if (nome.isEmpty() || horarioAcordar.isEmpty() || peso.isEmpty() || frequenciaExercicios.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Para enviar os dados para outra tela
                Intent intent = new Intent(MainActivity.this, SegundaTela.class);
                intent.putExtra("Nome", nome);
                intent.putExtra("HorarioAcordar", horarioAcordar);
                intent.putExtra("Peso", peso);
                intent.putExtra("FrequenciaExercicios", frequenciaExercicios);
                startActivity(intent);
            }
        });
    }