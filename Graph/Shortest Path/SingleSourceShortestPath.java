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

class SingleSourceShortestPath{
	public static void  shortestPath(ArrayList<ArrayList<Integer>> adj,int dest){
		ArrayList<Integer> q = new ArrayList<Integer>();
		int n = adj.size();
		ArrayList<Integer> parent = new ArrayList<Integer>();
		ArrayList<Integer> dist = new ArrayList<Integer>();
		boolean visited[] =new boolean[n];
		q.add(0);
		visited[0]=true;
		parent.add(0,-1);
		dist.add(0,0);
		while(q.size()!=0){
			int item = q.remove(0);
			ArrayList<Integer> al=adj.get(item);
			for(int b:al){
				if(!visited[b]){
					q.add(b);
					parent.add(b,item);
					visited[b]=true;
					dist.add(b,dist.get(item)+1);
				}
				
			}
		}
		System.out.println("\nShortest Distance is: " + dist.get(dest));
		System.out.print("Shortest path is: ");
		int temp = dest;
		while( temp != -1){
			System.out.print(temp+" ");
			temp = parent.get(temp);
		}
		
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

		System.out.println("Please input the destination node for the shortest path: ");
		int dest =sc.nextInt();
		g.printGraph(adj);
		shortestPath(adj,dest);
	}
}
			
