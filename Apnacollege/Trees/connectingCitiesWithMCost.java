package Apnacollege.Trees;

import java.util.*;

public class connectingCitiesWithMCost {
    public static class Edge implements Comparable<Edge> {
        int dest, cost;

        public Edge(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;

        }
         @Override
        public int compareTo(Edge e2){
  return this.cost - e2.cost;
        }

    }

    public static void connectCitiesWithMininumCost(int[][] cities) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean vist[] = new boolean[cities.length];

        pq.add(new Edge(0, 0));
        int finalCost = 0;
        while (!pq.isEmpty()) {
            Edge curr = pq.remove();
            if (!vist[curr.dest]) {
                vist[curr.dest] = true;
                finalCost += curr.cost;
                for (int i = 0; i < cities[curr.dest].length; i++) {
                    if (cities[curr.dest][i] != 0) { // if 0 then there is no connect
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }

        }
    System.out.println(finalCost);

    }

    public static void main(String[] args) {
        int n = 4;
        int cities[][] = { { 0, 1, 2, 3, 4 }, { 1, 0, 5, 0, 7 }, { 2, 5, 0, 7 }, { 2, 5, 0, 6, 0 }, { 3, 0, 6, 0, 0 },
                { 4, 7, 0, 0, 0 } };
        int src = 0, dest = 3, k = 1;

        connectCitiesWithMininumCost(cities);
    }

}
