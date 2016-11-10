/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

/**
 *
 * @author usuario
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
     /*   int x=0;
        int y=7;
        int z=-4;
        
        while (x != z) {
            if (y<25){
                y=y+4;
            }
                else{
                    if (z<0){
                        z=z+2;
                        x=x+1;
                        }
                    else{
                        z=z+1;
                        x=x-1;
                        
                    }
                y=y+3;  
            }
           
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("Fin");
        
    
*/
  
     /*
     
     int a=-5;
     int i=4;
     
     while (i<=30){
         i=i*3;
         if (i<5){
             i=a*2;
             
         }
         else {
             i=i+a;
              
         }
         System.out.println("Los valores de i son "+i);
     }
     System.out.println("Resultado final "+i);
*/
    /* 
     int x=0; 
     for(x=0; x<101;x++)
     if (x%2!=0){
         System.out.println("Es impar "+x);
     }
     else{
       System.out.println("Es par "+x);  
     }
*/
 /*   int a=50;
    int b=3;
    if (b%2!=0){
        for(a=0;a<=50;a++){
            System.out.println("Los numeros son; "+a);
        }
      System.out.println("Es impar ");  
    }
    else {
    System.out.println("NO Es impar ");    
    }
 */
 /*
 int x = 0;
 int y = 7;
 int z = -4;
 
 while (x > z) {
     if(y<15){
         y=y+4;
     }
     else {
         if(z<0){
             z=z+2;
         }
         else{
             z=z+1;
             x=x-1;
         }
       y=y+3;  
     }
     System.out.println("x="+x);
     System.out.println("y="+y);
     System.out.println("z="+z);     
 }
 System.out.println("Resultado final de x="+x);
 System.out.println("Resultado final de y="+y);
 System.out.println("Resultado final de z="+z);
 */
 /*
 int p=4;
 int x=0;
 int c=0;
 
 while (p!=8){
     x=x+5;
     p=p+1;
     c++;
 }
 System.out.println("El valor de x="+x);
 */
 /*
 int a=60;
 int b=0;
 int x=100;
 int y=100;
 int z=100;
 
 while (a!=b){
     a=a+10;
     while(x==y){
         x=x+z;
     }
     b=b+20;
     a=a-10;
     y=x;
 }
 System.out.println("El valor de z="+z);
*/
 
/* 
 int [] v;
 int max;
 int min;
 int sum=0;
 int media=0;
 int sumapar=0;
 int numerospares=0;
 v=new int[100];
 int x=0;
 
 for (x=0;x<v.length; x++){
     v[x]=(int)(Math.random()*100);      
     }
for (x=0;x<v.length;x++){
     System.out.println(v[x]);
} 
min=max=v[0];

for(x=0;x<v.length; x++){
 if (v[x]>max){
     max=v[x];
 }  
 if(v[x]<min){
     min=v[x];
 }
  if (x%2==0){
          sumapar=sumapar+v[x];
          numerospares=v[x];
        }
  
  if(x>=v.length-10){
         v[x]=0;   
        }
 sum=sum+v[x];
 System.out.println(v[x]); 
 
 
}
media=sum/v.length;
System.out.println("El numero max="+max);
System.out.println("El numero min="+min);
System.out.println("la media es "+media);
System.out.println("la suma de los pares es "+sumapar);
*/

//Ejercicio del dni:


//declarar todas las variables
/*
char[] letras=new char[23];
letras[0]='T';
letras[1]='O';
letras[2]='P';
letras[3]='Q';
letras[4]='R';
letras[5]='S';
ETC... 

declarar variables implicita;
final char[]letras={'T','R','W','A','G',
              'M','Y','F','P','D',
              'X','B','N','J','Z',
              'S','Q','V','H','L',
              'C','K','E'};
int x=56999545;
for (int i=0; i<letras.length;i++){
    System.out.println(letras[i]);
       
}
System.out.println("con letra"+letras[x%23]);
*/
//otra forma;
int x=56999545;
String letras=new String("TRWAGMYFPDXBNJZSQVHLCKE");
//System.out.println(x+"con letra"+letras.charAt(x%23));


char[] texto1={'a','b','c','s','z','w'};
char[] texto2= new char[texto1.length];

for(int i=0; i<texto1.length;i++){ 
  texto2[texto1.length-i-1]=texto1[i];
}
System.out.println(texto1);
System.out.println("**************");
System.out.println(texto2);

}
}
