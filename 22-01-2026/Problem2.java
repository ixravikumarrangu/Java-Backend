import java.util.*;
class Solution{
    int num;
    Solution(int num){
        this.num=num;
    }
    public void print_1_to_n(){
        for(int i=1;i<=this.num;i++){
            System.out.print(i+" ");
        }
    }
    public void even_numbers(){
        for(int i=2;i<=this.num;i+=2){
            System.out.print(i+" ");
        }
    }
    public int sum_of_numbers(){
        int i=this.num;
        int sum=0;
        while(i>0){
            sum+=i;
            i--;
        }
        return sum;
    }
}
public class Problem2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Solution sol=new Solution(num);
        System.out.println("Printing 1 to "+num+": ");
        sol.print_1_to_n();
        System.out.println("\nPrinting even numbers from 1 to "+num+": ");
        sol.even_numbers();
        System.out.println("\nThe Sum of numbers from 1 to "+num+" is "+sol.sum_of_numbers());
    }
}
