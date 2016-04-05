package com.example.jimy.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by jimy on 01/04/16.
 */
public class HelloWorldActivity extends Activity{

    TextView helloWorld;
    Button meAperte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworld);
        Log.d("onCreate","We are on onCreate method");

        helloWorld = (TextView)findViewById(R.id.tvHelloWorld);
        meAperte = (Button)findViewById(R.id.btMeAperte);

        meAperte.setOnClickListener(new View.OnClickListener() {
            boolean flag = true;
            @Override
            public void onClick(View v) {
                if(flag){
                    helloWorld.setText("Hello from android!");
                    flag = false;
                }
                else{
                    helloWorld.setText("Hello World!");
                    flag = true;
                }
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart","We are on onStart method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume", "We are on onResume method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause", "We are on onPause method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop", "We are on onStop method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy", "We are on onDestroy method");

    }
}
