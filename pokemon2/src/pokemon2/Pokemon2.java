/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon2;

import java.util.ArrayList;

public class Pokemon2 {

    static ArrayList<Persona> personas = new ArrayList<Persona>();

    public static void rellenarDatos() {
        Persona p;
        pokemon pok;
        for (int i = 0; i < 100; i++) {
            p = new Persona();
            p.setNombre("ASH" + i);
            p.setEdad(i);
            for (int j = 0; j < 10; j++) {
                pok = new pokemon();
                pok.setDatos("Pikachu" + i+j, i*j);
                p.addPokemon(pok);

            }
            personas.add(p);

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
