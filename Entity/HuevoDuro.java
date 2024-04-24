package Entity;

import java.util.Arrays;
import java.util.List;

public class HuevoDuro extends Receta {
    public HuevoDuro(){
        super(8,"Colocar 200ml de agua en una olla, hervirla y luego colocar el huevo por 8 minutos",
                List.of(new Ingrediente("huevo",1),new Ingrediente("agua",200)),
                List.of(new Utensilio("olla",100)));

    }
}
