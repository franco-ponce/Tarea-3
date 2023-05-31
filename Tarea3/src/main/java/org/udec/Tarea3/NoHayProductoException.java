package org.udec.Tarea3;

public class NoHayProductoException extends Exception{

    public NoHayProductoException(String error){
        super(error);
    }
}
