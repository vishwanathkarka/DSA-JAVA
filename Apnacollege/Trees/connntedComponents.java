package Apnacollege.Trees;
// moving all the  node which don't has  route connection also
//Ex
     //   (5)
        // 0 --- 1
        // (1) /   \   (3)    4 --- 8
        //    /     \         |             9
        //    2 ---- 3        9
        //(2) |  (1) 
        //     

import java.util.ArrayList;

public class connntedComponents {

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


    public static void bfs(ArrayList<Edge>[] graph){
        boolean visted[] = new boolean[graph.length];
        for(int i =0; i<graph.length;i++){ // this is for visiting the non joined graph to visit
            if(!visted[i]){
                bfsUtil(graph,visted,i);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph, boolean[] visted,int curr){
        System.out.println(curr+" ");
        visted[curr] = true;
        for(int i =0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visted[e.dest]){
                bfsUtil(graph,visted,e.dest);
            }
        }
    }

        public static void main (String args[]){
        int v = 4;
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
        
// System.out.println(graph);
        //2- neighbors
        // for(int i =0; i<graph[2].size();i++){
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.dest);
        // }
boolean visted[] = new boolean[4];
for(int i =0;i<visted.length;i++){
visted[i] = false;
}
      bfs(graph) ;
    
    }

}
