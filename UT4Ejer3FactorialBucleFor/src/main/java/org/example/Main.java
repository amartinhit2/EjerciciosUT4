package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        String texto = teclado.nextLine();
        int numero = Integer.parseInt(texto);
        
        int resultado = 1;

        for(int i = numero; i > 0; i--){
            resultado = resultado * i;
        }

        System.out.println("El factorial de " + numero + " es: " + resultado);

    }
}