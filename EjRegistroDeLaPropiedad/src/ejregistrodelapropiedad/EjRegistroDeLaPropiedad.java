/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejregistrodelapropiedad;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author usuario
 */
public class EjRegistroDeLaPropiedad {

    static ArrayList<Inmueble> inmuebles = new ArrayList<>();

    public static void rellenarDatos() {
        Rustico r;
        Urbano u;
        Propietario p;

        for (int i = 0; i < 10; i++) {
            r = new Rustico();
            r.setNum_registro("registro " + i);
            r.setSuperficie(Math.random() + i);
            r.setDireccion("Direccion" + i);

            p = new Propietario();
            p.setNombre("Juan " + i);
            p.setEmail("@.com " + i);
            p.setTlf(6666 + i);
            r.setPropietarios(p);

            inmuebles.add(r);
        }
        for (int i = 0; i < 10; i++) {
            u = new Urbano();
            u.setNum_registro("registro " + i);
            u.setSuperficie(i + Math.random());
            u.setCultivo("Cultivo" + i);
            p = new Propietario();
            p.setNombre("Juan " + i);
            p.setEmail("@.com " + i);
            p.setTlf(6666 + i);
            u.setPropietarios(p);

            inmuebles.add(u);

        }
    }

    public static void eliminarInmueble(int pos) {
        inmuebles.remove(pos);
        System.out.println("El inmueble se ha borrado");

    }

    public static void eliminarInmueble(String registro) {
        for (int i = 0; i < inmuebles.size(); i++) {
            while (registro.equals(inmuebles.get(i).getNum_registro())) {
                inmuebles.remove(i);
                System.out.println("El inmueble se ha borrado mediante la posicion " + registro);
            }
        }

    }

    public static Inmueble unir(Inmueble c1, Inmueble c2) {
        Inmueble inmueblenuevo = new Inmueble();
        inmueblenuevo.setNum_registro(" Nuevo Registro " + Math.random() * 10);
        inmueblenuevo.setSuperficie(c1.getSuperficie() + c2.getSuperficie());
        inmuebles.remove(c2);
        System.err.println("Numero de registro de la nueva propiedad: " + inmueblenuevo.getNum_registro() + " Superficie " + inmueblenuevo.getSuperficie());
        return inmueblenuevo;

    }

    public static void unir(ArrayList<Inmueble> vector, int pos1, int pos2) {
        

        Inmueble in1 = vector.get(pos1);
        Inmueble in2 = vector.get(pos2);
        
        if (in1.getClass() == in2.getClass()) {
            Inmueble nuevo = null;
            if (in1 instanceof Urbano) {
                nuevo = new Urbano();
               ((Urbano)nuevo).setCultivo("Nuevo cultivo");
            
            } else if (in1 instanceof Rustico) {

                nuevo = new Rustico();
                ((Rustico)nuevo).setDireccion("La nueva direccion es ");
            }

            nuevo.setSuperficie(in1.getSuperficie() + in2.getSuperficie());
            nuevo.setNum_registro("9999");
            nuevo.setPropietarios(in1.getPropietarios());

            vector.remove(pos1);
            vector.remove(in2);

            vector.add(nuevo);

        } else {
            System.out.println("No se pueden unir porque no son de la misma clase");
        }
    }

    public static void dividir(Inmueble inmu, int porcentaje, Propietario pro) {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        rellenarDatos();
        //eliminarInmueble(3);
        //eliminarInmueble(inmuebles.get(4).getNum_registro());
        eliminarInmueble("registro " + 1);
        unir(inmuebles.get(1), inmuebles.get(2));
        unir(inmuebles, 4, 6);
    }

}
