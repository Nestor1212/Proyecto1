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

public class temperatura extends AppCompatActivity {
    // VARIABLES

    private Spinner sptemperatura;
    private TextView lbresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        lbresultado=(TextView)findViewById(R.id.lbresultado);
        sptemperatura=(Spinner)findViewById(R.id.sptemperatura);

        final EditText editemp=(EditText) findViewById(R.id.editemp);
        final String [] elementos =
                new String[]{" ","Convertir Celcius a Farenheit","Convertir Celcius a Kelvin","Convertir Farenheit a Celcius","Convertir Farenheit a Kelvin",
                        "Convertir Kelvin a Celcius","Convertir Kelvin a Farenheit"};

        //adaptador con un array java

        ArrayAdapter <String> adaptadorT=
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item,elementos);


        //...
        adaptadorT.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);


        //...

        sptemperatura.setAdapter(adaptadorT);


        //operaciones en spinner

        sptemperatura.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                        Double r = 0.0;

                        switch (position) {

                            // Celcius - Farenheit
                            case 1: {
                                double valor = Double.parseDouble(editemp.getText().toString());

                                r = ((9*valor)/5)+ 32;

                                lbresultado.setText(r.toString() + " Grados Farenheit");

                            }
                            ;

                            break;

                            //Celcius - Kelvin

                            case 2:

                            {
                                double valor = Double.parseDouble(editemp.getText().toString());

                                r = valor + 273.15;

                                lbresultado.setText(r.toString() + " Grados Kelvin");
                            }
                            ;

                            break;


                            //Farenheit - Celcius

                            case 3:

                            {
                                double valor = Double.parseDouble(editemp.getText().toString());

                                r = (5*(valor-32))/9;

                                lbresultado.setText(r.toString() + " Grados Celcius");

                            }
                            ;

                            break;

                            //Farenheit - Kelvin


                            case 4:

                            {
                                double valor = Double.parseDouble(editemp.getText().toString());

                                r = ((5*(valor-32))/9)+273.15;

                                lbresultado.setText(r.toString() + " Grados Kelvin");

                            }
                            ;

                            break;


                            //Kelvin - Celcius


                            case 5:

                            {
                                double valor = Double.parseDouble(editemp.getText().toString());

                                r = valor - 273.15;

                                lbresultado.setText(r.toString() + " Grados Celcius");

                            }
                            ;

                            break;


                            //Kelvin - Farenheit


                            case 6:

                            {
                                double valor = Double.parseDouble(editemp.getText().toString());

                                r = ((9*(valor - 273.15))/5)+32;

                                lbresultado.setText(r.toString() + " Grados Farenheit");

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
                        getMenuInflater().inflate(R.menu.menu_temperatura, menu);
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
