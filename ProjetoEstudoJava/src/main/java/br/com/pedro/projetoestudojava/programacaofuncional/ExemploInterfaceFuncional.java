/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedro.projetoestudojava.programacaofuncional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author Pedro
 */
public class ExemploInterfaceFuncional {
    
    //Predicate, Consumer, Function, Supplier, UnaryOperator, BinaryOperator
    
    //Para operações Booleanas pode-se usar o Predicate
    //Sintaxe Preditate<T>
    Predicate<String> valorPredicate = valor -> valor.isEmpty();
    
    //Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado, o nome ja diz CONSUMER
    //Sintaxe Consumer<T>
    Consumer<String> valorConsumer = s -> System.out.println(s);
    
    //Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R
    //Sintaxe Function<T,R>
    Function<String,Integer> valorFunction = t -> t.length();
    
    public int testeFunction(){
      return valorFunction.apply("abacate com tomate");
    }
    
    public void testeConsumer(String frase){
        valorConsumer.accept(frase);
    }
    
    public static void main(String args[]){
        ExemploInterfaceFuncional teste = new ExemploInterfaceFuncional();
        teste.testeConsumer("TESTE DENTRO DO CONSUMER "+ teste.testeFunction());
    }
    
}
