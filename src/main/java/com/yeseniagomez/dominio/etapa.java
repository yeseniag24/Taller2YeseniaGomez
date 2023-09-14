package com.yeseniagomez.dominio;

public class etapa {

    private int numeroEtapaYG;
    private double distanciaYG;
    private String dificultad;

    public etapa(int numeroEtapaYG, double distanciaYG){
        this.numeroEtapaYG=numeroEtapaYG;
        this.distanciaYG=distanciaYG;

    }

    public int getNumeroEtapaYG() {
        return numeroEtapaYG;
    }

    public double getDistanciaYG() {
        return distanciaYG;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDistanciaYG(double distanciaYG) {
        this.distanciaYG = distanciaYG;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }
}
