import java.util.*;
class MeanMedian
{
    void Mean(double a[],int n)
    {
        double sum=0,mean=0;
        System.out.println("\nThe numbers are: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
            sum=sum+a[i];
        }
        mean=sum/a.length;
        System.out.println("\n\nMean= "+mean+"\n");
    }
    void Median(double a[],int n)
    {
        double median;
        Arrays.sort(a);
        if(n%2==1)
        {
            median=a[n/2];
            System.out.println("Median= "+median+"\n");
        }
        else
        {
            median=(a[(n-1)/2]+a[n/2])/2;
            System.out.println("Median= "+median+"\n");
        }
    }
    public static void main(String args[])
    {
        double a[];
        int n;
        Scanner sc=new Scanner(System.in);
        MeanMedian mm=new MeanMedian();

        System.out.println("\nEnter the limit: ");
        n=sc.nextInt();
        a=new double[n];

        for(int i=0;i<n;i++)
        {
            a[i]=Double.parseDouble(args[i]);
        }
        
        mm.Mean(a,n);
        mm.Median(a,n);
    }
}
