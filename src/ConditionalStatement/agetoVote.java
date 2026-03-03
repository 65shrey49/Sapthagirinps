package ConditionalStatement;

import java.util.Scanner;

public class agetoVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Minor");
        }

    }
}