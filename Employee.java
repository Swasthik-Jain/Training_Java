public class Employee{
    public int id;
    public String FirstName;
    public String LastName;
    public int salary;
    public String Name;
    public int AnnualSalary;
    public Employee(int id,String FirstName,String LastName,int salary){
        this.id=id;
        this.FirstName=FirstName;
        this.LastName = LastName;
        this.salary = salary;
        this.Name=this.FirstName + " " +this.LastName;
        this.AnnualSalary=this.salary*12;
    }
    public int getID(){
        return this.id;
    }
    public String getFirstName(){
        return this.FirstName;
    }
    public String getLastName(){
        return this.LastName;
    }
    public int getSalary(){
        return this.salary;
    }
    public String getName(){
        return this.Name;
    }
    public int getAnnualSalary(){
        return this.AnnualSalary;
    }
    public int raiseSalary(int percent){
        this.AnnualSalary=AnnualSalary+(AnnualSalary*percent/100);
        this.salary=AnnualSalary/12;
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public String toString(){
        return (Name+" "+salary+" "+ AnnualSalary+" "+id);
    }
    public static void main(String args[]){
        Employee e1 = new Employee(1,"Barfdgdh","hdhjjdkd",10000);
        System.out.println(e1);
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}