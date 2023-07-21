package Apnacollege.Trees;


import java.util.*;



public class prog{

 static class Pair implements Comparable<Pair> {
int n, path;
    public  Pair(int n, int path){
        this.n = n;
        this.path = path;
    }
    @Override 
    public int compareTo(Pair p2){
         return this.path - p2.path;
    }
}

   static class Edge{
    int src, dest, wt;
        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;

        }
    }

    public static void Dijsra(ArrayList<Edge>[] graph){
int dist[] = new int[graph.length];
int src = 0;
for(int i =0; i<graph.length;i++){
if(i!= src){
dist[i] = Integer.MAX_VALUE;
}
}
PriorityQueue<Pair> pq = new PriorityQueue<>();
boolean visted[] = new boolean[graph.length];

for(int i =0; i<visted.length;i++){
    visted[i] = false;
}
pq.add(new Pair(src, 0)); 
while(!pq.isEmpty()){
    Pair curr = pq.remove();
    if(!visted[curr.n]){
        visted[curr.n] = true;

        for(int i = 0; i<graph[curr.n].size();i++){
            Edge e = graph[curr.n].get(i);
            int u = e.src;
            int v = e.dest;
            int wt = e.wt;
            if(dist[u]+wt < dist[v]){
                dist[v] =  dist[u] +wt;
                 pq.add(new Pair(v, dist[v])); // v => dest , dist[v] => its' weight 
            }
           

        }
        
    }
    for(int i =0; i<dist.length;i++){
    System.out.print(dist[i]+" ");
}
System.out.println();
}

    } 
    public static void main(String[] args){
 ArrayList<Edge>[] graph = new   ArrayList[6];
 for(int i =0; i<graph.length;i++){
    graph[i] = new ArrayList<>();
 }

   // 0 vertex
   graph[0].add(new Edge(0, 1, 2));
   graph[0].add(new Edge(0, 2, 4));

   // 1 vertex
   graph[1].add(new Edge(1, 3, 7));
   graph[1].add(new Edge(1, 2, 1));

   // 2 vertex
   graph[2].add(new Edge(2, 4, 3));

   // 3 vertex
   graph[3].add(new Edge(3 , 5, 1));

   // 4 vertex
   graph[4].add(new Edge(4 , 3, 2));
   graph[4].add(new Edge(4 , 5, 3));
//    ArrayList<Edge> graph[]
Dijsra(graph);
    }


}





