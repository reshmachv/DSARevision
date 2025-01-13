package RecursiveProblem;

import java.util.List;
import java.util.Stack;

public class SortStack {
    public static Stack<Integer> insertion(Stack<Integer>s,int temp){
        if(s.isEmpty()||s.peek()<=temp){
            s.add(temp);
            return s;
        }
        int first=s.pop();
        insertion(s,temp);
        s.add(first);
        return s;
    }
    public static Stack<Integer> sortingStack(Stack<Integer>s){
        if(s.size()==1){
            return s;
        }
        int temp=s.pop();
        sortingStack(s);
        return insertion(s,temp);
    }
    public static void main(String []args){
        Stack<Integer> s=new Stack<>();
        s.add(1);
        s.add(4);
        s.add(6);
        s.add(5);
        s.add(3);
        s.add(2);
        System.out.println(sortingStack(s));
    }
}
