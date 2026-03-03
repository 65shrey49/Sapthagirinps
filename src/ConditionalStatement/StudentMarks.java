package ConditionalStatement;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args){
        double sub1, sub2, sub3, sub4, sub5, totalMarks;
        double percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sub1");
        int s1 = sc.nextInt();
        System.out.println("enter sub2");
        int s2 = sc.nextInt();
        System.out.println("enter sub3");
        int s3 = sc.nextInt();
        System.out.println("enter sub4");
        int s4 = sc.nextInt();
        System.out.println("enter sub5");
        int s5 = sc.nextInt();
        totalMarks=s1+s2+s3+s4+s5;
        System.out.println("total marks is " +totalMarks);
        percentage = (totalMarks/500)*100;
        System.out.println("percentage is"+percentage);


    }
}
