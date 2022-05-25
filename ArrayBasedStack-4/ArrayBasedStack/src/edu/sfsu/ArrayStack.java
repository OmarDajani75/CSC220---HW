/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sfsu;

import java.util.Arrays;

/**
 *
 * @author abeer
 */
public class ArrayStack<T> implements StackInterface<T> {

    private T[] stack; // array of stack entries
    private int topIndex; // index of top entry
    private static final int DEFAULT_INITIAL_CAPACITY = 50;

    public ArrayStack() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public ArrayStack(int initialCapacity) {
        // the cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[]) new Object[initialCapacity];
        stack = tempStack;
        topIndex = -1;
    }

    private void ensureCapacity() {
        if (topIndex == stack.length - 1) // if array is full,
        // double size of array
        {
            stack = Arrays.copyOf(stack, 2 * stack.length);
        }
    } // end ensureCapacity

    @Override
    public void push(T entry) {
        ensureCapacity();
        topIndex++;
        stack[topIndex] = entry;
    }

    @Override
    public T pop() {
        T top = null;
        if (!isEmpty()) {
            top = stack[topIndex];
            stack[topIndex] = null;
            topIndex--;
        } // end if
        return top;
    }

    public boolean popN(int n) {
        if (n<=topIndex+1) {
            for (int i=0; i<n ;i++) {
                stack[topIndex] = null;
                topIndex--;
            }
            return true;
        }
        else { return false; }
    }

    @Override
    public T peek() {
        T top = null;
        if (!isEmpty()) {
            top = stack[topIndex];
        }
        return top;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

}
