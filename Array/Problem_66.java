package Array;
import java.util.*;
import java.lang.*;
public class Problem_66
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter elements of an array");
        for(int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Shifting factor");
        int B = sc.nextInt();
        System.out.println(Rotate(arr, B));


    }

    public static int[] Rotate(int arr[], int p)
    {
        int x = arr.length;
        int b = p%x;
        
        reverse(arr, 0, x-1);
        reverse(arr, 0, b-1 );
        reverse(arr, b, x-1);

        return arr;

    }

    public static int[] reverse(int app[], int S, int E)
    {
        while(S<E)
        {
            int temp= app[S];
            app[S] = app[E];
            app[E] = app[temp];
            E--;
            S++;
        }
        return app;
    }
}
