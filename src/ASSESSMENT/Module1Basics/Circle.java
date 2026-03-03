package Module1Basics;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the value of radius");
        double rad = sc.nextInt();
        // formula
        double area =  Math.PI * rad * rad;
        System.out.println("Area of circle is :" + area);

    }
}
