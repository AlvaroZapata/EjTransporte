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
public class CursoBadajoz_Vectores02 {

    private static Persona [] miVectorPersonas = new Persona [100];
    
    public static void rellenarDatos() {
        
        Persona p;
        for (int i=0; i < miVectorPersonas.length;i++) {
            p = new Persona(); //CREO UNA PERSONA
            p.setNombre("Juan "+i); //le ponemos un nombre aleatorio
            p.setEdad(i); //le ponemos una edad aleatoria
            
            Pokemon pok;
            for (int j=0; j < p.getPokemons().length;j++) {
                pok = new Pokemon(); //CREO UN POKEMON
                pok.setNombre("Pokemon_"+i+"_"+j);
                pok.setPuntuacion(i*j); //puntuación aleatoria, por ejemplo
                p.addPokemon(pok); //añadimos el pokemon a la persona
            }
            
            miVectorPersonas[i] = p; //insertamos p en la posición i de miVectorPersonas
        }
        //Una vez ejecutado el código anterior tengo 100 personas con 10 pokemons cada una
    }
    
    public static void ejercicio01 () {
        //Mostrar el nombre de todas las personas
        for (int i=0; i < miVectorPersonas.length;i++) {
            System.out.println(miVectorPersonas[i].getNombre());
        }
        
        
    }
    
    public static void ejercicio02 () {
        //Mostrar la edad de todas las personas
        
        for( int i=0; i<miVectorPersonas.length;i++){
            System.out.println(miVectorPersonas[i].getEdad());
        }
        
        
    }
        
    
    public static void ejercicio03 () {
        //Mostrar el nombre de la persona de mayor edad
       int maxEdad = miVectorPersonas[0].getEdad(); 
        int x = 0; 
        for (int i=0; i< miVectorPersonas.length;i++) {
            if ( miVectorPersonas[i].getEdad()>maxEdad) {
                maxEdad = miVectorPersonas[i].getEdad();
                x=i;
            }
        }
        System.out.println("El más viejo es "+miVectorPersonas[x].getNombre());
    }
    
    
    public static void ejercicio04 () {
        //Mostrar el nombre de todos los pokemons
        for (int i=0; i<miVectorPersonas.length;i++) {
            System.out.println(miVectorPersonas[i].getNombre()+"Tiene los siguientes pokemons");
            for (int j=0; j<miVectorPersonas[i].getNumPokemons();j++){            
            System.out.println(miVectorPersonas[i].getPokemons()[j].getNombre());
        }
        }       
    }
    
    public static void ejercicio05 () {
        //EJERCICIO COMPLEJO - Mostrar el pokemon que tiene mayor puntuación
        
        int pokemonmax=0;
        int posper=0;
        int pospok=0;
        for (int i=0; i<miVectorPersonas.length;i++) {
            //System.out.println(miVectorPersonas[i].getNombre());
            for (int j=0; j<miVectorPersonas[i].getNumPokemons();j++){ 
                if(miVectorPersonas[i].getPokemons()[j].getPuntuacion()>pokemonmax){
                 pokemonmax = miVectorPersonas[i].getPokemons()[j].getPuntuacion();
                 posper=i;
                 pospok=j;
                }
            
        }
        }
        System.out.println( miVectorPersonas[posper].getPokemons()[pospok].getPuntuacion());
    }   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rellenarDatos();
        
        //ejercicio01();
        //ejercicio02();
        //ejercicio03();
        //ejercicio04();
        ejercicio05();
        
    }
    
}
