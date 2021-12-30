/* Implementation of undirected graph */
import java.util.Scanner;
import java.util.*;
class Graph{
	//adding an edge to the graph
	public static void addEdge(ArrayList<ArrayList<Integer> adj>,int source,int dest){
		adj.get(source).add(dest);
		adj.get(dest).add(source);
	}
	public static void printGraph(<ArrayList<ArrayList Integer>> g){
		for(int i =0;i<g.size();i++){
			System.out.println("\n Adjacency list of vertex 
			for(j=0;j<g.get(i).size();j++){
				System.out.println("--> "+g.get(i).get(j));
			}
		}
	}
}

class GraphImplementation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input no of vertex: ");
		int v =sc.nextInt();
		System.out.println("Please input source and dest");
		Graph g = new Graph();
		while(true){
			int source  =sc.nextInt();
			int dest = sc.nextInt();
			System.out.println("Do you want to continue ");
			String opt = 
			