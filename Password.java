import java.util.*;
class Password
{
    public static void main(String args[])
    {
        String pass;
        int special=0,uppercase=0,lowercase=0,digit=0,min=8;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("\nEnter a password: ");
        pass=sc.nextLine();

        if(pass.length()<min)
        {
            System.out.println("\nPassword is short\n");
        }
        else
        {
            for(int i=0;i<pass.length();i++)
            {
                char ch=pass.charAt(i);
                if(ch=='@'||ch=='#'||ch=='$'||ch=='*')
                {
                    special=1;
                }
                else if(Character.isUpperCase(ch))
                {
                    uppercase=1;
                }
                else if(Character.isLowerCase(ch))
                {
                    lowercase=1;
                }
                else
                {
                    digit=1;
                }
            }
        }
        if(special==1 && uppercase==1 && lowercase==1 && digit==1)
        {
            System.out.println("\nPassword is Strong\n");
        }
        else
        {
            System.out.println("Password is Weak\n");
        }
    }
}
