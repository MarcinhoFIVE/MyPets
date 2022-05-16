package br.com.etecia.mypets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CafeBadilicoActivity extends AppCompatActivity {

    CardView idCardView;
    Button idBtnUm;
    Button idBtnDois;
    Button idBtnTres;
    Button idBtnQuatro;
    Button idBtnCinco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafe_badilico_layout);

        idCardView = findViewById(R.id.idCardView);

        idCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei no CardVIew", Toast.LENGTH_SHORT).show();
            }
        });

        idBtnUm = findViewById(R.id.idBtnUm);

        idBtnUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em 5:30", Toast.LENGTH_SHORT).show();
            }
        });

        idBtnDois = findViewById(R.id.idBtnDois);

        idBtnDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em 7:30", Toast.LENGTH_SHORT).show();
            }
        });

        idBtnTres = findViewById(R.id.idBtnTres);

        idBtnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em 8:30", Toast.LENGTH_SHORT).show();
            }
        });

        idBtnQuatro = findViewById(R.id.idBtnQuatro);

        idBtnQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em 9:00", Toast.LENGTH_SHORT).show();
            }
        });

        idBtnCinco = findViewById(R.id.idBtnCinco);

        idBtnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em Reservar", Toast.LENGTH_SHORT).show();
            }
        });
    }
}