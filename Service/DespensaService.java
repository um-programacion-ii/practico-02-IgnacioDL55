package Service;

import Entity.Ingrediente;
import Entity.Receta;
import Entity.Utensilio;
import Exceptions.StockInsuficiente;
import Exceptions.VidaUtilInsuficiente;

import java.util.Map;

public class DespensaService {
    public static void verificarStock(Map<String, Ingrediente> ingredienteEnDespensa, Receta receta) throws StockInsuficiente {
        for (Ingrediente ingredienteReceta : receta.getIngredientes()){
            Ingrediente ingredienteDespensa = ingredienteEnDespensa.get(ingredienteReceta.getNombre());
            if (ingredienteDespensa == null || ingredienteDespensa.getCantidad() < ingredienteReceta.getCantidad()){
                throw new StockInsuficiente("No hay suficientes " + ingredienteReceta.getNombre() + " en la despensa, solamente necesitas: "+ ingredienteReceta.getCantidad() + " unidades");
            }
        }
    }

    public static void verificarVidaUtil(Map<String, Utensilio>utensilioEnDespensa, Receta receta) throws VidaUtilInsuficiente {
        for (Utensilio utensilioReceta : receta.getUtensilios()){
            Utensilio utensilioDespensa = utensilioEnDespensa.get(utensilioReceta.getNombre());
            if (utensilioDespensa == null || utensilioDespensa.getVidaUtil() < utensilioReceta.getVidaUtil()){
                throw new VidaUtilInsuficiente("El utensilio " + utensilioReceta.getNombre() + " ya no tiene vida util para poder cocinar la receta (" + utensilioReceta.getVidaUtil() + ")" );
            }
        }
    }

    public static void renovarUtensilio(Map<String, Utensilio>utensilioRenovado){
        for (Utensilio utensilioDespensa : utensilioRenovado.values()){
            if (utensilioDespensa.getVidaUtil() == 0){
                utensilioDespensa.setVidaUtil(100);
            }
        }
    }

}