package saturday;

class employee{
    
    double salary=50000;
    void displaysalary()

    {
        System.out.println("employee salary rs"+ salary);
    }
}
class fulltimeemployee extends employee {
    double hike=0.50;
     void incrementsalary()
     {
        salary=salary+(salary*hike);

     }
}
class internemployee extends employee{
    double hike=0.25;
    void incrementsalary()
    {
       salary=salary+(salary*hike);

    }

    
}
public class hierarchical{
    public static void main(String[] args)
    {
        fulltimeemployee emp1=new fulltimeemployee();
        internemployee emp2=new internemployee();
        System.out.println("salary of employee of a full time employee before incrementing");
        emp1.displaysalary();
        System.out.println("salary of employee of a intern before incrementing");
        emp2.displaysalary();
        emp1.incrementsalary();
        emp2.incrementsalary();
        System.out.println("salary of employee of a full time employee after incrementing");
        emp1.displaysalary();
        System.out.println("salary of employee of a intern after incrementing");
        emp2.displaysalary();

    }

}