package algorithm;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/*
* Problem URL: www.hackerrank.com/challenges/mini-max-sum/problem
* Submitted By: anisulnz
* */
public class MiniMaxSum {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(double[] arr) {
        DecimalFormat df = new DecimalFormat("0");
        double[] tempArray = arr;
        Arrays.sort(tempArray);
        double minTotal = 0;
        double maxTotal = 0;
        //calculating sum of first 4 elements
        for (int i = 0; i < 4; i++) {
            minTotal += tempArray[i];
        }

        for (int j = tempArray.length -1 ; j > tempArray.length -5; j--) {
            maxTotal += tempArray[j];
        }

        System.out.println(df.format(minTotal) + " " + df.format(maxTotal));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        double[] arr = new double[arrItems.length];

        for (int i = 0; i < arrItems.length; i++) {
            double arrItem = Double.parseDouble(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
