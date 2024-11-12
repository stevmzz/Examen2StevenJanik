package com.example.examen2;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestEncuentraElementoPresente {

    @Test
    public void testEncuentraElementoPresente() {
        // Arreglo de ejemplo
        int[] lista = {1, 2, 3, 4, 5};
        // Elemento que buscamos
        int elemento = 3;

        // Llamamos al método Encuentra y verificamos que devuelve true
        assertTrue("El elemento debe estar en la lista", Calculadora.Encuentra(lista, elemento));
    }

    @Test
    public void testEncuentraElementoNoPresente() {
        // Arreglo de ejemplo
        int[] lista = {1, 2, 3, 4, 5};
        // Elemento que no está en la lista
        int elemento = 6;

        // Llamamos al método Encuentra y verificamos que devuelve false
        assertFalse("El elemento no debe estar en la lista", Calculadora.Encuentra(lista, elemento));
    }
}
