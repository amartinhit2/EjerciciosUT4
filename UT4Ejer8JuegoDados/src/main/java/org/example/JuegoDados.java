package org.example;

public class JuegoDados {
    private int puntajeDados1;
    private int puntajeDados2;

    public JuegoDados() {
        this.puntajeDados1 = 0;
        this.puntajeDados2 = 0;
    }

    public void jugar(int numRondas){
        for (int i = 0; i < numRondas; i++){
            int tirada1 =lanzarDado();
            int tirada2 =lanzarDado();
            if (tirada1 > tirada2) {
                puntajeDados1++;
            } else if (tirada2 > tirada1) {
                puntajeDados2++;
            }
        }
    }

    public int lanzarDado(){
        int num = (int) (Math.random()*6)+1;
        return num;
    }

    @Override
    public String toString() {
        String s = "";
        if (puntajeDados1 > puntajeDados2){
            s += "1º jugador1 con: " + puntajeDados1 + " puntos\n";
            s += "2º jugador2 con: " + puntajeDados2 + " puntos";
        } else if (puntajeDados2 > puntajeDados1){
            s += "1º jugador2 con: " + puntajeDados2 + " puntos\n";
            s += "2º jugador1 con: " + puntajeDados1 + " puntos";
        } else {
            s += "Hay un empate de: " + puntajeDados2 + "puntos";
        }

        return s;
    }
}
