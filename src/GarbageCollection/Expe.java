package GarbageCollection;

import java.lang.reflect.Array;

public class Expe {
    public static void main(String[] args) {
        int i=10, j=0, k=0;
        try{
            k=i/j;
            int[] arr = {1,2,3,4,5};
        }
        catch (ArithmeticException e){
            System.out.println("You cant divide anything by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index");
        }
        catch(Exception e){
            System.out.println("unknown exception");
        }
        finally{
            System.out.println("this stack will get executed");
        }
        System.out.println("hello");

    }

}
