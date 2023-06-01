package org.udec.Tarea3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.lang.annotation.Documented;

import static org.junit.jupiter.api.Assertions.*;

public class MonedaTest{
    @DisplayName("Verifica que las monedas sean las que acepta la maquina")
    @Test
    public void VerificarMonedaTest(){
        Moneda m = new Moneda100();
        Moneda m2 = new Moneda500();
        Moneda m3 = new Moneda1000();
        Moneda m4 = new Moneda1500();
        boolean resultado100 = m.verificarMoneda(100);
        assertTrue(resultado100, "La moneda de 100 no ha sido aceptada");
        boolean resultado500 = m2.verificarMoneda(500);
        assertTrue(resultado500, "la moneda de 500 no ha sido aceptada");
        boolean resultado1000= m3.verificarMoneda(1000);
        assertTrue(resultado1000, "la moneda de 1000 no ha sido aceptada");
        boolean resultado1500 = m4.verificarMoneda(1500);
        assertTrue(resultado1500, "la moneda de 1500 no ha sido aceptada");
    }
}





