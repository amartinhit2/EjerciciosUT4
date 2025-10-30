package es.masanz.ut4.ej29;

import es.masanz.ut4.ej29.util.ColoresConsola;
import es.masanz.ut4.ej29.util.GeneradorPalabras;

import static es.masanz.ut4.ej29.util.ColoresConsola.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        System.out.println("-".repeat(55));
        System.out.printf("| %4s | %-17s | %11s | %-10s |\n","ID","Jugador","Puntuacion","Rango");
        System.out.println("-".repeat(55));

        int id = 1;

        while (true){
            int puntuacion = (int) (Math.random()*201);
            String nombre = GeneradorPalabras.obtenerPalabraDinamica();

            String color = "";
            String pintarEn = "";
            if (puntuacion < 50){
                //rojo
                color = "ROJO";
                pintarEn = ROJO;
            } else if (puntuacion <= 100) {
                //amarillo
                color = "AMARILLO";
                pintarEn = AMARILLO;
            }else {
                //verde
                color = "VERDE";
                pintarEn = VERDE;
            }

            System.out.printf("| "+ pintarEn +"%4d"+RESET+" | " + pintarEn + "%-17s" + RESET + " | " + pintarEn + "%11s" + RESET + " | " + pintarEn + "%-10s" + RESET + " |\n", id, nombre, puntuacion, color);
            System.out.println("-".repeat(55));

            int numeroSalida = (int) (Math.random()*100);
            if (numeroSalida < 5){
                break;
            }
            id++;
        }
    }
}