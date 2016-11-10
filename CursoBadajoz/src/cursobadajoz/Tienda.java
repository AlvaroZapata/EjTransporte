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
public class Tienda {
    private String nombre;
    private double precio;
    Empleado[] empleados;
    int num_empleados;

    public Tienda() {
        this.empleados = new Empleado[3];
    }
    
    void addEmpleado(Empleado e) {
        if (this.empleados.length > this.num_empleados) {
            this.empleados[this.num_empleados] = e;
            this.num_empleados++;            
        }
        else {
            System.out.println ("ERROR EJEMPLO CURSO: No se pueden añadir más empleados a la tienda");
        }
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
