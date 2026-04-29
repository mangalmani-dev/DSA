package Ai;

import java.util.*;

class Node implements Comparable<Node> {
    int vertex;
    int gCost; // cost from start
    int hCost; // heuristic cost

    Node(int vertex, int gCost, int hCost) {
        this.vertex = vertex;
        this.gCost = gCost;
        this.hCost = hCost;
    }

    int fCost() {
        return gCost + hCost;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.fCost(), other.fCost());
    }
}
public class AStar {

    static int[][] graph = {
            {0, 1, 4, 0, 0, 0},
            {1, 0, 2, 5, 12, 0},
            {4, 2, 0, 2, 0, 0},
            {0, 5, 2, 0, 3, 1},
            {0, 12, 0, 3, 0, 2},
            {0, 0, 0, 1, 2, 0}
    };

    static int[] heuristic = {7, 6, 2, 1, 0, 1};

    public static void aStar(int start, int goal) {
        PriorityQueue<Node> openList = new PriorityQueue<>();
        boolean[] closedList = new boolean[graph.length];

        openList.add(new Node(start, 0, heuristic[start]));

        while (!openList.isEmpty()) {
            Node current = openList.poll();

            if (current.vertex == goal) {
                System.out.println("Reached Goal with cost: " + current.gCost);
                return;
            }

            closedList[current.vertex] = true;

            for (int i = 0; i < graph.length; i++) {
                if (graph[current.vertex][i] > 0 && !closedList[i]) {
                    int newG = current.gCost + graph[current.vertex][i];
                    openList.add(new Node(i, newG, heuristic[i]));
                }
            }
        }

        System.out.println("No Path Found");
    }
    public static void main(String[] args) {
        int start = 0;
        int goal = 4;

        aStar(start, goal);
    }
}
