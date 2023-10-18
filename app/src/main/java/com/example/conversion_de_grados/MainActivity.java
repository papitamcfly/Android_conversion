package com.example.conversion_de_grados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import com.example.conversion_de_grados.mdoels.celsius;
import com.example.conversion_de_grados.mdoels.farenheit;
import com.example.conversion_de_grados.mdoels.kelvin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button celcius = findViewById(R.id.btncelcius); // Reemplaza "btncelcius" con el ID de tu botón en el XML de diseño

        celcius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, celsiusmain.class);
                startActivity(intent);
            }
        });

        Button Farenheit = findViewById(R.id.btnfarenheit);
        Farenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity1.class);
                startActivity(intent);
            }
        });
        Button Kelvin = findViewById(R.id.btnkelvin);
        Kelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Kelvinmain.class);
                startActivity(intent);
            }
        });
    }
}