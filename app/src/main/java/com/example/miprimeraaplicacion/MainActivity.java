package com.example.miprimeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botonEnviar;
    private EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.mainActivity_editorNombre);
        botonEnviar = findViewById(R.id.mainActivity_botonEnviar);
        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String elNombreString = nombre.getText().toString();
                //Toast.makeText(MainActivity.this, "Hola wachem", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Hola " + elNombreString + ", como andas?", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
