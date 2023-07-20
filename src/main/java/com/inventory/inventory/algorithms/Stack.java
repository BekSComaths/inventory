package main.java.com.inventory.inventory.algorithms;
import jsjf.exceptions.*;
import java.util.Arrays;

public class Stack<T> { // Added generic type T
    private final static int DEFAULT_CAPACITY = 100;
    private int top;
    private T[] stack;

    @SuppressWarnings("unchecked")
    public Stack(int initialCapacity) { // Changed method name to match class name
        top = 0;
        stack = (T[])(new Object[initialCapacity]);
    }

    public void push(T element) {
        if (size() == stack.length)
            expandCapacity();
        stack[top] = element;
        top++;
    }

    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    public T pop() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack is empty"); // Added error message
        top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }

    public T peek() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack is empty"); // Added error message
        return stack[top - 1];
    }

    public boolean isEmpty() { // Added isEmpty() method
        return top == 0;
    }

    public int size() { // Added size() method
        return top;
    }
}

