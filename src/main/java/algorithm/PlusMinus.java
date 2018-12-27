package algorithm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
    private static DecimalFormat decimalFormat = new DecimalFormat("0.000000");

    // Complete the plusMinus function below.

    static void plusMinus(int[] arr) {
        double positiveElementCount = 0;
        double negativeElementCount = 0;
        double zeroElementCount = 0;
        double totaElementCount = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveElementCount++;
            } else if (arr[i] < 0) {
                negativeElementCount++;
            } else {
                zeroElementCount++;
            }
        }

        System.out.println(decimalFormat.format(positiveElementCount/totaElementCount));
        System.out.println(decimalFormat.format(negativeElementCount/totaElementCount));
        System.out.println(decimalFormat.format(zeroElementCount/totaElementCount));
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
