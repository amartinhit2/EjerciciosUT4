package es.masanz.ut4.ej26;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*String nombre = "Alejandro Martinez Hita";

        for (int i =0; i < nombre.length(); i++){
            char c = nombre.charAt(i);
            if (c == ' '){
                System.out.println();
            }
            System.out.print(c);
        }
        System.out.println();
         */

        String palabra = GeneradorPalabras.obtenerPalabraFija();
        System.out.println(palabra);

        System.out.println(GeneradorPalabras.obtenerPalabraDinamica(2));

    }
}