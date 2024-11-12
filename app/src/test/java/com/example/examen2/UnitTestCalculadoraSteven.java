package com.example.examen2;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTestCalculadoraSteven {

    // Pruebas para el método convertirNumero

    // Prueba 1: Convertir número octal a decimal
    @Test
    public void testConvertirNumeroOctal() {
        int resultado = Calculadora.convertirNumero("17", 1); // Octal 17
        assertEquals(15, resultado); // Octal 17 es 15 en decimal
    }

    // Prueba 2: Convertir número con caracteres inválidos (hexadecimal)
    @Test
    public void testConvertirNumeroHexadecimalInvalido() {
        int resultado = Calculadora.convertirNumero("Z", 3); // Entrada inválida para hexadecimal
        assertEquals(-1, resultado); // Se espera -1 por error de conversión
    }

    // Pruebas para el método realizarOperacion

    // Prueba 1: Multiplicar dos números
    @Test
    public void testMultiplicacion() {
        int resultado = Calculadora.realizarOperacion(4, 5, "*");
        assertEquals(20, resultado); // 4 * 5 es 20
    }

    // Prueba 2: Intentar dividir por 0 (debería arrojar excepción)
    @Test
    public void testDivisionPorCero() {
        try {
            Calculadora.realizarOperacion(5, 0, "/");
            fail("Se esperaba una excepción por división por cero");
        } catch (ArithmeticException e) {
            assertEquals("División por 0", e.getMessage()); // Error esperado por división por cero
        }
    }

    // Pruebas para el método convertirADestino

    // Prueba 1: Convertir número decimal a octal
    @Test
    public void testConvertirADestinoOctal() {
        String resultado = Calculadora.convertirADestino(63, 1);
        assertEquals("77", resultado); // 63 en decimal es 77 en octal
    }

    // Prueba 2: Convertir número negativo a decimal
    @Test
    public void testConvertirADestinoDecimalNegativo() {
        String resultado = Calculadora.convertirADestino(-10, 2); //lo pasamos a base 21 lo cual no funcionará
        assertEquals("-10", resultado); // -10 en decimal es -10
    }
}
