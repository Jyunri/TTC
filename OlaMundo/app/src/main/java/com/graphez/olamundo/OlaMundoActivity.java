package com.graphez.olamundo;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ezorzal on 17/03/16.
 */
public class OlaMundoActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ola_mundo);
        Log.i("Ciclo de vida", "On Create");

        EditText cidade = (EditText)findViewById(R.id.cidade);
        Button salvar = (Button)findViewById(R.id.btSave);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Clicou botao: ",getText(R.string.stSave).toString());
                AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
                builder.setTitle("TESTE");
                builder.setMessage("MESSAGE");
                builder.show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ciclo de vida","On Create");
    }
}

