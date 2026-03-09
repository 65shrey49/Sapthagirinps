package GarbageCollection;

public class EXThreads {
        public void run(){
            for (int i=0; i<10; i++){
                System.out.println("Thread is running...");
            }
        }

    }

      class Drive {
        public static void main(String[] args) {
            EXThreads m = new EXThreads();
            m.run();

            for (int i=0; i<10; i++){
                System.out.println("Main Thread if Running...");
            }
        }
    }


