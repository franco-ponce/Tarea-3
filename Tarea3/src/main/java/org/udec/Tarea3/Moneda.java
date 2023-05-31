package org.udec.Tarea3;

public abstract class Moneda {

    public Moneda(){
    }

    public Moneda getSerie(){
        return this;
    }

    public abstract int getValor();
}

class Moneda100 extends Moneda{
    private int valor=100;

    public Moneda100(){
        super();
    }

    public int getValor(){
        return valor;
    }
}

class Moneda1500 extends Moneda {
    private int valor=1500;

    public Moneda1500(){
        super();
    }

    public int getValor(){
        return valor;
    }
}

class Moneda1000 extends Moneda {
    private int valor=1000;

    public Moneda1000(){
        super();
    }

    public int getValor(){
        return valor;
    }
}

class Moneda500 extends Moneda{
    private int valor=500;

    public Moneda500(){
        super();
    }

    public int getValor(){
        return valor;
    }
}
