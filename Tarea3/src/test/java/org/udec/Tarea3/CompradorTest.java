package org.udec.Tarea3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Assertions;

class CompradorTest {
    private Expendedor exp;
    private Comprador c,c1;
    private Moneda m;
    @BeforeEach
    public void setUp(){
        exp = new Expendedor(50,1000);
        m = new Moneda1000();
        c = null;
        c1 = null;
    }
    @DisplayName("Hace la compra de 2 sprites")
    @Test
    public void testComprar_Dos_Sprites_Seguidas() {
        int a = Expendedor.SPRITE;
        try {
            c = new Comprador(m, a, exp);
            c1 = new Comprador(m, a, exp);
        } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e) {
            Assertions.fail("Hay una excepcion: " + e.getMessage());
        }
        Assertions.assertEquals(0, c.cuantoVuelto());
        Assertions.assertEquals(0, c1.cuantoVuelto());
        Assertions.assertEquals("sprite", c.queIngeriste());
        Assertions.assertEquals("sprite", c1.queIngeriste());
    }
    @DisplayName("Hace la compra de 2 cocacolas")
    @Test
    public void testComprar_Dos_Cocacolas_Seguidas() {
        int a = Expendedor.COCA;
        try {
            c = new Comprador(m, a, exp);
            c1 = new Comprador(m, a, exp);
        } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e) {
            Assertions.fail("Hay una excepcion: " + e.getMessage());
        }
        Assertions.assertEquals(0, c.cuantoVuelto());
        Assertions.assertEquals(0, c1.cuantoVuelto());
        Assertions.assertEquals("cocacola", c.queIngeriste());
        Assertions.assertEquals("cocacola", c1.queIngeriste());
    }
    @DisplayName("Hace la compra de 2 super 8")
    @Test
    public void testComprar_Dos_Super8_Seguidos() {
        int a = Expendedor.SUPER8;
        try {
            c = new Comprador(m, a, exp);
            c1 = new Comprador(m, a, exp);
        } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e) {
            Assertions.fail("Hay una excepcion: " + e.getMessage());
        }

        Assertions.assertEquals(0, c.cuantoVuelto());
        Assertions.assertEquals(0, c1.cuantoVuelto());
        Assertions.assertEquals("super8", c.queIngeriste());
        Assertions.assertEquals("super8", c1.queIngeriste());
    }
    @DisplayName("Hace la compra de 2 snickers")
    @Test
    public void testComprar_Dos_Snickers_Seguidos() {
        int a = Expendedor.SNICKER;
        try {
            c = new Comprador(m, a, exp);
            c1 = new Comprador(m, a, exp);
        } catch (NoHayProductoException | PagoInsuficienteException | PagoIncorrectoException e) {
            Assertions.fail("Hay una excepcion: " + e.getMessage());
        }

        Assertions.assertEquals(0, c.cuantoVuelto());
        Assertions.assertEquals(0, c1.cuantoVuelto());
        Assertions.assertEquals("snicker", c.queIngeriste());
        Assertions.assertEquals("snicker", c1.queIngeriste());
    }
}
