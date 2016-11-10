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
public class Grado extends Estudio{
    private int duracion;

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println(this.duracion);
        
        
        
    }

    public Grado(int duracion, int codigo, String ciudad, Facultad facultad) {
        super(codigo, ciudad, facultad);
        this.duracion = duracion;
    }
    
    
}
