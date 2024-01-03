/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.pedro.projetoestudojava.programacaofuncional.funcionalinterface;

import java.util.List;

/**
 *
 * @author Pedro
 * @param <T>
 */
@FunctionalInterface
public interface InterfaceFuncional<T> {
    List<T>applay(T t);
}
