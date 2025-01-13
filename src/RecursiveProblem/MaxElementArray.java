package RecursiveProblem;

import java.util.ArrayList;
import java.util.List;

public class MaxElementArray {
    public static int MaxElementArray(List<Integer>l,int max){
        if(l.isEmpty()){
            //System.out.println(max);
            return max;
        }
        int e=l.get(l.size()-1);
        if(max<e){
            max=e;
        }
        l.remove(l.size()-1);
        return MaxElementArray(l,max);
    }
    public static void main(String []args){
        List<Integer>l=new ArrayList<>();
        l.add(1);
        l.add(4);
        l.add(6);
        l.add(5);
        l.add(3);
        l.add(2);
        System.out.print(MaxElementArray(l,0));
    }
}
