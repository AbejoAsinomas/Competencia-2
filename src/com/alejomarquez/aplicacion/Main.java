package com.alejomarquez.aplicacion;

import com.alejomarquez.dominio.Competencia;
import com.alejomarquez.dominio.Corredor;
import com.alejomarquez.dominio.Equipo;
import com.alejomarquez.dominio.Etapa;

public class Main {
    public static void main(String[] args) {
        Competencia competencia = new Competencia();

        Equipo equipo1 = new Equipo("Equipo 1");
        equipo1.agregarCorredor(new Corredor("Corredor 1"));
        equipo1.agregarCorredor(new Corredor("Corredor 2"));
        equipo1.agregarCorredor(new Corredor("Corredor 3"));
        equipo1.agregarCorredor(new Corredor("Corredor 4"));
        equipo1.agregarCorredor(new Corredor("Corredor 5"));


        Equipo equipo2 = new Equipo("Equipo 2");
        equipo2.agregarCorredor(new Corredor("Corredor 1"));
        equipo2.agregarCorredor(new Corredor("Corredor 2"));

        Equipo equipo3 = new Equipo("Equipo 3");
        equipo3.agregarCorredor(new Corredor("Corredor 1"));
        equipo3.agregarCorredor(new Corredor("Corredor 2"));

        Equipo equipo4 = new Equipo("Equipo 4");
        equipo4.agregarCorredor(new Corredor("Corredor 1"));
        equipo4.agregarCorredor(new Corredor("Corredor 2"));

        Equipo equipo5 = new Equipo("Equipo 5");
        equipo5.agregarCorredor(new Corredor("Corredor 1"));
        equipo5.agregarCorredor(new Corredor("Corredor 2"));
        Equipo equipo6 = new Equipo("Equipo 6");
        equipo6.agregarCorredor(new Corredor("Corredor 1"));
        equipo6.agregarCorredor(new Corredor("Corredor 2"));

        Etapa etapa1 = new Etapa(1, 300);
        Etapa etapa2 = new Etapa(2, 280);
        Etapa etapa3 = new Etapa(3, 245);
        Etapa etapa4 = new Etapa(4, 212);
        Etapa etapa5 = new Etapa(5, 450);
        Etapa etapa6 = new Etapa(6, 187);
        Etapa etapa7 = new Etapa(7, 165);
        Etapa etapa8 = new Etapa(8, 290);
        Etapa etapa9 = new Etapa(9, 350);
        Etapa etapa10 = new Etapa(10, 110);


        //Agregar Equipos
        competencia.agregarEquipo(equipo1);
        competencia.agregarEquipo(equipo2);
        competencia.agregarEquipo(equipo3);
        competencia.agregarEquipo(equipo4);
        competencia.agregarEquipo(equipo5);
        //Agregar Etapas
        competencia.agregarEtapa(etapa1);
        competencia.agregarEtapa(etapa2);
        competencia.agregarEtapa(etapa3);
        competencia.agregarEtapa(etapa4);
        competencia.agregarEtapa(etapa5);
        competencia.agregarEtapa(etapa6);
        competencia.agregarEtapa(etapa7);
        competencia.agregarEtapa(etapa8);
        competencia.agregarEtapa(etapa9);
        competencia.agregarEtapa(etapa10);

        competencia.mostrarTablaPosiciones();
    }
}
