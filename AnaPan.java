import java.util.*;
class AnaPan
{
    void Anagram(String s1, String s2)
    {
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.length()==s2.length())
        {
            char a1[]=s1.toCharArray();
            char a2[]=s2.toCharArray();

            Arrays.sort(a1);
            Arrays.sort(a2);

            boolean result=Arrays.equals(a1,a2);
            if(result)
            {
                System.out.println("\n"+s1+" and "+s2+" are anagram");
            }
            else
            {
                System.out.println("\n"+s1+" and "+s2+" are not anagram");
            }
        }
        else
        {
            System.out.println("\n"+s1+" and "+s2+" are not anagram");
        }
    }
    void Pangram(String s3)
    {
        s3=s3.toLowerCase();
        boolean result=true;

        for(char ch='a';ch<='z';ch++)
        {
            if(!s3.contains(String.valueOf(ch)))
            {
                result=false;
                break;
            }
        }
        if(result)
        {
            System.out.println("\n"+s3+" is a pangram\n");
        }
        else
        {
            System.out.println("\n"+s3+" is not a pangram\n");
        }
    }
    public static void main(String args[])
    {
        String s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        AnaPan ap=new AnaPan();

        System.out.println("\nEnter the first string: ");
        s1=sc.nextLine();

        System.out.println("Enter the second string: ");
        s2=sc.nextLine();

        ap.Anagram(s1,s2);

        System.out.println("\nEnter the third String: ");
        s3=sc.nextLine();

        ap.Pangram(s3);
    }
}
