import java.util.*;
class Strings
{
    public static void main(String args[])
    {
        String s1,s2;
        Scanner sc=new Scanner(System.in);

        System.out.println("\nEnter the first string: ");
        s1=sc.nextLine();

        System.out.println("Enter the second string: ");
        s2=sc.nextLine();
        sc.close();

        String s3=s1.concat(s2);
        System.out.println("Concatenated String= "+s3);
        System.out.println("\nBefor Trimming: "+s3);
        System.out.println("\nLength of string= "+s3.length());

        s1=s1.trim();
        s2=s2.trim();
        s3=s1.concat(s2);
        System.out.println("\nAfter Trimming: "+s3);
        System.out.println("\nLength of string= "+s3.length());

        int v=0;

        for(int i=0;i<s3.length();i++)
        {
            char ch=s3.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                v++;
            }
        }
        System.out.println("\nNo. of Vowels in the string are "+v+"\n");
    }
}
