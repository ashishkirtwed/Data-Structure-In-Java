import java.util.*;
class Graph{
	//adding an edge to the graph
	public void addEdge(ArrayList<ArrayList<Integer>> adj,int source,int dest){
		adj.get(source).add(dest);
		adj.get(dest).add(source);
	}
	public  void printGraph(ArrayList<ArrayList <Integer>> g){
		for(int i =0;i<g.size();i++){
			System.out.print("\n Adjacency list of vertex "+i+"-->");
			for(int j=0;j<g.get(i).size();j++){
				System.out.print(" "+g.get(i).get(j));
			}
		}
	}
}

class DFSTraversal{
	public static void DFSHelper(ArrayList<ArrayList<Integer>>adj,boolean visited[],int source){
		visited[source] = true;
		System.out.print(source+" ");
		ArrayList<Integer> al = adj.get(source);
		for(int item:al){
			if(visited[item]==false){
				DFSHelper(adj,visited,item);
			}
		}
	}
	public static void DFSTraversal(ArrayList<ArrayList<Integer>> adj,int source){
		int n = adj.size();
		boolean visited[] = new boolean[n];
		DFSHelper(adj,visited,source);
	}
	
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
		int source =0;
		System.out.println("Depth First Search Traversal...");
		DFSTraversal(adj,source);
		sc.close();
	}
}
			
