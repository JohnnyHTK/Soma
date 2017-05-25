package com.example.martinsj.myapplication2;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button valorsoma = (Button) findViewById(R.id.btCalcular);
        //final Button valorsub = (Button) findViewById(R.id.sub);
        final Button limpar = (Button) findViewById(R.id.btLimpar);
        final TextView txtTeste = (TextView)findViewById(R.id.resutado);
        //final EditText valornome = (EditText) findViewById(R.id.editText);
        final EditText valora = (EditText) findViewById(R.id.txtValor1);
        final EditText valorb = (EditText) findViewById(R.id.txtValor2);

        final String[] recebeTexto = {null};


        txtTeste.setVisibility(View.INVISIBLE);



        /*enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txtTeste.setText("FUI PRESSIONADO");

                recebeTexto[0] = editText.getText().toString();


            }
        });*/

        valorsoma.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                /*txtTeste.setText(valora.getText());
                txtTeste.setVisibility(View.VISIBLE);*/

                if(!valora.getText().toString().equals("") && !valorb.getText().equals("")){


                    double a = Double.parseDouble(valora.getText().toString());
                    double b = Double.parseDouble(valorb.getText().toString());

                    double soma = a + b;
                    txtTeste.setText(""+soma);
                    txtTeste.setVisibility(View.VISIBLE);


                }else{
                    txtTeste.setText("ERROR, CAMPO VAZIO");
                    txtTeste.setVisibility(View.VISIBLE);

                }

            }
        });

        /*valorsub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            if(!valora.getText().toString().equals("") && !valorb.getText().equals("") && !valornome.getText().equals("")) {
                String nome = valornome.getText().toString();
                double a = Double.parseDouble(valora.getText().toString());
                double b = Double.parseDouble(valorb.getText().toString());

                double sub = a - b;
                txtTeste.setText(nome + "\n" +
                        "O valor da subtração foi: " + sub);
                txtTeste.setVisibility(View.VISIBLE);
            }else{

                txtTeste.setText("ERROR, CAMPO VAZIO");
                txtTeste.setVisibility(View.VISIBLE);

            }

            }
        });*/
        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valora.setText("");
                valorb.setText("");
                txtTeste.setVisibility(View.INVISIBLE);
            }
        });
    }
}
