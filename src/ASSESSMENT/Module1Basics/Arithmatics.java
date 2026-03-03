package Module1Basics;

import java.util.Scanner;

public class Arithmatics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1  = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        //Addition
        int sum = num1 + num2;
        System.out.println(" sum of two number is :" + sum);
        //Subtract
        int num = num1 - num2;
        System.out.println("subtraction of two numbers is :" + num);
        // multiplication
        int product = num1 * num2;
        System.out.println("product of two numbers is : " + product);
        // division
        int fraction = num1 / num2;
        System.out.println("Division of two numbers is :" + fraction);

    }
}
