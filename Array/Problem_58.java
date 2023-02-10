package Array;
import java.util.*;
import java.lang.*;
public class Problem_58
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }

        int a = arr_add(arr);
        System.out.println(a);
    }

    public static int arr_add(int A[])
    {
        int x = A.length;
        int evensum =0;
        int oddsum =0;

        for(int i=0; i<x; i++)
        {
            if(A[i]%2==0)
            {
                evensum= evensum+A[i];
            }
            else
            {
                oddsum = oddsum+A[i];
            }
        }
        int diff = evensum - oddsum;
        return diff;
    }
}
