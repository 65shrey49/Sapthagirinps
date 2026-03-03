package StringPackage;

public class StringsBuffer {
    static void StringsAppend(){
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println("original sting is :" + sbf);
        sbf.append("world");
        System.out.println("New String is :" + sbf);
    }

    static void stringinsert(){
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println("Original string is: " + sbf);
        sbf.insert(2,"World");
        System.out.println("New String is: " +sbf);
    }
    static void stringReverse(){
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println("Original string is: " + sbf);
        sbf.reverse();
        System.out.println("New String is: " +sbf);
    }
    public static void main(String[] args){
        StringsAppend();
        stringinsert();
        stringReverse();
    }
}
