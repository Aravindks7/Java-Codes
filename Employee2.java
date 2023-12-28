package Work;
public class Bonus2 
{
    int eid;
    String ename;
    int salary;

    public Bonus2( int eid, String ename, int salary) 
    {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
    }

    public static Bonus2[] add_bonus2(Bonus2[] list) 
    {
        for (Bonus2 e : list) 
        {
            e.salary += e.salary * .05;
        }
        return list;
    }

    public static void display(Bonus2[] list) 
    {
        System.out.println("\n5% Bonus added to their salary");
        for (Bonus2 e : list) 
        {
            System.out.println("\nEmployee ID: " + e.eid+"\nEmployee Name: " + e.ename +"\nSalary: " + e.salary);
        }
    }
}

/*-----------------------------Outside the Package-----------------------------*/

import Work.Bonus2;
import java.util.*;
public class Employee2 
{   
    public static void main(String[] args) 
    {
        int i,n;
        char choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the no of employees: ");
        n = sc.nextInt();
        sc.nextLine();
        Bonus2[] emp_list = new Bonus2[n];

        for (i = 0; i < n; i++) 
        {
            System.out.println("\nEnter details of employee number " + (i + 1));

            System.out.println("Name: ");
            String ename = sc.nextLine();

            System.out.println("ID: ");
            int eid = sc.nextInt();
            
            System.out.println("Salary: ");
            int salary = sc.nextInt();
            
            sc.nextLine();

            emp_list[i] = new Bonus2(eid, ename, salary);
        }

        System.out.println("\nDo you want to give bonus ?Y/N");
        choice=sc.next().charAt(0);
        while(choice=='y'||choice=='Y')
        {
            emp_list = Bonus2.add_bonus2(emp_list);
            Bonus2.display(emp_list);
            break;
        }

    }
}
