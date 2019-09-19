package org.dimigo.stack;

import java.util.*;

public class Stack1_2 {

    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

}