package es.masanz.ut4.ej29.util;

public class ColoresConsola {
        public static final String RESET = "\u001B[0m";
        public static final String ROJO = "\u001B[31m";
        public static final String VERDE = "\u001B[32m";
        public static final String AMARILLO = "\u001B[33m";
        public static final String AZUL = "\u001B[34m";
        public static final String MAGENTA = "\u001B[35m";
        public static final String CIAN = "\u001B[36m";
        public static final String BLANCO = "\u001B[37m";

        public static void imprimirEnRojo(String texto){
            System.out.println(ROJO + texto + RESET);
        }

        public static void imprimirEnVerde(String texto){
            System.out.println(VERDE + texto +RESET);
        }
        public static void imprimirEnAmarillo(String texto){
            System.out.println(AMARILLO + texto +RESET);
        }
        public static void imprimirEnAzul(String texto){
            System.out.println(AZUL + texto +RESET);
        }
        public static void imprimirEnMagenta(String texto){
            System.out.println(MAGENTA + texto +RESET);
        }
        public static void imprimirEnCian(String texto){
            System.out.println(CIAN + texto +RESET);
        }
        public static void imprimirEnBlanco(String texto){
            System.out.println(BLANCO + texto +RESET);
        }


    public static String devolverEnRojo(String texto){
        return ROJO + texto + RESET;
    }

    public static String devolverEnVerde(String texto){
        return VERDE + texto +RESET;
    }
    public static String devolverEnAmarillo(String texto){
        return AMARILLO + texto +RESET;
    }
    public static String devolverEnAzul(String texto){
        return AZUL + texto +RESET;
    }
    public static String devolverEnMagenta(String texto){
        return MAGENTA + texto +RESET;
    }
    public static String devolverEnCian(String texto){
        return CIAN + texto +RESET;
    }
    public static String devolverrEnBlanco(String texto){
        return BLANCO + texto +RESET;
    }
}

