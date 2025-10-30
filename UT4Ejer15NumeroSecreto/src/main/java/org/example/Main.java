package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto = teclado.nextLine();
        int num = Integer.parseInt(texto);
        int numal = (int) (Math.random()*10)+1;
        int contador = 1;

        while (num != numal){
            System.out.print("Escribe un numero del 1 al 10:");
            num = teclado.nextInt();
            if (num > numal){
                System.out.println("El numero secreto es menor");
                contador++;
            }
            if (num < numal) {
                System.out.println("El numero secreto es mayor");
                contador++;
            }

            }
        System.out.println("Lo realizaste en: " + contador);
        System.out.println("Acertaste");
    }
}
