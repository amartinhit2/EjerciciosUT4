package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce cantidad de numero por linea: ");
        int numPorLinea = teclado.nextInt();

        System.out.print("Introduce el numero hasta el que se mostrara: ");
        int numtotal = teclado.nextInt();

        for (int i = 1; i <= numtotal; i++){
            System.out.printf("%-4d",i);
           if (i%numPorLinea==0){
               System.out.println();
           }
        }
    }
}