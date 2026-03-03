package Encapulation;



public class Student {
        private String name;
        private int usn;
        static String college;

        Student(String name, int usn) {
            this.name = name;
            this.usn = usn;
            college = "Sapthagiri";
        }

        // getter()
        String getName() {
            return name;
        }
        int getUsn() {
            return usn;
        }
        // setter()
        void setName(String n){
            name = n;
        }
        void setUsn(int usn){
            this.usn = usn;
        }

        void printdetails() {
            System.out.println("Student name:" + name);
            System.out.println("Student usn:" + usn);
            System.out.println("Student college is:" + college);
        }
    }

    class Driver {
        public static void main(String[] args) {
            Student s1 = new Student("shrey", 105);
            Student s2 = new Student("shiva",100);
            s1.printdetails();
            s2.printdetails();

            s1.setName("ravi");
            s2.setUsn(406);

            System.out.println(s1.getName());
            s1.printdetails();
            s2.printdetails();
        }
}

