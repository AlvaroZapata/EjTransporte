/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5arraylistfamilia;

import java.util.ArrayList;
import java.util.Iterator;



/**
 *
 * @author usuario
 */
public class Ej5ArraylistFamilia {
    
    static ArrayList<Familia> familias_es = new ArrayList<Familia>();
    static ArrayList<Familia> familias_por = new ArrayList<Familia>();


public static void rellenardatos(){
    Familia f;
    for (int i = 0; i < 10; i++) {
        f = new Familia();
        f.setCapital(1.1*i);
        f.setEdad(10*i);
        f.setNombre("Perez"+i);
        familias_es.add(f);
        
        f = new Familia();
        f.setCapital(1.1*i);
        f.setEdad(10*i);
        f.setNombre("Gomez"+i);
        familias_por.add(f);
        
        
    }
}

public static Familia casar (int a1, int a2){
    Familia familianueva = new Familia();
    familianueva.setNombre("FAMILIA NUEVA");
    familianueva.setCapital(familias_es.get(a1).getCapital()+familias_por.get(a2).getCapital());
    
    return familianueva;
 
}

public static Familia casar (Familia a1, Familia a2){
    Familia familianueva = new Familia();
    familianueva.setNombre("FAMILIA NUEVA");
    familianueva.setCapital(a1.getCapital()+a2.getCapital());
    

    return familianueva;
}
 
public static void mostrarFamilia (ArrayList<Familia> familia){
    for (Iterator<Familia> iterator = familia.iterator(); iterator.hasNext();) {
        Familia next = iterator.next();
        System.out.println("nombre"+next.getNombre()+" "+next.getCapital());
    }
}
    public static void main(String[] args) {
        // TODO code application logic here
        
       rellenardatos();
      
       
        
        Familia fa = casar(familias_es.get(1), familias_por.get(2));
        System.out.println(fa.getCapital());
        fa = casar(1, 2);
        System.out.println(fa.getCapital());
        
        //mostrarFamilia(familias_es);
        
    }
    
}
