package org.example;

public class Temporizador {

    private int tiempoInicial;

    public Temporizador(int tiempoInicial){
        this.tiempoInicial = tiempoInicial;
    }

    public void initemporizador() throws InterruptedException {
        for (int i = tiempoInicial; i >= 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

}
