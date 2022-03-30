package br.com.etecia.mypets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }

    public void AcessaSistema(View view) {
        Toast.makeText(getApplicationContext(), "Welcome to the jungle", Toast.LENGTH_SHORT).show();
    }
}