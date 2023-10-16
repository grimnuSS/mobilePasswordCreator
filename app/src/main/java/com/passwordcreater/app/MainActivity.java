package com.passwordcreater.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btn;

    String[] harf = {"A", "B", "C,", "D", "E", "F", "G", "H"};
    Integer[] rakam = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    String[] ozelKarakter = {"!","#","$","%","&","*","?","-","_",".","<",">"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txt_olusanSifre);
        btn = findViewById(R.id.btn_olustur);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sifre = "";
                Random rnd = new Random();

                for (int i = 0; i < 3; i++) {
                    sifre = sifre + harf[rnd.nextInt(8)] + rakam[rnd.nextInt(10)] + ozelKarakter[rnd.nextInt(12)];
                }
                txt.setText("" + sifre);
            }
        });

    }
}