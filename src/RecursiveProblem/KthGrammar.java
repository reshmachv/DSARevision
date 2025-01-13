package RecursiveProblem;

import java.util.Scanner;

public class KthGrammar {
    public static int grammar(int n,int k){
        if(n==1||k==1){
            //System.out.println(0);
            return 0;
        }
        int mid=(int)Math.pow(2,n-1)/2;
        if(k<=mid) {
            int a=grammar(n - 1, k);
            //System.out.print(a+" ");
            return a;

        }
        else{
            int b=1-grammar(n-1,k-mid);
            //System.out.print(b+" ");
            return b;
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(grammar(n,k));
    }
}
