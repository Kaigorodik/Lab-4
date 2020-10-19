package lab_4_example_07_09;
import java.util.Scanner;
public class lab_4_example_07_09 {
	
	 private static class Caeser {
	        static char alphabet[] = {'z', 'y', 'x', 'w', 'v', 'u', 't', 's',
	                'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h',
	                'g', 'f', 'e', 'd', 'c', 'b', 'a'};
	        static String encryptText;

	        private static String encrypt(String enText, int key) {
	            char[] ArrayText = enText.toCharArray();
	            char[] CharCode = new char[ArrayText.length];
	            for (int i = 0; i < ArrayText.length; i++) {
	                for (int j = 0; j < alphabet.length; j++) {
	                    if (ArrayText[i] == alphabet[j]) {
	                        CharCode[i] = alphabet[(j + key) % 26];
	                    } else if (CharCode[i] == 0) {
	                        CharCode[i] = '*';
	                    }
	                }

	            }
	            for (int i = 0; i < ArrayText.length; i++) {
	                ArrayText[i] = (char) CharCode[i];
	            }
	            encryptText = new String(ArrayText);
	            return encryptText;
	        }

	        private static String decrypt(String enText, int key) {
	            char[] ArrayText = enText.toCharArray();
	            int[] CharCode = new int[ArrayText.length];
	            for (int i = 0; i < ArrayText.length; i++) {
	                for (int j = 0; j < alphabet.length; j++) {
	                    if (ArrayText[i] == alphabet[j]) {
	                        CharCode[i] = alphabet[(j - key) % 33];
	                    } else if (CharCode[i] == '*') {
	                        CharCode[i] = '*';
	                    }
	                }
	            }
	                for (int i = 0; i < ArrayText.length; i++) {
	                    ArrayText[i] = (char) CharCode[i];
	                }
	                encryptText = new String(ArrayText);
	                return encryptText;
	            }
	        }


       public static void main(String[] args) {
           Scanner id = new Scanner(System.in);
           System.out.print("Input the text to encrypt: ");
           String text = id.nextLine();
          
           System.out.print("Input the key: ");
           int shift = id.nextInt();
           String encryptStr = Caeser.encrypt(text.toLowerCase(), shift);

           
           System.out.print("The text after conversion :" + "\"" + encryptStr + "\"");
          
           System.out.print("\nPerform a reverse conversion? (y/n)"); 
           boolean cool = false;
           while (!cool) {
               String reply = id.next();
               
               if (reply.toLowerCase().equals("y")) {
                   String decryptStr = Caeser.decrypt(encryptStr, shift);
                   System.out.println(decryptStr);
                   cool = true;
               }
               
               else if (reply.toLowerCase().equals("n")) {
                   System.out.println("Bye!");
                   cool = true;
               }
               
               else {
                   System.out.println("Error! Input the correct answer: ");
                   cool = false;
               }
           }
       }
   

    }