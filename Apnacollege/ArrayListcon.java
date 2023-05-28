package Apnacollege;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListcon {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(3);// 3 is intial capacity
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

list.add(5);
list.add(6);
list.add(1);
list2.add("hello");
System.out.println(list); //[5, 6, 1]
System.out.println(list2); //[hello]
Collections.sort(list); // sorted in ascending order
Collections.sort(list , Collections.reverseOrder()); //reverse order sorted
System.out.println(list); // [6, 5, 1]
System.out.println(list.get(1)); //5
list.set(1,99); 
System.out.println(list); //[6, 99, 1]
System.out.println(list.size()); //3



// multi dimensional array list
ArrayList<ArrayList> mainList = new ArrayList<>();
ArrayList<Integer> li = new ArrayList<>();
li.add(5);
li.add(9);
mainList.add(li);
mainList.add(li);
System.out.println(mainList); //[[5, 9], [5, 9]]
    }
}
