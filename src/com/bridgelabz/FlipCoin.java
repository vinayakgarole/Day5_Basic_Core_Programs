package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {

        int heads = 0;
        int tails = 0;
        int count = 1;

        System.out.println("Enter the total number of flips: ");
        Scanner n = new Scanner(System.in);
        int flips = n.nextInt();

        while (count <= flips) {
            double r = Math.floor(Math.random() * 10) % 2;
            System.out.println(count + " " + r);

            if (r < 0.5) {
                heads++;
                System.out.println("HEADS");
            } else {
                tails++;
                System.out.println("TAILS");
            }
            count++;
        }
        System.out.println("Number of HEADS: " + heads);
        System.out.println("Number of TAILS: " + tails);

        double headpercent = (double) heads / flips * 100;
        double tailpercent = (double) tails / flips * 100;

        System.out.println("percentage of heads: " + headpercent);
        System.out.println("percentage of tails: " + tailpercent);
    }
}
