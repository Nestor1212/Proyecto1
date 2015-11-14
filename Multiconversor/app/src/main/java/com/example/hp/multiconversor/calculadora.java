package com.example.hp.multiconversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        final EditText entrada = (EditText) findViewById(R.id.entrada);
        final EditText entrada2 = (EditText) findViewById(R.id.entrada2);
        final TextView resultadocalc = (TextView) findViewById(R.id.resultadocalc);

        Button bsumar = (Button) findViewById(R.id.bsumar);
        Button brestar = (Button) findViewById(R.id.brestar);
        Button bmultiplicar = (Button) findViewById(R.id.bmultiplicar);
        Button bdividir = (Button) findViewById(R.id.bdividir);

        //Enventos click btnes

        final Double resul = 0.0;

        //Boton para la suma
        bsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Entrada
                double val = Double.parseDouble(entrada.getText().toString());
                double val2 = Double.parseDouble(entrada2.getText().toString());
                //Proceso
                Double resul = val + val2;
                //Salida
                resultadocalc.setText("La suma es: "+resul.toString());





            }
        });
        brestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Entrada
                double val = Double.parseDouble(entrada.getText().toString());
                double val2 = Double.parseDouble(entrada2.getText().toString());
                //Proceso
                Double resul = val - val2;
                //Salida
                resultadocalc.setText("La resta es: "+resul.toString());





            }
        });

        bmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Entrada
                double val = Double.parseDouble(entrada.getText().toString());
                double val2 = Double.parseDouble(entrada2.getText().toString());
                //Proceso
                Double resul = val * val2;
                //Salida
                resultadocalc.setText("La multiplicacion es: " + resul.toString());






            }
        });

        bdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Entrada
                double val = Double.parseDouble(entrada.getText().toString());
                double val2 = Double.parseDouble(entrada2.getText().toString());
                //Proceso
                Double resul = val / val2;
                //Salida
                resultadocalc.setText("La division es: "+resul.toString());





            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculadora, menu);
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
