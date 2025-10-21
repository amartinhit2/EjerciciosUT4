package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("inserta un numero: ");
        String texto = teclado.nextLine();
        int numero = Integer.parseInt(texto);


        for (int i = 1; i<= 10; i++){
            System.out.println(numero*i);
        }

    }
}