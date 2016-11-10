/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faro;

/**
 *
 * @author usuario
 */
public class Tienda {
   public double superficie;
   public int numeroDeLocal;
   public double precio;
   private String nombre;
    
    public double devolverSuperficie(){
     return this.superficie;  
    }
    public double mostrarNumeroDeLocal(){
     return this.numeroDeLocal;  
    }
    public double devolverPrecio(){
     return this.precio;  
    }
    public void setNombre(String n){
        this.nombre=n;
    }
    public String getNombre(){
    return this.nombre;
    }
    
}
        
      
    

    

