package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // ------------ Primeira tela --------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primeira_tela_activity_main);

        Button submitButton = findViewById(R.id.btnEntrar);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Coloque aqui o código que deseja executar quando o botão é clicado na primeira tela.
            }
        });
    }

    // Método para enviar o usuário para a segunda tela
    public void segundaTela(View view) {
        Intent intent = new Intent(MainActivity.this, SegundaTela.class);
        startActivity(intent);
    }
}
