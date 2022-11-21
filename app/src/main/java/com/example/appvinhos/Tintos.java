package com.example.appvinhos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Tintos extends AppCompatActivity {

    private String[] Alentejo = new String[]{"Alentejo","Douro"};
    private int[] imagens = {R.drawable.esp1, R.drawable.esp2,R.drawable.esp3};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tintos);
    }

    //incluir menu na activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuvinhos,menu);
        menu.removeItem(R.id.idtintos);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id == R.id.btnsair){
            finish();
        }

        if(id==R.id.idbrancos) {
            Intent it = new Intent(Tintos.this, Brancos.class);
            startActivity(it);
            finish();
        }
        if(id==R.id.btnhome) {
            Intent it = new Intent(Tintos.this, Home.class);
            startActivity(it);
            finish();
        }
        if (id==R.id.idespirituosos){
            Intent it = new Intent(Tintos.this,Espirituosos.class);
            startActivity(it);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}