package Methods;

public class Demo {
    void printDemo(){
        System.out.println("Demoo");
    }
}


class DriverCode{
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.printDemo();
    }
}