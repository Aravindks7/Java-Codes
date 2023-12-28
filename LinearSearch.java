import java.util.*;
public class LinearSearch 
{
    static void linearSearch(int a[], int key)
    {    
        for(int i=0;i<a.length;i++)
        {    
            if(a[i] == key)
            {    
                System.out.println(i);
            }
        } 
        System.out.println(" ");       
    }
    static void linearSearch(int a[], int key,boolean flag)
    {
        System.out.println("\nAfter method overloading, element is found at index: ");
        while(flag==true)
        {
            for(int i=0;i<a.length;i++)
            {    
                if(a[i] == key)
                {    
                    int pos[]=new int[a.length];     
                    for(int j=0;j<1;j++)
                    {
                        pos[j]=i;   
                        System.out.println(pos[j]+" "); 
                        flag=false; 
                    } 
                }
            }   
        }         
    }
    public static void main(String[] args) 
    {
        int a[],n,i,x;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the limit: ");
        n=sc.nextInt();
        a=new int[n];

        System.out.println("\nEnter the elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("\nUnsorted array: "+Arrays.toString(a));
    
        Arrays.sort(a);
    
        System.out.println("\nSorted array: "+Arrays.toString(a));

        System.out.println("\nEnter the search element: ");
        x=sc.nextInt();
    
        boolean flag=true;
        linearSearch(a,x,flag);
        sc.close();
    }
}
