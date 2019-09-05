package org.dimigo.array;

import java.util.*;

public class Array1_1 {

    public static void main(String[] args) {
        int size, random;
        Scanner scanner = new Scanner(System.in);

        size = scanner.nextInt();
        random = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*random+1);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        int[] count = new int[random+1];

        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for(int i = 0; i < count.length; i++) {
            System.out.println(i + "의 개수: " + count[i]);
        }
    }

}
