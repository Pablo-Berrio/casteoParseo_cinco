package org.example;

public class Main {
    public static void main(String[] args) {
        //ESCRIBE UN PROGRAMA QUE TOME UNA CADENA DE CARACTERES QUE REPRESENTA UN NUMERO EN NOTACION CIENTIFICA
        //(POR EJEMPLO "3.14e-2") Y LO CONVIERTA EN SU EQUIVALENTE EN FORMATO DECIMAL.
        //UTILIZA EL METODO Double.parseDouble() PARA REALIZAR LA CONVERSION.

        String numeroCientifico= "3.14e-2";
        double numeroDecimal= Double.parseDouble(numeroCientifico);

        System.out.println(numeroDecimal);


    }
}