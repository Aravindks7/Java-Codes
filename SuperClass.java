import java.util.*;
class Volume
{
    public void display(double r)
    {
        double pi=3.14;
        double volume=4/3*(pi*r*r*r);
        System.out.println("\nVolume of Sphere= "+volume+"\n");
    }
}
class Area extends Volume
{
    public void display(double r)
    {
        double pi=3.14;
        double area=4*pi*r*r;
        System.out.println("\nSurface Area of Sphere= "+area);
        super.display(r);
    }
}
class SuperClass
{
    public static void main(String args[])
    {
        Area a=new Area();
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the radius of sphere: ");
        int r=sc.nextInt();
        a.display(r);
    }
}
