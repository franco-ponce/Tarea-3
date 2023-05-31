package org.udec.Tarea3;

public abstract class Dulces extends Producto{
    public Dulces(int a){
        super(a);
    }
}
class Snicker extends Dulces{
    public Snicker(int serie){
        super(serie);
    }

    public String ingerir(){
        return "snicker";
    }
}
class Super8 extends Dulces{
    public Super8(int serie){
        super(serie);
    }
    public String ingerir(){
        return "super8";
    }
}
