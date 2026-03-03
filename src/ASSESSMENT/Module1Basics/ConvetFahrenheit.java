package Module1Basics;

import java.util.Scanner;

public class ConvetFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of celsius :");
        double deg = sc.nextInt();
        double fahrenheit = (deg * 1.8)  + 32;
        System.out.println("celsius to fahrenheit is: " + fahrenheit);
    }
}
