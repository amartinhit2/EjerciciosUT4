package es.masanz.ut4.ej26;

public class GeneradorPalabras {
    private static final String PALABRAS_FIJAS = "gato pero rana leon osos";
    private static final String PALABRAS_VARIABLES = "gatooo perrro rana leon osos";


    public static String obtenerPalabraFija(){
        int longitudPalabra = 0;
        int contador = 1;
        for (int i = 0; i < PALABRAS_FIJAS.length();i++){
            char c = PALABRAS_FIJAS.charAt(i);
            if (c == ' '){
                contador++;
            }
        }

        System.out.println(contador);

        for (int i = 0; i < PALABRAS_FIJAS.length(); i++) {
            char c = PALABRAS_FIJAS.charAt(i);
            if (c != ' '){
                longitudPalabra++;
            } else {
                break;
            }

        }


        int numal = (int) (Math.random()*contador);

        return PALABRAS_FIJAS.substring(numal*(longitudPalabra+1), numal*(longitudPalabra+1) + longitudPalabra);


        }

    public static String obtenerPalabraDinamica(int numPalabra) {
        int contadorEspacios = 0;
        int posIni = 0;
        int posFin = PALABRAS_VARIABLES.length();
        // Buscar posicion inicial de la palabra
        for (int i = 0; i < PALABRAS_VARIABLES.length(); i++) {
            char c = PALABRAS_VARIABLES.charAt(i);
            if (c == ' ') {
                contadorEspacios++;
            }
            if (contadorEspacios == numPalabra) {
                if (i != 0) {
                    posIni = i + 1;
                } else {
                    posIni = i;
                }
                break;
            }
        }
        // Buscar posicion final de la palabra
        for (int i = posIni; i < PALABRAS_VARIABLES.length(); i++) {
            char c = PALABRAS_VARIABLES.charAt(i);
            if (c == ' ') {
                posFin = i;
                break;
            }
        }
        return PALABRAS_VARIABLES.substring(posIni, posFin);
    }
}
