package lab_4_example_07_07;
import java.util.Scanner;
public class lab_4_example_07_07 {
public static void main(String[] args) {
    Scanner id = new Scanner(System.in);
    System.out.print("Input the number of rows in the array: ");
    int a =id.nextInt();
    System.out.print("Input the number of columns in the array: ");
    int b = id.nextInt();
    int Zmeyka[][] = new int[a][b];
    int hvost = 0; //переменная для подсчета использованных значений
    int telo = 0; //переменная для заполнения элементов массива
    int h = 0;//вспомогательная переменная для подсчета строк
    for (int i = 0 ; h <Zmeyka.length ; h++) {
        for (int j = 0 ; j <(Zmeyka[i].length - hvost); j++) {//заполнение верхней строки массива слева-направо
        Zmeyka[i][j] = telo;
        telo++;
        }
        if(i<Zmeyka.length-1) {
        i++;}
        for (int k = Zmeyka[i].length-1; k > hvost; k--) {//заполнение правого столбца массива снизу-вверх
            Zmeyka[k][Zmeyka[i].length-1-hvost] = telo;
            telo++;
        }
        hvost++;
                    }
    int z = 0;//вспомогательная переменная для подсчета символов в строке
    for (int i =0; i < Zmeyka.length; i++){//печать массива
        int count = i+1;//переменная для повышения номера индекса для вывода на консоль
        System.out.print("line number " + count + " : ");
        for (int j = 0; j <Zmeyka[i].length; j++){
            System.out.print(Zmeyka[i][j]+" ");
            z++;
        }
        System.out.println(" Number of characters per line " + z);
        z = 0; //обнуление счетчика символов
    }

        }}