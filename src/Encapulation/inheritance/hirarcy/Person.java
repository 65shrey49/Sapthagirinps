package Encapulation.inheritance.hirarcy;

public class Person {
    String FirstName;
    String LastName;

    Person(String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
}
class Student extends Person{
    int usn;

    Student(String FirstName, String LastName, int usn) {
        super(FirstName, LastName);
        this.usn = usn;
    }

        void printdetails() {
            System.out.println("First Name is :" + FirstName);
            System.out.println("Last Name is :" + LastName);
            System.out.println("USN is :" + usn);
        }


}

class Drive{
    public static void main(String[] args) {
        Student s1 = new Student("Shreyas","Yalamalli",105 );
        s1.printdetails();

    }
}
