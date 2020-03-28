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

        botonEnviar = findViewById(R.id.mainActivity_botonEnviar);
        //nombre.findViewById(R.id.mainActivity_editorNombre);
        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hola wachim", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
