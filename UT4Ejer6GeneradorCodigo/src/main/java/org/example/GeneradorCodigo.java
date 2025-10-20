package org.example;

public class GeneradorCodigo {

    private int longitud;
    private String codigo;

    public GeneradorCodigo() {
        this.longitud = 16;
    }

    public String generarCodigo() {
        codigo = "";
        for (int i = 0; i < longitud; i++) {
            int numal = (int) (Math.random() * 10);
            codigo += numal;
        }
        return codigo;
    }

    public String toString() {
        generarCodigo();
        return "Su codigo es ";
    }
}
