package Apnacollege.Trees;

import java.util.*;

public class Bipartite {
    static class Edge{
        int src;
        int des;
        int wt;
       public Edge(int source,int destination,int weight){
            this.src = source;
            this.des = destination;
            this.wt = weight;
        }
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int color[] = new int[graph.length]; // for coloring the graph
        for(int i =0; i<color.length; i++){  // to move all the graphs it will also move the un join graph
            color[i] = -1;

        }

        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i<graph.length;i++){
            if(color[i] == -1){ // if not colored
            q.add(i);
            color[i] = 0; // coloring the first one with yellow
            while(!q.isEmpty()){
                int curr = q.remove();
                for(int j =0; j<graph[curr].size();j++){ // to vist sub graph
                    Edge e = graph[curr].get(j);
                    if(color[e.des] == -1){ // checking wheather it is colored
                        int nextcol = color[curr] == 0 ?1:0; // if parent color is 0 then we putting 1
                        color[e.des] = nextcol; // adding color
                        q.add(e.des);
                    }
                    else if(color[e.des] == color[curr]){
return false;
                    }
                }
            }
            }
           
        }
         return true;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v]; // for creating the graph
        // here 
        for(int i =0; i<v;i++){
            graph[i] = new ArrayList<>();
        }
        //   (5)
        // 0 --- 1
        // (1) /   \   (3)  
        //    /     \
        //    2 ---- 3
        //(2) |  (1) 
        //    4
        
        //  0-vertex;
        graph[0].add(new Edge(1, 1, 5));

        // 1 -vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 -vertex 
        graph[2].add(new Edge(2, 1, 1));
        // graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));

System.out.println( isBipartite(graph));


    }
}
