package algorithm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GradingStudents {
    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int[] finalGrades = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            int quotient = grades[i] % 5;
            int remainingToBeMultipleOfFive = 5 - quotient;

            if (grades[i] >= 38 && remainingToBeMultipleOfFive < 3) {
                finalGrades[i] = grades[i] + remainingToBeMultipleOfFive;
            } else {
                finalGrades[i] = grades[i];
            }
        }
        return finalGrades;
    }


    public static void main(String[] args) throws IOException {
        int[] grades = {73, 67, 38, 33};
        int[] result = gradingStudents(grades);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
