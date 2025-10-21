package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingresa un numero: ");
        String texto = teclado.nextLine();
        int numero = Integer.parseInt(texto);

        /* 
        for(int i=1; i <=numero; i=i+2){
            if (i % 2==1) {
                System.out.println(i);
            }
            System.out.println(i);
        }
*/

        for(int i=1; i <=numero; i=i+2){
            System.out.println(i);
        }
    }
}