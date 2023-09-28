package com.example.arreglos_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Declaración de un Arreglo (Array)
        /*
        * 1. tipo de dato
        * 2. se agregan []
        * 3. nombre del arreglo
        * 4. Se define su valor o se define su tamaño
        * 5. El tamaño de un arreglo no se puede modificar una vez creado
        * */
        //Arreglo de números
        //Los arreglos inician en la posición 0
        //p0->2 p1=20 p2=70 p3=60 p4=15 p5=6 p6=47
        int [] numeros= {2,20,70,60,15,6,47,1,99,88};
        numeros[2]=33;
        numeros[5]=numeros[0]*numeros[4];
        // {2,20,33,60,15,30,47}
        // Orden
        Arrays.sort(numeros);
        //Arreglo de nombres
        // "Luis;30;1.70;87456963;M;Colombia;Caldas;Manizales"
        String [] nombres= new String[7];
        //split es un metodo de String que separa una cadena de texto con base en un caracter especial
        nombres= "Luis;30;1.70;87456963;M;Colombia;Caldas;Manizales".split(";");

        System.out.println(numeros.length+"-"+nombres.length);
        System.out.println(numeros[5]+2+"-"+nombres[7]);
        System.out.println(Arrays.toString(numeros));


    }
}