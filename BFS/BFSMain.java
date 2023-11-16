package Graph.BFS;

public class BFSMain {

	public static void main(String[] args) {
		BreathFirstSearch g = new BreathFirstSearch(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 0);
		g.addEdge(1, 3);
		//initialize a new boolean array to store g.addedge(2,0);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(4, 3);
		g.addEdge(5, 3);
		System.out.println("Following is Breath First Traversal: ");
		g.BFS(0);

	}

}
