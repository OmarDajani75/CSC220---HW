/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sfsu;

/**
 *
 * @author abeer
 */
public interface StackInterface<T> {
    public void push(T entry);
    public T pop();
    public T peek();
    public boolean isEmpty();
}
