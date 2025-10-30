package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Inserte un numero");
        String texto = teclado.nextLine();
        int lineas = Integer.parseInt(texto);

        String numAsteriscos = "*";
        for(int linea = 1; linea<lineas; linea++){
            int numEspacio = lineas - 1 -linea;
            for (int i=0; i < numEspacio;i++){
                System.out.print(" ");
            }
            System.out.println(numAsteriscos);
            numAsteriscos = "*"+numAsteriscos+"*";
        }
    }
}