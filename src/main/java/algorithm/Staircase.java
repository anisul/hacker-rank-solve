package algorithm;

import java.util.Scanner;

/*
* Problem URL: www.hackerrank.com/challenges/staircase/problem
* Submitted By: anisulnz
* */
public class Staircase {

    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int m = 0; m < n - i - 1; m++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
