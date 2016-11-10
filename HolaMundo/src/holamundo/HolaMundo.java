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
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=85;
        int y=85;
        int z=85;
                
if(x>=y){     
    if (x>y){
        System.out.println(" x="+x + " es mayor que y="+y);
        int w=x;
            if (w>=z){
                    if (w>z){
                System.out.println("x"+x+"es mayor que z"+z);
                System.out.println("El mayor de los 3 es x="+x);
                    }
                    else{
                     System.out.println("z"+z+"es mayor que x"+x);   
                    }
                }
    
            }
        else {
            System.out.println("x"+x+"es igual a y"+y);
            int w=x;
                if (w<=z){
                    if (w>=z){
                      if(w>z){
                        System.out.println("El mayor de los 3 es z="+z);    
                        }
                        else{
                         System.out.println("Los 3 valores son iguales "+z+" "+x+" " +y);   
                        }
                    }
                else{
                    System.out.println("z"+z+"es mayor que x e y  "+x    +y);   
                    }
                }
          }
    
    }
else {
       System.out.println("y="+y+"es mayor a x="+x);
       int w=y;
       if (z<=w){
            System.out.println("El mayor de los 3 es y"+y);
            }
        else{
           System.out.println("El mayor de los 3 es z"+w); 
       }
}

     
        
        int p=20000;
        double iva=0.21;
        double dto=0.5;
        Coche.mostrarModelo();
        Coche.mostrarPrecio(p);
        Coche.mostrarIva(p, iva);
        System.out.print("El precio con iva  ");
        System.out.println(Coche.calcularIva(p,iva));
        System.out.print("El precio con el descuento  ");
        System.out.println(Coche.calcularDescuento(p, dto));
        System.out.println(Coche.calcularDescuentoIva(p,iva, dto));
      
    }
    
    
    
    
    }

   

