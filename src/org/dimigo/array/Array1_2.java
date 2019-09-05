package org.dimigo.array;

import java.util.*;

public class Array1_2 {

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);

        input = scanner.nextLine();

        char[] change = new char[input.length()];

        for(int i = 0; i < input.length(); i++){
            change[i] = input.charAt(i);
        }

        for(int i = input.length() - 1; i >= 0; i--) {
            System.out.print(change[i]);
        }
    }

}
