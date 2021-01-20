package com.example.loginsample;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {
    private ImageView imageView;
    TextView tv,tv3;
    Button intbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView = findViewById(R.id.imageView);
        tv=(TextView)findViewById(R.id.stv);
        tv3=(TextView)findViewById(R.id.tv3);
        intbtn=findViewById(R.id.btnintent);
        intbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent intent = new Intent(splash.this, MainActivity.class);
                 startActivity(intent);
                 finish();
            }
        });

    }
}
