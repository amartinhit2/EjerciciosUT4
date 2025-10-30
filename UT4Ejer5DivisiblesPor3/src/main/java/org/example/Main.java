package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        String texto = teclado.nextLine();
        int numero = Integer.parseInt(texto);

        for(int i = 1; i <= numero; i++){
            if(i % 3 == 0){
                System.out.println("El numero " + i + " es divisible por 3");
            }
            else{
                System.out.println("El numero " + i + " no es divisible por 3");
            }
        }

    }
}