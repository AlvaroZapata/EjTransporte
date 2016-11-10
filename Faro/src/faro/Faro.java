/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faro;

import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author usuario
 */
public class Faro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Tienda tienda1=new Tienda();
        //tienda1.setNombre("Primark");
        //tienda1.numeroDeLocal=18;
        //tienda1.superficie=40000;
        //tienda1.precio=30;
        //Tienda tienda2=new Tienda();
        //tienda2.setNombre("Decimas");
        //tienda2.numeroDeLocal=10;
        //tienda2.superficie=20000;
        //tienda2.precio=50.5;
        //Empleado empleado1=new Empleado();
        //empleado1.setNombre("Juan");
        //empleado1.setEdad(33);
        //empleado1.setCargo("Encargado");
        //empleado1.setSalario(5000);
        //Empleado empleado2=new Empleado();
        //empleado2.setNombre("Leticia");
        //empleado2.setEdad(22);
        //empleado2.setCargo("Dependienta");
        //empleado2.setSalario(1500);
        //System.out.println(tienda1.getNombre());
        //System.out.println(empleado1.getNombre());
        //System.out.println(empleado1.getCargo());     
        
       
   /*  
    int i=11;
    while (i<302){
        
     System.out.println(i); 
     i=i+1;
    }
    i=401;
    while (i>300){
        
     System.out.println(i); 
     i=i-1;
    }
    i=2;
    while (i<129){
     System.out.println(i); 
     i=i*2;
    }
  for(i=2;i<129;i=i*2){
      System.out.println(i); 
     i=i*2;      
  }  
 /* int x;
  int y;
  int z;
  for (x=1; x<=100;x++){
      System.out.println("TIENDA "+x+" DEL FARO ");
      for (y=1;y<=10;y++){
          System.out.println("Tienda "+x+" Productos "+y);
      }
  }
  for (x=1; x<=20;x++){
      for (z=1; z<=20;z++){
          if ((z%2)==0){
      for (y=1;y<=10;y++){
          System.out.println("CENTRO COMERCIAL "+z+" Tienda "+x+" del faro. Productos "+y);
      }
      }
      }

  }
    
   int [] capacidades=new int[8];
   for(int a=0;a<8;a++){
       v[n]="Centro"+n;
       capacidades[a]=100*(a+1);
   }
        */
   
  String [] v;
  v=new String[8];
  v[0]="Faro";
  v[1]="C.ingles";
  v[2]="Mediamark";
  v[3]="Decimas";
  v[4]="Mercadona";
  v[5]="Arbol";
  v[6]="Dia";
  v[7]="Carrefour";
  
     
       
int [] capacidad;
capacidad=new int[8];
capacidad[0]=10;
capacidad[1]=20;
capacidad[2]=30;
capacidad[3]=40;
capacidad[4]=50;
capacidad[5]=60;
capacidad[6]=70;
capacidad[7]=80;


/* Recorre el indice del vector

for(String i: v){
   System.out.println(i);
     }
 }
*/
int  regalos=50;
int  total=0;
for (int i=0; i<8; i++){
System.out.println("El supermercado "+v[i]);
System.out.println(" Tiene una capacidad de "+capacidad[i]);
total=total+capacidad[i]; 

if(regalos>=0) {
 int regalosRep=regalos;   
 regalos=regalos-capacidad[i];
 if(regalos>0)
 System.out.println(" Reparte regalos "+capacidad[i]+"\n");
 else
 {
     System.out.println("Reparte Regalos : "+ regalosRep+"\n");
 }
}
else {
    System.out.println(" No REPARTE REGALOS \n");
}

}
System.out.println(" La capacidad total es  "+total);

    }
    
}
