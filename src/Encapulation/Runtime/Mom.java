package Encapulation.Runtime;

public class Mom {
    void cook(){
        System.out.println(" INDIAN");
    }
}
class Daugther extends Mom{
    void cook(){
        System.out.println("MAXICAN");
    }
}
class Driver{
    public static void main(String[] args) {
        Mom m = new Mom();
        Daugther d = new Daugther();

        d.cook();
        m.cook();
    }
}

