package com.example.juanet.hora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity  {
    public final static String TAG_LOG = MainActivity.class.getSimpleName(); //this is just "MainActivity"

    Button btn;
    EditText et;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d(TAG_LOG, "...........Acá empieza la actividad de la app................");
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.btnHora);
        et = (EditText)findViewById(R.id.message);
        img = (ImageView)findViewById(R.id.foto);


    }

    public void buttonClick(View view){

        Log.d(TAG_LOG, "...........ACTIVIDAD DEL BOTON...........");
        Date d = new Date();
        Log.d(TAG_LOG, "...........Fecha...........: " + d.toString());
        SimpleDateFormat test = new SimpleDateFormat("HH:mma");
        String date = test.format(d);
        Log.d(TAG_LOG, "...........Hora............: " + date);
        et.setText(date);

    }

    protected void onStart(){
        super.onStart();
        Log.d(TAG_LOG, "...........On Start-------------");
        //setContentView(R.layout.activity_main);
    }

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG_LOG, "...........On Restart-------------");
        //setContentView(R.layout.activity_main);
    }

    protected void onResume(){
        super.onResume();
        Log.d(TAG_LOG, "...........On Resume-------------");
        //setContentView(R.layout.activity_main);
    }

    protected void onPause( ){
        super.onPause();
        Log.d(TAG_LOG, "...........On pause-------------");
        //setContentView(R.layout.activity_main);
    }

    protected void onStop( ){
        super.onStop();
        Log.d(TAG_LOG, "...........On stop-------------");
        //setContentView(R.layout.activity_main);
    }

    protected void onDestroy( ){
        super.onDestroy();
        Log.d(TAG_LOG, "...........On destroy-------------");
        //setContentView(R.layout.activity_main);
    }
}
