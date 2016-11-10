/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6herenciavehiculo;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author usuario
 */
public class Ej6HerenciaVehiculo {

    static ArrayList<Vehiculo> vehiculo = new ArrayList<Vehiculo>();

    public static void rellenarDatos() {
        Coche c;
        Camion cam;
       
        
        for (int i = 0; i < 10; i++) {
            
            
            c = new Coche();
            c.setMarca("NISSAN"+i);
            c.setNum_puertas((int) (i + Math.random()*10));
            vehiculo.add(c);
        }
        for (int i = 0; i < 5; i++) {
            cam = new Camion();

            cam.setMarca("TOYOTA"+i);
            cam.setNum_ejes((int) (i+Math.random()*10));
            vehiculo.add(cam);
        }
    }

    public static void mostrarVehiculos() {
     for (Vehiculo v: vehiculo){
         System.out.println("Marca "+v.getMarca());
         if (v instanceof Coche) {
          ((Coche) v).getNum_puertas();
             System.out.println("Numero de puertas "+((Coche) v).getNum_puertas());
             
         } else if (v instanceof Camion) {
           ((Camion)v).getNum_ejes();
             System.out.println("Numero de ejes "+((Camion)v).getNum_ejes());
           
            
         }
         
         //System.out.println(v.getClass().getName());
     }
    }

    public static void main(String[] args) {

        rellenarDatos();
        mostrarVehiculos();

        

    }

}
