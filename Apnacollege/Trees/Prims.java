package Apnacollege.Trees;

import java.util.*;
public class Prims {
    
    public static class Edge{
        int src, dest, wt;
        public Edge(int src, int  dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }


    public static void main(String[] args) {
      ArrayList<Edge>[] graph = new ArrayList[5];  
      for(int i =0; i<graph.length;i++){
        graph[i] = new ArrayList<>();
      }
      createGraph(graph);
      PrimsBST(graph);
    }


    // static class Pair implements Comparable<Pair>
     static  class Pair implements Comparable<Pair>{
        int n , cost;
        public Pair(int n , int wt){
            this.n = n;
            this.cost = cost;
        }
        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost; // path based sorting
            // returning the low weight value ;
        }
    }


    public static void PrimsBST(ArrayList<Edge>[] graph){
        boolean vist[] = new boolean [graph.length];
        for(int i =0; i<vist.length;i++){
            vist[i] = false;
        }
        PriorityQueue <Pair> pq = new PriorityQueue<>();
        pq.add(new  Pair(0,0) );
        int finalCost = 0;
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vist[curr.n]){
                vist[curr.n] = true;
                finalCost+=curr.cost;
            for(int i =0; i<graph[curr.n].size();i++){
                Edge e = graph[curr.n].get(i);
                pq.add(new Pair(e.dest,e.wt));
            }
        }
        
        }
        System.out.println(finalCost);
    }

    public static void  createGraph(ArrayList<Edge>[] graph){
          // 0 vertex
          graph[0].add(new Edge(0, 1, 10));
          graph[0].add(new Edge(0, 2, 15));
          graph[0].add(new Edge(0, 3, 30));
        
          // 1 vertex
          graph[1].add(new Edge(1, 0, 10));
          graph[1].add(new Edge(1, 3, 40));
        
          // 2 vertex
          graph[2].add(new Edge(2, 0, 15));
          graph[2].add(new Edge(2, 3, 50));
        
          // 3 vertex
          graph[3].add(new Edge(3 , 1, 40));
          graph[3].add(new Edge(3 , 2, 50));
    }
}
