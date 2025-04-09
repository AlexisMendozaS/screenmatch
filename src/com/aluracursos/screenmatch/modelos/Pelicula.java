package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {
    private String Director;

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }
}
