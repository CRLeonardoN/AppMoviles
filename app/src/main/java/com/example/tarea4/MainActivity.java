package com.example.tarea4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Registro(View view) {
        Intent i = new Intent(MainActivity.this, Registro.class);
        startActivity(i);
    }
    public void Principal(View view){
        Intent i = new Intent(MainActivity.this, Principal.class);
        startActivity(i);
    }
}