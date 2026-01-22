import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Employee{
    int id;
    String name;
    double monthlySalary;
    public static String companyName="InnovaTech Technology Solutions";
    Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.monthlySalary=salary;
    }
    public double calculateAnualSalary(){
        return 12*this.monthlySalary;
    }
    public void displayEmployeeDetails(){
        System.out.println(
            "Employee Id: "+this.id+"\n"+
            "Name :"+this.name+"\n"+
            "Annual Salary :"+calculateAnualSalary()+
            "Company :"+companyName
        );
    }
}
public class Problem5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of employees: ");
        int cnt=sc.nextInt();
        List<Employee> arr=new ArrayList<>();
        for(int i=1;i<=cnt;i++){
            System.out.println("Enter Employee "+i+" details: ");
            int id=sc.nextInt();
            String name=sc.next();
            double sal=sc.nextDouble();
            Employee emp=new Employee(id,name,sal);
            arr.add(emp);
        }
        for(Employee myobj:arr){
            System.out.println();
            myobj.displayEmployeeDetails();
        }
    }
}
