package Task_1;

import java.util.Scanner;

public class Task_1_Prime_number {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        //Whole
        if ( a == (int)a) {
        System.out.println("Number is whole" );
        //Even or odd
        if (a%2==0){
        System.out.println("Number is even");
            }
            else {
                System.out.println("Number is odd");}
        }
        else {
            System.out.println("Error! Number is't whole, try again.");
        }

        //Prime or composite
        for (int i = 1; i<=a; i++) {
               if ((a % i) == 0) {
                    count++;
                }
            }
            if (count==2 && a>1) {
                System.out.print("Number is prime");}
            else {
                if (count>2 && a>1)
                System.out.print("Number is composite ");
        }
    }
}



