package org.udec.Tarea3;

import java.util.ArrayList;

class Deposito<T>{
    private ArrayList<T> a;
    public Deposito() {
        this.a = new ArrayList<T>();
    }
    public void addDeposito(T producto){
        a.add(producto);
    }

    public int sizeDep(){
        return a.size();
    }
    public T getDeposito(){
        int b = a.size();
        if(b!=0){
            T nuevo= a.remove(0);
            return nuevo;
        }else {
            return null;
        }
    }
}
