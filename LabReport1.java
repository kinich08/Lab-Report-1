class Employee {
    protected String name;
    protected int id;
    protected double basicSalary;
    
    public Employee(String name,int id,double basicSalary){
        this.name=name;
        this.id=id;
        this.basicSalary=basicSalary;
    }
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Basic Salary: "+basicSalary+" Taka");
    }
}

class Manager extends Employee{
    String department;
    
    public Manager(String name,int id,double basicSalary,String department){
        super(name,id,basicSalary);
        this.department=department;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo(); 
        System.out.println("Department: "+department);
        System.out.println();
    }
}

public class LabReport1{
    public static void main(String[] args) {
        
        Employee emp = new Employee("Sumit",24200311,30000.0);
        System.out.println("Employee Details:");
        emp.displayInfo();
        System.out.println();
        
        Manager m = new Manager("Antor Bhowmik",24200211,75000.0, "IT");
        System.out.println("Manager Details:");
        m.displayInfo();
    }
}