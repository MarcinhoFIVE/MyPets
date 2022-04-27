package br.com.etecia.mypets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edtUsuario, edtSenha;
    Button btnEntrar, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        edtUsuario = findViewById(R.id.etUser);
        edtSenha = findViewById(R.id.etPass);
        btnEntrar = findViewById(R.id.btnEntrar);
        btnSair = findViewById(R.id.btnSair);

        //Evento de click nos botões
        btnEntrar.setOnClickListener(View -> {
                if (edtUsuario.getText().toString().equals("hello") && edtSenha.getText().toString().equals("world")) {
                    Toast.makeText(LoginActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                    //Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));


                } else {
                    Toast.makeText(LoginActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        );
        
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void AcessaSistema(View view) {

    }
}