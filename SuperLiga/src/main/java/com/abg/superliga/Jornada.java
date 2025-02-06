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
    
    public enum TipoJornada {regular, quarto, semi, finales};
    
    int numero;
           ArrayList<Partido> partidos;
           Date fecha;
           TipoJornada tipo;
}
