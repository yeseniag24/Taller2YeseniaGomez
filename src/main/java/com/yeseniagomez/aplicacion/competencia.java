package com.yeseniagomez.aplicacion;

import com.yeseniagomez.dominio.Competencia;
import com.yeseniagomez.dominio.etapa;
import com.yeseniagomez.dominio.corredor;
import com.yeseniagomez.dominio.equipo;

public class competencia {
    public static void main(String[] args) {

        Competencia laCompetencia = new Competencia("ruta Rionegro2023");



        equipo equipo1 = new equipo("Medellin");
        equipo equipo2 = new equipo("Bogota");
        equipo equipo3 = new equipo("pasto");
        equipo equipo4 = new equipo("pereira");
        equipo equipo5 = new equipo("Barranquila");


        corredor corredor1 = new corredor("yesenia");
        corredor corredor2 = new corredor("alejandro");
        corredor corredor3 = new corredor("laura");
        corredor corredor4 = new corredor("julian");
        corredor corredor5 = new corredor("juliana");

        equipo1.agregarCorredor(corredor1);
        equipo2.agregarCorredor(corredor2);

        etapa etapa1 = new etapa(1,20);

        laCompetencia.agregarEquipo(equipo1);








}
