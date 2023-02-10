package Array;
import java.util.*;
import java.lang.*;
public class Problem_59
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of test cases");
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            System.out.println("Enter the size of array");
            int n = sc.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter the elements of array");
            for (int p = 0; p < n; p++)
            {
                arr[p]= sc.nextInt();
            }

            for (int p = 0; p < n; p++)
            {
                System.out.println(arr[p]);
            }


            System.out.println("Enter an integer b ");
            int b = sc.nextInt();
            System.out.println(b);

            //boolean c = fun1(arr,b);
            fun1(arr,b);
            System.out.println();
            System.out.println("========================================");
        }

    }
    public static void fun1(int arr1[], int b)
    {
           int x = arr1.length;
           //boolean  a = false;
           for(int i =0; i<x; i++)
           {
               if(arr1[i]==b)
               {

                   System.out.println("true");
               }
               else
               {
                   System.out.println("False");
               }
           }

    }


}
