/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4arraylistbanco;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author usuario
 */
public class Ej4ArrayListBanco {

    static ArrayList<Banco> bancos_es = new ArrayList<Banco>();
    static ArrayList<Banco> bancos_por = new ArrayList<Banco>();
    static ArrayList<Caja> cajas = new ArrayList<Caja>();

    public static void rellenarDatos() {
        Banco b;
        Caja c;
        for (int i = 0; i < 10; i++) {
            b = new Banco();
            b.setNombre("SANTANDER" + i);
            b.setNum_sucursales(10 * i);
            b.setNº_acciones(10 - i);
            bancos_es.add(b);
            
             b = new Banco();
            b.setNombre("BBVA" + i);
            b.setNum_sucursales(10 * i);
            b.setNº_acciones(10 - i);
            bancos_por.add(b);

            c = new Caja();
            c.setNombre("Caja" + 1);
            c.setNum_sucursal(100 * i);
            c.setNº_socios(80 * i);
            cajas.add(c);

        }

    }

    //  1  Esta funcion recibe 2 bancos crea uno nuevo, borra los recividos y lo mete de nuevo en el vector y lo devuelve.
    public static Banco fusionar(int b1, int b2) {
        Banco banconuevo = new Banco();
        banconuevo.setNombre("Nuevo Banco");
        banconuevo.setNum_sucursales(bancos_es.get(b1).getNum_sucursales() + bancos_por.get(b2).getNum_sucursales());
        banconuevo.setNº_acciones(bancos_es.get(b1).getNº_acciones() + bancos_por.get(b2).getNº_acciones());

        bancos_es.remove(b1);
        bancos_por.remove(b2);
        bancos_es.add(banconuevo);
        System.out.println(banconuevo.getNombre() + " " + banconuevo.getNum_sucursales() + " " + banconuevo.getNº_acciones());
        return banconuevo;
    }
    //  2  Recibe 2 bancos , crea uno nuevo y lo devuelve 
     //Comentado porque solo puede haber sobrecarga cuando la cabezera es distinta.
    /*public static Banco fusionar(Banco b1, Banco b2) {
        Banco banconuevo = new Banco();
        banconuevo.setNombre("Banco popular NUEVA");
        banconuevo.setNum_sucursales(b1.getNum_sucursales() + b2.getNum_sucursales());
        banconuevo.setNº_acciones(b1.getNº_acciones() + b2.getNº_acciones());

        System.out.println(banconuevo.getNombre() + " " + banconuevo.getNum_sucursales() + " " + banconuevo.getNº_acciones());
        return banconuevo;
    }
    */
    
    // 4  Recibe 2 bancos, los fusiono en el primero de ellos, borro el segundo y lo devuelvo.
   
    
    //  5   Recibe vector de banco y 2 enteros (posiciones), los fusiono en el primero y lo devuelve y borra el segundo
    
    //Comentado porque solo puede haber sobrecarga cuando la cabezera es distinta.
    
     /* public static Banco fusionar(ArrayList<Banco> vector, int x, int y) {
          Banco b1 = vector.get(x);
          Banco b2 = vector.get(y);
          
          b1.setNombre("Banco nuevo");
          b1.setNº_acciones(b1.getNº_acciones()+b2.getNº_acciones());
          b1.setNum_sucursales(b1.getNum_sucursales()+b2.getNum_sucursales());
       
          bancos.remove(y);
          return b1;

    }
   */   
      public static Caja fusionar(ArrayList<Caja> vector, int x, int y){
          Caja c1 = vector.get(x);
          Caja c2 = vector.get(y);
          
          c1.setNombre("Caja nueva");
          c1.setNum_sucursal(c1.getNum_sucursal()+c2.getNum_sucursal());
          c1.setNº_socios(c1.getNº_socios()+c2.getNº_socios());
          cajas.remove(y);
          return c1;
          
          
      }
      
      

    public static Caja fusionar(Caja c1, Caja c2) {

        Caja cajanueva = new Caja();
        cajanueva.setNombre("CAJA NUEVA ");
        cajanueva.setNum_sucursal(c1.getNum_sucursal() + c2.getNum_sucursal());
        cajanueva.setNº_socios(c1.getNº_socios() + c2.getNº_socios());

        System.out.println(cajanueva.getNombre() + " " + cajanueva.getNum_sucursal() + " " + cajanueva.getNº_socios());
        return cajanueva;
    }

    public static void mostrarTodosPorNumSucursal() {
        for (Iterator<Banco> iterator = bancos_es.iterator(); iterator.hasNext();) {
            Banco Ban = iterator.next();
            System.out.println(Ban.getNombre());

        }

    }

    public static void main(String[] args) {
        rellenarDatos();

        fusionar(3,1);
        //fusionar(bancos.get(3), bancos.get(1));
        fusionar(cajas.get(7), cajas.get(4));
        //mostrarTodosPorNumSucursal();
        //fusionar(bancos_es, 1, 2);
        fusionar(cajas, 0, 0);
    }

}
