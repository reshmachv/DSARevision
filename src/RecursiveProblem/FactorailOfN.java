package RecursiveProblem;

import java.util.Scanner;

public class FactorailOfN {
    public static int factorial(int n){
        if(n==1||n==0){
            return n;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(factorial(n));
    }
}
