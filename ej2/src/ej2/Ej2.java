/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

/**
 *
 * @author usuario
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int i=0;
 int [] vector1;
 int[] vector2;
 vector1=new int[10];
 vector2=new int[10];
 int min=0;
 int max=0;
 
 
        for (i=0; i<vector1.length; i++){
            vector1[i]=(int)(Math.random() *100);
            System.out.println(vector1[i]);
        }
           
        min=vector1[0]; 
        
        for(i=0;i<vector1.length;i++){
            if (vector1[i]<min){
                min=vector1[i];
            }
        }
            
        for (i=0; i<vector2.length; i++){
            vector2[i]=(int)(Math.random() *100);
        }
                 
         max=vector2[0];   
          for(i=0;i<vector2.length;i++){
            if (vector2[i]>max){
              max=vector2[i];  
            }
               
        }
          System.out.println("el min"+min); 
          System.out.println("el max"+max);   

    }
}
    

