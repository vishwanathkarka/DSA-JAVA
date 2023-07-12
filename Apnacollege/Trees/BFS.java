package Apnacollege.Trees;

import java.util.ArrayList;
import java.util.*;

public class BFS {

    static class Edge{
        int src ;
        int dest;
        int wt;
     public Edge(int s,int d,int w){
        this.src =s;
        this.dest = d;
        this.wt = w;
     }
    }

public static void breathForSearch(ArrayList<Edge>[] graph){
    Queue<Integer> q = new LinkedList<>();
boolean visited[] = new boolean[graph.length];
q.add(0); // taking the root as the 0;
while(!q.isEmpty()){
int curr = q.remove();
if(!visited[curr]){
    System.out.println(curr+" ");
    visited[curr] = true;
    for(int i =0; i< graph[curr].size(); i++){
        Edge e = graph[curr].get(i);
q.add(e.dest);
    }
}
}
}


   public static void main (String args[]){
        int v = 5;
        ArrayList <Edge>[] graph = new ArrayList[v];
        for(int i =0; i<v; i++){
            graph[i] = new ArrayList<>();
        }
        //   (5)
        // 0 --- 1
        // (1) /   \   (3)  
        //    /     \
        //    2 ---- 3
        //(2) |  (1) 
        //    4

        // 0- vertex
        graph[0].add(new Edge(0,1,5));

        // 1-vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        // 2-vertex
         graph[2].add(new Edge(2,1,1));
         graph[2].add(new Edge(2,3,1));
         graph[2].add(new Edge(2,4,2));

        // 3-vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        // 4 vertex
        graph[4].add(new Edge(4,2,2));
        

        breathForSearch(graph);

        //2- neighbors
        // for(int i =0; i<graph[2].size();i++){
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.dest);
        // }

     
    }

  

    
}
