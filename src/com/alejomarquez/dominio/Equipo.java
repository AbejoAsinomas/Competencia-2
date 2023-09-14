package com.alejomarquez.dominio;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreAM;
    private List<Corredor> corredoresAM;
    private int puntuacionAM;

    public Equipo(String nombre) {
        this.nombreAM = nombre;
        this.corredoresAM = new ArrayList<>();
    }

    public String getNombre() {
        return nombreAM;
    }

    public void agregarCorredor(Corredor corredor) {
        if (corredoresAM.size() < 5) {
            corredoresAM.add(corredor);
        } else {
            System.out.println("El equipo ya tiene 5 corredores, no se puede agregar más.");
        }
    }

    public List<Corredor> getCorredores() {
        return corredoresAM;
    }

    public int getPuntuacion() {
        return puntuacionAM;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacionAM = puntuacion;
    }
}
