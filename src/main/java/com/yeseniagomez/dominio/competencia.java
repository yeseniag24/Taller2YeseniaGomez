package com.yeseniagomez.dominio;

import java.util.ArrayList;
import java.util.List;

public class Competencia {

    private String nombreYG;
    private List<Equipo> equiposYG;
    private List<Etapa> etapasYG;


    public Competencia(String nombreYG) {
        this.nombreYG = nombreYG;
        this.equiposYG = new ArrayList<>();
        this.etapasYG = new ArrayList<>();
    }


    public void agregarEquipo(Equipo equipo){
        if (equiposYG.size() < 5) {
            equiposYG.add(equipo);
        } else {
            System.out.println("no se puede agregar mas de 5 equipos a la competencia");
        }
    }


    public void agregarEtapa(Etapa etapa) {
        if (etapasYG.size() < 10) {
            etapasYG.add(etapa);
        } else {
            System.out.println("no se puede ingresar mas de 10 etapas");
        }
    }


    public void todosEquipos() {
        System.out.println("Equipos en competencia");
        for (Equipo equipo : equiposYG) {
            System.out.println(equipo.getNombreYG());
        }
    }



