package com.example.hp.multiconversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemSelectedListener;

public class divisas extends AppCompatActivity {

    // VARIABLES

    private Spinner conversiones;
    private TextView lbresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisas);

        lbresultado=(TextView)findViewById(R.id.lbresultado);
        conversiones=(Spinner)findViewById(R.id.conversiones);

        final EditText moneda=(EditText) findViewById(R.id.moneda);
        final String [] elementos =
                new String[]{" ","Convertir a Euros","Convertir a Pesos Mexicanos","Convertir a Quetzal","Convertir a Lempira",
                        "Convertir a Cordoba","Convertir a Balboa", "Convertir a colon costarricense"};

        //adaptador con un array java

        ArrayAdapter <String> adaptador=
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item,elementos);


        //...
        adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);


        //...

        conversiones.setAdapter(adaptador);


        //operaciones en spinner

        conversiones.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                        Double r=0.0;

                        switch (position){

                            // Dolar a euro
                            case 1: {
                                double valor = Double.parseDouble(moneda.getText().toString());

                                r= valor * 0.92;

                                lbresultado.setText( r.toString() + " Euros (EUR)");

                            }
                            ;

                            break;

                            //Dolar a peso mexicano

                            case 2:

                               {
                                   double valor = Double.parseDouble(moneda.getText().toString());

                                   r= valor * 16.556;

                                   lbresultado.setText( r.toString() + " Peso Mexicanos (MXN)");
                                    }
                                ;

                                break;


                            //Dolar a Quetzal

                            case 3:

                                {
                                    double valor = Double.parseDouble(moneda.getText().toString());

                                    r= valor * 7.6631;

                                    lbresultado.setText(r.toString() + " Quetzales (GTQ)");

                                    }
                                ;

                                break;

                            //Lempira


                            case 4:

                            {
                                double valor = Double.parseDouble(moneda.getText().toString());

                                r= valor * 22.0831;

                                lbresultado.setText( r.toString() + "Lempiras (HNL)");

                            }
                            ;

                            break;


                            //Cordoba


                            case 5:

                            {
                                double valor = Double.parseDouble(moneda.getText().toString());

                                r= valor * 27.7163;

                                lbresultado.setText( r.toString() + "Cordobas (NIO)");

                            }
                            ;

                            break;


                            //Balboa


                            case 6:

                            {
                                double valor = Double.parseDouble(moneda.getText().toString());

                                r= valor * 1;

                                lbresultado.setText(r.toString() + "Balboas (PAB)");

                            }
                            ;

                            break;





                        }




                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {



                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_divisas, menu);
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
