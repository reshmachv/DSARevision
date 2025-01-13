package RecursiveProblem;

import java.util.Scanner;
public class Printnumbers {
    public static void print(int n){
        if(n==0){
            System.out.print(n+" ");
            return;
        }
        //System.out.print(n+" ");
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}
