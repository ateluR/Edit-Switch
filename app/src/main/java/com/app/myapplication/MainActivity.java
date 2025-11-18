package com.app.myapplication;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int numer = 0;
    private Button poprzedni;
    private Button nastepny;
    private ImageView imageView;
    private EditText wpisywany_numer_zdjecia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        poprzedni = findViewById(R.id.poprzedni);
        nastepny = findViewById(R.id.nastepny);
        imageView = findViewById(R.id.imageView2);
        Switch sw = findViewById(R.id.switch1);
        LinearLayout tlo = findViewById(R.id.main);
        wpisywany_numer_zdjecia = findViewById(R.id.editTextNumber);




        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull CompoundButton compoundButton, boolean b) {
                if (b) {
                    tlo.setBackgroundColor(getResources().getColor(R.color.szafir   ));
                } else {
                    tlo.setBackgroundColor(getResources().getColor(R.color.niebieski));

                }
            }
        });




         int[] tablica_zd = new int[3];
        tablica_zd[0] = R.drawable.images;
        tablica_zd[1] = R.drawable.pies;
        tablica_zd[2] = R.drawable.rekin;
        nastepny.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(numer==2){
                            numer=0;
                        }
                        else{
                            numer++;
                        }
                        imageView.setImageResource(tablica_zd[numer]);
                    }
                }
        );
        poprzedni.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(numer==0){
                            numer=2;
                        }
                        else{
                            numer--;
                        }
                        imageView.setImageResource(tablica_zd[numer]);
                    }
                }
        );






    }
}