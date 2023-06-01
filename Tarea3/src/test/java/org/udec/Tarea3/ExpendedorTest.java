package org.udec.Tarea3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ExpendedorTest {

    @DisplayName("NoHayProductoTest")
    @Test
    void NoHayProductosDisponibles() {
        Expendedor expendedor = new Expendedor(0, 100);
        Moneda moneda = new Moneda100();
        Expendedor.ProductoEnum producto = Expendedor.ProductoEnum.COCA;
        assertThrows(NoHayProductoException.class, () -> {
            expendedor.comprarProducto(moneda, producto);
        }, "Debe saltar un NoHayProductoException");
    }

    @Test
    @DisplayName("PagoInsuficienteTest")
    void testNoSeHaDepositadoMoneda() {
        Expendedor expendedor = new Expendedor(10, 100);

        Moneda moneda = null;
        Expendedor.ProductoEnum producto = Expendedor.ProductoEnum.COCA;

        assertThrows(PagoIncorrectoException.class, () -> {
            expendedor.comprarProducto(moneda, producto);
        }, "Debe saltar un PagoInsuficienteException");
    }
}
