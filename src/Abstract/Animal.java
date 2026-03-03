package Abstract;

abstract class Animal {
    abstract void eat();

    void run(){
        System.out.println("Running");
    }
}
class Lion extends Animal{
    void eat(){
        System.out.println("MEAT");
    }
}
class Dear extends Animal{
    void eat(){
        System.out.println("GRASS");
    }
}
class Drive{
    public static void main(String[] args) {
        Lion l = new Lion();
        l.eat();
        l.run();

        Dear d = new Dear();
        d.eat();
        d.eat();
    }
}
