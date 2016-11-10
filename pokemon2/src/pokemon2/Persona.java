/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon2;

import java.util.ArrayList;

/**
 *
 * @author jesus
 */
public class Persona {
    private String nombre;
    private int edad;
    
    int numPokemons = 0; //inicialmente tenemos cero pokemons en el vector siguiente
    //Pokemon2[] pokemons = new Pokemon2[10];
   private ArrayList <pokemon> pokemons=new ArrayList<pokemon>();
   
   public void addPokemon(pokemon p){
       this.pokemons.add(p);
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumPokemons() {
        return numPokemons;
    }

    public void setNumPokemons(int numPokemons) {
        this.numPokemons = numPokemons;
    }

    public ArrayList<pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<pokemon> pokemons) {
        this.pokemons = pokemons;
    }
   
  
    
    
    
}
