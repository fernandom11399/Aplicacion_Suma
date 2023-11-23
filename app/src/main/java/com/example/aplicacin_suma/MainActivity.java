package com.example.aplicacin_suma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numerouno, numerodos;
    Button sumar;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numerouno = findViewById(R.id.ETnumerouno);
        numerodos = findViewById(R.id.ETnumerodos);
        sumar = findViewById(R.id.BTNsumar);
        res = findViewById(R.id.TVresultado);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numerouno != null && numerodos != null){
                    double uno = new Double(String.valueOf(numerouno.getText()));
                    double dos = new Double(String.valueOf(numerodos.getText()));
                    double r = uno + dos;
                    res.setText(String.valueOf(r));
                }
            }
        });
    }
}