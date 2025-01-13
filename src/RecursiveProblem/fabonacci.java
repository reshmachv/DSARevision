package RecursiveProblem;

import java.util.Scanner;

public class fabonacci {
    public static int fabonacciNumber(int n){
        if(n==1||n==0){
            return n;
        }
        return fabonacciNumber(n-1)+fabonacciNumber(n-2);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fabonacciNumber(n));
    }
}
