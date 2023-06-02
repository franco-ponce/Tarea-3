package org.udec.Tarea3;
public class Comprador {
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, Expendedor.ProductoEnum producto, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        this.vuelto = 0;
        Producto p = exp.comprarProducto(m, producto);
        if (p != null) {
            sonido = p.ingerir();
        }
        for (Moneda moneda = exp.getVuelto(); moneda != null; moneda = exp.getVuelto()) {
            this.vuelto += moneda.getValor();
        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queIngeriste() {
        return sonido;
    }
}