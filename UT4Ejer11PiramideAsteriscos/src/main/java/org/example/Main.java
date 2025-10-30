package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int lineaCentral = 4;

        for (int i = 0; i < lineaCentral-1; i++) {
            for (int j = 0; j < (1+i*2) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = lineaCentral-2; i >= 0; i--) {
            for (int j = 0; j < (1+i*2) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = lineaCentral - 3; i >= 0; i--) {
            for (int j = 0; j < (1+i*2) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }






















        /*
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

        for(int linea = lineas; linea>=0; linea++){
            int numEspacio = lineas - 1 - linea;
            for (int i=0; i < numEspacio;i++){
                System.out.print(" ");
            }
            System.out.println(numAsteriscos);

        }

 */
    }
}