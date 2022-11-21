package com.example.appvinhos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Tintos extends AppCompatActivity {

    private String[] Regioes = new String[]{"Douro","Alentejo"};

    private int[] NomeDouro = new int[]{R.string.nometinto1,R.string.nometinto3,R.string.nometinto2};
    private int[] DescriDouro= new int[]{R.string.descricaotinto1,R.string.descricaotinto3,R.string.descricaotinto2};
    private int[] precoDouro = new int[]{R.string.precotinto1,R.string.precotinto3,R.string.precotinto2};
    private int[] imagensDouro = {R.drawable.tinto1,R.drawable.tinto3,R.drawable.tinto2 };
    private String[] NomeAlentejo = new String[]{"Vinho Tinto Esteva da Casa Ferreirinha - Douro 2020","Vinho Tinto Titan of Douro -Douro 2019","Vinho Tinto grande reserva Flor do Tua - trás-os-montes 2019"};
    private String[] DescriAlentejo= new String[]{"Ideal com: carnes brancas, peixe, bacalhau, carnes vermelhas, queijos  ","Ideal com: carnes vermelhas, queijos, assados, caça ","Ideal com: Queijos"};
    private String[] precoAlentejo = new String[]{"4,25 €","44,14 €","13,40 €"};
    private int[] imagensAlentejo = {R.drawable.vd1,R.drawable.vd3,R.drawable.vd2};

    private Spinner sp1;
    private TextView nome1,nome2,nome3;
    private TextView desc1,desc2,desc3;
    private TextView valor1,valor2,valor3;
    private ImageView img1,img2,img3;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tintos);

        nome1=findViewById(R.id.txtnometinto1);
        nome2=findViewById(R.id.txtnometinto2);
        nome3=findViewById(R.id.txtnametinto3);
        //---------------------------------------
        desc1= findViewById(R.id.txtdesctinto1);
        desc2= findViewById(R.id.txtdesctinto2);
        desc3= findViewById(R.id.txtdesctinto3);
        //-------------------------------------------
        valor1= findViewById(R.id.txtprecotinto1);
        valor2= findViewById(R.id.txtprecotinto2);
        valor3= findViewById(R.id.txtprecotinto3);
        //--------------------------------------------------
        img1= findViewById(R.id.imgtinto1);
        img2= findViewById(R.id.imgtinto2);
        img3= findViewById(R.id.imgtinto3);
        //----------------------------------------
        sp1= findViewById(R.id.spinner3);

        ArrayAdapter<String> wine = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,Regioes);
        sp1.setAdapter(wine);

        //APLICAR O CÓDIGO AO EVENTO DE SELEÇÃO DAS AÇÕES
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    img1.setImageResource(imagensDouro[0]);
                    nome1.setText(NomeDouro[0]);
                    desc1.setText(DescriDouro[0]);
                    valor1.setText(precoDouro[0]);
                    img2.setImageResource(imagensDouro[1]);
                    nome2.setText(NomeDouro[1]);
                    desc2.setText(DescriDouro[1]);
                    valor2.setText(precoDouro[1]);
                    img3.setImageResource(imagensDouro[2]);
                    nome3.setText(NomeDouro[2]);
                    desc3.setText(DescriDouro[2]);
                    valor3.setText(precoDouro[2]);
                }
                if (i == 1){
                    img1.setImageResource(imagensAlentejo[0]);
                    nome1.setText(NomeAlentejo[0]);
                    desc1.setText(DescriAlentejo[0]);
                    valor1.setText(precoAlentejo[0]);
                    img2.setImageResource(imagensAlentejo[1]);
                    nome2.setText(NomeAlentejo[1]);
                    desc2.setText(DescriAlentejo[1]);
                    valor2.setText(precoAlentejo[1]);
                    img3.setImageResource(imagensAlentejo[2]);
                    nome3.setText(NomeAlentejo[2]);
                    desc3.setText(DescriAlentejo[2]);
                    valor3.setText(precoAlentejo[2]);
                }
                Toast.makeText(Tintos.this, sp1.getSelectedItem() + "", Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


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