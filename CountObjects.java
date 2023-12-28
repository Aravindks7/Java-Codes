class CountObjects
{
    static int count;
    CountObjects(int a,int b)
    {
        count++;
        int sum=a+b;
        System.out.println("\nSum= "+sum);
    }
    public static void main(String[] args)
    {
        CountObjects obj1=new CountObjects(1,2);
        CountObjects obj2=new CountObjects(3,4);
        CountObjects obj3=new CountObjects(5,6);
        CountObjects obj4=new CountObjects(7,8);
        CountObjects obj5=new CountObjects(9,10);
        System.out.println("\nNo. of objects created= "+count+"\n");            
    }
}
