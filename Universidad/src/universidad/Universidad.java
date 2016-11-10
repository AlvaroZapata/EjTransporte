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
public class Universidad {

   
    
    static ArrayList<Facultad> facultades = new ArrayList<>();

    public static void rellenarDatos() {
        Facultad fa;
        Estudio es;
        Grado gra;
        Master ma;
        MPostgrado mp;
        MNoOficial mn;
        Becario be;
        Intercambio in;
        Regular re;
        for (int i = 0; i < 10; i++) {
            fa = new Facultad("CALLE CAROLINA CORONADO"+i, "Badajoz");
            //fa.setDireccion("CALLE CAROLINA CORONADO");
            //fa.setCiudad("Badajoz");
            
            es = new Estudio(22, "Madrid", fa );
            //es.setCiudad("Madrid");
            //es.setCodigo(22);
            fa.anadirEstudio(es);
            
            gra = new Grado(8000, 33, "MADRID", fa);
            //gra.setCiudad("MADRID");
            //gra.setCodigo(33);
            //gra.setDuracion(8000);
            fa.anadirEstudio(gra);
            
            be = new Becario("Educacion", "Juan", 22);
            //be.setNombre("Juan");
            //be.setEdad(22);
            //be.setDepartamento("EDUCACION");
            
            
            in = new Intercambio("Montijo", "Paco", 23);
            //in.setNombre("PACO");
            //in.setEdad(23);
            //in.setUniv_origen("MONTIJO");
            
            re = new Regular("Luis ", 24);
            //re.setNombre("LUIS");
            //re.setEdad(24);
            
            
            ma = new Master("MATH", 44, "Sevilla", fa);
            //ma.setCiudad("Sevilla");
            //ma.setCodigo(44);
            //ma.setEspecialidad("MATH");
            ma.anadirAlumno(be);
            fa.anadirEstudio(ma);
            
            
            mp = new MPostgrado("ciencias sociales ", "CIENCIA", 55, "Valladolid", fa);
            //mp.setCiudad("Valladolid");
            //mp.setCodigo(55);
            //mp.setEspecialidad("Ciencia");
            //mp.setEstudiosprevios("CIENCIAS SOCIALES");
            mp.anadirAlumno(re);
            fa.anadirEstudio(mp);
            
            mn = new MNoOficial("INGENIERO", "ARQ", 66, "Merida", fa);
            //mn.setCiudad("Merida");
            //mn.setCodigo(66);
            //mn.setEspecialidad("ARQ");
            //mn.setTitulo("INGENIERO");
            mn.anadirAlumno(in);
            fa.anadirEstudio(mn);
            facultades.add(fa);
 
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
    }

}
