package Lab9;
import java.util.HashMap;
import java.util.Scanner;

 

public class Assignment3 {
    public HashMap<Integer,Integer> getSquares(int[] array)
    {
        HashMap<Integer,Integer> map1=new HashMap<>(array.length);
        for(int i=0;i<array.length;i++) 
        {
            map1.put(array[i], array[i]*array[i]);
    }
    return map1;
}
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the size");
        int size=scanner.nextInt();
        int array[]=new int[size];
        System.out.println("enter the elements");
        for(int i=0;i<array.length;i++) {
            array[i]=scanner.nextInt();
    }
Assignment3 assesement3=new Assignment3();
    HashMap<Integer,Integer> mapoutput= assesement3.getSquares(array);
    System.out.println("the values of squares of the array is"+mapoutput);

 

    }
}