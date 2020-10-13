package lab_4_example_07_05;
import java.util.Random;
public class lab_4_example_07_05 {

	public static void main(String[] args)  {
	   
		 Random random = new Random();

	        int firstArray[][] = new int[3][5];

	        for (int i = 0; i < 3; i++)
	        {
	            for (int j = 0; j < 5; j++)
	            {
	                firstArray[i][j] = random.nextInt(200);
	                System.out.println("i= " + i + "; j= " + j + " value = " + firstArray[i][j]);

	            }
	        }
	        System.out.println("**************************************************");

	        int secondArray[][] = new int[5][3];

	        for (int k = 0; k < 5; k++)
	        {
	            for (int s = 0; s < 3; s++)
	            {
	                secondArray[k][s] = firstArray[s][k];
	                System.out.println("s= " + s + "; k= " + k + " value = " +  secondArray[k][s]);
	            }
	        }}}