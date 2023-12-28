import java.util.*;
class GCD
{
    int n1,n2;
}
class ThisKeyword extends GCD
{
    public void display(int n1, int n2)
    {
        this.n1=n1;
        this.n2=n2;
        int gcd=1;

        for(int i=1; i<=n1 && i<=n2; i++)
        {
            if(n1%i==0 && n2%i==0)
            gcd=i;
        }
        System.out.println("\nGCD of "+n1+" and "+n2+" = "+gcd+"\n");
    }
    public static void main(String args[])
    {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        ThisKeyword tk=new ThisKeyword();

        System.out.println("\nEnter the two numbers: ");
        n1=sc.nextInt();
        n2=sc.nextInt();

        tk.display(n1,n2);
    }
}
