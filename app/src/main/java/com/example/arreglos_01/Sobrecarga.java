package com.example.arreglos_01;

import java.util.Arrays;

public class Sobrecarga {

    /*
    Sobrecargar un metodo es tener más de un metodo con el mismo nombre
    pero con diferentes parametros y dependiendo tambien difente lógica

    *Para seleccionar un metodo de sobrecarga se hace con base en los parametros
    * */
    public void prueba(){
        System.out.println("prueba");
    }

    public double calculateIMC(double altura, double peso){
        double imc= (peso/(altura*altura));
        return imc;
    }

    public void calculateIMC(double altura, double peso,String nombre){
        double imc= (peso/(altura*altura));
        System.out.println("El usuario "+nombre+" tiene un IMC de "+imc);
    }

    public int calculateIMC(int peso, int altura){
        int imc= (peso/(altura*altura));
        return imc;
    }

    public String calculateIMC(String peso,String altura){
        double pesoD= Double.parseDouble(peso);
        double alturaD= Double.parseDouble(altura);
        double imc= pesoD/(alturaD*alturaD);
        return imc+"";
    }

    //Clases de java -> un paquete de funciones y/o metodos
    //Math class
    //Elevar un número a un exponente n
    public void pruebaMathClass(){
        //metodo pow permite elevar un número a cualquier potencia
        double cuadrado= Math.pow(8,2);
        double cubo= Math.pow(5,3);
        //metodo max que me devuelve el valor mayor entre 2 números
        double max= Math.max(cuadrado,cubo);
        //metodo min que me devuelve el valor minimo entre 2 números
        double min= Math.min(cuadrado,cubo);
        //metodo raiz cuadrada
        double raiz= Math.sqrt(cubo);
        //Dentro de la clase Math se tienen constantes como PI y Euler
        double areaCirculo= Math.PI*Math.pow(3,2);

        double equation= Math.sqrt((cubo+cuadrado-areaCirculo)/min);
    }

    public void pruebaClaseArray(){
        int [] numeros={2,34,55,69,74,100,1};
        int [] numeros1={2,34,56,96,41,100};

        //Si un arreglo A es igual a un arreglo B
        boolean result=Arrays.equals(numeros1,numeros);
        //El metodo para imprimir un arreglo completo
        System.out.println(Arrays.toString(numeros1));

        //El metodo sort en cualquier lenguaje de programación significa ordenar
        Arrays.sort(numeros);
        System.out.println(numeros);
    }

}
