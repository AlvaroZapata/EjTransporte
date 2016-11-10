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
public class MPostgrado extends Master{
    private String estudiosprevios;

    public String getEstudiosprevios() {
        return estudiosprevios;
    }

    public void setEstudiosprevios(String estudiosprevios) {
        this.estudiosprevios = estudiosprevios;
    }

    public MPostgrado(String estudiosprevios, String especialidad, int codigo, String ciudad, Facultad facultad) {
        super(especialidad, codigo, ciudad, facultad);
        this.estudiosprevios = estudiosprevios;
    }
    
    
    
}
