package Apnacollege.Trees;

import java.util.ArrayList;
import java.util.*;

public class practice {
    
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
    //   graph[2].add(new Edge(2,3,1));
         graph[2].add(new Edge(2,4,2));

        // 3-vertex
        graph[3].add(new Edge(3,1,3));
        // graph[3].add(new Edge(3,2,1));

        // 4 vertex
        graph[4].add(new Edge(4,2,2));
        

        // breathForSearch(graph);

        //2- neighbors
        // for(int i =0; i<graph[2].size();i++){
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.dest);
        // }
        boolean visited[] = new boolean[graph.length];
        for(int i =0; i<graph.length;i++){
            visited[i] = false;
        }
// System.out.println( isCycleExist(graph,0,-1,visited));
// System.out.println(isBipartite(graph));
     
    }
    
    public static boolean isPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited){
        if(src == dest){
            return true;
        }
        
        visited[src] = true;
        for(int i =0;i<graph[src].size();i++){
            // if(!visited[i]){
                Edge e = graph[src].get(i);
              if( !visited[e.dest] && isPath(graph,e.dest,dest,visited)){
                  return true;
              }
            // }
            
        }
        
        return false;
    }

  public static boolean isCycleExist(ArrayList<Edge>[] graph,int curr,int par, boolean[] visted){
    visted[curr] = true;
    for(int i =0; i<graph[i].size();i++){
        Edge e = graph[i].get(i);
        
       if(!visted[e.dest]){
           if(isCycleExist(graph,e.dest,curr,visted)){
               return true;
           }
           else if( !visted[e.dest] &&  e.dest != par){
               return true;
           }
       }
    }
    return false;
}
  

public static boolean isBipartite(ArrayList<Edge>[] graph){
    int col[] = new int[graph.length];
    for(int i =0 ;i<col.length; i++){
        col[i] = -1;
        
    }
    Queue<Integer> q = new LinkedList<>();
    for(int j=0; j<graph.length;j++){
        if(col[j]==-1){
            q.add(j);
            col[j] = 0;
            while(!q.isEmpty()){
                int curr = q.remove();
                for(int i =0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    if(col[e.dest]==-1){
                        int nextCol = col[curr] == 0 ?1:0;
                         col[e.dest] = nextCol;
                        q.add(e.dest);
                    }
                    else if(col[e.dest] == col[curr]){
                        return false;
                    }
                }
            }
        }
    }
    return true;
}

}
