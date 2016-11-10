/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon2;

/**
 *
 * @author jesus
 */
public class pokemon {
    private String nombre;
    private int puntuacion;

    
    public void setDatos(String name, int punt){
        this.nombre=name;
        this.puntuacion=punt;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    
}
