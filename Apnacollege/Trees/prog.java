// package Apnacollege.Trees;


// import java.util.*;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;


// public class prog{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i = 0; i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//          List<Integer> duplicates = findDuplicates(arr);

//          for( int i =0; i<duplicates.size();i++){
//            System.out.print( duplicates.get(i)+" ");
//          }
        
//     }







//     public static List<Integer> findDuplicates(int[] arr) {
//         List<Integer> duplicates = new ArrayList<>();
//         Map<Integer, Integer> countMap = new HashMap<>();

//         // Count occurrences of each element
//         for (int num : arr) {
//             countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//         }

//         // Add elements with count > 1 to duplicates list
//         for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
//             if (entry.getValue() > 1) {
//                 duplicates.add(entry.getKey());
//             }
//         }

//         return duplicates;
//     }
// }

   


// // 2 2 5 2 1 1 8 9

// // write a Java program to check whether given two strings are anagrams or not.

// // ip1:

// // keep

// // peek

// // op1:

// // Yes

// // For example:

// // Test	Input	Result
// // Test case 1
// // keep
// // peek
// // Yes
// // Test case 2
// // anagrams
// // anagram
// // No