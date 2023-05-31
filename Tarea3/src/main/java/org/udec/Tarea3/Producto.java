package org.udec.Tarea3;
public abstract class Producto {
    private int serie;
    public Producto(int a){
        this.serie=a;
    }

    public abstract String ingerir();
    public int getSerie(){
        return serie;
    }
}
