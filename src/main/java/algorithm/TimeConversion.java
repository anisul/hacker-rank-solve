package algorithm;

import java.util.Scanner;

public class TimeConversion  {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String[] parts = s.split(":");
        String hourComponent = parts[0];
        String minuteComponent = parts[1];
        String secondComponent = parts[2].substring(0,2);
        String amPmComponent = parts[2].substring(2,4);

        int hourComponentInInt = Integer.parseInt(hourComponent);
        if (amPmComponent.equals("PM") && (hourComponentInInt >=1 && hourComponentInInt <= 11)) {
            hourComponent = String.valueOf(hourComponentInInt + 12);
        } else if (hourComponentInInt == 12 && amPmComponent.equals("AM")) {
            hourComponent = "00";
        }

        return hourComponent + ":" + minuteComponent + ":" +secondComponent;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scan.nextLine();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
