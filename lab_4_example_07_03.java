package lab_4_example_07_03;

public class lab_4_example_07_03 {

	public static void main(String[] args) {
		int height = 11;
		int width =23;
        char[][] graph = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                graph[i][j] = '2';
            }
        }
 
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {   
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
}

