package Graph.FloodFillAlgo;

public class FloodFillAlogrithm {

	public static void main(String[] args) {
		int[][]image= {
				{1,1,1,2,2},{1,1,1,2,2},{1,1,2,2,2},{3,3,3,3,3},{3,3,3,3,3}
		};
		System.out.println("Original Image:");
		printImage(image);
		int startRow =2,startcol=2;
		int oldcolor=image[startRow][startcol];
		int newcolor=4;
		floodFill(image,startRow,startcol,oldcolor,newcolor);
		System.out.println("\nImage after Flood Fill:");
		printImage(image);

	}
	public static void floodFill(int[][]image,int row,int col,int oldcolor,int newcolor) {
		int rows=image.length;
		int cols=image[0].length;
		if(row<0||row>=rows||col<0||col>=cols||image[row][col]!=oldcolor) {
			return;
		}
		image[row][col]=newcolor;
		floodFill(image,row+1,col,oldcolor,newcolor);//down
		floodFill(image,row-1,col,oldcolor,newcolor);//up
		floodFill(image,row,col+1,oldcolor,newcolor);//right
		floodFill(image,row,col-1,oldcolor,newcolor);//left
	}
	public static void printImage(int[][]image) {
		for(int[]row:image) {
			for(int pixel:row) {
				System.out.print(pixel+" ");
			}
			System.out.println();
		}
	}

}
