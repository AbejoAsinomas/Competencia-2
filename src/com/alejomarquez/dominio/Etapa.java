package com.alejomarquez.dominio;

public class Etapa {
    private int numeroAM;
    private int tiempoAM; // Tiempo en segundos

    public Etapa(int numero, int tiempo) {
        this.numeroAM = numero;
        this.tiempoAM = tiempo;
    }

    public int getNumero() {
        return numeroAM;
    }

    public int getTiempo() {
        return tiempoAM;
    }
}
