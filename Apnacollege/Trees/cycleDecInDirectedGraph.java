package Apnacollege.Trees;

import java.util.ArrayList;

import Apnacollege.Trees.CycleDetection.Edge;

public class cycleDecInDirectedGraph {
    
    static class Edge{
        int src ;
        int dest;
        // int wt;
     public Edge(int s,int d){
        this.src =s;
        this.dest = d;
        // this.wt = w;
     }
    }


    public static  boolean isCycle(ArrayList<Edge>[] graph){
        boolean visted[] = new boolean[graph.length];
        boolean stack [] = new boolean[graph.length];
        for(int i =0; i<graph.length;i++){
            if(!visted[i]){
                if(isCycleDecUtil(graph,i , visted,stack)){
        return true;
                }
            }
        }
        return false;
    }

    public static void printAllPaths(ArrayList<Edge>[] graph,int src, int dest,String path){
        if(src == dest){
            System.out.println(path);
            return ;
        }
for(int i =0; i<graph.length;i++){
    Edge  e = graph[src].get(i);
    printAllPaths(graph, e.dest, dest, path+src);
}

        
    }

    public static boolean isCycleDecUtil(ArrayList<Edge>[] graph, int curr,boolean visted[],boolean stack[]){
        visted[curr] = true;
        stack[curr] = true;

        for(int i =0; i<graph.length;i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }
            if(!visted[e.dest] && isCycleDecUtil(graph,e.dest,visted,stack)){
                return true;
            }
        }
stack[curr] = false;
return false;
    }
    public static void main (String args[]){
        int v = 5;
        ArrayList <Edge>[] graph = new ArrayList[5];
        for(int i =0; i<graph.length; i++){
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
        graph[0].add(new Edge(0,5));

        // 1-vertex
        graph[1].add(new Edge(1,5));
        graph[1].add(new Edge(1,1));
        graph[1].add(new Edge(1,3));

        // 2-vertex
         graph[2].add(new Edge(2,1));
         graph[2].add(new Edge(2,1));
         graph[2].add(new Edge(2,2));

        // 3-vertex
        graph[3].add(new Edge(3,3));
        graph[3].add(new Edge(3,1));

        // 4 vertex
        graph[4].add(new Edge(4,2));
        
        



        //2- neighbors
        // for(int i =0; i<graph[2].size();i++){
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.dest);
        // }
        //    System.out.println( isCycle(graph) ); 
        printAllPaths(graph,0,3,"");
     
    }


}
