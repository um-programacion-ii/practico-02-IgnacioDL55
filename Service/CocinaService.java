package Service;

import Entity.Chef;
import Entity.Ingrediente;
import Entity.Receta;
import Entity.Utensilio;
import Exceptions.StockInsuficiente;
import Exceptions.VidaUtilInsuficiente;

import java.util.Map;

public class CocinaService {
    public static void preparacion(Chef chef, Receta receta, Map<String, Ingrediente> despensaIngrediente, Map<String, Utensilio> despensaUtensilio) throws StockInsuficiente, VidaUtilInsuficiente {
        /*boolean hayIngredientes = true;
        for (Ingrediente ingredienteReceta : receta.getIngredientes()){
            boolean encontrado = true;
            for (Ingrediente ingredienteDespensa : despensa){
                if (ingredienteReceta.getNombre().equalsIgnoreCase(ingredienteDespensa.getNombre())
                        && ingredienteDespensa.getCantidad() >= ingredienteReceta.getCantidad()){
                encontrado = true;
                ingredienteDespensa.sacar(ingredienteReceta.getCantidad());
                break;
                }
            }
            if (!encontrado) {
                System.out.println("No tenes " + ingredienteReceta.getNombre() +
                        " en la despensa. Te faltan " + (ingredienteReceta.getCantidad()) + " unidad/es.");
                hayIngredientes = false;
                break;
            }
        }
        if (hayIngredientes) {
            System.out.println("La receta esta lista.");
            System.out.println("Ingredientes restantes en la despensa:");
            for (Ingrediente ingrediente : despensa) {
                System.out.println("- " + ingrediente);
            }
        } else {
            System.out.println("No se pudo preparar la receta debido a ingredientes insuficientes.");
        }

    }

         */

        System.out.println("El Chef " + chef.getNombre() + " va cocinar la siguiente receta: " + receta);
        DespensaService.verificarStock(despensaIngrediente, receta);
        DespensaService.verificarVidaUtil(despensaUtensilio, receta);

        for (Ingrediente ingredienteReceta : receta.getIngredientes()) {
            Ingrediente ingredienteDespensa = despensaIngrediente.get(ingredienteReceta.getNombre());
            ingredienteDespensa.sacar(ingredienteReceta.getCantidad());
        }

        for (Utensilio utensilioReceta : receta.getUtensilios()) {
            Utensilio utensilioDespensa = despensaUtensilio.get(utensilioReceta.getNombre());
            utensilioDespensa.utilizar(utensilioReceta.getVidaUtil());
        }

        System.out.println("Ya esta lista la receta!");
        System.out.println("\nTu despensa tiene estos ingredientes: ");
        for (Ingrediente ingrediente : despensaIngrediente.values()) {
            System.out.println("- " + ingrediente);
        }

        System.out.println("\nTienes estos utensilios en la despensa:");
        DespensaService.renovarUtensilio(despensaUtensilio);
        for (Utensilio utensilio : despensaUtensilio.values()) {
            System.out.println("- " + utensilio);
        }
    }
}
