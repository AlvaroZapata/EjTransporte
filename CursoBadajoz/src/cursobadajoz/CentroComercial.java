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
public class CentroComercial {
    private String nombre;
    private String ciudad;
    private double superficie;
    Empleado[] empleados;
    Tienda[] tiendas;
    int num_empleados;
    int num_tiendas;

    public CentroComercial() {
        this.empleados = new Empleado[3];
        this.tiendas = new Tienda[2];
        this.num_empleados = 0;
        this.num_tiendas = 0;
    }



    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Tienda[] getTiendas() {
        return tiendas;
    }

    public void setTiendas(Tienda[] tiendas) {
        this.tiendas = tiendas;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    void addEmpleado(Empleado e) {
        if (this.empleados.length > this.num_empleados) {
            this.empleados[this.num_empleados] = e;
            this.num_empleados++;            
        }
        else {
            System.out.println ("ERROR EJEMPLO CURSO: No se pueden añadir más empleados al centrocomercial");
        }
    }
    
    void addTienda(Tienda e) {
        if (this.tiendas.length > this.num_tiendas) {
            this.tiendas[this.num_tiendas] = e;
            this.num_tiendas++;            
        }
        else {
            System.out.println ("ERROR EJEMPLO CURSO: No se pueden añadir más tiendas al centrocomercial");
        }
    }
}
