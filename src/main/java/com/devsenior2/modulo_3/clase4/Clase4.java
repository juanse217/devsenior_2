package com.devsenior2.modulo_3.clase4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase4 {
    public static void main(String[] args) {
        // Manejo de excepciones.
        ejemplo2();
    }

    public static void ejemplo1() {
        Scanner sc = new Scanner(System.in);
        boolean lecturaExitosa = false;

        do {

            try {
                System.out.println("Dame un numerador: ");
                int numerador = sc.nextInt(); // Puede botar un mismatchexception
                // sc.nextLine();

                System.out.println("Ingrese denominador: ");
                int denominador = sc.nextInt(); // Puede botar un mismatrexception
                // sc.nextLine();

                int result = numerador / denominador; // Puede botar un ArithmeticException si el denominador es 0.
                                                      // Unchecked

                lecturaExitosa = true; // Si llega aqui es porque no hubo excepciones.

                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre 0" + e.getMessage());
                sc.nextLine(); // Debemos limpiar el buffer dentro del catch para que se pase a la siguiente
                               // linea.
            } catch (InputMismatchException e) {
                System.out.println("Entrada no valida");
                sc.nextLine();
            }

        } while (!lecturaExitosa);// Mientras sea falso

        sc.close();
    }

    public static void ejemplo2() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        do {
            try {
                System.out.println("dame el numerador");
                int numerador = sc.nextInt();
                System.out.println("Dame el denominador");
                int denominador = sc.nextInt();

                if (denominador == 0) {
                    throw new DivisionInvalidaException("No se puede dividir entre 0");
                }
                int result = numerador / denominador;
                System.out.println(result);
                exit = true;

            } catch (DivisionInvalidaException e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        } while (!exit);
        sc.close();
    }
}
