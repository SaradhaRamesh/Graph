package Graph.DFS;

import java.util.LinkedList;

public class ExampleDFS {
private int V;
private LinkedList<Integer>adj[];
public ExampleDFS(int v) {
	V=v;
	adj = new LinkedList[v];
	for(int i=0;i<v;++i) {
		adj[i]=new LinkedList();
	}
	
}
void addEdge(int v,int w) {
	adj[v].add(w);
}
void DFSUtil(int vertex,boolean nodes[]) {
	nodes[vertex]=true;
	System.out.print(vertex+" ");
	int a=0;
	for(int i=0;i<adj[vertex].size();i++) {
		a=adj[vertex].get(i);
		if(!nodes[a]) {
			DFSUtil(a,nodes);
		}
	}
}
void DFS(int v) {
	boolean already[]=new boolean[V];
	DFSUtil(v,already);
}

}
