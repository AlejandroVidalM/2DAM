package com.salesianostriana;

import com.salesianostriana.dam.CuentaCorriente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CuentaCorrienteTest {


    @Test
    @DisplayName("Ingresar 10")
    void depositarPositivo(){
        CuentaCorriente cuentaC = new CuentaCorriente("Ale" , 1, 100);
        assertEquals(true, cuentaC.deposit(10));
    }
    @Test
    @DisplayName("Ingresar 0")
    void depositarCero(){
        CuentaCorriente cuentaC = new CuentaCorriente("Ale" , 1, 100);
        assertEquals(true, cuentaC.deposit(0));
    }
    @Test
    @DisplayName("Ingresar -10")
    void depositarNegativo(){
        CuentaCorriente cuentaC = new CuentaCorriente("Ale" , 1, 100);
        assertEquals(false, cuentaC.deposit(-10));
    }
    @Test
    @DisplayName("sacar y ")
    void depositarPositivo(){
        CuentaCorriente cuentaC = new CuentaCorriente("Ale" , 1, 100);
        assertEquals(true, cuentaC.withdraw(10));
    }
    @Test
    @DisplayName("Ingresar 0")
    void depositarCero(){
        CuentaCorriente cuentaC = new CuentaCorriente("Ale" , 1, 100);
        assertEquals(true, cuentaC.withdraw(0));
    }
    @Test
    @DisplayName("Ingresar -10")
    void depositarNegativo(){
        CuentaCorriente cuentaC = new CuentaCorriente("Ale" , 1, 100);
        assertEquals(false, cuentaC.withdraw(-10));
    }
}

