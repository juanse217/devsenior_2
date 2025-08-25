package com.devsenior2.modulo_3.clase3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Clase3 {
    public static void main(String[] args) {
        // Se habla de errores y excepciones. 
        //No es una buena practica agrupar varias lineas que lanzan excepciones en un solo try si estas no son dependientes ya que si atrapa una, el resto del try no se ejecuta. 
        try {

            // EXCEPTIONES
            String text = "abc";
            int number = Integer.parseInt(text);
            System.out.println(number);

            int resultado = 10 / 0;
            System.out.println(resultado);

            int[] arr = { 1, 2, 3 };
            System.out.println(arr[5]);


            FileReader reader = new FileReader("file.txt");
            reader.close();

        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException |  IOException e ) { //Usamos solo IOException, no FileNotFoundException ya que el segunddo hereda de la primera.
            System.err.println(e);
        } finally {
            System.out.println("finally block");
        }

        CuentaBanco cuenta = new CuentaBanco(10);

        try {
            cuenta.retirar(11); // este nos requiere manejar la excepcion. 
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
