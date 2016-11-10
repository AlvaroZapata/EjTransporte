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
public class Estudio {
    
   ArrayList<Alumno> alumnos = new ArrayList<>();
    
    private int codigo;
    private String ciudad;
    private Facultad facultad;

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public void anadirAlumno(Alumno alum){
        alumnos.add(alum);
    }
    
    public void mostrar(){
        System.out.println(this.ciudad);
        System.out.println(this.codigo);
        System.out.println(this.facultad);
        System.out.println(this.alumnos);
        
    }

    public Estudio(int codigo, String ciudad, Facultad facultad) {
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.facultad = facultad;
    }
    
    
    
}
