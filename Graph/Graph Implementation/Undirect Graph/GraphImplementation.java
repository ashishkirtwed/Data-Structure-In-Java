/* Implementation of undirected graph */
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
				