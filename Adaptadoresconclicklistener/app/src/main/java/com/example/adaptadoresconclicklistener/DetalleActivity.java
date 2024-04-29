package com.example.adaptadoresconclicklistener;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetalleActivity extends AppCompatActivity {
    private TextView textViewDetalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        // Obtener el elemento seleccionado de la actividad anterior del MainActivity
        String selectedItem = getIntent().getStringExtra("item");

        textViewDetalle = findViewById(R.id.textViewDetalle);
        textViewDetalle.setText("Detalles del elemento: " + selectedItem);
    }
}