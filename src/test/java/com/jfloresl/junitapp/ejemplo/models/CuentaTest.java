package com.jfloresl.junitapp.ejemplo.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta(){
        Cuenta cuenta = new Cuenta("andres",new BigDecimal("1123.0"));
        String esperado="andres";
        String real=cuenta.getPersona();
        assertNotNull(real);
        assertEquals(esperado,real);
        assertTrue(real.equals("andres"));

    }

    @Test
    void testSaldoCuenta(){
        Cuenta cuenta = new Cuenta("andres",new BigDecimal("1123.0"));
        assertEquals(1123.0,cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO)<0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO)>0);
    }

    @Test
    void testDebitoCuenta(){
        Cuenta cuenta = new Cuenta("Andres",new BigDecimal("1000.123456"));
        cuenta.debito(new BigDecimal(100));
        assertNotNull(cuenta.getSaldo());
        assertEquals(900,cuenta.getSaldo().intValue());
        assertEquals("900.123456",cuenta.getSaldo().toPlainString());
    }

    @Test
    void testCreditoCuenta(){
        Cuenta cuenta = new Cuenta("Andres",new BigDecimal("1000.123456"));
        cuenta.credito(new BigDecimal(100));
        assertNotNull(cuenta.getSaldo());
        assertEquals(1100,cuenta.getSaldo().intValue());
        assertEquals("1100.123456",cuenta.getSaldo().toPlainString());
    }

}