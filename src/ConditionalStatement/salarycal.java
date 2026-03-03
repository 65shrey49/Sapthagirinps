package ConditionalStatement;


import java.util.Scanner;

public class salarycal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SALARY:");
        double salary = sc.nextDouble();
        double tax = 0;
        if (salary <= 300000) {
            tax = 0;
        }
        else if(salary<=700000){
            tax = salary * 0.10;
        }
        else{
            tax = salary * 0.20;
        }
        System.out.println("salary" + salary);
        System.out.println("tax to be paid" + tax);
        System.out.println("Net salary after tax" + (salary - tax));
        sc.close();
    }
}
