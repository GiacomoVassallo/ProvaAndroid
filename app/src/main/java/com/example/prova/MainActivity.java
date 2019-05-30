package com.example.prova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nome = "Giacomo";
        String nome1 = "Alex";

        if(nome.equals("Giacomo")){
            nome = "";
        }

    }
}
