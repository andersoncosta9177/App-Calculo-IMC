package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultado;
   private  EditText peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = findViewById(R.id.editPeso);
        altura = findViewById(R.id.editAltura);
        resultado = findViewById(R.id.resultado);



    }
     
    public void Calcular(View view){
        double Peso = Double.parseDouble(peso.getText().toString());
        double Altura = Double.parseDouble(altura.getText().toString());
         double imc = Peso  / (Altura * Altura);
         imc = (int)imc;
         if(imc < 18.5){
             resultado.setText( "IMC: " + imc + "  ABAIXO DO PESO");
         }else if(imc >= 18.5 && imc  < 24.9){
             resultado.setText("IMC: " + imc + "  PESO IDEAL");
         }else if(imc >= 25 && imc < 29.9){
             resultado.setText("IMC: " + imc + " SOBREPESO");
         }else if(imc >= 30 && imc  < 34.9){
             resultado.setText("IMC: " + imc + " OBESIDADE GRAU 1:");
         }else if(imc >= 35 && imc < 39.9){
             resultado.setText("IMC: " + imc + " OBESIDADE GRAU 2");
         }else if(imc >= 40){
             resultado.setText("IMC: " + imc + " OBESIDADE MORBIDA");
         }
    }


}