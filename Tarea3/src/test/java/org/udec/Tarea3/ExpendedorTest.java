package org.udec.Tarea3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ExpendedorTest {

    @DisplayName("NoHayProductoTest")
    @Test
    public void NoHayProductosDisponibles() {
        Expendedor expendedor = new Expendedor(0);
        Moneda moneda = new Moneda100();
        Expendedor.ProductoEnum numeroProducto = Expendedor.ProductoEnum.COCA;
        assertThrows(NoHayProductoException.class, () -> {
            expendedor.comprarProducto(moneda, numeroProducto);
        }, "Debe saltar un NoHayProductoException");
    }
    @Test
    @DisplayName("PagoInsuficienteTest")
    public void testNoSeHaDepositadoMoneda() {
        Expendedor expendedor = new Expendedor(10);

        Moneda moneda = null;
        Expendedor.ProductoEnum numeroProducto = Expendedor.ProductoEnum.COCA;

        assertThrows(PagoIncorrectoException.class, () -> {
            expendedor.comprarProducto(moneda, numeroProducto);
        }, "Debe saltar un PagoInsuficienteException");
    }
}
