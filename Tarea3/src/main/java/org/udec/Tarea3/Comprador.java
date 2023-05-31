package org.udec.Tarea3;

public class Comprador {
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        this.vuelto = 0;
        int num = cualProducto;
        Producto producto = exp.comprarProducto(m, num);
        if(producto!=null){
            sonido = producto.ingerir();
        }
        for (Moneda moneda = exp.getVuelto(); moneda != null; moneda = exp.getVuelto()) {
            this.vuelto += moneda.getValor();
        }
    }

    public int cuantoVuelto(){
        return vuelto;
    }

    public String queIngeriste(){
        return sonido;
    }
}