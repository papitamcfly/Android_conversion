package com.example.conversion_de_grados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.conversion_de_grados.mdoels.celsius;
import com.example.conversion_de_grados.mdoels.farenheit;
import com.example.conversion_de_grados.mdoels.kelvin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celsius celsius = new celsius(0.0,"C");
        celsius.setValor(10.00);


        farenheit farenheit = new farenheit(0.0,"F");
        kelvin kelvin = new kelvin(0.0,"K");
    }
}