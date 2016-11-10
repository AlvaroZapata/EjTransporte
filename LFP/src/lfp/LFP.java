/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lfp;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author usuario
 */
public class LFP {

    static ArrayList<Equipo> equipos = new ArrayList<>();

    public static void RellenarDatos() {

        EquipoPrimera e;
        EquipoSegunda d;
        Masajista ma;
        Entrenador en;
        Jugador ju;

        for (int i = 0; i < 20; i++) {
            e = new EquipoPrimera();
            e.setNombre("EquipoPrimera " + i);
            e.setAnoDeFundacion(1900 + i);
            e.setCapacidad(100000 + i);
            e.setNombreDelEstadio("Camp Now " + i);
            ArrayList<Jugador> jugadores = new ArrayList<>();

            ma = new Masajista();
            ma.setNombre("Juan " + i);
            ma.setEdad((int) Math.random() * 10);
            ma.setNum_colegiado(i);
            e.setMasajista(ma);

            en = new Entrenador();
            en.setNombre(" Guardiola " + i);
            en.setNacionalidad(" Catalana " + i);
            en.setEdad((int) Math.random() * 10);
            e.setEntrenador(en);

            for (int j = 0; j < 22; j++) {
                ju = new Jugador();
                ju.setNombre("Messi " + j);
                ju.setEdad((int) Math.random() * 10);
                ju.setAltura(Math.random() * 20);
                ju.setPeso(Math.random() * 10);
                e.anadirJugador(ju);
            }
           

            equipos.add(e);

        }

        for (int i = 0; i < 20; i++) {
            d = new EquipoSegunda();
            d.setNombre("EquipoSegunda" + 20 + i);
            d.setAnoDeFundacion(1900 + 20 + i);
           

            ma = new Masajista();
            ma.setNombre("Pedro " + i);
            ma.setEdad((int) Math.random() * 10);
            ma.setNum_colegiado(i);

            en = new Entrenador();
            en.setNombre(" Mourinho " + i);
            en.setNacionalidad(" Portuguesa " + i);
            en.setEdad((int) Math.random() * 10);

            d.setMasajista(ma);
            d.setEntrenador(en);

            for (int j = 0; j < 22; j++) {
                ju = new Jugador();
                ju.setNombre("CR7 " + j);
                ju.setEdad((int) Math.random() * 10);
                ju.setAltura(Math.random() * 20);
                ju.setPeso(Math.random() * 10);
                d.anadirJugador(ju);
            }
           
            
            equipos.add(d);

        }
    }
    
    public static void Traspasar (Equipo origen, Equipo destino, Jugador j){
        destino.anadirJugador(j);
        origen.borrarJugador(j);
        
        
        
        
    }
           

    public static void main(String[] args) {
        RellenarDatos();
        Traspasar(equipos.get(1), equipos.get(2), equipos.get(1).getJugador().get(1));
        
        //System.out.println(equipos.get(4).getJugador().get(3).getNombre());
    

    }

}
