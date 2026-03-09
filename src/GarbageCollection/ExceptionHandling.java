package GarbageCollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args)  throws IOException{
        String name;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER SOME NAME");
        name = br.readLine();
        System.out.println("You entered: "+ name);
    }
}
