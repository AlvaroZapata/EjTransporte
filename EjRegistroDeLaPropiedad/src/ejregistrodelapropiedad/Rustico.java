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
public class Rustico extends Inmueble{
    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Propietario getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(Propietario propietarios) {
        this.propietarios = propietarios;
    }

    
    
}
