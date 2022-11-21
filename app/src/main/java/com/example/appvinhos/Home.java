package com.example.appvinhos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        exibirDialogo();
    }
//incluir menu na activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuvinhos,menu);
        menu.removeItem(R.id.btnhome);
        return super.onCreateOptionsMenu(menu);
    }
    //programar cada botão

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id == R.id.btnsair){
            finish();
        }
        if(id==R.id.idtintos){
            Intent it = new Intent(Home.this,Tintos.class);
            startActivity(it);
            finish();
        }
        if(id==R.id.idbrancos) {
            Intent it = new Intent(Home.this, Brancos.class);
            startActivity(it);
            finish();
        }
        if (id==R.id.idespirituosos){
            Intent it = new Intent(Home.this,Espirituosos.class);
            startActivity(it);
            finish();
        }if (id==R.id.idlicores){
            Intent it = new Intent(Home.this,Licores.class);
            startActivity(it);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void exibirDialogo(){
        AlertDialog.Builder msgbox = new AlertDialog.Builder(this);
        msgbox.setTitle("Verificação de Idade Legal");
        msgbox.setIcon(android.R.drawable.ic_menu_info_details);
        msgbox.setMessage("Tem Idade Legal para consumir bebidas alcólicas ? ");
        msgbox.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {


            }
        });
        msgbox.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        msgbox.show();

    }

}