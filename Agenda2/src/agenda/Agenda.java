/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Agenda {

    //static Contactos[] contactos = new Contactos[20];
    public static ArrayList<Contactos> contactos = new ArrayList<Contactos>();

    public static void rellenarDatos() {

        Contactos cont;
        for (int c = 0; c < 10; c++) {
            cont = new Contactos();
            cont.setNombre("NOMBRE PERSONA " + c);
            cont.setEdad(39 + c);
            cont.setTelefono(644777888 + c);

            contactos.add(cont);
        }

    }

    public static void eliminarContacto(String nombre) {
        for (int c = 0; c < contactos.size(); c++) {
            if (nombre.equals(contactos.get(c).getNombre())) {
                //lo he encontrado y esta en la posicion "c".
                contactos.remove(c);
                

            }
        }
    }

    public static void mostrarContacto(String nombre) {
        for (int c = 0; c < contactos.size(); c++) {
            if (nombre.equals(contactos.get(c).getNombre())) {
                //lo he encontrado y esta en la posicion "c".
                System.out.println(contactos.get(c).getNombre());
                System.out.println(contactos.get(c).getEdad());
                System.out.println(contactos.get(c).getTelefono());
                

            }
        }
    }
/*
    public static void mostrarContactos() {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null) {
            System.out.println("MUESTRA EL NOMBRE DEL CONTACTO: " + contactos[i].getNombre() + ". Edad: " + contactos[0].getEdad() + ". " + i);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        rellenarDatos();
        String c = "NOMBRE PERSONA ";
        eliminarContacto("NOMBRE PERSONA 1");
        eliminarContacto("NOMBRE PERSONA 3");
        mostrarContacto("NOMBRE PERSONA 7");
        for (int i = 0; i<contactos.size();i++){
            System.out.println(contactos.get(i).getNombre());
        }
        //mostrarContactos();
    }

}
