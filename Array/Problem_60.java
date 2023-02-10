package Array;

import java.util.Scanner;

public class Problem_60
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of test cases");

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int j=0;j<n;n++)
        {
            arr[j] = sc.nextInt();
        }
        int c[] = new int[2];
        System.out.println("Enter the element you wants to find");
        int p = sc.nextInt();

        int count =0;
        for(int i=0; i<n; i++)
        {

            if(arr[i]==p)
            {
                c[count]=1;
                count++;
            }
        }
        for(int i=0; i<count;i++)
        {
            System.out.println(c[i]);
        }




    }
}
