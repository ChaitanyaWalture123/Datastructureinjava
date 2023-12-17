package data_structuresand_algorithms.graphs;

import java.util.Arrays;

public class Graphs {
	
int e;
int v;

int adjmatrix[][];


	public Graphs(int nodes) {
	this.v=nodes;
	this.e=0;
	this.adjmatrix= new int[nodes][nodes];
	
}
public void addedge(int a,int b) {
	adjmatrix[a][b]=1;
	adjmatrix[b][a]=1;
	e++;
	
}




public void print() {
	for(int i = 0;i<v;i++) {
		for(int j=0;j<v;j++) {
			System.out.print(adjmatrix[i][j]+" ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		
		Graphs g = new Graphs(4);
		g.addedge(0,1);
		g.addedge(1,2);
		g.addedge(2,3);
		g.addedge(3,0);
		g.print();
		

	}

}
