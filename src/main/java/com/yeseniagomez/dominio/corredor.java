package com.yeseniagomez.dominio;

public class corredor {
    private String nombreYG;
    private int edadYG;
    private String equipoYG;


    public corredor(String nombreYG, String equipoYG){
        this.nombreYG=nombreYG;
        this.equipoYG=equipoYG;
    }

    public String getNombreYG() {
        return nombreYG;
    }

    public int getEdadYG() {
        return edadYG;
    }

    public String getEquipoYG() {
        return equipoYG;
    }

    public void setEquipoYG(String equipoYG) {
        this.equipoYG = equipoYG;
    }
}
