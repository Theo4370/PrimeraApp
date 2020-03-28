package com.example.miprimeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botonEnviar;
    private Button botonCambiarColor;
    private Button botonCambiarTexto;
    private TextView textoPrincipal;
    private EditText nombre;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.mainActivity_linearLayout);
        botonCambiarColor = findViewById(R.id.mainActivity_botonColorEditText);
        botonCambiarTexto = findViewById(R.id.mainActivity_botonContenidoTextView);
        textoPrincipal = findViewById(R.id.mainActivity_textoPrincipal);
        nombre = findViewById(R.id.mainActivity_editorNombre);
        botonEnviar = findViewById(R.id.mainActivity_botonEnviar);
        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String elNombreString = nombre.getText().toString();
                Toast.makeText(MainActivity.this, "Hola " + elNombreString + ", como andas?", Toast.LENGTH_SHORT).show();
                linearLayout.setBackgroundColor(Color.RED);
            }
        });

        botonCambiarColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoPrincipal.setTextColor(Color.GREEN);
            }
        });

        botonCambiarTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textoPrincipal.setText("Esto cambio?");
            }
        });
    }
}
