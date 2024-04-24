package Entity;

import java.util.HashMap;
import java.util.Map;

public class Despensa {
    private Map<String, Ingrediente> ingredientes;
    private Map<String, Utensilio> utensilios;

    public Despensa(){
        this.ingredientes = new HashMap<>();
        this.utensilios = new HashMap<>();
    }

    public void setIngredientes(Map<String, Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void getIngredientes(String nombre, int cantidad){
        Ingrediente ingrediente = ingredientes.get(nombre);
        if(ingrediente != null) {
            ingrediente.sacar(cantidad);
        } else {
            System.out.println("No hay " + nombre + " en tu despensa!");
        }
    }

    public void getUtensilios(String nombre, int cantidad){
        Utensilio utensilio = utensilios.get(nombre);
        if(utensilio != null) {
            utensilio.utilizar(cantidad);
        } else {
            System.out.println("No hay " + nombre + " en tu despensa!");
        }
    }

    public void addIngrediente(Ingrediente newIngrediente){
        ingredientes.put(newIngrediente.getNombre(), newIngrediente);
        System.out.println("Se agrego " + newIngrediente.getNombre() + " a la despensa");
    }

    public void addUtensilios(Utensilio newUtensilio){
        utensilios.put(newUtensilio.getNombre(), newUtensilio);
        System.out.println("Se agrego " + newUtensilio.getNombre() + " a la despensa");
    }

    public Map<String,Ingrediente> getIngredientes(){
        return ingredientes;
    }

    public Map<String,Utensilio> getUtensilios(){
        return utensilios;
    }

}