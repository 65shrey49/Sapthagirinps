package Methods;

public class Students {
    String name;
    int usn;

    Students(String name, int usn) {
        this.name = name;
        this.usn = usn;
    }

    void printdetails() {
        System.out.println("Student name:" + name);
        System.out.println("Student usn:" + usn);
    }
}

    class Driver {
        public static void main(String[] args) {
            Students s1 = new Students("shryas", 105);
            s1.printdetails();
        }
    }

