package com.br.classes;

import com.br.exception.CalculadoraException;
import com.br.interfaces.CalculadoraIT;

/**
 *
 * @author Fatinha de Sousa
 */
public class Calculadora implements CalculadoraIT {

    @Override
    public int somar(Integer numero1, Integer numero2) {

        if ((numero1 == null) || (numero2 == null)) {
            throw new CalculadoraException("Valores Nulos");
        }

        return numero1 + numero2;
    }

    @Override
    public int subtrair(Integer numero1, Integer numero2) {
        
        if ((numero1 == null) || (numero2 == null)) {
            throw new CalculadoraException("Valores Nulos");
        }
        
        return numero1 - numero2;
    }

    @Override
    public int multiplicar(Integer numero1, Integer numero2) {
        
        if ((numero1 == null) || (numero2 == null)) {
            throw new CalculadoraException("Valores Nulos");
        }
        
        return numero1 * numero2;
    }

    @Override
    public int dividir(Integer numero1, Integer numero2) {
        
        if ((numero1 == null) || (numero2 == null)) {
            throw new CalculadoraException("Valores Nulos");
        }
        
        return numero1 / numero2;
    }
}