/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Facultad {
    
    
   ArrayList<Estudio> estudios = new ArrayList<>();
   
   private static int num_facultades;
    
    private String direccion;
    private String ciudad;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public void anadirEstudio(Estudio estu){
        estudios.add(estu);
    }
    
     public void mostrar(){
        System.out.println(this.ciudad);
        System.out.println(this.direccion);
        System.out.println(this.estudios);
        
    }

    public Facultad(String direccion, String ciudad) {
        if (num_facultades <100){
        this.direccion = direccion;
        this.ciudad = ciudad;
        num_facultades++;
    }
    }
     
     
    
}
