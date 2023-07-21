package Apnacollege.Trees;

import java.util.*;

public class BellmanFord {

    public static class Edge{
        int src , dest,wt;
        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }


public static void Bellman(ArrayList<Edge>[] graph){
boolean visted[] = new boolean[graph.length];
int dist[] = new int[graph.length];
int src = 0;
for(int i = 0; i<dist.length;i++){
   if(i != src){
    dist[i] =  Integer.MAX_VALUE;
    
   } 
}

int V = graph.length-1;
for(int i =0 ;i<V-1; i++){ // we need to iterate upto the v-1
    for(int j =0; j<graph.length;j++){
    for(int k =0; k<graph[j].size();k++){
        Edge e = graph[j].get(k);
        int u = e.src;
        int v = e.dest;
        int wt = e.wt;

        if(dist[u] != Integer.MAX_VALUE &&  dist[u]+wt <dist[v]){
            dist[v] = dist[u]+wt;
        }
    }
  

}
  System.out.println(Arrays.toString(dist));
}
}

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[5];
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();  // intializing array with empty arraylist
        }
      
         /*             (5)
                         0 ------ 1
                                 / \
                            (1) /   \ (3)
                               /     \
                              2 ----- 3
                              |  (1)
                           (2)|
                              |
                              4
              */ 


        // 0 vertex
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
      
        // 1 vertex
        graph[1].add(new Edge(1, 2, -4));
      
        // 2 vertex
        graph[2].add(new Edge(2, 3, 2));
      
        // 3 vertex
        graph[3].add(new Edge(3 , 4, 4));
      
        // 4 vertex
        graph[4].add(new Edge(4, 1, -1));
      
    
        Bellman(graph);
    }
    
}
