package Module3;

import java.util.Scanner;

public class square {
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int result = square(number);

        System.out.println("Square of " + number + " is: " + result);
    }
}
