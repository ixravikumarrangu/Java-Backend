import java.math.BigInteger;
import java.util.*;
class Solution{
    // int a,b,num;
    // Solution(int a, int b){
    //     this.a=a;
    //     this.b=b;
    // }
    // Solution(int num){
    //     this.num=num;
    // }
    public int add(int a, int b){
        return (a+b);
    }
    public boolean isEven(int num){
        return (num%2==0);
    }
    // public long findFactorial(long num){
    //     if (num==0)
    //         return 1L;
    //     return num*(findFactorial(num-1));
    // }
    public BigInteger findFactorial(BigInteger num){
        if(num.equals(BigInteger.ZERO))
            return (BigInteger.ONE);
        return num.multiply(findFactorial(num.subtract(BigInteger.ONE)));
    }
}
public class Problem3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int num=sc.nextInt();
        Solution sol=new Solution();
        System.out.println("Sum of "+a+" and "+b+" is "+sol.add(a,b));
        String isEven=sol.isEven(num)?"Even number":"Odd Number";
        System.out.println(num+" is an "+isEven);
        System.out.println("Factorial of "+num+" is "+sol.findFactorial(BigInteger.valueOf(num)));
    }
}
