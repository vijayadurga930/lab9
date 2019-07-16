package Lab9;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Assignment2 {

	public static HashMap<Character, Integer> countCharacter(char[] arry, int size) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

 

        int k = 0, x = 0;
        int count[] = new int[100];
        while (k < arry.length) {
            if ((arry[k] >= 'a' && arry[k] <= 'z') || (arry[k] >= 'A' && arry[k] <= 'Z')) {
                x = arry[k] - '*';
                count[x]++;
            }
            k++;
        }
        for (int i = 0; i < count.length; i++) {

 

            if (count[i] != 0) {
                hashMap.put((char) (i + '*'), count[i]);
            }

 

        }
        return hashMap;
    }

 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("size of character array :");
        int size = scanner.nextInt();
        System.out.println("enter character array :");
        char arry[] = new char[size];
        for (int i = 0; i < size; i++) {
            try {
                arry[i] = (char) System.in.read();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

 

        }
        HashMap<Character, Integer> hashMap1 = countCharacter(arry, size);
        System.out.println(hashMap1);
        scanner.close();
    }

 

}