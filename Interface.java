import java.util.*;
interface quicksort1
{
    void quicksort(int a[],int low, int high);
}
interface quicksort2
{
    void swap(int a[],int i, int j);
}
class Interfaces implements quicksort1,quicksort2
{
    public void quicksort(int a[],int low, int high)
    {
        if(low >= high)
        {
            return;
        }

        int pivot=a[high];
        int i=low;
        int j=high;

        while(i < j)
        {
            while(a[i] <= pivot && i < j)
            {
                i++;
            }
            while(a[j] >= pivot && i < j)
            {
                j--;
            }
            swap(a, i, j);
        }
        swap(a, i, high);
        quicksort(a, low, i-1);
        quicksort(a, i+1, high);
    }
    public void swap(int a[],int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String args[])
    {
        int a[],n,i;
        Scanner sc=new Scanner(System.in);
        Interfaces obj=new Interfaces();
        
        System.out.println("\nEnter the limit: ");
        n=sc.nextInt();
        a=new int[n];

        System.out.println("\nEnter the elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("\nUnsorted Array: "+Arrays.toString(a));
        obj.quicksort(a, 0, n-1);
        System.out.println("\nSorted Array: "+Arrays.toString(a)+"\n");
    }
}
