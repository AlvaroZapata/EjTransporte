/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extremadura;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Extremadura {
    
    //static Provincia [] provincias = new Provincia[2];
    public static ArrayList<Provincia> provincias = new ArrayList<Provincia>();

    public static void rellenarDatos(){
        Provincia p= new Provincia();
        p.setNombre("BADAJOZ");
        p.setExtension(234000);
        provincias.add(p);
        
        p = new Provincia();
        p.setNombre("CACERES");
        p.setExtension(1371641);
        provincias.add(p);
        
        Localidad loc;
        ArrayList <Localidad> aux = new ArrayList <Localidad>();
        ArrayList <Localidad> aux2 = new ArrayList <Localidad>();
        for (int i=0;i<300;i++){
            loc = new Localidad();
            loc.setNombre("cachorrilla"+i);
            loc.setHabitantes(0+i);
            aux.add(loc);
            
            loc = new Localidad();
            loc.setNombre("malpartida"+i);
            loc.setHabitantes(0+i);
            aux2.add(loc);
        }
       
            provincias.get(0).setLocalidades(aux);
            provincias.get(1).setLocalidades(aux2); 
            
    }
    
    public static void ejercicio01()
    //nombre de las provincias
    {
       // for (int i = 0; i <provincias.size(); i++) {
         //   System.out.println(provincias.get(i).getNombre());
            
       // }
        for (Provincia p : provincias) {
            System.out.println(p.getNombre());
        }
        
    }
    public static void ejercicio02()
    //numero de las localidades;
    {
    for (Provincia p : provincias) {
        for(Localidad l: p.getLocalidades()){
         System.out.println(l.getNombre());  
            
        }
            
        }
        
    }
    public static void ejercicio03()
    // Numero de los habitatens de las provincias.
    {
        int suma_prov;
       for (Provincia p : provincias) {
           suma_prov=0;
        for(Localidad l: p.getLocalidades()){
         suma_prov=suma_prov + l.getHabitantes();
      
        }
          System.out.println("la suma por provincia es "+suma_prov);  
        }
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        rellenarDatos();
        
        //ejercicio01();
        //ejercicio02();
        ejercicio03();
    }
    
}
