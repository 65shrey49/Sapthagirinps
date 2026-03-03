package Module1Basics;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1  = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        // with third varible

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Num1 = " +num1+" Num2 = " + num2);

        // without third variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Num1 = " +num1+" Num2 = " + num2);
    }
}
