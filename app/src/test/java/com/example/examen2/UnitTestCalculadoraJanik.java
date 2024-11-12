package com.example.examen2;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTestCalculadoraJanik {

    // Pruebas para el método convertirNumero

    // Prueba 1: Convertir número binario a decimal
    @Test
    public void testConvertirNumeroBinario() {
        int resultado = Calculadora.convertirNumero("1010", 0); // Binario 1010
        assertEquals(10, resultado); // 1010 en binario es 10 en decimal
    }

    // Prueba 2: Convertir número hexadecimal a decimal
    @Test
    public void testConvertirNumeroHexadecimal() {
        int resultado = Calculadora.convertirNumero("A", 3); // Hexadecimal A
        assertEquals(10, resultado); // Hexadecimal A es 10 en decimal
    }

    // Pruebas para el método realizarOperacion

    // Prueba 1: Sumar dos números
    @Test
    public void testSuma() {
        int resultado = Calculadora.realizarOperacion(7, 3, "+");
        assertEquals(10, resultado); // 7 + 3 es 10
    }

    // Prueba 2: Restar dos números
    @Test
    public void testResta() {
        int resultado = Calculadora.realizarOperacion(7, 3, "-");
        assertEquals(4, resultado); // 7 - 3 es 4
    }

    // Pruebas para el método convertirADestino

    // Prueba 1: Convertir número decimal a binario
    @Test
    public void testConvertirADestinoBinario() {
        String resultado = Calculadora.convertirADestino(10, 0);
        assertEquals("1010", resultado); // 10 en decimal es 1010 en binario
    }

    // Prueba 2: Convertir número decimal a hexadecimal
    @Test
    public void testConvertirADestinoHexadecimal() {
        String resultado = Calculadora.convertirADestino(255, 3);
        assertEquals("ff", resultado); // 255 en decimal es ff en hexadecimal
    }
}
