package org.udec.Tarea3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DepositoTest {

    @DisplayName("Saber la cantidad de Monedas en el deposito ")
    @Test
    public void Moneda_En_deposito() {
        Deposito<Moneda> a = new Deposito<>();
        Moneda m = new Moneda1500();
        assertNotNull(a.sizeDep());
        a.addDeposito(m);
        assertNotNull(a.sizeDep());
        assertEquals(1,a.sizeDep());
    }

    @DisplayName("Se sabe cuanros productos hay a medida que se van agregando, y despues se quitan del deposito hasta que no quede ninguno")
    @Test
    public void Agregar_y_sacarProductos(){
        Deposito<Producto> p = new Deposito<>();
        Super8 o = new Super8(1);
        p.addDeposito(o);
        assertEquals(1,p.sizeDep());
        CocaCola c = new CocaCola(2);
        p.addDeposito(c);
        assertEquals(2,p.sizeDep());
        Snicker k = new Snicker(3);
        p.addDeposito(k);
        assertEquals(3,p.sizeDep());
        Sprite s = new Sprite(4);
        p.addDeposito(s);
        assertEquals(4,p.sizeDep());
        p.getDeposito();
        assertNotNull(p.sizeDep());
        p.getDeposito();
        assertNotNull(p.sizeDep());
        p.getDeposito();
        assertNotNull(p.sizeDep());
        p.getDeposito();
        assertNull(p.getDeposito());

    }
}