package org.udec.Tarea3;
public abstract class Bebida extends Producto {
    public Bebida(int a) {
        super(a);
    }
}
class CocaCola extends Bebida{
    public CocaCola(int serie){
        super(serie);
    }

    public String ingerir(){
        return "cocacola";
    }
}
class Sprite extends Bebida {
    public Sprite(int serie2){
        super(serie2);
    }
    public String ingerir(){
        return "sprite";
    }
}