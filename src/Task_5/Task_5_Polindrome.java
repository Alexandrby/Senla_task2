package Task_5;

import java.util.Scanner;

public class Task_5_Polindrome {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scaner = new Scanner(System.in);
        Integer number = scaner.nextInt();
        if (number > 100 || number < 0) {
            System.out.println("Invalid number. You must enter from 0 to 100.");
            return;
        }
        for (int i = 0; i < number; i++) {
            String numberWord = Integer.toString(i);
            char[] A = numberWord.toCharArray();
            char[] B = new char[A.length];
            for (int j = 0; j < A.length; j++) {
                B[(A.length - 1) - j] = A[j];
            }
            int sum = 0;
            for (int k = 0; k < A.length; k++) {
                if (A[k] == B[k]) {
                } else sum++;

            }
            if (sum > 0) {
            } else System.out.println(i);
        }
    }
}

