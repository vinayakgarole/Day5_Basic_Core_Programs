package com.bridgelabz;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {

        System.out.println("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factors Number");

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}