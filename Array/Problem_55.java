package Array;
import java.util.Scanner;
//import java.lang.*;

public class Problem_55
{
    public static void main(String  arr1[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array");

        for(int i:arr)
        {
            System.out.println(arr[i-1]);
        }

        System.out.println("Reverse array");

        for(int i = 0; i <n; i++)
        {
            System.out.println(arr[n-1-i]);
        }
    }
}
