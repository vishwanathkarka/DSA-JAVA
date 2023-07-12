package Apnacollege.Trees;

import java.util.ArrayList;

public class CycleDetection {

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



    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean visted[] = new boolean[graph.length];
        for(int i =0; i<graph.length; i++){
            if(!visted[i]){
                if(detectCycleUtil(graph, visted, i,-1)){
                    System.out.println(true);
                return true;
                }
                
            }
        }
        return false;
    }


public static boolean detectCycleUtil(ArrayList<Edge>[] graph,boolean visted[],int curr, int par){
 
    visted[curr] = true;
for(int i =0; i<graph[curr].size();i++){
    Edge e = graph[curr].get(i);
    System.out.println(e);
    // case -3 
    if(!visted[e.dest]){ 
        if(detectCycleUtil(graph,visted,e.dest,curr)){
            return true;
        }
        else if(visted[e.dest]&& e.dest != par){ // if the value in not parent but visted then it mean there is an cycle
return true;
        }
    }
}
return false;
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
        
System.out.println( detectCycle(graph));


        //2- neighbors
        // for(int i =0; i<graph[2].size();i++){
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.dest);
        // }

     
    }

  
}
