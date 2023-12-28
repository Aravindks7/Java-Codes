package Work;
public class Bonus
{
    public void add_bonus(int salary1,int salary2,int salary3,int eid)
    {
        int nsalary1=5000+salary1;
        int nsalary2=5000+salary2;
        int nsalary3=5000+salary3;

        System.out.println("\n5000 bonus added to the salary");

        switch(eid)
        {
            case 1001:
            System.out.println("\nNew Salary: "+nsalary1+"\n");
            break;

            case 1002:
            System.out.println("\nNew Salary: "+nsalary2+"\n");
            break;

            case 1003:
            System.out.println("\nNew Salary: "+nsalary3+"\n");
            break;
        }
    }
}

/*-----------------------------Outside the Package-----------------------------*/

import Work.Bonus;
import java.util.*;
public class Employee
{
    public static void main(String args[])
    {
        int eid,bonus;
        char choice;
        int salary1=10000,salary2=15000,salary3=25000;
        String ename1="Arun",ename2="John",ename3="David";
        Scanner sc=new Scanner(System.in);
        Bonus b=new Bonus();

        System.out.println("\nEnter the id of the employee: ");
        eid=sc.nextInt();

        switch(eid)
        {
            case 1001:
            System.out.println("\nEmployee Name: "+ename1);
            System.out.println("\nSalary: "+salary1);
            break;

            case 1002:
            System.out.println("\nEmployee Name: "+ename2);
            System.out.println("\nSalary: "+salary2);
            break;

            case 1003:
            System.out.println("\nEmployee Name: "+ename3);
            System.out.println("\nSalary: "+salary3);
            break;
        }
        System.out.println("\nDo you want to give bonus ?Y/N");
        choice=sc.next().charAt(0);
        while(choice=='y'||choice=='Y')
        {
            b.add_bonus(salary1,salary2,salary3,eid);
            break;
        }
    }
}
