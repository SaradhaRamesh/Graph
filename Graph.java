package Graph;
public class Graph{
	public class Edge{
		public int src,dest;
	}
	public int vertices,edges;
	//array to store all edges
	public Edge[] edge;
	public Graph(int vertices,int edges){
		this.vertices=vertices;
		this.edges=edges;
		//initialize the edge array
		edge=new Edge[edges];
		for(int i=0;i<edges;i++) {
			//each element of the edge array is an object to Edge type
			edge[i]=new Edge();
		}
		
	}
}
