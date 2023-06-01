package com.example.soundboard2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAlarms, btnBirds, btnFlutes,btnFuturistic, btnGamealarm, btnGeese, btnIntro, btnOrchestral, btnSchwazuuzal, btnSwoosh, btnTikTok, btnTrumpet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlarms = findViewById(R.id.btn_alarms);
        btnBirds = findViewById(R.id.btn_birds);
        btnFlutes = findViewById(R.id.btn_flute);
        btnFuturistic = findViewById(R.id.btn_futuristic);
        btnGamealarm = findViewById(R.id.btn_gamealarm);
        btnGeese = findViewById(R.id.btn_geese);
        btnIntro = findViewById(R.id.btn_intro);
        btnOrchestral = findViewById(R.id.btn_orchestral);
        btnSchwazuuzal = findViewById(R.id.btn_schwazuuzal);
        btnSwoosh = findViewById(R.id.btn_swoosh);
       btnTikTok = findViewById(R.id.btn_tiktok);
       btnTrumpet = findViewById(R.id.btn_trumpet);

       btnAlarms.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               playAlarms();
           }
       });

        btnBirds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playBirds();
            }
        });

        btnFlutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playFlutes();
            }
        });

        btnFuturistic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playFuturistic();
            }
        });

        btnGamealarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playGamealarm();
            }
        });

        btnGeese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playGeese();
            }
        });

        btnIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playIntro();
            }
        });

        btnOrchestral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playOrchestral();
            }
        });

        btnSchwazuuzal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSchwazuuzal();
            }
        });

        btnSwoosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSwoosh();
            }
        });

        btnTikTok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playTikTok();
            }
        });

        btnTrumpet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playTrumpet();
            }
        });
    }
}