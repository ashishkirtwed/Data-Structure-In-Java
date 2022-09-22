import java.util.*;
class Graph{
	//adding an edge to the graph
	public void addEdge(ArrayList<ArrayList<Integer>> adj,int source,int dest){
		adj.get(source).add(dest);
		adj.get(dest).add(source);
	}
	public  void printGraph(ArrayList<ArrayList <Integer>> g){
		for(int i =0;i<g.size();i++){
			System.out.println("\n Adjacency list of vertex "+i);
			for(int j=0;j<g.get(i).size();j++){
				System.out.print("--> "+g.get(i).get(j));
			}
		}
	}
}

class GraphImplementation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input no of vertex: ");
		int v =sc.nextInt();
		ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++){
			adj.add(new ArrayList<Integer>());
		}
		Graph g = new Graph();
		while(true){
			System.out.println("Please input source and dest");
			int source  =sc.nextInt();
			int dest = sc.nextInt();
			g.addEdge(adj,source,dest);
			System.out.println("Do you want to continue- Y/N ");
			char opt = sc.next().charAt(0);
			if(opt == 'N' || opt == 'n')
				break;
		}
		g.printGraph(adj);
		sc.close();
	}
}
			
	