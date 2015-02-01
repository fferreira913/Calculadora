package com.br.app;

import com.br.classes.Calculadora;

/**
 *
 * @author Fatinha de Sousa
 */
public class App {

    public static void main(String [] args){
    
        Calculadora calculadora = new Calculadora();
        
        System.out.println("------------Projeto Calculador");
        System.out.println("Soma: " +calculadora.somar(5, 5));
        System.out.println("Subtrair: " +calculadora.subtrair(5, 5));
        System.out.println("Multiplicar: " +calculadora.multiplicar(5, 5));
        System.out.println("Divisão: " +calculadora.dividir(5, 5));
    }
}
