import java.util.*;
class Solution{
    int num;
    Solution(int num){
        this.num=num;
    }
    public String check_sign(){
        if(num<0)
            return "Negative";
        if(num>0)
            return "Positive";
        return "Zero";
    }
    public boolean even_odd(){
        return (num%2==0);
    }
}
public class Problem1{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        Solution sol=new Solution(num);
        System.out.println("The given number "+num+" is "+sol.check_sign());
        if(sol.even_odd()){
            System.out.println("The given number "+num+" is an even number");
        }else{

            System.out.println("The given number "+num+" is an odd number");
        }
    }
}