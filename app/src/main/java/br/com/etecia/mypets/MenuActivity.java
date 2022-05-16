package br.com.etecia.mypets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.menu_pets, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.icCadastrar:
                Toast.makeText(getApplicationContext(),"Cadastrado com sucesso!", Toast.LENGTH_LONG).show();
                break;
            case R.id.icAlterar:
                Toast.makeText(getApplicationContext(),"Alterado com sucesso!", Toast.LENGTH_LONG).show();
                break;
            case R.id.icDelete:
                Toast.makeText(getApplicationContext(), "Excluído com sucesso!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.icPesquisar:
                Toast.makeText(getApplicationContext(), "Pesquisa realizada!", Toast.LENGTH_SHORT).show();
                break;
            default:
        }

        return super.onOptionsItemSelected(item);
    }
}