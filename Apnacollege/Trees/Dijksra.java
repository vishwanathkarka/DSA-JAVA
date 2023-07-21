package Apnacollege.Trees;

import java.util.*;

public class Dijksra { // gets value in nlog(n);
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

    }

    public static void main(String args[]) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        dijksra(graph, 0);

    }

    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;

        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path; // path based sorting
            // returning the low weight value ;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        /*
         * (5)
         * 0 ------> 2
         * ^ ^ /
         * / \ /
         * / \ v
         * 1 3
         * 
         */

        // 0 vertex
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        // 1 vertex
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        // 2 vertex
        graph[2].add(new Edge(2, 4, 3));

        // 3 vertex
        graph[3].add(new Edge(3, 5, 1));

        // 4 vertex
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 3));

        // dijksra(graph,0);
    };;

    public static void dijksra(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length]; // dist[i] =
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // infinate
            }
        }

        boolean visted[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0)); // moving to the self 0 => 0
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            // System.out.println(curr.n + "----"+curr.path);
            if (!visted[curr.n]) { // we got the value n form the priorityQueue
                visted[curr.n] = true;
                // niegbor
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    // dist[u] => wt upto the u + wt => wt for the dest < dist[v] => if v already
                    // visted but the wt is more than this path so we do it
                    if (dist[u] + wt < dist[v]) { // for the first value in the array is 0 => 0+2 < infinate
                        // dist[u] => accessing the values in the dist array
                        // + wt of the src LESS THAN dis[v]
                        // then updating the values in the distance array
                        dist[v] = dist[u] + wt; // updating the wt
                        pq.add(new Pair(v, dist[v])); // adding the possible values to the priorityQueue (dest, weight
                                                      // cal)
                        // removing the shorts path from it
                    }

                }
                System.out.println(pq);
            }

            for (int i = 0; i < dist.length; i++) {
                // System.out.print(dist[i]+" ");
            }
            System.out.println();
        }
    }

}
