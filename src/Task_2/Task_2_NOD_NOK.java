package Task_2;

import java.util.Scanner;

public class Task_2_NOD_NOK {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = number.nextDouble();
        if (num1!=(int)num1){
            System.out.println("Error! The first number is's whole, try again.");
            return;
        }
        System.out.println("Enter second number:");
        double num2 = number.nextDouble();
        if (num2!=(int)num2){
            System.out.println("Error! The second number is't whole, try again.");
            return;
        }
        // ÍÎÄ
        int maxNum = (int) Math.max(num1,num2);
        int[] f = new int[maxNum];

        for (int i = 1; i < f.length; i++) {
            if ((num1 % i == 0) & (num2 % i == 0)) {
                f[i] = i;
            }
        }
        int max = f[0];
        for (int i = 0; i < f.length; i++) {
            if (max < f[i]) {
                max = f[i];
            }
        }
        System.out.println("ÍÎÄ = " + max);

        //Íàõîæäåíèå ÍÎÊ
        int nok =0;
        for (int i = 1; i < maxNum; i++) {
            int temp = maxNum*i;
            if (temp%num2==0) {
                nok = temp;
                break;
            }
        }
        System.out.println("ÍÎÊ = "+nok);

    }
}

