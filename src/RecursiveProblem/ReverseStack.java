package RecursiveProblem;

import java.util.Stack;

public class ReverseStack {
    public static Stack<Integer>reverse(Stack<Integer>s2){
        if(s2.isEmpty()){
            return s2;
        }
        int element=s2.pop();
        reverse(s2);
        s2.add(element);
        return s2;
    }
    public static void main(String[] args){
        Stack<Integer>s2=new Stack<>();
        s2.add(5);
        s2.add(4);
        s2.add(3);
        s2.add(2);
        s2.add(1);
        System.out.println(reverse(s2));
    }
}
