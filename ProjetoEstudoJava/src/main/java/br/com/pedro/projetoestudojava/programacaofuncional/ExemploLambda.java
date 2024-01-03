/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedro.projetoestudojava.programacaofuncional;

import java.util.Scanner;
import java.util.function.BinaryOperator;

/**
 *
 * @author Pedro
 */
public class ExemploLambda {
    public static void main(String args[]){
     ExemploLambda jurosSimples = new ExemploLambda();
     jurosSimples.jurosSimples();
    }
    
    public void lambdaExplicita(){
        BinaryOperator<Integer>retorno =(x,y) ->{
            return x+y;
        };
        
        int resultado = retorno.apply(3, 4);
        System.err.println("RESULADO Explicita:.............: "+resultado);
    }
    
    public void lambdaImplicita(){
        BinaryOperator<Integer>retornoImplicita = (x,y) -> x+y;
        int resultado = retornoImplicita.apply(3, 4);
        System.err.println("RESULADO Implicita:.............: "+resultado);
        
    }
    
    public void jurosSimples(){
            
                System.err.println("Informe o valor para calcular o juros: ");
                Scanner valorDigitado = new Scanner(System.in);
                Double valor = valorDigitado.nextDouble();
                   
                TriFunction<Double, Double, Double,Double>jurosSimples = (principal,taxa,anos)->principal*(taxa/100)*anos;
                double resultadoJuros = jurosSimples.apply(valor, 10.0, 5.0);
                double valorFinal = resultadoJuros + valor;
                System.err.println("Total de juros é: "+ resultadoJuros + "valor total com juros é :" + valorFinal);
    }
    
    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
  
    
    
}
