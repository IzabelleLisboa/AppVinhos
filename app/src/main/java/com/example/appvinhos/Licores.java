package com.example.appvinhos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Licores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licores);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuvinhos,menu);
        menu.removeItem(R.id.idlicores);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id == R.id.btnsair){
            finish();
        }

        if(id==R.id.idbrancos) {
            Intent it = new Intent(Licores.this, Brancos.class);
            startActivity(it);
            finish();
        }
        if(id==R.id.btnhome) {
            Intent it = new Intent(Licores.this, Home.class);
            startActivity(it);
            finish();
        }
        if (id==R.id.idtintos){
            Intent it = new Intent(Licores.this,Tintos.class);
            startActivity(it);
            finish();
        }if (id==R.id.idespirituosos){
            Intent it = new Intent(Licores.this,Espirituosos.class);
            startActivity(it);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}