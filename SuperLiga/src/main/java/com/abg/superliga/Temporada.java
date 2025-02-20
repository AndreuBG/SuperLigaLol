/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abg.superliga;

import java.util.ArrayList;

/**
 *
 * @author andreu
 */
public class Temporada {

    private int año;
    private int split;
    private ArrayList<Partido> clasificacion = new ArrayList<>();
    private ArrayList<Jornada> jornadas = new ArrayList<>();;

    public Temporada(int año, int split, ArrayList<Partido> clasificacion, ArrayList<Jornada> jornadas) {
        this.año = año;
        this.split = split;
        this.clasificacion = clasificacion;
        this.jornadas = jornadas;
    }

    public int getAño() {
        return año;
    }

    public int getSplit() {
        return split;
    }

    public ArrayList<Partido> getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(ArrayList<Partido> clasificacion) {
        this.clasificacion = clasificacion;
    }

    public ArrayList<Jornada> getJornadas() {
        return jornadas;
    }

}
