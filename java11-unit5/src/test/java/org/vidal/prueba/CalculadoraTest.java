package org.vidal.prueba;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {


    static Calculadora calculadora;

    public static void init(){
        calculadora=new Calculadora();
        System.out.println("Se ha instanciado la calculadora");
    }

    @Test
    @DisplayName("1+1=2")
    void sumarDosPositivos() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.suma(1, 1), "1 + 1 debe ser igual a 2");
    }
    @Test
    @DisplayName("-1+(-1)=-2")
    void sumarDosNegativos() {
        Calculadora calculadora = new Calculadora();
        assertEquals(-2, calculadora.suma(-1, -1), "-1 + (-1) debe ser igual a -2");
    }
}