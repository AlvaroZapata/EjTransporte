/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author usuario
 */
public class Intercambio extends Alumno {

private String univ_origen;     

    public String getUniv_origen() {
        return univ_origen;
    }

    public void setUniv_origen(String univ_origen) {
        this.univ_origen = univ_origen;
    }

    public Intercambio(String univ_origen, String nombre, int edad) {
        super(nombre, edad);
        this.univ_origen = univ_origen;
    }


}
