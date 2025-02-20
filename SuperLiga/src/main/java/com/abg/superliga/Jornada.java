/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abg.superliga;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author andreu
 */
public class Jornada {

    public enum TipoJornada {
        regular, quarto, semi, finales
    };

    private int numero;
    private ArrayList<Partido> partidos;
    private Date fecha;
    private TipoJornada tipo;

    public Jornada(int numero, ArrayList<Partido> partidos, Date fecha, TipoJornada tipo) {
        this.numero = numero;
        this.partidos = partidos;
        this.fecha = fecha;
        this.tipo = tipo;
    }


    public int getNumero() {
        return numero;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public Date getFecha() {
        return fecha;
    }

    public TipoJornada getTipo() {
        return tipo;
    }

}
