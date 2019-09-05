package org.dimigo.array;

import java.util.Scanner;

public class Array1_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[51];
        int a = s.nextInt();

        for (int i = 1; i < a; i++)
            arr[s.nextInt()] = 1;

        for (int i = 1; i <= a; i++)
            if (arr[i] == 0)
                System.out.println(i);
    }

}