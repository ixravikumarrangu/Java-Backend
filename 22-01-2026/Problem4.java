import java.util.*;
class Student{
    private int id, marks;
    private String name;
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    public int get_marks(){
        return this.marks;
    }
    public void set_marks(int marks){
        this.marks=marks;
    }
    public boolean isPassed(){
        return(this.marks>=40);
    }
    public void print_profile(){
        String status=isPassed()?"Passed":"Failed";
        System.out.println(
            "Name : "+this.name+
            "\nStudent ID: "+this.id+
            "\nMarks : "+this.marks+
            "\nPass/Failed :"+status
        );
    }
}
public class Problem4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int id,marks;
        String name;
        id=sc.nextInt();
        name=sc.next();
        Student stu=new Student(id,name);
        System.out.print("Enter marks of "+name+" :");
        marks=sc.nextInt();
        stu.set_marks(marks);
        System.out.println("=== Student Profile ===");
        stu.print_profile();
    }
}
