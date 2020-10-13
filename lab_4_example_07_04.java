package lab_4_example_07_04;

public class lab_4_example_07_04 {

	public static void main(String[] args) {
		int Size=11;
		char[][] graph = new char[Size][];
		graph [0]=new char[1];
		graph [1]=new char[2];
		graph [2]=new char[3];
		graph [3]=new char[4];
		graph [4]=new char[5];
		graph [5]=new char[6];
		graph [6]=new char[7];
		graph [7]=new char[8];
		graph [8]=new char[9];
		graph [9]=new char[10];
		graph [10]=new char[11];
		int i,j,k=0;
		for (i = 0; i<Size; i++) 
			for (j=0;j<i+1;j++) {
			graph[i][j] = '*';
			k++;
			}
            for (i = 0; i <Size; i++) {
            	for (j=0;j<i+1;j++)
            System.out.print(graph[i][j]+" ");
            System.out.println();
	}
	}
}