package Graph;

public class ConnectedGraph {
	public static void main(String[] args) {
		int novertices=5;
		int noEdges=10;
		Graph cg= new Graph(novertices,noEdges);
		//create graph
		cg.edge[0].src=1;//edge1-2
		cg.edge[0].dest=2;
		cg.edge[1].src=1;//edge1-3
		cg.edge[1].dest=3;
		cg.edge[2].src=1;//1-4
		cg.edge[2].dest=4;
		cg.edge[3].src=1;//1-4
		cg.edge[3].dest=5;
		cg.edge[4].src=2;//1-5
		cg.edge[4].dest=3;
		cg.edge[5].src=2;//2-3
		cg.edge[5].dest=4;
		cg.edge[6].src=2;//2-5
		cg.edge[6].dest=5;
		cg.edge[7].src=3;//3-4
		cg.edge[7].dest=4;
		cg.edge[8].src=3;//3-5
		cg.edge[8].dest=5;
		cg.edge[9].src=4;//4-5
		cg.edge[9].dest=5;
		
		for(int i=0;i<noEdges;i++) {
			System.out.println(cg.edge[i].src+"-"+cg.edge[i].dest);

}}
}