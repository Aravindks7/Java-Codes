import java.util.Scanner;
import java.util.Arrays;
class BubbleSort
{
    public static void main(String args[]) 
    {
        int a[],n,i,j;
        Scanner sc=new Scanner(System.in);

        System.out.println("\nEnter the limit: ");
        n=sc.nextInt();
        a=new int[n];

        System.out.println("\nEnter the elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("\nBefore Bubblesorting, Array: "+Arrays.toString(a));

        for (i=0;i<n-1;i++)
        {
            for (j=0;j<n-i-1;j++)
            {  
                if (a[j]>=a[j+1])  
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }     
        System.out.println("\nAfter Bubblesorting Array: "+Arrays.toString(a)+"\n");
    }
}
