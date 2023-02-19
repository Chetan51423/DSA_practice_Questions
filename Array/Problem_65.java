package Array;
import java.util.*;
import java.lang.*;
public class Problem_65
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
        int ans1[]=new int[n];
        ans1 = inverse(arr);
        for(int j=0; j<n; j++)
        {
            System.out.println(ans1[j]);
        }

    }

    public static int[] inverse(int arr[])
    {
        int x = arr.length;
        int ans[]= new int[x];
        for(int i=0; i<x; i++)
        {
            int temp = arr[i];
            ans[temp] = i;
        }

        return ans;

    }
}
