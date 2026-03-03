package Encapulation;

interface Mom {
    void cook();
}
interface Dad{
    void cook();
}
class Child implements Mom, Dad{
    public void cook(){
        System.out.println("Indian");
    }
}
