import java.util.*;
import java.io.*;
class Exceptions
{
    void ZeroNotPossible(int a, int b)
    {
        try
        {
            int c=a/b;
            System.out.println("Value = "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("\nArithmeticException: Dividing a number by zero is not possible.\n");
        }
    }
    void FileNotFound()
    {
        try
        {
            System.out.println("Accessing a file.\n");
            File file=new File("D://test.txt");
            FileInputStream fis=new FileInputStream(file); 
            System.out.println("The file content is: ");
            int r=0;
            while((r=fis.read()) !=-1)
            {
                System.out.println((char) r);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("FileNotFoundException: Failed! File not Found!\n");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        Exceptions obj=new Exceptions();

        System.out.println("\nEnter any number: ");
        a=sc.nextInt();

        System.out.println("\nEnter zero: ");
        b=sc.nextInt();

        obj.ZeroNotPossible(a,b);
        obj.FileNotFound();
    }
}
