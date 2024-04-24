import Entity.*;
import Exceptions.StockInsuficiente;
import Exceptions.VidaUtilInsuficiente;
import Service.CocinaService;

public class Main {
    public static void main(String[] args){
        Ingrediente ingredientes = new Ingrediente("huevos", 10);
        Ingrediente zanahoria = new Ingrediente("zanahoria", 5);
        Ingrediente agua = new Ingrediente("agua", 500);
        Ingrediente aceite = new Ingrediente("aceite",250);
        Utensilio rallador = new Utensilio("rallador",100);
        Utensilio olla = new Utensilio("olla",100);
        Utensilio tostadora = new Utensilio("tostadora",100);

        System.out.println(ingredientes);
        System.out.println(zanahoria);
        System.out.println(agua);
        System.out.println(aceite);

        System.out.println("----------------------------------------------------------------------------------");
        Despensa despensa1 = new Despensa();

        despensa1.addIngrediente(ingredientes);
        despensa1.addIngrediente(zanahoria);
        despensa1.addIngrediente(aceite);
        despensa1.addIngrediente(agua);
        despensa1.addUtensilios(rallador);
        despensa1.addUtensilios(olla);
        despensa1.addUtensilios(tostadora);
        despensa1.getIngredientes(String.valueOf(ingredientes),2);

        System.out.println(despensa1.getIngredientes());

        System.out.println("----------------------------------------------------------------------------------");

        HuevoDuro huevoDuro = new HuevoDuro();
        System.out.println("Receta para el huevo duro:");
        System.out.println(huevoDuro);

        EnsaladaDeZanahoria ensaladaDeZanahoria= new EnsaladaDeZanahoria();
        System.out.println("REceta para la ensalada de zanahoria:");
        System.out.println(ensaladaDeZanahoria);

        Tostada tostada = new Tostada();
        System.out.println("Receta para la tostada:");
        System.out.println(tostada);

        System.out.println("----------------------------------------------------------------------------------");
        Chef chef1 = new Chef("Gordon Ramsay",14);

        try {
            CocinaService.preparacion(chef1,huevoDuro,despensa1.getIngredientes(), despensa1.getUtensilios());
        } catch (VidaUtilInsuficiente e) {
            System.out.println("Error de la vida util"+ e.getMessage());
        } catch (StockInsuficiente e) {
            System.out.println("Error de stock "+ e.getMessage());
        }


    }
}