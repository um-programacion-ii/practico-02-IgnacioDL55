package Entity;

import java.util.List;

public class Tostada extends Receta{
    public Tostada(){
        super(5,"Colocar el pan en la tostadora por 5 minutos, luego agregarle 10ml de mermelada",
                List.of(new Ingrediente("pan",1),new Ingrediente("mermelada",10)),
                List.of(new Utensilio("tostadora",100)));

    }
}