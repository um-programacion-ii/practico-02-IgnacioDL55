package Entity;


import Interface.Cocinable;
import Interface.Despensable;

public class Ingrediente implements Despensable, Cocinable {
    private String nombre;
    private int cantidad;

    public Ingrediente(String nombre , int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public void sacar(int retiro){
        if (this.cantidad >= retiro) {
            this.cantidad -= retiro;
            System.out.println("Se sacaron " + retiro + " unidad/es de " + nombre );
        } else {
            System.out.println("La cantidad actual (" + cantidad + ") de " + nombre + " es inferior a la cantidad que quieres sacar (" + retiro + ")");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String toString(){
        return  nombre + " " + cantidad;
    }

}
