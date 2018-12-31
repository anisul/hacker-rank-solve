package algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> sockHashmap = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            Integer count = sockHashmap.get(ar[i]);

            if (count == null) {
                sockHashmap.put(ar[i], 1);
            } else {
                sockHashmap.put(ar[i], new Integer(count + 1));
            }
        }

        Iterator iterator = sockHashmap.entrySet().iterator();

        int pairCount = 0;
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if (Integer.parseInt(pair.getValue().toString()) > 0) {
                pairCount += Integer.parseInt(pair.getValue().toString()) / 2;
            }
        }

        return pairCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

        scanner.close();
    }
}
