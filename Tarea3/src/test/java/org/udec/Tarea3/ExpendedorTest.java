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
        int numeroProducto = Expendedor.COCA;
        assertThrows(NoHayProductoException.class, () -> {
            expendedor.comprarProducto(moneda, numeroProducto);
        }, "Debe saltar un NoHayProductoException");
    }
    @Test
    @DisplayName("PagoInsuficienteTest")
    void testNoSeHaDepositadoMoneda() {
        Expendedor expendedor = new Expendedor(10, 100);

        Moneda moneda = null;
        int numeroProducto = Expendedor.COCA;

        assertThrows(PagoIncorrectoException.class, () -> {
            expendedor.comprarProducto(moneda, numeroProducto);
        }, "Debe saltar un PagoInsuficienteException");
    }
}

