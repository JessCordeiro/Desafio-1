package com.example.desafio1.ui.activity;

import android.app.Activity;

import android.os.Bundle;
import android.widget.TextView;


import br.com.alura.agenda.R;

public class Tela extends Activity {
    TextView recebeUsername;
    TextView recebePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela);

        recebeUsername = (TextView) findViewById(R.id.recebeUsername);
        String valorUsername = getIntent().getStringExtra("chave");
        recebeUsername.setText(valorUsername);


        recebePassword = (TextView) findViewById(R.id.recebePassword);
        String valorPassword = getIntent().getStringExtra("chave2");
        recebePassword.setText(valorPassword);
    }
}