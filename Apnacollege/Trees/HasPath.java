package Apnacollege.Trees;
import java.util.*;

public class HasPath {
    

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


    public static boolean hasPath(ArrayList<Edge>[] graph, int src , int dest, boolean visted[]){
if(src == dest){
    return true;
}
visted[src] = true;
for(int i =0; i< graph[src].size();i++){ 
Edge e = graph[src].get(i);
if(!visted[e.dest] && hasPath(graph,e.dest,dest,visted)){ // this will return when the it hits base case 
    // the base case result true the only it return true to all the function call
System.out.println("turrrrrr"+ i);  
return true;
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
        
// System.out.println(graph);
        //2- neighbors
        // for(int i =0; i<graph[2].size();i++){
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.dest);
        // }
boolean visted[] = new boolean[5];
for(int i =0;i<visted.length;i++){
visted[i] = false;
}
     System.out.print(   hasPath(graph,0,4,visted));
    
    }

}
