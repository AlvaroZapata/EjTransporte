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
public class MNoOficial extends Master{
    
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public MNoOficial(String titulo, String especialidad, int codigo, String ciudad, Facultad facultad) {
        super(especialidad, codigo, ciudad, facultad);
        this.titulo = titulo;
    }
    
    
    
}
