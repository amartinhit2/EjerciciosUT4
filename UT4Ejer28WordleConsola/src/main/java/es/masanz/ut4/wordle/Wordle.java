package es.masanz.ut4.wordle;

import es.masanz.ut4.wordle.util.GeneradorPalabras;

import java.util.Scanner;

import static es.masanz.ut4.wordle.util.ColoresConsola.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Wordle {
    public static void main(String[] args) {
        int intentos = 0;


        String palabraDia = GeneradorPalabras.obtenerPalabraDinamica();

        System.out.println("La palabra del dia es de " + palabraDia.length() + " Caracteres");

        Scanner teclado = new Scanner(System.in);


        while (intentos != 6){
            System.out.print("\nEscribe una palabra: ");
            String palabraJugador = teclado.nextLine();

            if (palabraJugador.length() > palabraDia.length() || palabraJugador.length() < palabraDia.length()){
                System.out.println("La palabra que escribiste no es valida");
            }else {
                intentos++;
            }

            char us;
            char dia;

            for (int i = 0; i < palabraDia.length(); i++){
                us = palabraJugador.charAt(i);
                dia = palabraDia.charAt(i);
                String usSTring = "" + us;
                if (us == dia){
                    System.out.print(VERDE + us + RESET);
                } else if (palabraDia.contains(usSTring)) {
                    System.out.print(AMARILLO + us + RESET);
                } else {
                    System.out.print(ROJO + us + RESET);
                }
            }
            if (palabraJugador.equals(palabraDia)){
                System.out.println("\nHas ganado");
                break;
            } else if (intentos >= 6) {
                System.out.println("\nHas perdido");
            }

        }

    }
}