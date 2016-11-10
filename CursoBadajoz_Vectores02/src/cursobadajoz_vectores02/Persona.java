/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursobadajoz_vectores02;

/**
 *
 * @author jesus
 */
public class Persona {
    private String nombre;
    private int edad;
    
    int numPokemons = 0; //inicialmente tenemos cero pokemons en el vector siguiente
    Pokemon[] pokemons = new Pokemon[10];

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

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public int getNumPokemons() {
        return numPokemons;
    }

    public void addPokemon (Pokemon p) {
        if (this.numPokemons < pokemons.length) {
            this.pokemons[this.numPokemons] = p;
            this.numPokemons++;
        }
    }

    
    
    
    
    
}
