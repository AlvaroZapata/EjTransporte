/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lfp;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public abstract class Equipo {
    
    private String nombre;
    private int anoDeFundacion;
    private Entrenador entrenador;
    private Masajista masajista;
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Masajista getMasajista() {
        return masajista;
    }

    public void setMasajista(Masajista masajista) {
        this.masajista = masajista;
    }

    public ArrayList<Jugador> getJugador() {
        return jugadores;
    }

    public void setJugador(ArrayList<Jugador> jugador) {
        this.jugadores = jugador;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoDeFundacion() {
        return anoDeFundacion;
    }

    public void setAnoDeFundacion(int añoDeFundacion) {
        this.anoDeFundacion = añoDeFundacion;
    }
    
    public void anadirJugador(Jugador ju){
        this.jugadores.add(ju);
    }
    
    public void borrarJugador (Jugador ju){
        this.jugadores.add(ju);
    }
    
    
    
}
