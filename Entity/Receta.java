package Entity;

import java.util.List;

public class Receta {
    private int tiempoCoccion;
    private String preparacion;
    private List<Ingrediente> ingredientes;
    private List<Utensilio> utensilios;

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Utensilio> getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(List<Utensilio> utensilios) {
        this.utensilios = utensilios;
    }

    public Receta(int tiempoCoccion, String preparacion, List<Ingrediente> ingredientes, List<Utensilio> utensilios) {
        this.tiempoCoccion = tiempoCoccion;
        this.preparacion = preparacion;
        this.ingredientes = ingredientes;
        this.utensilios = utensilios;
    }

    @Override
    public String toString() {
        return "Tiempo de cocción: " + tiempoCoccion + " minutos/Ingredientes: " + ingredientes + " Utensilios: "+ utensilios + "y Preparación: " + preparacion;
    }
}