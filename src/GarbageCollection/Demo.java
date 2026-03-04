package GarbageCollection;

public class Demo {
    public void finalize(){
        System.out.println("Garbage collected");
    }

    public static void main(String[] args) {
        for (int i=0; i<5000; i++){
            Demo obj = new Demo();
            obj = null;
        }
        System.gc();    // calling garbage collector
    }
}

