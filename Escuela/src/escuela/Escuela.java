/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

import java.util.ArrayList;
import java.util.Iterator;

public class Escuela {

    static ArrayList<Persona> personas = new ArrayList<>();

    public static void rellenarDatos() {

        Alumno alu;
        Profesor pro;
        ProfesorInterino proin;

        for (int i = 0; i < 20; i++) {
            alu = new Alumno();
            alu.setNombre("Manuel " + i);
            alu.setEdad((int) (Math.random() * 5));
            personas.add(alu);

            pro = new Profesor();
            pro.setNombre("Paco " + i);
            pro.setEdad((int) (Math.random() * 10));
            pro.setEspecialidad("Ciencias " + i);
            personas.add(pro);

            proin = new ProfesorInterino();
            proin.setNombre("Pedro " + i);
            proin.setEdad((int) (Math.random() * 10));
            proin.setEspecialidad("Lengua " + i);
            proin.setPuntos(10 * i);
            personas.add(proin);
        }

    }

    public static void mostrarProfesor() {
        int EdadMax = 0;
        Profesor perEdadMax = null;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i) instanceof Profesor) {

                if (EdadMax < personas.get(i).getEdad()) {
                    EdadMax = personas.get(i).getEdad();
                    perEdadMax = (Profesor) personas.get(i);

                }

            }
        }
        System.out.println("El profesor con la edad mas vieja es " + perEdadMax.getNombre() + " Su edad " + perEdadMax.getEdad());

    }

    public static void mostrarAlumno() {
        int EdadMin = 999999;
        Alumno perEdadMin = null;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i) instanceof Alumno) {

                if (EdadMin > personas.get(i).getEdad()) {
                    EdadMin = personas.get(i).getEdad();
                    perEdadMin = (Alumno) personas.get(i);

                }

            }
        }
        System.out.println("El alumno con la edad mas joven es " + perEdadMin.getNombre() + " Su edad " + perEdadMin.getEdad());

    }

    public static void CambiarEspecialidad(Profesor p, String nueva) {
       p.setEspecialidad("especialidad");
        

    }

    public static void main(String[] args) {
        // TODO code application logic here

        rellenarDatos();
        mostrarProfesor();
        mostrarAlumno();
        Profesor prof = null;
        int i = 0;
        int encontrado =0;
        while (i < personas.size()&& (encontrado==0)){
            if(personas.get(i) instanceof Profesor){
                encontrado =1;
                prof =(Profesor) personas.get(i);
            }
            i++;
        }
        CambiarEspecialidad(prof, "Ciencias sociales");
    }
}
