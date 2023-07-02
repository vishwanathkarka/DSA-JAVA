package Apnacollege.Hashing;
import java.util.*;

public class Hashing {

    public static void main(String[] args) {
        
   
    HashMap <String,Integer> map = new HashMap<>();
    // push
    map.put("Prashanth",809);
map.put("vishwa",7890);
map.put("Arun",678);
map.put("Ravi Teja",8994);

// get the value
System.out.println(map.get("Arun"));

// checking whether key available in the map
System.out.println(map.containsKey("Arun"));

// removing the element from the map
System.out.println(map.remove("vishwa"));

// printing the all the value of the map 
    System.out.println(map);

// printing the size
System.out.println(map.size());

// IsEmpty
System.out.println(map.isEmpty());

// iterate
Set <String> keys = map.keySet();

// for each
for(String k : keys){
    System.out.println("key = "+k+", value = "+map.get(k));
}


System.out.println(keys);


// LinkedHasMap - inorder double linked list
LinkedHashMap<String,Integer> lh = new LinkedHashMap<>();
lh.put("vishwa",94);
lh.put("Rajesh",87);
lh.put("Prashanth",33);
lh.remove("Rajesh");
System.out.println(lh.size());
Set <String> m = lh.keySet();
for(String k : m){
System.out.println(lh.get(k));
}

System.out.println(lh);
System.out.println(lh.isEmpty());

//Tree Map 
TreeMap<String,Integer> tm = new TreeMap<>();  // insertion - 0 (log n)
tm.put("Vishwa",789);
System.out.println(tm.get("Vishwa"));


// HashSet
HashSet<Integer> set = new HashSet<>();
set.add(78);
set.add(97);
set.add(97);
System.out.println(set.contains(97));
set.remove(78);
System.out.println(set.size());
System.out.println(set.isEmpty());
System.out.println(set);

// iterator
for(Integer i : set){
System.out.print(i);
}
    }

}
