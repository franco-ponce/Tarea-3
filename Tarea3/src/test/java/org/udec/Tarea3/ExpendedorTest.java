package org.udec.Tarea3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ExpendedorTest {
    private Expendedor a;
    @BeforeEach
    public void setUp(){
        a = new Expendedor(0);
    }

    @DisplayName("NoHayProductoTest")
    @Test
    public void NoHayProductosDisponibles() {
        Moneda moneda = new Moneda100();
        Expendedor.ProductoEnum numeroProducto = Expendedor.ProductoEnum.COCA;
        Exception exception = assertThrows(NoHayProductoException.class, () -> {
            a.comprarProducto(moneda, numeroProducto);
        }, "Debe saltar un NoHayProductoException");
    }
    @Test
    @DisplayName("PagoInsuficienteTest")
    public void testNoSeHaDepositadoMoneda() {

        Moneda moneda = null;
        Expendedor.ProductoEnum numeroProducto = Expendedor.ProductoEnum.COCA;

        Exception exception = assertThrows(PagoIncorrectoException.class, () -> {
            a.comprarProducto(moneda, numeroProducto);
        }, "Debe saltar un PagoInsuficienteException");
    }
}