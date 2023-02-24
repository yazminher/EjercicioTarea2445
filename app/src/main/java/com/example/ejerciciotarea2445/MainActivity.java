package com.example.ejerciciotarea2445;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.ejerciciotarea2445.R;

public class MainActivity extends AppCompatActivity {
    private EditText nombre_txt,apellido_txt,edad_txt,correo_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre_txt=(EditText) findViewById(R.id.txt_nombre);
        apellido_txt=(EditText) findViewById(R.id.txt_apellido);
        edad_txt=(EditText) findViewById(R.id.txt_edad);
        correo_txt=(EditText) findViewById(R.id.txt_correo);
    }
    public void enviar(View view){
        Intent intent=new Intent(this,ActivityInformacion.class);
        intent.putExtra("nombre",nombre_txt.getText().toString());
        intent.putExtra("apellido",apellido_txt.getText().toString());
        intent.putExtra("edad",edad_txt.getText().toString());
        intent.putExtra("correo",correo_txt.getText().toString());
        startActivity(intent);
        nombre_txt.setText("");
        apellido_txt.setText("");
        edad_txt.setText("");
        correo_txt.setText("");
    }
}