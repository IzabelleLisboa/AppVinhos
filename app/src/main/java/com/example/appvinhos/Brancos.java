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

public class Brancos extends AppCompatActivity {

    private String[] Regioes = new String[]{"Douro","Alentejo"};

    private int[] NomeDouro = new int[]{R.string.nomebranco1,R.string.nomebranco3,R.string.nomebranco2};
    private int[] DescriDouro= new int[]{R.string.descricaobranco1,R.string.descricaobranco3,R.string.descricaobranco2};
    private int[] precoDouro = new int[]{R.string.precobranco1,R.string.precobarnco3,R.string.precobarnco2};
    private int[] imagensDouro = {R.drawable.branco1,R.drawable.branco3,R.drawable.branco2 };
    private String[] NomeAlentejo = new String[]{"Vinho branco Adega de Borba-Alentejo 2020","Vinho Branco Paulo Laureano VV Private Selection-Alentejo 2019","Vinho Branco Defesa Herdade do Esporão-Alentejo 2021"};
    private String[] DescriAlentejo= new String[]{"Ideal com: Carnes Brancas, Marisco, Peixe, Assados ","Ideal com: Carnes Brancas e Peixe","Ideal com: Marisco e Peixe"};
    private String[] precoAlentejo = new String[]{"3,79 €","6,72 €","11,01 €"};
    private int[] imagensAlentejo = {R.drawable.v1,R.drawable.v3,R.drawable.v2};

    private Spinner sp1;
    private TextView nome1,nome2,nome3;
    private TextView desc1,desc2,desc3;
    private TextView valor1,valor2,valor3;
    private ImageView img1,img2,img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brancos);

        nome1=findViewById(R.id.txtBranco1);
        nome2=findViewById(R.id.txtbranco2);
        nome3 = findViewById(R.id.txtnomebranco3);
        //---------------------------------------
        desc1= findViewById(R.id.txtdescbranco1);
        desc2= findViewById(R.id.textdescbranco2);
        desc3= findViewById(R.id.txtdescbranco3);
        //-------------------------------------------
        valor1= findViewById(R.id.valorbranco1);
        valor2= findViewById(R.id.txtvalorbranco2);
        valor3= findViewById(R.id.txtvalorbranco3);
        //--------------------------------------------------
        img1= findViewById(R.id.imgbranco1);
        img2= findViewById(R.id.imgbranco2);
        img3= findViewById(R.id.imgbranco3);
        //----------------------------------------
        sp1= findViewById(R.id.spinner1);

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
                Toast.makeText(Brancos.this, sp1.getSelectedItem() + "", Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuvinhos,menu);
        menu.removeItem(R.id.idbrancos);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id == R.id.btnsair){
            finish();
        }

        if(id==R.id.idtintos) {
            Intent it = new Intent(Brancos.this, Tintos.class);
            startActivity(it);
            finish();
        }
        if(id==R.id.btnhome) {
            Intent it = new Intent(Brancos.this, Home.class);
            startActivity(it);
            finish();
        }
        if (id==R.id.idespirituosos){
            Intent it = new Intent(Brancos.this,Espirituosos.class);
            startActivity(it);
            finish();
        }if (id==R.id.idlicores){
            Intent it = new Intent(Brancos.this,Licores.class);
            startActivity(it);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}