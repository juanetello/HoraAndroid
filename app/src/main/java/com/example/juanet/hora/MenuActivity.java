package com.example.juanet.hora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity implements OnClickListener{
    Button btn;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn = (Button)findViewById(R.id.button2);
        img = (ImageView)findViewById(R.id.foto2);

        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button2:
                Intent intento = new Intent(MenuActivity.this, MainActivity.class);//se le pasa el contexto
                startActivity(intento);
                break;
            case R.id.button3:
                Intent intento2 = new Intent(MenuActivity.this, ImagenActivity.class);
                startActivity(intento2);
                break;
        }
    }
}
