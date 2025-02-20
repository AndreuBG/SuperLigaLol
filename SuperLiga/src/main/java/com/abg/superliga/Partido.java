/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abg.superliga;

/**
 *
 * @author andreu
 */
public class Partido {

    private int id;
    private Equipo equipoRojo;
    private Equipo equipoAzul;
    private String resultado;
    private String hora;
    private Jugador mvp;

    public Partido(int id, Equipo equipoRojo, Equipo equipoAzul, String resultado, String hora, Jugador mvp) {
        this.id = id;
        this.equipoRojo = equipoRojo;
        this.equipoAzul = equipoAzul;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public Equipo getEquipoRojo() {
        return equipoRojo;
    }

    public Equipo getEquipoAzul() {
        return equipoAzul;
    }

    public String getResultado() {
        return resultado;
    }

    public String getHora() {
        return hora;
    }

    public Jugador getMvp() {
        return mvp;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setMvp(Jugador mvp) {
        this.mvp = mvp;
    }
    
    

}
