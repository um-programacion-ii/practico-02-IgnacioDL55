package Entity;

import Interface.Despensable;
import Interface.Reutilizable;

public class Utensilio implements Despensable, Reutilizable {
    private String nombre;
    private int vidaUtil;

    public Utensilio(String nombre, int vidaUtil) {
        this.nombre = nombre;
        this.vidaUtil = vidaUtil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public void utilizar(int veces){
        if (vidaUtil >= veces){
            vidaUtil-= veces;
            System.out.println("Usaste "+ veces + " este utensilio");
        } else {
            System.out.println("El utensilio "+ nombre + "ya esta no tiene vida util!");
        }
    }

    public String toString(){
        return nombre + " (vida util: " + vidaUtil + ")";
    }


}
