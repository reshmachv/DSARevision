package RecursiveProblem;

import java.util.ArrayList;
import java.util.List;

public class SortArray {
  public static List<Integer>insert(List<Integer>arr,int temp){
    if(arr.isEmpty() ||arr.get(arr.size()-1)>=temp){
      arr.add(temp);
      System.out.println("element added if temp element is greater"+temp);
      return arr;
    }
    int last = arr.get(arr.size() - 1);
    arr.remove(arr.size() - 1);
    insert(arr,temp);
    arr.add(last);
    System.out.println("Adding element after sorting the array"+arr);
    return arr;
  }
  public static List<Integer> arraySort(List<Integer> arr,int n){
    if(n==1){
      System.out.println("last item in unsorted array"+arr);
      return arr;
    }
    int temp=arr.get(n-1);
    System.out.println("sending last element to get sorted by function"+temp);
    arr.remove(n-1);
    arraySort(arr,n-1);
    return insert(arr,temp);
  }
  public static void main(String[] args) {
    List<Integer> arr=new ArrayList<>();
    arr.add(5);
    arr.add(8);
    arr.add(1);
    arr.add(7);
    arr.add(0);
    System.out.print(arraySort(arr,arr.size()));
  }
}
