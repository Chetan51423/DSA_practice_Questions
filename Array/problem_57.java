package Array;
import java.util.*;
import java.lang.*;
public class problem_57
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");

        int n = sc.nextInt();
        int A[] = new int[n];

        for(int i=0; i<n; i++)
        {
            A[i]= sc.nextInt();
        }

        int m = sc.nextInt();
        System.out.println("Enter the Integer");

        int c[]= new int[n];
        c = arr_add(A,m);

        for(int i=0; i<n; i++)
        {
            System.out.println(c[i]);
        }
    }

    public static int[] arr_add(int A[], int n)
    {
        int x = A.length;
        int f[]= new int[x];

        for(int i=0; i<x; i++)
        {
            f[i]=A[i]+n;
        }

        return f;
    }
}
