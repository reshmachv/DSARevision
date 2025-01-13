package RecursiveProblem;

import java.util.Stack;

public class DeleteMiddleStack {
    public static Stack<Integer>deleteMid(Stack<Integer>s1,int n){
        if(s1.size()==(n/2)+1){
            s1.pop();
            return s1;
        }
        int e=s1.pop();
        deleteMid(s1,n);
        s1.add(e);
        return s1;
    }
    public static void main(String []args){
        Stack<Integer>s1=new Stack<>();
        s1.add(3);
        s1.add(5);
        s1.add(6);
        s1.add(4);
        s1.add(1);
        //s1.add(9);
        System.out.print(deleteMid(s1,s1.size()));
    }
}
