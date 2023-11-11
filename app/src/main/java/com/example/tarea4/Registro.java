package com.example.tarea4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tarea4.R;

public class Registro extends AppCompatActivity {

    private EditText editTextNombre, editTextEmail, editTextPassword;
    private Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        editTextNombre = findViewById(R.id.editTextNombre);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = editTextNombre.getText().toString();
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();

                Toast.makeText(Registro.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void Volver(View view) {
        Intent i = new Intent(Registro.this, MainActivity.class);
        startActivity(i);
    }
}
