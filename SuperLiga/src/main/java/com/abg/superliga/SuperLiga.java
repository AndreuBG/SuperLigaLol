/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.abg.superliga;

/**
 *
 * @author andreu
 */
public class SuperLiga {

    public static void main(String[] args) {
        Jugador Andreu = new Jugador("Andreu", "Bifante", "AndreuBG", 18, Rol.MID);
        Jugador Guillem = new Jugador("Guillem", "Rodríguez", "DisnaKing", 18, Rol.ADC);
        Jugador Alan = new Jugador("Alan", "Camarena", "Alanxio07", 19, Rol.SUPP);
        
        
        Entrenador Knekro = new Entrenador("Knekro", "Mondong", "Knegod", 98);
        
        Equipo Mondongers = new Equipo("Mondongers", "MDG");
        
        Mondongers.setEntrenador(Knekro);
        
        Mondongers.añadirTitular(Guillem);
        Mondongers.añadirTitular(Andreu);
        Mondongers.añadirTitular(Alan);
        
        Mondongers.imprimirAlineacion();
        
    }
}
