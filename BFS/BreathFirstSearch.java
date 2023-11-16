package Graph.BFS;

import java.util.*;

public class BreathFirstSearch {
public int V;
private LinkedList<Integer>adj[];
private Queue<Integer>queue;
BreathFirstSearch(int v){
	V=v;
	adj=new LinkedList[v];
	for(int i=0;i<v;i++) {
		adj[i]=new LinkedList();
	}
	queue = new LinkedList<Integer>();
	
}

void addEdge(int v,int w) {
	adj[v].add(w);
}
void BFS(int n) {
	boolean nodes[]=new boolean[V];
	int a=0;
	nodes[n]=true;
	queue.add(n);
	while(queue.size()!=0) {
		n=queue.poll();
		System.out.print(n+" ");
		for(int i=0;i<adj[n].size();i++) {
			a=adj[n].get(i);
			if(!nodes[a]) {
				nodes[a]=true;
				queue.add(a);
			}
		}
	}
	
			}


}
