import java.util.*;  
import java.io.*;
public class convert {
    static void printBinary(int[] binary, int id)
    {
       for (int i = id - 1; i >= 0; i--)
            System.out.print(binary[i] + "");
    }

    public static void decimalToBinary(int n)
    {
        int[] binary = new int[35];
        int id = 0;

        while (n > 0) {
            binary[id++] = n % 2;
            n = n / 2;
        }

        printBinary(binary, id);
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);    
        System.out.print("Enter number- ");  
        int number= sc.nextInt();
        decimalToBinary(number);
    }
}
