package Apnacollege.Trees;

import java.util.*;

public class chepestFlight {

        /*  Ther are n cities connected by some number of flights. You are given an array flights where
        flights[i] = [from,to,price] indicates that there is a flight. 
        You are also given three integers src,dst,and k, return the cheapest price from src to dst with
        at most k stops.
        if there is no such route,return -1.
    */

    public static class Edge{
int src, dest,wt;
public Edge(int src, int dest,int wt){
    this.src = src;
    this.dest = dest;
    this.wt = wt;
}


    }

    public static class Info{
        int node ;
        int stop;
        int cost;
        public Info(int node, int stop, int cost){
            this.node = node;
            this.stop = stop;
            this.cost  = cost;
        }
    }


    public static void createGraph(int flight[][],ArrayList<Edge> graph[]){

        // initializing graph arr with empty arraylist
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }
       
        for(int i=0;i<flight.length;i++){
            int src = flight[i][0];
            int dest = flight[i][1];
            int wt = flight[i][2];
            Edge e = new Edge(src, dest, wt);

            graph[src].add(e);

        }
    }

  public static int cheapestFlightWithKstops(int n , int[][] flight, int src, int dest, int k){
    ArrayList<Edge> graph[] = new ArrayList[n];
    createGraph(flight, graph);

    // performing the dijksra algo
    int cost[]  = new int[graph.length];
   
for(int i = 0; i<cost.length;i++){
   if(i!= src){
    cost[i] = Integer.MAX_VALUE; // placing the infinate for the cost array
   }
}

Queue<Info> q = new LinkedList<>(); // we are performing the BFS to move from the src to destination with k moves
q.add(new Info(src,0,0));

while(!q.isEmpty()){
    Info curr = q.remove();
    if(curr.stop> k){ // stop is greater than the k then no need of the iterating
        break;
    }
    for(int i =0; i<graph[curr.node].size();i++){
        Edge e = graph[curr.node].get(i);
        int u = e.src;
        int v = e.dest;
        int wt = e.wt;

        // relaxation
        if(curr.cost + wt < cost[v] && curr.stop<= k ){
            cost[v] = curr.cost+wt;
            q.add(new Info(v,curr.stop+1,cost[v]));
        }

    }
}
if(cost[dest]!=Integer.MAX_VALUE){

    return cost[dest];
}

return -1;

    }

    public static void main(String[] args) {
        int n=4;
        int flight[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src=0 , dest = 3, k = 1;

        System.out.println(cheapestFlightWithKstops(n, flight, src, dest, k));
    }

}