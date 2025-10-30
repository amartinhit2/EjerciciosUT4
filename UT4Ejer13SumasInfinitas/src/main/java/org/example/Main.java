package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 1;
        int suma = 0;

        while (num != 0 ){
            System.out.print("Inserte un numero: ");
            num = teclado.nextInt();
            suma += num;
        }
        System.out.println("La suma total es: " + suma);
    }
}