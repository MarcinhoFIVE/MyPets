package br.com.etecia.mypets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CafeBadilicoActivity extends AppCompatActivity {

    CardView idCardView;
    Button idHoraUm;
    Button idHoraDois;
    Button idHoraTres;
    Button idHoraQuatro;
    Button idHoraCinco;
    FloatingActionButton idFABCafe;

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

        idHoraUm = findViewById(R.id.idHoraUm);

        idHoraUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em 5:30", Toast.LENGTH_SHORT).show();
            }
        });

        idHoraDois = findViewById(R.id.idHoraDois);

        idHoraDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em 7:30", Toast.LENGTH_SHORT).show();
            }
        });

        idHoraTres = findViewById(R.id.idHoraTres);

        idHoraTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em 8:30", Toast.LENGTH_SHORT).show();
            }
        });

        idHoraQuatro = findViewById(R.id.idHoraQuatro);

        idHoraQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em 9:00", Toast.LENGTH_SHORT).show();
            }
        });

        idHoraCinco = findViewById(R.id.idHoraCinco);

        idHoraCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em Reservar", Toast.LENGTH_SHORT).show();
            }
        });
    }
}