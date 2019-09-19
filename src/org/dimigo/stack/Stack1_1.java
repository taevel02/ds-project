package org.dimigo.stack;

public class Stack1_1 {

    public static void main(String[] args) throws Exception {
        MyStack ms = new MyStack(3);
        ms.push('A');
        ms.push('B');
        ms.push('C');
        System.out.println(ms.peek());

        while (!ms.isEmpty()) {
            System.out.println(ms.pop());
        }
    }

}

class MyStack {
    private char[] stack;
    private int top;
    private int size;

    public MyStack(int size) {
        this.top = -1;
        this.size = size;
        this.stack = new char[size];
    }

    public char push(char item) {
        if (isFull()) throw new RuntimeException("Stack is Full");
        return stack[++top] = item;
    }

    public char pop() {
        if (isEmpty()) throw new RuntimeException("Stack is Empty");
        return stack[top--];
    }

    public char peek() {
        return stack[top];
    }

    public boolean isFull() {
        return top == (size-1);
    }

    public boolean isEmpty() {
        return top == -1;
    }
}