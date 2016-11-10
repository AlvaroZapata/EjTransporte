/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extremadura;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Provincia {
    //private Localidad [] localidades = new Localidad[300];
    private ArrayList <Localidad> localidades=new ArrayList<Localidad>();
    //private int num_localidades =0;
    private String nombre;
    private double extension;

    public ArrayList<Localidad> getLocalidades() {
        return localidades;
    }

    public void setLocalidades(ArrayList<Localidad> localidades) {
        this.localidades = localidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }
    public void addLocalidad (Localidad localidad){
        this.localidades.add(localidad);
    }
}
