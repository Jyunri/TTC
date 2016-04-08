package com.example.jimy.triangulo;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float a, b, c, p, altura, area;
    EditText ladoA, ladoB,ladoC;
    Button calcula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AlertDialog.Builder adBuilder = new AlertDialog.Builder(this);
        ladoA = (EditText)findViewById(R.id.etLa);
        ladoB = (EditText)findViewById(R.id.etLb);
        ladoC = (EditText)findViewById(R.id.etLc);
        calcula = (Button)findViewById(R.id.btCalcula);

        ladoA.setGravity(Gravity.CENTER);
        ladoB.setGravity(Gravity.CENTER);
        ladoC.setGravity(Gravity.CENTER);
        adBuilder.setTitle("Resultado");

        calcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(ladoA.getText().toString());
                b = Float.parseFloat(ladoB.getText().toString());
                c = Float.parseFloat(ladoC.getText().toString());
                p = (a + b + c) / 2;
                altura = (float) ((2 / c) * Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                area = altura * c / 2;
                adBuilder.setMessage("a = " + a + "\nb = " + b + "\nc = " + c + "\nAltura = " + altura + "\n\nArea = " + area);
                Toast.makeText(getApplicationContext(), "Calculando..", Toast.LENGTH_SHORT).show();
                adBuilder.show();
            }
        });
    }
}
