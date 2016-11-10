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
public class Urbano extends Inmueble{
    private String cultivo;

    public String getCultivo() {
        return cultivo;
    }

    public void setCultivo(String cultivo) {
        this.cultivo = cultivo;
    }

    public Propietario getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(Propietario propietarios) {
        this.propietarios = propietarios;
    }

    
    
}
