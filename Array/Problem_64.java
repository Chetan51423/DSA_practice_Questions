package Array;
import java.util.*;
import java.lang.*;
public class Problem_64
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter size of an array");
        for(int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for(int i=0; i<n-1; i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        for(int i=0; i<n;i++)
        {
            System.out.println(arr[i]);

        }


    }
}
