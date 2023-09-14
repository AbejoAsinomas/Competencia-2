package com.alejomarquez.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Competencia {
    private List<Equipo> equiposAM;
    private List<Etapa> etapasAM;

    public Competencia() {
        this.equiposAM = new ArrayList<>();
        this.etapasAM = new ArrayList<>();
    }

    public void agregarEquipo(Equipo equipo) {
        if (equiposAM.size() < 5) {
            equiposAM.add(equipo);
        } else {
            System.out.println("La competencia ya tiene 5 equipos, no se puede agregar más.");
        }
    }

    public void agregarEtapa(Etapa etapa) {
        if (etapasAM.size() < 10) {
            etapasAM.add(etapa);
        } else {
            System.out.println("La competencia ya tiene 10 etapas, no se puede agregar más.");
        }
    }

    public List<Equipo> getEquipos() {
        return equiposAM;
    }

    public List<Etapa> getEtapas() {
        return etapasAM;
    }

    public void calcularPuntuacion() {
        for (Equipo equipo : equiposAM) {
            int puntuacion = 0;
            for (Etapa etapa : etapasAM) {
                int tiempoEtapa = etapa.getTiempo();
                puntuacion += 100 - tiempoEtapa;
            }
            equipo.setPuntuacion(puntuacion);
        }
    }

    public void mostrarTablaPosiciones() {
        calcularPuntuacion();

        List<Equipo> equiposConPuntuacion = new ArrayList<>(equiposAM);

        Collections.sort(equiposConPuntuacion, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo equipo1, Equipo equipo2) {
                return Integer.compare(equipo2.getPuntuacion(), equipo1.getPuntuacion());
            }
        });

        System.out.println("Tabla de Posiciones (Top 10):");
        for (int i = 0; i < Math.min(10, equiposConPuntuacion.size()); i++) {
            Equipo equipo = equiposConPuntuacion.get(i);
            System.out.println((i + 1) + ". " + equipo.getNombre() + " = Puntuación: " + equipo.getPuntuacion());
        }
    }

}
