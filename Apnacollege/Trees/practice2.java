package Apnacollege.Trees;

import java.util.*;
public class practice2 {


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


    public static void topSort(ArrayList<Edge>[]graph){
        boolean visted[]  = new boolean [graph.length];
        Stack<Integer>  s = new Stack<>();
        for(int i =0; i<graph.length;i++){
            if(!visted[i]){
                topSortUtil(graph,i,visted,s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] visted, Stack s){
        visted[curr] = true;
        for(int i =0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visted[e.dest]){
                topSortUtil(graph,e.dest,visted,s);
            }
        }
        s.push(curr);
    }
    
    public static void calIndeg(ArrayList<Edge> graph[], int indeg[]){
        for(int i =0 ; i<graph.length;i++){
            int v = i;
            for(int j =0; j<graph[v].size(); j++){
                Edge e = graph[v].get(j);
                indeg[e.dest]++;

            }
        }
    }

    public static void topSortBFS(ArrayList<Edge> graph[]){
        int  indeg[] = new int[graph.length];
        calIndeg(graph,indeg);
        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i<indeg.length;i++){
            if(indeg[i] ==0){ // if it has no number of child we will add to the queue
                q.add(i);
            }
        }

        // bfs
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.println(curr+" ");
            for(int i =0; i< graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0){
                    q.add(e.dest);

                }
            }
        }
    }
    public static void main(String[] args) {
          int v = 6;
        ArrayList <Edge>[] graph = new ArrayList[v];
        for(int i =0; i<v; i++){
            graph[i] = new ArrayList<>();
        }

       
        // 1-vertex
        // graph[1].add(new Edge(1,0,5));
        // graph[1].add(new Edge(1,2,1));
        // graph[1].add(new Edge(1,3,3));

        // 2-vertex
        //  graph[2].add(new Edge(2,1,1));
        //   graph[2].add(new Edge(2,3,1));
         graph[2].add(new Edge(2,3,2));
 
        // 3-vertex
        // graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,1,1));


        graph[4].add(new Edge(4,1,1));
        graph[4].add(new Edge(4,0,1));


        graph[5].add(new Edge(5,2,1));
        graph[5].add(new Edge(5,0,1));

        // topSort(graph);
        topSortBFS(graph);
        
    }


}
