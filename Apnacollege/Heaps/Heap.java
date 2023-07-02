package Apnacollege.Heaps;
import java.util.*;
public class Heap {
    ArrayList <Integer> arr = new ArrayList<>();

    // adding
    public  void add(int data){
arr.add(data); // added it at the end
int x = arr.size()-1; 
int par = (x-1)/2; // getting the parent of the last element which is been added
while(arr.get(x)<arr.get(par)){
    // swap
    int temp = arr.get(x);
    arr.set(x,arr.get(par));
    arr.set(par,temp);
    x = par; // changing the position 
    par = (x-1)/2; // changing the par
}
    }

    //print
    public int peek(){
        return arr.get(0);
    }

    // remove
    public int remove(){
        int data = arr.get(0);
        int temp = arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1,temp);
        arr.remove(arr.size()-1); 
        heapify(0);

return data;
    }

    private void heapify(int i){
        int leftchild = 2*i+1;
        int rightchild = 2*i+2;
        int minIdx = i;
        if(leftchild < arr.size() && arr.get(minIdx)>arr.get(leftchild)){
            minIdx = leftchild;
        }
        if(rightchild <arr.size() && arr.get(minIdx)>arr.get(rightchild)){
            minIdx = rightchild;
        }
        if(minIdx != i){
            // swap 
            int temp = arr.get(i);
            arr.set(i,arr.get(minIdx));
            arr.set(minIdx, temp); 
            heapify(minIdx);  
        }

    }

    public boolean isEmpty(){
        return arr.size() == 0;
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

while(!h.isEmpty()){
System.out.println(h.peek());
h.remove();
}

    }

}
