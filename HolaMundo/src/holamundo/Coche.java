/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author usuario
 */
public class Coche {
    
    public static void mostrarModelo(){
         System.out.println("El modelo es Audi ");
    }
    public static void mostrarPrecio(int p){
         System.out.print("El precio inicial es ");
         System.out.println(p);
    }
    public static void mostrarIva(int p, double iva){
        System.out.print("El iva es ");
        System.out.println((p*iva));
          }
    public static double calcularIva(int p, double iva){
       return ((p*iva)+p);      
    }
    public static double calcularDescuento(int p, double dto){
       return (p * dto);
    }
    public static double calcularDescuentoIva(int p, double iva, double dto){
        System.out.print("El precio con iva y aplicado el descuento es ");
        return (Coche.calcularIva(p, iva)*dto);
    }
 }
    

