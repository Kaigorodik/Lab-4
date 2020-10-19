package lab_4_example_07_08;
import java.util.Scanner;
public class lab_4_example_07_08 {

	 private static class Caeser {
	        static String encryptText;
	        private static String encrypt(String enText, int key)
	        {
	            char[] ArrayText = enText.toCharArray();
	            int[] CharCode = new int[ArrayText.length];
	            for (int i = 0; i < ArrayText.length; i++)
	            {
	                CharCode[i] = ArrayText[i];
	                CharCode[i] = CharCode[i] + key;
	            }
	            for (int i = 0; i < ArrayText.length; i++)
	            {
	                ArrayText[i] = (char) CharCode[i];
	            }
	            encryptText = new String(ArrayText);
	            return encryptText;
	        }

	        private static String decrypt(String enText, int key)
	        {
	            char[] ArrayText = enText.toCharArray();
	            int[] CharCode = new int[ArrayText.length];
	            for (int i = 0; i < ArrayText.length; i++)
	            {
	                CharCode[i] = ArrayText[i];
	                CharCode[i] = CharCode[i] - key;
	            }
	            for (int i = 0; i < ArrayText.length; i++)
	            {
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
	        String encryptStr = Caeser.encrypt(text, shift);
	      
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