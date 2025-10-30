package org.example;

public class GeneradorCodigo {

    private int longitud;
    private String codigo;

    public GeneradorCodigo(int longitud) {
        this.longitud = longitud;
        this.codigo = "";
    }

    public void generarCodigo() {
        codigo = "";
        for (int i = 0; i < longitud; i++) {
            int numal = (int) (Math.random() * 10);
            codigo += numal;
        }
    }


    public String toString() {
        generarCodigo();
        String s = "";
        s += "Su codigo es: " + codigo;
        return s;
    }
}
