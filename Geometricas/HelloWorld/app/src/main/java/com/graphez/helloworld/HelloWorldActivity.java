package com.graphez.helloworld;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ezorzal on 05/04/16.
 */
public class HelloWorldActivity extends Activity {

    Context a;
    int opcao=1;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        a = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworld);

        Button botao = (Button)findViewById(R.id.botao);

        botao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
               // Log.i("BOTAO: ", "CLICK");
                EditText editText = (EditText)findViewById(R.id.editX);
                EditText editTextY = (EditText)findViewById(R.id.editY);
                EditText editTextZ = (EditText)findViewById(R.id.editZ);
                //float z = Float.parseFloat(editTextZ.getText().toString());
                float k = 0;
                float p = 0;
                String titulo;

                if(opcao == 1) {
                    float x= Float.parseFloat(editText.getText().toString());
                    float y = Float.parseFloat(editTextY.getText().toString());
                    titulo = "Retângulo - Perímetro: 2a + 2b; Área: ab";
                    k = x*y;
                    p = 2*x + 2*y;

                }else if(opcao == 2){
                    float x= Float.parseFloat(editText.getText().toString());
                    titulo = "Quadrado  - Perímetro: 4a; Área: aa";
                    k = x*x;
                    p=2*x;

                }else if(opcao == 3){
                    float x= Float.parseFloat(editText.getText().toString());
                    float y = Float.parseFloat(editTextY.getText().toString());
                    titulo = "Paralelogramo - Perímetro: 2a + 2b; Área: ab";
                    k = x*y;
                    p = 2*x + 2*y;
                }else if(opcao == 4){
                    float x= Float.parseFloat(editText.getText().toString());
                    float y = Float.parseFloat(editTextY.getText().toString());
                    float z = Float.parseFloat(editTextZ.getText().toString());
                    titulo = "Triângulo - Perímetro: a+b+c; Área: sqrt(s(s-a)(s-b)(s-c))";
                    float s = (x + y + z)/2;
                    k = (float)Math.sqrt(s*(s-x)*(s-y)*(s-z));
                    p = x + y + z;
                }else if(opcao == 5){
                    float x= Float.parseFloat(editText.getText().toString());
                    float y = Float.parseFloat(editTextY.getText().toString());
                    float h = Float.parseFloat(editTextZ.getText().toString());
                    titulo = "Trapézio - Perímetro: 2a + 2b; Área: ((a + b)/2)h";
                    k = ((x*y)/2)*h;
                    p = 2*x + 2*y;
                }else{
                    float r = Float.parseFloat(editText.getText().toString());
                    titulo = "Circuferência - Perímetro: 2PIr; Área: 2PIrr";
                    k = (float) (2*Math.PI*r);
                    p = (float) (Math.PI*r*r);
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(a);
                builder.setTitle(titulo);
                builder.setMessage("P: "+p+" - Área: " + String.valueOf(k));
                builder.show();
            }
        });






    }


    public void onRadioButtonClicked(View view) {

        String selection = "";
        TextView text1 = (TextView) findViewById(R.id.txt1);
        TextView text2 = (TextView) findViewById(R.id.txt2);
        TextView text3 = (TextView) findViewById(R.id.txt3);

        TextView textObjeto = (TextView) findViewById(R.id.txtObjeto);


        EditText edit1 = (EditText) findViewById(R.id.editX);
        EditText edit2 = (EditText) findViewById(R.id.editY);
        EditText edit3 = (EditText) findViewById(R.id.editZ);




        switch (view.getId()) {
            case R.id.radioButton1:
                selection = "Retângulo";
                opcao=1;
                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
                text3.setVisibility(View.GONE);
                text1.setText("a");
                text2.setText("b");

                edit1.setVisibility(View.VISIBLE);
                edit2.setVisibility(View.VISIBLE);
                edit3.setVisibility(View.GONE);

                textObjeto.setText(selection);


                break;
            case R.id.radioButton2:
                selection = "Quadrado";
                opcao=2;

                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.GONE);
                text3.setVisibility(View.GONE);
                text1.setText("a");

                edit1.setVisibility(View.VISIBLE);
                edit2.setVisibility(View.GONE);
                edit3.setVisibility(View.GONE);

                textObjeto.setText(selection);


                break;
            case R.id.radioButton3:
                selection = "Paralelogramo";
                opcao=3;


                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
                text3.setVisibility(View.GONE);
                text1.setText("a");
                text2.setText("b");

                edit1.setVisibility(View.VISIBLE);
                edit2.setVisibility(View.VISIBLE);
                edit3.setVisibility(View.GONE);

                textObjeto.setText(selection);


                break;
            case R.id.radioButton4:
                selection = "Triângulo";
                opcao=4;

                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
                text3.setVisibility(View.VISIBLE);
                text1.setText("a");
                text2.setText("b");
                text2.setText("c");

                edit1.setVisibility(View.VISIBLE);
                edit2.setVisibility(View.VISIBLE);
                edit3.setVisibility(View.VISIBLE);

                textObjeto.setText(selection);

                break;
            case R.id.radioButton5:
                selection = "Trapézio";
                opcao=5;

                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
                text3.setVisibility(View.VISIBLE);
                text1.setText("b1");
                text2.setText("b2");
                text3.setText("h");

                edit1.setVisibility(View.VISIBLE);
                edit2.setVisibility(View.VISIBLE);
                edit3.setVisibility(View.VISIBLE);

                textObjeto.setText(selection);


                break;
            case R.id.radioButton6:
                selection = "Circuferência";
                opcao=6;


                text1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.GONE);
                text3.setVisibility(View.GONE);
                text1.setText("r");

                edit1.setVisibility(View.VISIBLE);
                edit2.setVisibility(View.GONE);
                edit3.setVisibility(View.GONE);

                textObjeto.setText(selection);

                break;
        }

        Toast.makeText(this, selection, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume()
    {
        super.onResume();
        Log.i("Teste: ", "onResume");
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.i("Teste: ","onPause");
    }
}