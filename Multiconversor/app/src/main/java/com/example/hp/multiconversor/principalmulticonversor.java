package com.example.hp.multiconversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class principalmulticonversor extends AppCompatActivity {

    private Button bmoneda;
    private Button bcalculadora;
    private Button btemperatura;
    private Button blongitud;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principalmulticonversor);

        bmoneda=(Button)findViewById(R.id.bmoneda);
        bcalculadora=(Button)findViewById(R.id.bcalculadora);
        btemperatura=(Button)findViewById(R.id.btemperatura);
        blongitud=(Button)findViewById(R.id.blongitud);


        bmoneda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent(principalmulticonversor.this, divisas.class);

                startActivity(intent1);
            }
        });

        bcalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent2 = new Intent(principalmulticonversor.this, calculadora.class);

                startActivity(intent2);
            }
        });

        btemperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent3 = new Intent(principalmulticonversor.this, temperatura.class);

                startActivity(intent3);
            }
        });

        blongitud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent4 = new Intent(principalmulticonversor.this, longitud.class);

                startActivity(intent4);
            }
        });









    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principalmulticonversor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
