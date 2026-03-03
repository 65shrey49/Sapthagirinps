package Methods;

public class job {
    String company;
    int salary;

    job(String company, int salary){
        this.company = company;
        this.salary = salary;
    }
    void printdetails(){
        System.out.println("Name of company:" + company);
        System.out.println("Expected salary:" + salary);
    }
}
class direct{
    public static void main(String[] args) {
        job c1 = new job("wipro", 100000);
        c1.printdetails();
    }
}
