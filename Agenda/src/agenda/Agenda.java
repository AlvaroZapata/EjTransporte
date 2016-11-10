/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author usuario
 */
public class Agenda {

    private static final Contacto[] contacto = new Contacto[20];

    public static void añadirContacto() {
        for (int i = 0; i < contacto.length; i++) {
            Contacto c = new Contacto();
            c.setNombre("Juan" + i);
            c.setTelefono(+i);
            contacto[i] = c;
            //System.out.print(contacto[i].getNombre()+" ");   
        }

    }

    public static void eliminarContacto(String nombre) {
        int a = 0;
        for (int i = 0; i < contacto.length; i++) {
            if (contacto[i].getNombre().equals(nombre)) {
                contacto[i] = null;
                System.out.print("La posicion esta vacia ");
                System.out.println("*********");

            }

        }

    }

    public static void mostrarContactos() {
        for (Contacto contacto1 : contacto) {
            if (contacto1 != null) {
                System.out.println(contacto1.getNombre());
            }
               
        }

    }

    public static void mostrarContacto(String nombre) {
        for (Contacto contacto1 : contacto) {
            if (contacto1 != null) {
                if (contacto1.getNombre().equals(nombre)) {
                    System.out.println(contacto1.getNombre());
                }
            }
        }
    }

    public static void main(String[] args) {
        añadirContacto();

        eliminarContacto("Juan11");
        mostrarContacto("Juan13");
        mostrarContactos();
    }

}
