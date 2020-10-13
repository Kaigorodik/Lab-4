package lab_4_example_07_06;
import java.util.Random;
public class lab_4_example_07_06 {

	public static void main(String[] args) {
		Random random = new Random();

        int firstArray[][] = new int[5][5];

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                firstArray[i][j] = random.nextInt(200);
                System.out.println("i= " + i + "; j= " + j + " value = " + firstArray[i][j]);

            }
        }

        int deleteS = random.nextInt(4);
        int deleteK = random.nextInt(4);


        System.out.println("deleteS= " + deleteS + "; deleteK= " + deleteK);

     

        int secondArray[][] = new int[4][4]; 
        for (int i=0, s = 0; i<4; s++) {
            if (s!=deleteS){
            for (int j =0, k = 0 ; j <4; k++) {
                if (k != deleteK) {
                    secondArray[i][j] = firstArray[j][i];
                    System.out.println("i = " + i + ";j= " + j + ";value= " + secondArray[i][j]);
                   j++;
                }
            }
                i++;
        }
            }
    }}