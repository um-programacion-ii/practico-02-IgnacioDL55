package Entity;

import java.util.List;

public class EnsaladaDeZanahoria extends Receta{
    public EnsaladaDeZanahoria(){
        super(10,"Rallar la zanahoria con el rallador y despues agregarle 15ml de aceite",
                List.of(new Ingrediente("zanahoria",5),new Ingrediente("aceite",100)),
                List.of(new Utensilio("rallador",100)));
    }
}
