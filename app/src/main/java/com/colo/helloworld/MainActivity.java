package com.colo.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Date fecha = new Date();
    private TextView secondsDisplay;

    public MainActivity(){
        Log.d("INFO","DENTRO DEL METODO CONSTRUCTOR");
    }

    static {
        Log.d("INFO","SE INICIALIZA EL 'MUNDO ESTATICO'");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("INFO","DENTRO DEL METODO CONSTRUCTOR");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();

        fecha = new Date();
        //System.out.println(new Timestamp(fecha.getTime()));
        Log.d("INFO","ON PAUSE");

    }

    @Override
    protected void onResume() {
        super.onResume();

        long milisegundos = (new Date()).getTime() - fecha.getTime();
        StringBuilder sb = new StringBuilder();
        sb.append(milisegundos/1000).append(" segundos en segundo plano..");
        secondsDisplay.setText(sb.toString());


        Log.d("INFO","ON RESUME");
    }


}
