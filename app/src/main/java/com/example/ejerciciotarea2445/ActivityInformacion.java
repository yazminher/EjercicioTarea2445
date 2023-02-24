package com.example.ejerciciotarea2445;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ejerciciotarea2445.R;

public class ActivityInformacion extends AppCompatActivity {
    private TextView nombre_text,apellido_text,edad_text,correo_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        nombre_text=(TextView) findViewById(R.id.text_nombre);
        apellido_text=(TextView) findViewById(R.id.text_apellido);
        edad_text=(TextView) findViewById(R.id.text_edad);
        correo_text=(TextView) findViewById(R.id.text_correo);
        nombre_text.setText(getIntent().getStringExtra("nombre"));
        apellido_text.setText(getIntent().getStringExtra("apellido"));
        edad_text.setText(getIntent().getStringExtra("edad"));
        correo_text.setText(getIntent().getStringExtra("correo"));
    }
}