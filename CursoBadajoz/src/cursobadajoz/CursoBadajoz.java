/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursobadajoz;

/**
 *
 * @author jesus
 */
public class CursoBadajoz {
    private static CentroComercial[] centroscomerciales;

    public static void rellenarDatos () {

        centroscomerciales = new CentroComercial[3];
        //FORMA 1 - Una forma de hacerlo
        /*
        CentroComercial c1 = new CentroComercial(); 
        CentroComercial c2 = new CentroComercial();
        CentroComercial c3 = new CentroComercial();
        centroscomerciales[0]=c1;
        centroscomerciales[1]=c2;
        centroscomerciales[2]=c3;
        */

        //FORMA 2 - Otra forma de hacerlo
        /*
        CentroComercial c1 = new CentroComercial(); 
        centroscomerciales[0]=c1;
        c1 = new CentroComercial();
        centroscomerciales[0]=c1;
        c1 = new CentroComercial();
        centroscomerciales[2]=c1;
        */

        //FORMA 3 - Otra forma de hacerlo
        /*
        centroscomerciales[0]=new CentroComercial();
        centroscomerciales[1]=new CentroComercial();
        centroscomerciales[2]=new CentroComercial();
        */

        //FORMA 4 - Otra forma de hacerlo
        for (int i=0;i<=2;i=i+1) {
            centroscomerciales[i]=new CentroComercial();
        }

        //Hasta aquí solo tenemos la estructura.
        //Vamos a meter unos datos de ejemplo para trabajar después con ejercicios
        centroscomerciales[0].setNombre("FARO");
        centroscomerciales[0].setCiudad("Badajoz");
        centroscomerciales[0].setSuperficie(8000);

        centroscomerciales[1].setNombre("RUTA DE LA PLATA");
        centroscomerciales[1].setCiudad("Cáceres");
        centroscomerciales[1].setSuperficie(3000);

        centroscomerciales[2].setNombre("EVORA ZONA FRANCA");
        centroscomerciales[2].setCiudad("Évora");
        centroscomerciales[2].setSuperficie(700);


        //Vamos a meter unos empleados en estos centros comerciales
        Empleado e = new Empleado();
        e.setNombre("Juan");
        e.setEdad(22);
        centroscomerciales[0].addEmpleado (e); //asigno e al centrocomercial que esta en la posicion 0
        //aquí ya puedo reutilizar 'e' si quiero para crear otro empleado

        e = new Empleado();
        e.setNombre("Juana");
        e.setEdad(24);
        centroscomerciales[0].addEmpleado(e);

        e = new Empleado();
        e.setNombre("Andres");
        e.setEdad(26);
        centroscomerciales[1].addEmpleado (e);

        e = new Empleado();
        e.setNombre("Andrea");
        e.setEdad(28);
        centroscomerciales[1].addEmpleado(e);

        e = new Empleado();
        e.setNombre("Ramon");
        e.setEdad(30);
        centroscomerciales[2].addEmpleado (e);

        e = new Empleado();
        e.setNombre("Ramona");
        e.setEdad(32);
        centroscomerciales[2].addEmpleado(e);


        //Vamos a crear unas tiendas con uno o dos... empleados a su vez
        Tienda t = new Tienda();
        t.setNombre("ZARA");
        t.setPrecio(10000);
        e = new Empleado();
        e.setNombre("Pepe Zara");
        e.setEdad(40);
        t.addEmpleado(e);
        centroscomerciales[0].addTienda(t);
        
        t = new Tienda();
        t.setNombre("PRIMARK");
        t.setPrecio(20000);
        e = new Empleado();
        e.setNombre("Andrea Primark");
        e.setEdad(42);
        t.addEmpleado(e);
        centroscomerciales[0].addTienda(t);
        
    }


    public static void ejemplo01() {
        //EJEMPLO 1 - Muestra la ciudad del primer centro comercial
        String ciudad;
        ciudad = centroscomerciales[0].getCiudad();
        System.out.println("La ciudad del primer centro comercial es: "+ciudad);
    }
    
    public static void ejemplo02() {
        //EJEMPLO 2 - Muestra las ciudades de todos los centros comerciales
        System.out.println("Los centros comerciales están situados en estas ciudades: ");
        for (int i=0;i<=2;i++) {
            System.out.println(centroscomerciales[i].getCiudad());
        }        
    }
    
    public static void ejemplo03() { //EJERCICIO
        //EJEMPLO 3 - //Muestra los nombres de todos los centros comerciales
       System.out.println("El nombre de todos lso centros comerciales es: ");
        for (int i=0;i<=2;i++) {
            System.out.println(centroscomerciales[i].getNombre());
        }    
        
    }
        
    public static void ejemplo04() {
        //EJEMPLO 4 - Muestra la cantidad de centros comerciales que hay
        System.out.println ("En total hay "+ centroscomerciales.length +" centros comerciales");
    }
    
    public static void ejemplo05() { //EJERCICIO
        //EJEMPLO 5 - Muestra el número de tiendas que tiene cada centro comercial
      String nomtiendas;
      int contador;
      CentroComercial c;
      Tienda[] listae;
     for (int i=0;i<=2;i++) { //recorre los centros comerciales
            c = centroscomerciales[i]; //para facilitar: colocamos en 'c' el centro actual (i)
            
            System.out.println("El centro comercial "+c.getNombre()+"Tiene las siguientes tiendas "); 
            listae = c.getTiendas(); //llamamos listae a la lista de tiendas
        
            for (int j=0;j<listae.length;j++) { //recorre las tiendas (dentro de un centro comercial)
                if (listae[j] != null) {
                    
                    nomtiendas = listae[j].getNombre();
                    System.out.println(nomtiendas);                    
                }
                  
            }
            System.out.println("La cantidad de tiendas es "+centroscomerciales[i].num_tiendas);
        }     
    }
    
    public static void ejemplo06() { //EJERCICIO
        //EJEMPLO 6 - Muestra el número de empleados que tiene cada centro comercial
     String nomempleados="";
     CentroComercial c; 
     Empleado[] listae;
    for (int i=0;i<=2;i++) { //recorre los centros comerciales
            c = centroscomerciales[i]; //para facilitar: colocamos en 'c' el centro actual (i)
             listae = c.getEmpleados();
             System.out.println("El centro comercial "+centroscomerciales[i].getNombre()+" Tiene los siguientes empleados "+centroscomerciales[i].num_empleados+" Que son: ");
            for (int j=0;j<listae.length;j++) { //recorre las tiendas (dentro de un centro comercial)
                if (listae[j] != null) {
                    nomempleados = listae[j].getNombre();
                    System.out.println(nomempleados);                    
                }
                
            }
    
    }
   
    }

    public static void ejemplo07() {
        //EJEMPLO 7 - Muestra la edad de todos los empleados de los centros comerciales        
        System.out.println("Edades de empleados de centros comerciales: ");
        
        int anos;
        CentroComercial c;
        Empleado[] listae;
        
        for (int i=0;i<=2;i++) { //recorre los centros comerciales
            c = centroscomerciales[i]; //para facilitar: colocamos en 'c' el centro actual (i)
            
            System.out.println(c.getNombre()); 
            listae = c.getEmpleados(); //llamamos listae a la lista de empleados
        
            for (int j=0;j<listae.length;j++) { //recorre los empleados (dentro de un centro comercial)
                if (listae[j] != null) {
                    anos = listae[j].getEdad();
                    System.out.println(anos);                    
                }
            }
        }        
    }
    
    public static void ejemplo08() {
        //EJEMPLO 8 - Mostrar la edad de los empleados de las tiendas
           System.out.println("Edades de empleados de centros comerciales: ");
        
        int anos;
        String nomempleados="";
        String nomtiendas="";
        CentroComercial c;
        Empleado[] listae;
        Tienda nombreTienda;
       
        
               
        for (int i=0;i<=2;i++) { //recorre los centros comerciales
            c = centroscomerciales[i]; //para facilitar: colocamos en 'c' el centro actual (i)
            Tienda d;
            System.out.println(c.getNombre()); 
            
        
            for(int k=0; k<c.num_tiendas;k++){ //recorre las tiendas
            nombreTienda=c.tiendas[k];    
            listae = nombreTienda.getEmpleados(); //llamamos listae a la lista de empleados    
             d=c.tiendas[k];
             System.out.println("Tienda :" + d.getNombre());
            for (int j=0;j<listae.length;j++) { //recorre los empleados (dentro de un centro comercial)
                if (listae[j] != null) {
                    nomempleados = listae[j].getNombre();
                    System.out.println(nomempleados);
                    anos = listae[j].getEdad();
                    System.out.println(anos);                    
                }
               
            }
           
        }        
    }
    }
        
    public static void ejemplo09() {
        //EJEMPLO 9 - Mostrar la edad de los empleados de los centros comerciales y de las tiendas
       int anos;
        String nomempleados="";
        String nomtiendas="";
        CentroComercial c;
        Empleado[] listae;
        Tienda nombreTienda;
       
        
               
        for (int i=0;i<=2;i++) { //recorre los centros comerciales
            c = centroscomerciales[i]; //para facilitar: colocamos en 'c' el centro actual (i)
            
            System.out.println("El centro comercial "+c.getNombre()); 
            
        
            for(int k=0; k<c.num_tiendas;k++){ 
            nombreTienda=c.tiendas[k];  
            listae = nombreTienda.getEmpleados(); //llamamos listae a la lista de empleados 
            Tienda d;
            
             d=c.tiendas[k];
             System.out.println("Tienda :" + d.getNombre());
                    
            for (int j=0;j<listae.length;j++) { //recorre los empleados (dentro de una tienda)
                
                if (listae[j] != null) {
                   
                    nomempleados = listae[j].getNombre();
                    System.out.print(nomempleados);
                    anos = listae[j].getEdad();
                    System.out.println(" Tiene "+anos+" años");                    
                }
                
            }
           
        } 
            listae = c.getEmpleados(); //llamamos listae a la lista de empleados
             for (int j=0;j<listae.length;j++) { //recorre los empleados (dentro de un centro comercial)
                if (listae[j] != null) {
                    
                    anos = listae[j].getEdad();
                    nomempleados = listae[j].getNombre();
                    System.out.print(nomempleados);
                    System.out.println(" tiene "+anos+" años");                    
                } 
            }
    }
        
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Solo llamamos a la función anterior para rellenar de datos el vector de centros comerciales
        rellenarDatos();

        
        //Hasta ahora solo hemos trabajado con arrays[] en el main.
        //Ahora vamos a tener varias clases: CentroComercial, Tienda y Empleado
        //Vamos a ver cómo hay empleados en las tiendas y también empleados en los centros comerciales
        //Además, para organizarnos, creamos varias funciones dentro de esta clase y los llamamos desde el main
        
        
        
        //ejemplo01(); //Muestra la ciudad del primer centro comercial *
        //ejemplo02(); //Muestra las ciudades de todos los centros comerciales *
        //ejemplo03(); //Muestra los nombres de todos los centros comerciales        
        //ejemplo04(); //Muestra la cantidad de centros comerciales que hay *
        //ejemplo05(); //Muestra el número de tiendas que tiene cada centro comercial
        //ejemplo06(); //Muestra el número de empleados que tiene cada centro comercial
        //ejemplo07(); //Muestra la edad de todos los empleados de los centros comerciales *
        ejemplo08(); //Mostrar la edad de los empleados de las tiendas
        //ejemplo09(); //Mostrar la edad de los empleados de los centros comerciales y de las tiendas        

    }
    
}
