package data_structuresand_algorithms.graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import data_structuresand_algorithms.stack.Stack;

public class AdjacencyListRepresentation {
    private LinkedList<Integer> adjacency[];

    public AdjacencyListRepresentation(int v) {
        adjacency = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacency[i] = new LinkedList<Integer>();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of vertices");
        int v = sc.nextInt();
        AdjacencyListRepresentation g = new AdjacencyListRepresentation(v);
        System.out.println("Enter the no of edges");
        int e = sc.nextInt();

        for (int i = 0; i < e; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            g.addedge(s, d);
        }

        int source = sc.nextInt();
        g.bfs(source);
     
        
        
        
        g.dfs(source);
    }

    private void dfs(int source) {
    	boolean visited[] = new boolean[adjacency.length];

        Stack<Integer> s = new Stack<>();
        s.push(source);

        visit[source] = true;
        while (!s.isEmpty()) {
            int p = s.pop();

            System.out.print(p + " ");
            for (int i : adjacency[p]) {
                if (!visited[i]) {
                    visited[i] = true;
                    s.push(i);
                }
            }
        }
		
	}

	private void bfs(int source) {
        boolean visit[] = new boolean[adjacency.length];

        Queue<Integer> q = new LinkedList<>();
        q.add(source);

        visit[source] = true;
        while (!q.isEmpty()) {
            int p = q.poll();

            System.out.print(p + " ");
            for (int i : adjacency[p]) {
                if (!visit[i]) {
                    visit[i] = true;
                    q.add(i);
                }
            }
        }
    }

    private void addedge(int s, int d) {
        adjacency[s].add(d);
        adjacency[d].add(s);
    }
}

