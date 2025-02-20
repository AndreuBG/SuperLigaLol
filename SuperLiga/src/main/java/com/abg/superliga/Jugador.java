/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abg.superliga;


/**
 *
 * @author andreu
 */
public class Jugador {

    private String nombre;
    private String apellido;
    private String nickname;
    private int edad;
    private Rol rol;

    public Jugador(String nombre, String apellido, String nickname, int edad, Rol rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nickname = nickname;
        this.edad = edad;
        this.rol = rol;
    }
    
    public String getNombreJugadorCompleto() {
        return (getNombre() + " (" + getNickname() + ") " + getApellido());
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getEdad() {
        return edad;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

}
