/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejregistrodelapropiedad;

/**
 *
 * @author usuario
 */
public class Inmueble {
    
    private String num_registro;
    private double superficie;
    Propietario propietarios;

    public Propietario getPropietarios() {
        return propietarios;
    }

    public String getNum_registro() {
        return num_registro;
    }

    public void setNum_registro(String num_registro) {
        this.num_registro = num_registro;
    }

    public void setPropietarios(Propietario propietarios) {
        this.propietarios = propietarios;
    }

    

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

   
}
