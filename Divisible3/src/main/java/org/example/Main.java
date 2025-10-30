package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String texto = teclado.nextLine();
        int num = Integer.parseInt(texto);

        for (int i=1; i < num; i++){
            if (i % 3 == 0 ){
                System.out.println(i + " Es divisible");
            } else {
                System.out.println(i + " No es divisible");
            }
        }

    }
}