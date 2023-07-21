package Apnacollege.Trees;

import java.util.*;

public class Kosraju {
    
      static class Edge {
        int src;
        int dest;
      

        public Edge(int s, int d) {
            this.src = s;
          
        }

    }


    public static void topSort(ArrayList<Edge> graph[],int curr,boolean vist[], Stack<Integer> s){
        vist[curr] = true;
        for(int i =0; i<graph.length;i++){
            Edge e = graph[curr].get(i);
            if(!vist[e.dest]){
                topSort(graph, e.dest, vist, s);
            }
        }
        s.push(curr);
    }

    public static void kosaraju(ArrayList<Edge> graph[], int v){
// step 1
 Stack<Integer> s = new Stack<>();
 boolean vis[] = new boolean[v];
 for(int i =0 ;i<v;i++){
    if(vist[i]){
        topSort(graph, i, vis, s);
    }
 }

    }


    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        /*
         * (5)
         * 0 ------> 2
         * ^ ^ /
         * / \ /
         * / \ v
         * 1 3
         * 
         */

        // 0 vertex
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        // 1 vertex
        graph[1].add(new Edge(1, 0));

        // 2 vertex
        graph[2].add(new Edge(2, 1));

        // 3 vertex
        graph[3].add(new Edge(3, 4));


        
    };


    public static void main(String[] args) {
        
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

    }
}
