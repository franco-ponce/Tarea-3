package org.udec.Tarea3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;

class ProductoTest {

    @DisplayName("Test para saber la serie del producto")
    @Test
    public void SaberSerieProducto() throws Exception{
        CocaCola c = new CocaCola(3);
        assertNotNull(c.getSerie());
        assertEquals(3,c.getSerie());
    }

    @DisplayName("Para saber que ingeriste y la serie que no es tu producto que ingeriste")
    @Test
    public void Que_IngeristeYSerie() throws Exception{
        Super8 a = new Super8(4);
        assertNotNull(a.ingerir());
        Super8 b = new Super8(6);
        assertNotEquals("8",b.getSerie());
        assertEquals("super8",b.ingerir());
    }
}