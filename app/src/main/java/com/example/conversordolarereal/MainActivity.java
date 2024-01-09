package com.example.conversordolarereal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Aqui vai o meu codigo fonte:
    public void converter(View view) {
        EditText editDolar;
        TextView txtResultado;
        editDolar = findViewById(R.id.editDolar);
        txtResultado = findViewById(R.id.txtResultado);
        Double valorDolar = Double.parseDouble(editDolar.getText().toString());
        Double valorConvertido = valorDolar * 5;
        txtResultado.setText("Valor Convertido em reais: R$ " + valorConvertido);
    }
}