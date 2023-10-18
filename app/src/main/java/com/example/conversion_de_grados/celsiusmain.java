package com.example.conversion_de_grados;

import androidx.appcompat.app.AppCompatActivity;
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
public class celsiusmain extends AppCompatActivity {
    EditText editTextValue;
    Spinner spinnerUnits;
    Button btnConvertir;
    TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.celsiusa);
        editTextValue = findViewById(R.id.editTextValue);
        spinnerUnits = findViewById(R.id.spinnerUnits);
        btnConvertir = findViewById(R.id.btnConvertir);
        textViewResultado = findViewById(R.id.textViewResultado);
        String[] unitOptions = {"Fahrenheit", "Kelvin"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, unitOptions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerUnits.setAdapter(adapter);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputValue = editTextValue.getText().toString();
                if (!inputValue.isEmpty()) {
                    Double valor = Double.parseDouble(inputValue);
                    String unidadSeleccionada = spinnerUnits.getSelectedItem().toString();

                    if (unidadSeleccionada.equals("Fahrenheit")) {
                        farenheit farenheitValue = new farenheit(valor, "F");
                        celsius celsiusValue = new celsius(0.0, "C");
                        celsiusValue = celsiusValue.parse(farenheitValue);
                        textViewResultado.setText("Resultado en Celsius: " + celsiusValue.getValor() + " °C");
                    } else if (unidadSeleccionada.equals("Kelvin")) {
                        kelvin kelvinValue = new kelvin(valor, "K");
                        celsius celsiusValue = new celsius(0.0, "C");
                        celsiusValue = celsiusValue.parse(kelvinValue);
                        textViewResultado.setText("Resultado en Celsius: " + celsiusValue.getValor() + " °C");
                    }
                } else {
                    textViewResultado.setText("Por favor, ingrese un valor");
                }
            }
        });
    }
}
