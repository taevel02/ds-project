package org.dimigo.stack;

import java.util.*;

public class Stack1_3 {

    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack();
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int inputNum;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            inputNum = scanner.nextInt();
            if (inputNum == 0) {
                stack.pop();
            } else {
                stack.push(inputNum);
            }
        }

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }

}
