package com.yeseniagomez.dominio;

import java.util.ArrayList;
import java.util.List;

public class equipo {

    private String nombreYG;
    private String paisYG;
    private List<corredor>corredorsYG;

    public equipo(String nombreYG){
        this.nombreYG=nombreYG;
        this.paisYG=paisYG;
        this.corredorsYG= new ArrayList<>();
    }
    public void agregarCorredor(corredor corredor){
        if (corredorsYG.size()<5){
            corredorsYG.add(corredor);
        }else {
            System.out.println("El equipo ya esta completo");

        }

    }

    public String getNombreYG() {
        return nombreYG;
    }

    public String getPaisYG() {
        return paisYG;
    }

    public List<corredor> getCorredorsYG() {
        return corredorsYG;
    }

    public void setPaisYG(String paisYG) {
        this.paisYG = paisYG;
    }

    public void setCorredorsYG(List<corredor> corredorsYG) {
        this.corredorsYG = corredorsYG;
    }
}
