package algorithm;

import java.util.Scanner;

public class BirthdayCakeCandle {
    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int maxValue = 0;
        int maxValueCount = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > maxValue) {
                maxValueCount = 0;
                maxValue = ar[i];
                maxValueCount++;
            } else if (ar[i] == maxValue) {
                maxValueCount++;
            }
        }

        return maxValueCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        System.out.println(result);
        scanner.close();
    }
}
