class Test4
{
    static int a;
    static 
    {
        System.out.println("SIB1-TEST4");
        System.out.println(a);
    }
    static
    {
        a=56;
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        System.out.println("Main Start");
        System.out.println(a);
        System.out.println(Test3.a);
        System.out.println("Main End");
    }
}