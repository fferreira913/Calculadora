package com.br.exception;

/**
 *
 * @author Fatinha de Sousa
 */

public class CalculadoraException extends RuntimeException{
    
    public CalculadoraException(){
    
    }
    
    public CalculadoraException(String mensagem){
        super(mensagem);
    }
}
