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
public class Equipo {

    private String nombre;
    private ArrayList<Jugador> titulares = new ArrayList<>();
    private ArrayList<Jugador> reservas = new ArrayList<>();;
    private Entrenador entrenador;
    private String tag;

    public Equipo(String nombre, String tag) {
        this.nombre = nombre;
        this.tag = tag;

    }

    public void imprimirAlineacion() {
        System.out.printf("%-35s %-10s", "NOMBRE", "ROL");
        System.out.println("\n-----------------------------------------");
        for (int i = 0; i < titulares.size(); i++) {
            Jugador jugador = titulares.get(i);
            System.out.printf("\n%-35s %-10s", jugador.getNombreJugadorCompleto(),  jugador.getRol());
        }
        System.out.println("\n-----------------------------------------");
    }
    

    public void añadirTitular(Jugador jugador) {
        titulares.add(jugador);
    }

    public void eliminarTitular(Jugador jugador) {
        titulares.remove(jugador);
    }

    public void añadirReserva(Jugador jugador) {
        reservas.add(jugador);
    }

    public void eliminarReserva(Jugador jugador) {
        reservas.remove(jugador);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Jugador> getTitulares() {
        return titulares;
    }

    public ArrayList<Jugador> getReservas() {
        return reservas;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
