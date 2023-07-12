package Apnacollege.Trees;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import Apnacollege.sort;

public class DFS {

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

public static void depthFirstSearch(ArrayList<Edge>[] graph , int curr, boolean vis[]){
    System.out.println(curr);
    vis[curr] = true;
    System.out.println(Arrays.toString(vis));
    for(int i =0; i<graph[curr].size();i++){
        System.out.println("Index"+i);
       System.out.println("^^^^^^"+graph.toString());
        Edge e = graph[curr].get(i);
        System.out.println("destiation"+e.dest);
        if(!vis[e.dest]){
            depthFirstSearch(graph,e.dest,vis);
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
        

        //2- neighbors
        // for(int i =0; i<graph[2].size();i++){
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.dest);
        // }

        for(int i =0; i<graph.length;i++){
// System.out.println((graph));
for(int j =0; j<graph[i].size();j++){
 Edge e =  graph[i].get(j);
 System.out.print(e.dest+"->");
}
System.out.println();
        }
       depthFirstSearch(graph,0,new boolean[v]);
    }

  

    
}
