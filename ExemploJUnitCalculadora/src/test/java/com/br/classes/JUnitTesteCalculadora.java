package com.br.classes;

import com.br.exception.CalculadoraException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fatinha de Sousa
 */
public class JUnitTesteCalculadora {

    private Calculadora calculadora;

    public JUnitTesteCalculadora() {
        this.calculadora = new Calculadora();
    }

    @Test
    public void testSomaValoresPositivos() {
        //Equal verifica se o resultado do metodo é 10
        assertEquals("Somar", 10, calculadora.somar(5, 5));
        assertFalse("Valores Iguais", 10 == calculadora.somar(6, 6));
        assertFalse("Valores Diferentes", 10 == calculadora.somar(7, 4));
        assertTrue("Valores Iguais", 10 == calculadora.somar(5, 5));
        assertTrue("Valores Diferente", 10 == calculadora.somar(6, 4));
    }

    @Test
    public void testSomaValoresNegativos() {
        //Verifica soma dos valores negativos
        assertEquals("Somar", 10, calculadora.somar(20, -10));
        assertFalse("Valores Iguais", 10 == calculadora.somar(-6, 6));
        assertFalse("Valores Diferentes", 10 == calculadora.somar(-10, -10));
        assertTrue("Valores Iguais", 10 == calculadora.somar(-20, 30));
    }
    
    @Test(expected = CalculadoraException.class)
    public void testSomaValoresNulos(){
        assertEquals("Somar", 10, calculadora.somar(null, 5));
        assertFalse("Valores Nulos", 10 == calculadora.somar(null, 10));
        assertTrue("Valores Nulos", 10 == calculadora.somar(null, 10));
    }
}
