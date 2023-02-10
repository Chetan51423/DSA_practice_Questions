import java.util.Scanner;

public class CF1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans =0;
        int sum =0;
        int n = sc.nextInt();
        int[] array = new int[n];
        int key = sc.nextInt();
        for (int i =0 ; i< array.length; i++){
            array[i]= sc.nextInt();
        }
        int a = array[key-1];
        int count=0;
        for (int j= 0; j<array.length;j++)
        {
            sum = sum+array[j];
            if(array[j]>a || array[j]==a )
            {
                if(array[j]==0)
                {
                    continue;
                }

                count++;
            }
        }
        ans = count;
        if (sum == 0){
            ans = 0;
        }
        System.out.println(ans + " " + count );
    }
}
