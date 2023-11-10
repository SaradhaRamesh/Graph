package Graph;

public class GraphMain {

	public static void main(String[] args) {
		int novertices=5;
		int noEdges=8;
		Graph g= new Graph(novertices,noEdges);
		//create graph
		g.edge[0].src=1;//edge1-2
		g.edge[0].dest=2;
		g.edge[1].src=1;//edge1-3
		g.edge[1].dest=3;
		g.edge[2].src=1;//1-4
		g.edge[2].dest=4;
		g.edge[3].src=2;//2-4
		g.edge[3].dest=4;
		g.edge[4].src=2;//2-5
		g.edge[4].dest=5;
		g.edge[5].src=3;//3-4
		g.edge[5].dest=4;
		g.edge[6].src=3;//3-5
		g.edge[6].dest=5;
		g.edge[7].src=4;//4-5
		g.edge[7].dest=5;
		for(int i=0;i<noEdges;i++) {
			System.out.println(g.edge[i].src+"-"+g.edge[i].dest);
		}


	}

}
